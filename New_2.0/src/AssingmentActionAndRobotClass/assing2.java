package AssingmentActionAndRobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assing2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:\\www.cleartrip.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='px-1 plNew  flex flex-middle nmx-1 pb-1']")).click();
		Thread.sleep(2000);

		WebElement text = driver.findElement(By.xpath("//h2[@class='fs-6 px-4 c-neutral-400 fw-400']']"));
		Actions act = new Actions(driver);
		for (int i = 0; i <= 2; i++) {
			act.clickAndHold(text).perform();
		}
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);
		driver.findElement(By.name("btnk")).click();

	}
}
