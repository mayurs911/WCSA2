package assingmentOFActionAndRobot;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowserWithoutQuitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Thread.sleep(4000);
//	driver.switchTo().window("https://testpages.herokuapp.com/basic_web_page.html").close();

		Set<String> allwindow = driver.getWindowHandles();
		for (String handle : allwindow) {
			driver.switchTo().window(handle).close();
		}

	}

}
