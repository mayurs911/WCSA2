package QspMethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("mayur");
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='IwRSH']")).submit();

	}
}
