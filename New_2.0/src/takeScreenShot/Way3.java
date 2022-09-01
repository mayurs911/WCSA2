package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // WebDriverDriver driver = new ChromeDriver();
		
		RemoteWebDriver rwd = (RemoteWebDriver)driver;// downcasting
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		
		File src =rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot3.jpg");
		Files.copy(src, dest);
	}


}
