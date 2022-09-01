package QspLoactors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorSmartBear {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.smartbear.com/login.asp?returnUrl=/index.asp");
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("secid")).sendKeys("123");
		driver.findElement(By.name("password")).sendKeys("manager");
		driver.findElement(By.name("action")).click();
	}
}
