package pScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

import p03_08_2022.file;

public class Way1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=24309ndwlc50o");

		

		EventFiringWebDriver efw = (EventFiringWebDriver) driver;
		File src = efw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/wall3.jpg");
		Files.copy(src, dest);
	}
}