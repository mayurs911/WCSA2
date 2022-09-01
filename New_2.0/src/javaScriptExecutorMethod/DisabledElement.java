package javaScriptExecutorMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/PD/Desktop/SELENIUM%20HTML/disabledTextBox.html");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		// jse.executeScript("document.getElementById('i1').value='admin'");
	jse.executeScript("document.getElementById('i1').value=('admin')");
}
}