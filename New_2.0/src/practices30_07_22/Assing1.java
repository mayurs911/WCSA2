package practices30_07_22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assing1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:\\www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone 12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		driver.switchTo().window(
				"https://www.flipkart.com/apple-iphone-12-blue-64-gb/p/itm5778ad0d0d255?pid=MOBFWBYZ8DNJNY7N&lid=LSTMOBFWBYZ8DNJNY7NK9PX3E&marketplace=FLIPKART&q=iphone+12&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=44a69319-9053-4f19-b1b8-4b9c0d1df08f.MOBFWBYZ8DNJNY7N.SEARCH&ppt=sp&ppn=sp&ssid=rkhnxpxskg0000001659359698533&qH=7b7504afcaf2e1ea");

	}
}
