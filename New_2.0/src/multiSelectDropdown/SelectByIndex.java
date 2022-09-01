package multiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/PD/Desktop/WCSM7%20SELENIUM/MultiSelectDropdown.html");
		WebElement multiselect = driver.findElement(By.id("menu"));
		
		Select sel = new Select(multiselect);
		for (int i = 4; i <= 8; i++) 
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}

	}
}
