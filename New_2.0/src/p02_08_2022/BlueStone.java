package p02_08_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https:\\www.bluestone.com");
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(5000);
		WebElement webElement = driver.findElement(By.name("chat-widget"));
		Thread.sleep(5000);
		driver.switchTo().frame(webElement);
		driver.findElement(By.xpath("//p[contains(text(),'CHAT')]")).click();
	}
}