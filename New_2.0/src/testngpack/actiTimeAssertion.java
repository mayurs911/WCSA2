package testngpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class actiTimeAssertion {
  WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://127.0.0.1/login.do;jsessionid=6olph2h57h20i");
	}
	
		@Test
  public void actiTimeLogin()
  {
	  String loginPageTitle = driver.getTitle();
	  SoftAssert softassert = new SoftAssert();
	  softassert.assertEquals(loginPageTitle, "actiTIME - Login");
	  Reporter.log("login Page Title is verified");
	  
	  boolean statusOfusername = driver.findElement(By.name("username")).isDisplayed();
	  Assert.assertEquals(statusOfusername, true);
	  Reporter.log(" username test box is displayed",true);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  //------------------------------------------------------------------------------//
	  
	  boolean statusOfpassword = driver.findElement(By.name("pwd")).isDisplayed();
	  Assert.assertEquals(statusOfpassword, true);
	  Reporter.log(" password test box is displayed",true);
	  driver.findElement(By.name("pwd")).sendKeys("manager");
  //------------------------------------------------------------------------------//
	  
	  boolean statusOfLoginButton = driver.findElement(By.id("loginButton")).isDisplayed();
	  Assert.assertEquals(statusOfLoginButton, true);
	  Reporter.log(" login button is displayed",true);
	  driver.findElement(By.name("loginButton")).click();
	  
	  
	  String homePageTitle = driver.getTitle();
		 softassert.assertEquals(homePageTitle, "actiTIME - Enter Time-Track");
		 Reporter.log("home page title is verified",true);
		 
		 Reporter.log("create user",true);
		 Reporter.log("delete user",true);
		 Reporter.log("generate user",true);
	  
	  
  }
		@AfterMethod
		public void tearDown() 
		{
			driver.quit();
		}
}
