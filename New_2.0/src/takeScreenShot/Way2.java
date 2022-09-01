package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver(); // RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot2.jpg");
		Files.copy(src, dest);
	}


}
