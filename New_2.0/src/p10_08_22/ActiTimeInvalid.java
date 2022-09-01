package p10_08_22;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalid {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=5vmyjjlyv9ne");

		Flib1 flib = new Flib1();
		int rc = flib.getRowCount("./data/TestDataActiTime.xlsx", "invalidcreds");
		for (int i = 1; i <= rc; i++) {
			String username = flib.readExcelData("./data/TestDataActiTime.xlsx", "invalidcreds", i, 0);
			String password = flib.readExcelData("./data/TestDataActiTime.xlsx", "invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();

		}

	}
}