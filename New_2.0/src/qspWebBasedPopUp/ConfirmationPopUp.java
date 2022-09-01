package qspWebBasedPopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/PD/Desktop/SELENIUM%20HTML/confirmation.html");

		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		//driver.findElement(By.xpath("//button[contains(text().='I am Hungry')]")).click();
		
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = al.getText();
		System.out.println(text);
		al.accept();

	}
}
