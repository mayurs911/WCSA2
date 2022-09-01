package QspMethodsOfWebElement; //selenium.dev> selenium Level Support text

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		WebElement web = driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors"));
		String textOfWeb = web.getText();
		System.out.println(textOfWeb);

	}
}
