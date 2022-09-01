package Practices23_07_22WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement position = driver.findElement(By.name("login"));
		Point axis = position.getLocation();
		int xp = axis.getX();
		int xy = axis.getY();
		
		System.out.println(" X-axis "+xp);
		System.out.println("Y-axis "+xy);
	
}
}