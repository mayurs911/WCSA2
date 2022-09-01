package Practices20_07_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(2000);
		
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']"));

		for (WebElement sugg : suggestion) {
			String text = sugg.getText();
			System.out.println(text);
		}
	}

}
