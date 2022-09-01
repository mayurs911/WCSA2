package QspMethodsOfWEbDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement userTextBox = driver.findElement(By.id("txtUsername"));
		System.out.println("address " + userTextBox);
		Thread.sleep(2000);
		userTextBox.sendKeys("admin");
		Thread.sleep(2000);
		userTextBox.clear();
	}
}
