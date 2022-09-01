package p02_08_2022; // id not working use string name

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FarmeUsingIdOrName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/PD/Desktop/username.html");
		driver.findElement(By.id("un")).sendKeys("admin");
		driver.switchTo().frame("frnm");
		driver.findElement(By.id("pwd")).sendKeys("manager");
	
	}

}
