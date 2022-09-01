package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void actiTimeLogin()
  {
	  Reporter.log("login successfully", true);
  }

  @Test(dependsOnMethods = "actiTimeLogin")
  public void actiTimeCreateUser()
  {
	  Reporter.log("create user", true);
  }
  
  @Test(dependsOnMethods = "actiTimeCreateUser" )
  public void actiTimeLogout()
  {
	  Reporter.log("logout successfully", true);
  }

}
