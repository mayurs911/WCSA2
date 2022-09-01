package p10_08_22;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti3Invalid {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=1j5u6flrk8it8");

		Flib3 fb = new Flib3();
		int rc = fb.getRowCount("./data/TestDataActiTime.xlsx", "invalidcreds");

		for (int i = 1; i <= rc; i++) {
			String username = fb.readExcelData("./data/TestDataActiTime.xlsx", "invalidcreds", i, 0);
			String password = fb.readExcelData("./data/TestDataActiTime.xlsx", "invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
			driver.findElement(By.name("username")).clear();

		}

	}
}