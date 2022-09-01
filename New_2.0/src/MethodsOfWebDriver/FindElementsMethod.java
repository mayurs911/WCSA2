package MethodsOfWebDriver; // for loop

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");

		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(2000);

		List<WebElement> webElementSuggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for (int i = 0; i < webElementSuggestions.size(); i++) {
			WebElement sugg = webElementSuggestions.get(i);
			String textOfSugg = sugg.getText();
			Thread.sleep(1000);
			System.out.println(textOfSugg);
		}

		// for(WebElement sugg:webElementSuggestions)
		// {
		// String textOfWebElement = sugg.getText();
		// System.out.println(textOfWebElement);
	}
}
