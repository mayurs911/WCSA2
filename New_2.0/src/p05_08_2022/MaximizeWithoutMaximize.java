package p05_08_2022;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWithoutMaximize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("-start-maximized");
		WebDriver  driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https:\\www.google.com");
		
	
	
	}

}
