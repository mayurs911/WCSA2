package takeScreenShotDynamically;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import p03_08_2022.file;

public class BaseTest {
	static WebDriver driver;


	public void initalization() {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https:\\www.flipkart.com");
	}

	public void failed(String methodName)
	{
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/ts1.jpg");
			Files.copy(src, dest);
		} catch (Exception e) {
		}

	}
}
