package Flags; 

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void loginActiTime() 
  {
	  Reporter.log("login",true);
  }
  @Test(dependsOnMethods  = "loginActiTime")
  public void createUserActiTime() 
  {
	  Reporter.log("create user",true);
  }
  @Test(dependsOnMethods = "createUserActiTime")
  public void logoutActiTime() 
  {
	  Reporter.log("logout",true);
  }
  
}
