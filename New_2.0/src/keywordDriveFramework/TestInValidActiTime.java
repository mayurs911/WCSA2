package keywordDriveFramework;

import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;

public class TestInValidActiTime extends BaseTest implements IAutoConstant {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();

		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/TestDataActiTime.xlsx", "invalidcreds");
		for (int i = 1; i <= rc; i++) {
			String username = flib.readExcelData("./data/TestDataActiTime.xlsx", "invalidcreds", i, 0);
			String password = flib.readExcelData("./data/TestDataActiTime.xlsx", "invalidcreds", i, 1);
			System.out.println(i);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
			driver.findElement(By.name("username")).clear();
			
			Thread.sleep(2000);

			bt.closeBrowser();

		}
	}

}
