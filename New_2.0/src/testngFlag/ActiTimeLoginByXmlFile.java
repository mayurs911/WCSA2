package testngFlag;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTimeLoginByXmlFile {
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void loginActiTime(String browservalue) throws InterruptedException 
	{
		if(browservalue.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("chrome");
		Thread.sleep(2000);
		
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("chrome");
			
			
		}
		}
	
	
	
}
