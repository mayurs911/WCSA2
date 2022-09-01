package windowBasedPopUp;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadWithAutoIT {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.name("photofile"));
		act.doubleClick(target).perform();
		
		Thread.sleep(5000);

		WebElement target1 = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		act.doubleClick(target1).perform();

		File abs = new File("./autoitScript/uploadfile1.exe");
		String abspath = abs.getAbsolutePath();

		Runtime.getRuntime().exec(abspath);
		Thread.sleep(4000);
		

	}
}
