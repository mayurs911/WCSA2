package practices30_07_22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[.=' LOAN ']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
		
		
		
		
	}

}
