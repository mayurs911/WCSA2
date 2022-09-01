package AssingmentActionAndRobotClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assing3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class='lc-1mwyrdx e16i86ec0']")).click();

	}
}