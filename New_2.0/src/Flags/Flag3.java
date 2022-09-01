package Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(priority = 1)
  public void loginActiTimeLogin()
  {
	  Reporter.log("valid login successful", true);
  }
  @Test(priority = 2)
  public void createUserActiTimeLogin()
  {
	  Reporter.log("create user  successful", true);
  }
  @Test(priority = 3)
  public void logoutActiTimeLogin()
  {
	  Reporter.log("logout successful", true);
  }
}
