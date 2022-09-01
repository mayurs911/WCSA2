package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();

}
}
