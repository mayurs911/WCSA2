package qspWebBasedPopUp; //maximize browser without using driver.manage().window().maximize();

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotificationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	
		ChromeOptions co = new ChromeOptions();
		// co.addArguments("-start-maximized");  // maximize browser without using driver.manage().window().maximize();
		co.addArguments("--disable-notifications"); // disable notification
		
		WebDriver driver = new ChromeDriver(co);
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("confirmBtn")).click();

}
}