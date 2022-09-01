package QspLoactors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorInstagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("max");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("mayur123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
}
