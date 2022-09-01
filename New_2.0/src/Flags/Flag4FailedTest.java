package Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4FailedTest {
	@Test
	public void loginActiTime() 
	{
		int i = 1 / 0;
		System.out.println(i);

		Reporter.log("login", true);
	}

	@Test(dependsOnMethods = "loginActiTime")
	public void createUserActiTime() 
	{
		Reporter.log("createUser", true);
	}

	@Test(dependsOnMethods = "createUserActiTime")
	public void logoutActiTime()
	{
		Reporter.log("logout", true);
	}
}
