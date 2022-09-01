package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mayur");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
}
