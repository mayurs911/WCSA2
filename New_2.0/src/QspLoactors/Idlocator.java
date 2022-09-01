package QspLoactors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open the webPage
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// type userName
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		// type Password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// click on login button
		driver.findElement(By.id("btnLogin")).click();
	}
}
