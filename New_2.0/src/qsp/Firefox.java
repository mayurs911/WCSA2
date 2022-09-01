package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}
}
