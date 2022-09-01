package handlingTheDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Value {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PD/Desktop/WCSM7%20SELENIUM/SingleSelectDropdown.html");
		Thread.sleep(3000);
		WebElement dropdwonelement = driver.findElement(By.xpath("//select[@id='menu']"));
		Select sel = new Select(dropdwonelement);
		sel.selectByValue("v5");
	}
}
