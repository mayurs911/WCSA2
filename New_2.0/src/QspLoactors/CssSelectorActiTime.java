package QspLoactors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorActiTime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1l7v57d79acwd");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	}
}
