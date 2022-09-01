package MethodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
}
