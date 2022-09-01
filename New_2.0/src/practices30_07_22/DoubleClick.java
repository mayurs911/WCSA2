package practices30_07_22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(.,'Double')]"));
	
}
}
