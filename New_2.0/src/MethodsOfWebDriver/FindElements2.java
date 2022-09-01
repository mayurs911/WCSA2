package MethodsOfWebDriver; // for each loop

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");

		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(2000);

		List<WebElement> webElementsSuggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']"));

		for (WebElement sugg : webElementsSuggestion) {
			String text = sugg.getText();
			System.out.println(text);

		}
	}

}
