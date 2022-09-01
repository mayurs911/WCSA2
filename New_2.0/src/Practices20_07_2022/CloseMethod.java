package Practices20_07_2022;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
		driver.close();
	}
}
