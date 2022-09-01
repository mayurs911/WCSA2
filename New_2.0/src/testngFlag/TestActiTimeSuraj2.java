package testngFlag;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestActiTimeSuraj2 {
	WebDriver driver;
	
	@BeforeTest
	public void launchActiTime()
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("http://127.0.0.1/login.do;jsessionid=18gwmg4ub3m4h");
		
	}
	
  @Test
  public void loginActiTime()
  {
	 
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
  }
  
  @Test
  public void logoutActiTime() throws InterruptedException
  {
	 
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
  }
	@BeforeMethod
  public void launchBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 driver.get("http://127.0.0.1/login.do;jsessionid=18gwmg4ub3m4h");
		 
  }
  @AfterMethod
  public void closeBrowser()
  {
	  driver.quit();
  }
}
