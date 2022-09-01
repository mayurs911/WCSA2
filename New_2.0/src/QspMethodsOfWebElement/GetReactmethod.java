package QspMethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetReactmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:\\www.facebook.com");

		WebElement loginButton = driver.findElement(By.name("login"));
		Rectangle rect = loginButton.getRect();
		System.out.println("width : " + rect.getWidth());
		System.out.println("height : " + rect.getHeight());
		System.out.println("xaxis :" + rect.getX());
		System.out.println("yaxis : " + rect.getY());

	}
}
