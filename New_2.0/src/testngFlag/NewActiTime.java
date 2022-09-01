package testngFlag;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewActiTime {
	WebDriver driver;
	@Test
	@Parameters({"browser","username","password"})
	public void validLogin(String browserValue,String username,String password) throws InterruptedException 
	{

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("http://127.0.0.1/login.do;jsessionid=18gwmg4ub3m4h");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			

		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("http://127.0.0.1/login.do;jsessionid=18gwmg4ub3m4h");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
		}
		else
		{
			Reporter.log("Enter valid input",true);
		}
	}
}