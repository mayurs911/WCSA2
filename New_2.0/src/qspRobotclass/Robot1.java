package qspRobotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(4000);

		Robot robot = new Robot();
		// to generate print pop-up
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		// to switch the control to cancel button
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
}
