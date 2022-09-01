package Flags; // enabled flag

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(enabled = false)
  public void validActiTimeLogin()
  {
	  Reporter.log("valid login successful",true);
  }
  @Test
  public void invalidActiTimeLogin()
  {
	  Reporter.log("invalid login successful",true);
  }
}
