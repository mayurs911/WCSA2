package qspFrameHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(3000);
		
		WebElement frameElement = driver.findElement(By.id("chat-widget"));
		driver.switchTo().frame("frameElement");
		
		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
		
		
	}
}


