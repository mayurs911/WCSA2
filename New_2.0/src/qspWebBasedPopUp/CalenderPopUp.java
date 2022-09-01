package qspWebBasedPopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUp {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:\\www.cleartrip.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='px-1 plNew  flex flex-middle nmx-1 pb-1']")).click();
		Thread.sleep(5000);
		
		Actions al = new Actions(driver);
		WebElement dc = driver.findElement(By.xpath("//div[@class='w-100p']"));
		al.doubleClick(dc);
		// to open calendar pop up
		//driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-relative homeCalender']/button")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[3]")).click();
		
	}
}
