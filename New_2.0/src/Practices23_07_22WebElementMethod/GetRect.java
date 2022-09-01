package Practices23_07_22WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement position = driver.findElement(By.name("login"));
		Rectangle value = position.getRect();
		Dimension D = value.getDimension();
		int H = value.getHeight();
		Point P = value.getPoint();
		int X = value.getX();
		int Y = value.getY();
		
		System.out.println(D);
		System.out.println(H);
		System.out.println(P);
		System.out.println(X);
		System.out.println(Y);

	}
}
