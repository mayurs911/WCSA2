package Flags; // alwaysRun

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test
  public void loginActiTime() 
  {
	  int i=1/0;
	  Reporter.log("login",true);
  }
  
  @Test(dependsOnMethods = "loginActiTime")
  public void createUserActiTime() 
  {
	  Reporter.log("createUser",true);
  }
  @Test(dependsOnMethods = "createUserActiTime")
  public void logoutActiTime() 
  {
	  Reporter.log("logout",true);
  }
  
}
