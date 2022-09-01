package Practices20_07_2022;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class SwitchToMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.switchTo().activeElement().sendKeys("java", Keys.ENTER);
	}
}
