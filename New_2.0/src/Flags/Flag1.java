package Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "valid acti time login")
  public void validActiTimeLogin() 
  {
	  Reporter.log("valid perform",true);
  }
  
  @Test(description = "valid acti time login")
  public void invalidActiTimeLogin() 
  {
	  Reporter.log("invalid perform",true);
  }
}
