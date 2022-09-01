package Practices20_07_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		driver.findElement(By.name("q"));
		Thread.sleep(2000);

		driver.switchTo().activeElement().sendKeys("iphone");
		Thread.sleep(2000);

		List<WebElement> iphoneName = driver.findElements(By.className("//div[@class='wM6W7d']"));

		for (WebElement iphone : iphoneName)
		{
			String text = iphone.getText();
			System.out.println(text);
		}
	}
}