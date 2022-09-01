package keywordDriveFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestValidActiTime extends BaseTest implements IAutoConstant {

	public static void main(String[] args) throws IOException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();

		Flib flib = new Flib();
		String username = flib.readPropertyFileData("./data/config.properties", "username");
		String password = flib.readPropertyFileData("./data/config.properties", "password");

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

		bt.closeBrowser();
	}
}
