package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=3qxh1u5lmlva7");
		String loginPageTitle = driver.getTitle();

		if (loginPageTitle.equals("actiTime-Login")) {
			System.out.println("The Test Case is passed ! Login Page Title is matched");
		}

		else {
			System.out.println("The Test Case is Not Passed ! Login Title is Not Matched");
		}
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

	}
}
