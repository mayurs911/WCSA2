package qspFrameHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https:\\www.bluestone.com");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(3000);

		driver.switchTo().frame("chat-widget");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("pratik");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='lc-22twvl e1xplv9i0'])[3]")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='lc-90q5um esv0owm0']")).click();
	}
}
