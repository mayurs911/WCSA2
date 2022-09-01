package operationalMethodOfDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PD/Desktop/WCSM7%20SELENIUM/SingleSelectDropdown.html");
		WebElement multiselect = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselect);
		List<WebElement> option = sel.getOptions();

		for (WebElement op : option) {
			String value = op.getText();
			System.out.println(value);
		}
	}

}
