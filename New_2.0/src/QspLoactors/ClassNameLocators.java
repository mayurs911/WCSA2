package QspLoactors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		driver.switchTo().activeElement().sendKeys("Rachel Green-Geller", Keys.ENTER);
		driver.findElement(By.className("lNPNeF")).click();
	}
}
