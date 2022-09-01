package keywordDriveFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest1 implements IAutoConstant{
	static WebDriver driver;
	public void openBrowser() throws IOException 
	{
		Flib fb = new Flib();
		String browser = fb.readPropertyFileData(PROP_PATH, "browser");
		String url = fb.readPropertyFileData(PROP_PATH, "url");
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_VALUE, GECKO_KEY);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		}
		
	}

	public void closeBrowser()
	{
		driver.quit();
		
	}
}
