package Practices20_07_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.nimbuzz.com/login");
		
		driver.findElement(By.partialLinkText("Forgot Pass")).click();
	}
}
