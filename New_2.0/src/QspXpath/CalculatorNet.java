package QspXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorNet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.findElement(By.xpath("(//span[@class='scinm'])[9]")).click();
		driver.findElement(By.xpath("(//span[@class='scinm'])[5]")).click();
		driver.findElement(By.xpath("(//span[@class='scinm'])[10]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[.='+']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='1']")).click();
		driver.findElement(By.xpath("//span[.='5']")).click();
		driver.findElement(By.xpath("//span[.='0']")).click();
		Thread.sleep(3000);
		String sum = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println(sum);
	}
}
