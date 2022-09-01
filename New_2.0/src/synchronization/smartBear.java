package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class smartBear {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://my.smartbear.com/login.asp?returnUrl=/index.asp");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='secid']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@class='btnBlue']")).click();

	}
}
