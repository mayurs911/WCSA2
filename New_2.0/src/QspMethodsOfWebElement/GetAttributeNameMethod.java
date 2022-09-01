package QspMethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeNameMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:\\www.google.com");

		WebElement searchBox = driver.findElement(By.name("q"));
		String tagName = searchBox.getAttribute("title");
		System.out.println(tagName);

	}
}