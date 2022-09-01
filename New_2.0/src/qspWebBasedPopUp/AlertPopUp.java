package qspWebBasedPopUp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/PD/Desktop/SELENIUM%20HTML/alart.html");
	driver.findElement(By.xpath("//button[.='Try it']")).click();
	Alert al = driver.switchTo().alert();
	String text = al.getText();
	System.out.println(text);
	Thread.sleep(2000);
	al.accept();
	
	
}
}
