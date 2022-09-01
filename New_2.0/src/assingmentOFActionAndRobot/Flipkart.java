package assingmentOFActionAndRobot; // using tab

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https:\\www.flipkart.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='✕']")).click();
	
	driver.findElement(By.name("q")).sendKeys("iphone 12");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[.='APPLE iPhone 12 (Red, 128 GB)']")).click();
	
	String child = driver.getWindowHandle();
	
	
	driver.switchTo().window(child);
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	driver.findElement(By.xpath("//span[@class='B_NuCI']"));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@id='swatch-2-color']")).click();
	

	 //Thread.sleep(2000);
	
		
}
}
