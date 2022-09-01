package QspMethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:\\www.facebook.com");
		WebElement loginButton = driver.findElement(By.name("login"));
		String cssvalue = loginButton.getCssValue("position");
		System.out.println(cssvalue);
	}

}
