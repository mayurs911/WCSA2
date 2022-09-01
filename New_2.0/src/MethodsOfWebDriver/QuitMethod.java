package MethodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.fb.com");
		Thread.sleep(3000);
		driver.quit();
	}
}
