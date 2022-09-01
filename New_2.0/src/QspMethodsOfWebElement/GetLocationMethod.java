package QspMethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:\\www.facebook.com");

		WebElement loginButton = driver.findElement(By.name("login"));
		Point point = loginButton.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();

		System.out.println(" The palcement of login button is as follows ");
		System.out.println(" X axis distance " + xaxis);
		System.out.println(" X axis distance " + yaxis);

	}
}