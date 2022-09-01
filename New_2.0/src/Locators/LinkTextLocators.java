package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.linkText("Forgot your password?")).click();
}
}
