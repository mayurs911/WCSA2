package takeScreenShot; // by using WebElement method taking screenshot

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:\\www.facebook.com");

		WebElement loginButton = driver.findElement(By.name("login"));
		File src = loginButton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/loginButton.jpg");
		Files.copy(src, dest);
	}
}