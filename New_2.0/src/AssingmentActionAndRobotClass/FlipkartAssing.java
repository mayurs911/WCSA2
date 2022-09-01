package AssingmentActionAndRobotClass;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:\\www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 12");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(3000);
		// tab2
		driver.switchTo().window("https://www.flipkart.com/apple-iphone-12-blue-64-gb/p/itm5778ad0d0d255?pid=MOBFWBYZ8DNJNY7N&lid=LSTMOBFWBYZ8DNJNY7NK9PX3E&marketplace=FLIPKART&q=iphone+12&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=316e0ea4-7214-41a3-8d8d-5555884c5ff8.MOBFWBYZ8DNJNY7N.SEARCH&ppt=hp&ppn=homepage&ssid=90gc27p4k00000001659350402559&qH=7b7504afcaf2e1ea");
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
	}

}
