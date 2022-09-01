package methodOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://pd-pc/login.do");
	
	WebElement user = driver.findElement(By.name("username"));
	boolean visible = user.isDisplayed();
	System.out.println(visible);
	
}
}