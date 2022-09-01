package MethodsOfWebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Open')]")).click();
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
	
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String handle:allhandles )
		{
		System.err.println(handle);	
		}
	}
}