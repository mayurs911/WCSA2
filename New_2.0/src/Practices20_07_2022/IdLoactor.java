package Practices20_07_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLoactor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en/club-vistara/login/login-page");
		driver.findElement(By.id("flyerid")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("manager");
		driver.findElement(By.className("aubergine-button-dark col-xs-12")).click();
	}
}
