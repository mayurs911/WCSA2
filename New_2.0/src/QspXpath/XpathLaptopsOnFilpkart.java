package QspXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLaptopsOnFilpkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop", Keys.ENTER);
		Thread.sleep(3000);
		String Price = driver.findElement(By.xpath(
				"//div[.='Lenovo IdeaPad Gaming Core i5 11th Gen - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeForce...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"))
				.getText();

		System.out.println("Lenovo IdeaPad Core i3 11th Gen "+Price);

	}
}
