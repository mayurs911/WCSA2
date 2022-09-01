package QspXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.youtube.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='search-input']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("ytd-searchbox-spt")).sendKeys("hello");
	}
}