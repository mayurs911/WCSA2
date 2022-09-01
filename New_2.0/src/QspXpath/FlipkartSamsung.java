package QspXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSamsung {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung note 10 plus", Keys.ENTER);
		Thread.sleep(3000);
		String Price = driver.findElement(By.xpath(
				"//div[.='SAMSUNG Galaxy Note 10 Plus (Aura Glow, 256 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[.='₹59,599']"))
				.getText();

		System.out.println("SAMSUNG Galaxy Note 10 Plus " + Price);
	}
}
