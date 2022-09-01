package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementP1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
		System.out.println("address of webelement" + usernameTextBox);
		usernameTextBox.sendKeys("Admin");
		Thread.sleep(2000);
		usernameTextBox.clear();
	}
//WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
//System.out.println("address of webelement : "+usernameTextBox);
//usernameTextBox.sendKeys("Admin");
//Thread.sleep(2000);
//usernameTextBox.clear();
}
