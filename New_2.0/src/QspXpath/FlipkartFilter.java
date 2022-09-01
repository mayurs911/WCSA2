package QspXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFilter {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("tv", Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[6]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[9]")).click();
		Thread.sleep(5000);
		String Price = driver.findElement(By.xpath(
				"//div[.='SONY Bravia 163.9 cm (65 inch) Ultra HD (4K) LED Smart TV']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"))
				.getText();
		System.out.println("SONY Bravia 163.9 cm (65 inch) Ultra HD (4K) LED Smart TV " + Price);

	}
}
