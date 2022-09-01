package QspLoactors; // ActiTime webPage

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open the webPage of ActiTime
		driver.get("http://127.0.0.1/login.do;jsessionid=14goq5k9egf63");

		// type userName
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(3000);

		// type Password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		
		// click on login button
		driver.findElement(By.id("loginButton")).click();
	}
}
