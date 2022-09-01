package keywordDriveFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class Acti extends BaseTest1 implements IAutoConstant{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest1 bt = new BaseTest1();
		bt.openBrowser();

		Flib fb = new Flib();
		String username = fb.readPropertyFileData(PROP_PATH, "username");
		String password = fb.readPropertyFileData(PROP_PATH, "password");

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		
		bt.closeBrowser();
	}

}
