package QspSynchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=5vmyjjlyv9ne");
		String LoginPage = driver.getTitle();
		System.out.println(LoginPage);

		if (LoginPage.equals("actiTIME - Login")) 
		{
			System.out.println("Test case is Passed ! Login page is matched");
		} 
		else 
		{
			System.out.println("Test case is Not Passed ! Login page is Not matched");
		}

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	
		Thread.sleep(4000);

		String actualHomePage = driver.getTitle();

		if (actualHomePage.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Test case is Passed ! Home page is matched");
		}
		else 
		{
			System.out.println("Test case is Not Passed ! Home page is Not matched");
		}

	}
}