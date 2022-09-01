package testngpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class orangeHRMassertion {
	WebDriver driver;

	// initalization
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test
	public void orangeHRMlogin() throws InterruptedException 
	{
		String loginTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(loginTitle, "OrangeHRM");
		Reporter.log("login title is displayed", true);
		// ______________________________________//

		boolean statusofUsername = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(statusofUsername, true);
		Reporter.log("username test box is displayed", true);
		driver.findElement(By.name("username")).sendKeys("Admin");

		// ________________________________________________//

		boolean statusofPassword = driver.findElement(By.name("password")).isDisplayed();
		Assert.assertEquals(statusofPassword, true);
		Reporter.log("password test box is displayed", true);
		driver.findElement(By.name("password")).sendKeys("admin123");
		// ________________________________________________//

		boolean statusofloginButton = driver.findElement(By.xpath("//button[.=' Login ']")).isDisplayed();
		Assert.assertEquals(statusofloginButton, true);
		Reporter.log("login button is displayed", true);
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		
		Thread.sleep(5000);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void f() {
	}
}
