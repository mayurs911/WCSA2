package Practices20_07_2022;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		driver.switchTo().activeElement().sendKeys("java", Keys.ENTER);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();

	}
}
