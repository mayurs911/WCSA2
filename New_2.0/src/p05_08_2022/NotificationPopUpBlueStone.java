package p05_08_2022;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotificationPopUpBlueStone {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("confirmBtn")).click();

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ESCAPE);
		rob.keyRelease(KeyEvent.VK_ESCAPE);

		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(4000);

		Alert al = driver.switchTo().alert();

		String text = al.getText();
		System.out.println(text);
		Thread.sleep(4000);

		al.accept();

	}
}