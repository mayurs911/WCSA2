package Locators; // OR operator is logical operator used to HIGHLIGHT MULTIPLE webElement.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class XpathCase4Syntax2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.puma.com/in/en/home");
	driver.findElement(By.xpath("//input[contains(@type,'search') or contains(@placeholder,'Search puma.com')]")).sendKeys("shoes");
}
}
