package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementP2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=ggslpb1no1ee8");

		WebElement actiTimeUserName = driver.findElement(By.name("username"));
		Thread.sleep(5000);
		actiTimeUserName.sendKeys("admin");
		System.out.println(actiTimeUserName);
		actiTimeUserName.clear();
	}

}
