package keywordDriveFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	static WebDriver driver;

	public void openBrowser() throws IOException {
		Flib flib = new Flib();
		// read the data from property file
		String browserValue = flib.readPropertyFileData("./data/config.properties", "browser");

		// read the data from property file
		String url = flib.readPropertyFileData("./data/config.properties", "url");

		// use the value of browser
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}

		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		}

		else {
			System.out.println("enter the correct choice");
		}

	}

	// method to close the browsers
	public void closeBrowser() {
		driver.quit();
	}

}
