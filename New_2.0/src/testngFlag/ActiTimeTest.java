package testngFlag; // priority flag

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActiTimeTest {

	@Test(priority = 1)
	public void loginActiTimeTest() 
	{
		Reporter.log("login  succesful",true);
	}
	
	@Test(priority = 2)
	public void createUserActiTime() 
	{
		Reporter.log("create user",true);
	}
	

	@Test(priority = 3)
	public void logoutActiTime() 
	{
		Reporter.log("logout successful",true);
	}
}
