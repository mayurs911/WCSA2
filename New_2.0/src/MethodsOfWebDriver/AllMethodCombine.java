package MethodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethodCombine {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:\\www.google.com");
	String Url=driver.getCurrentUrl();
	System.out.println(Url);
	
	String Page=driver.getPageSource();
	System.out.println(Page);
	
	String title=driver.getTitle();
	System.out.println(title);
}
}
