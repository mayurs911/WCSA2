package assingmentOFActionAndRobot;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		// parent window
		String parent = driver.getWindowHandle();
		System.out.println(parent);
       
		// child window
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Thread.sleep(2000);

		Set<String> allhandle = driver.getWindowHandles();
		for(String wh:allhandle)
		{
			String title = driver.switchTo().window(wh).getTitle();
			System.out.println(title);
			
			if (! title.equals(parent))
			{
				driver.switchTo().window(wh).close();
			}
		}

	}
}
