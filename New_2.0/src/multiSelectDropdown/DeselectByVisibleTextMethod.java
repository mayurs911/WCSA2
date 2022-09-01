package multiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleTextMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PD/Desktop/WCSM7%20SELENIUM/MultiSelectDropdown.html");
		WebElement multiselect = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselect);
		sel.selectByVisibleText("Misal");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Misal");
	}
}
