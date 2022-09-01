package p06_08_2022;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://google.com/");

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/sc2.jpg");
		Files.copy(src, dest);
	}
}
