package QspLoactors; // cssSelector shortcut for lengthy text 

						//use ^ & then use static character of complete text

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorShortcut_1_2_3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// shortcut_1: ^ for starting char
		driver.findElement(By.cssSelector("input[id^='txtU']")).sendKeys("Admin");

		// shortcut_2: $ for ending char
		driver.findElement(By.cssSelector("input[id$='sword']")).sendKeys("admin123");

		// shortcut_3: * for in between char
		driver.findElement(By.cssSelector("input[id*='tnLo']")).click();
	}
}