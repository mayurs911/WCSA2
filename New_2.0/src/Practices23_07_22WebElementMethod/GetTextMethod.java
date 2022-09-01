package Practices23_07_22WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement txtUser = driver.findElement(By.xpath("//span[.='( Username : Admin | Password : admin123 )']"));
		String value = txtUser.getText();
		System.out.println(value);

	}
}
