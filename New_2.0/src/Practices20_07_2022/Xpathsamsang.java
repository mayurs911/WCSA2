package Practices20_07_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathsamsang {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.flipkart.com");
		driver.switchTo().activeElement().sendKeys("samsung note 10 plus");
	
	}
	

}
