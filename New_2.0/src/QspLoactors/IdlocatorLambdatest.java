package QspLoactors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdlocatorLambdatest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.lambdatest.com/login");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("manager");
		driver.findElement(By.className("rounded block w-full text-size-14 h-40 tracking-widest font-bold uppercase g-recaptcha bg-black text-white disabled:opacity-50")).click();
	}
}
