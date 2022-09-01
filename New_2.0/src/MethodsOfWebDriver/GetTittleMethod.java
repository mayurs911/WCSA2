package MethodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittleMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String titleOfLoginPage = driver.getTitle();
		System.out.println(titleOfLoginPage);

	}
}
