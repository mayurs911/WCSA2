package qspFrameHandling; //frame using name

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/PD/Desktop/username.html");
	driver.findElement(By.id("un")).sendKeys("admin");
	driver.switchTo().frame("frnm");
	Thread.sleep(2000);
	driver.findElement(By.id("pwd")).sendKeys("manager");
	
	
}
}
