package qspWebBasedPopUp; // sendKey work for FireFox 

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeyToAlert {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("prompt")).click();
		
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		al.sendKeys("automation");
	
}
}