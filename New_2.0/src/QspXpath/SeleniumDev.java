package QspXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDev {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[.='Downloads']")).click();
		Thread.sleep(3000);

		String title = driver.findElement(By.xpath("\r\n" + "\r\n"
				+ "//p[.='Java']/ancestor::div[@class='card h-100 bg-transparent border-0']/descendant::a[.='API Docs']\r\n"
				+ "")).getText();

		System.out.println(title);
	}
}
