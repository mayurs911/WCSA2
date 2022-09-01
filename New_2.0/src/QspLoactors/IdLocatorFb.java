package QspLoactors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorFb {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mayur123");
		driver.findElement(By.name("login")).click();
	}
}
