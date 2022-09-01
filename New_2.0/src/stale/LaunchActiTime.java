package stale; //  StaleElementReferenceException (stale: means old)

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActiTime {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=1j5u6flrk8it8");
	Thread.sleep(4000);
	
	WebElement username = driver.findElement(By.name("username"));
	driver.navigate().refresh();
	// username.sendKeys("admin"); // username holds the old address so here we get StaleElementReferenceException 
	
	
	driver.findElement(By.name("username")).sendKeys("admin");
}
}
