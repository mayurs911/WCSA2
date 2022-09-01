package QspXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartShopping {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("headphone",
				Keys.ENTER);
		Thread.sleep(2000);
		String headphonePrice = driver.findElement(By.xpath(
				"//a[.='Noise Buds VS102 Truly Wireless Bluetooth Headset']/ancestor::div[@class='_4ddWXP']/descendant::div[@class='_30jeq3']"))
				.getText();
		System.out.println(headphonePrice);
	}
}
