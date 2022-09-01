package assingmentOFActionAndRobot;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:\\www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("iphone 12");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[.='APPLE iPhone 12 (Red, 128 GB)']")).click();

		String parentHandle = driver.getWindowHandle();

		Set<String> allHandles = driver.getWindowHandles();

		for (String wh : allHandles) {
			if (!parentHandle.equals(wh)) {
				driver.switchTo().window(wh);
			}

			else {

			}
		}

		driver.findElement(By.xpath("//li[@id='swatch-2-color']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='256 GB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pincodeInputId")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pincodeInputId")).sendKeys("411062");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

	}
}
