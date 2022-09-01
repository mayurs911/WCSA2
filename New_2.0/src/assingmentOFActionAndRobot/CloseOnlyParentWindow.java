package assingmentOFActionAndRobot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseOnlyParentWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Thread.sleep(4000);

		driver.switchTo().window(parent).close();

	}
}