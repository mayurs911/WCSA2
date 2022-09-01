package assingmentOFActionAndRobot;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tv {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:\\www.flipkart.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("tv");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		driver.findElement(By.xpath("//div[.='LG 80 cm (32 inch) HD Ready LED Smart WebOS TV']")).click();
		String parentwindow = driver.getWindowHandle();

		Set<String> allwindows = driver.getWindowHandles();
		for (String windowHandle : allwindows) {
			if (!parentwindow.equals(windowHandle)) {
				driver.switchTo().window(windowHandle);
			}
			else
			{
				
			}
			driver.findElement(By.id("pincodeInputId")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("pincodeInputId")).sendKeys("411062");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		}

	}
}
