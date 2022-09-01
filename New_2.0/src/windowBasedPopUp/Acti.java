package windowBasedPopUp;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acti {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://pd-pc/login.do");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='content administration']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		act.doubleClick(target).perform();
		Thread.sleep(3000);
		// integrating the auto It script with a selenium script
		File file = new File("./autoItScript/uploadfile1.exe");
		String abspath = file.getAbsolutePath();
		Runtime.getRuntime().exec(abspath);
		
		
	}
}
