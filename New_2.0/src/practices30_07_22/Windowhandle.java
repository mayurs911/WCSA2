package practices30_07_22;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		
		for(String window:allwin)
		{
		System.err.println(window);
		}
	}
}
