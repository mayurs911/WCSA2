package Practices20_07_2022;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

	}
}
