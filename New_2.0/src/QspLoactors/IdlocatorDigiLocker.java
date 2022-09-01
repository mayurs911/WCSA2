package QspLoactors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdlocatorDigiLocker {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://digilocker.meripehchaan.gov.in/signin/oauth_partner/%252Foauth2%252F1%252Fconsent%253Fresponse_type%253Dcode%2526client_id%253D3E783873%2526state%253D102%2526redirect_uri%253Dhttps%25253A%25252F%25252Fnad.digilocker.gov.in%25252Findex.php%25252Fsignup%25252Fcallback_data%2526scope%253Dopenid%2526orgid%253D002585%2526txn%253D62cbf8e777810oauth21657534695%2526hashkey%253D91fb20164a927051f7bf473dccb9dc8a13a076ba4384046849e912a655a60c51%2526requst_pdf%253DN%2526signup%253Dsignup");
	driver.findElement(By.id("username")).sendKeys("Admin");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.id("terms1")).click();
	driver.findElement(By.id("submitbtn1")).click();
	
	
}
}
