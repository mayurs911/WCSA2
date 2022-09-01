package Practices23_07_22WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement position = driver.findElement(By.name("login"));
		Dimension value = position.getSize();
		int H = value.getHeight();
		int W = value.getWidth();

		System.out.println(H);
		System.out.println(W);
	}
}
