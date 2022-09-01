package testngFlag;    // Flag 1 : description flag

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  
	@Test(description ="This test is used to perfrom valid login  " )
  
  public void validActiTimeTest() 
  {
	  Reporter.log("valid login is performed", true);
  }
	
	@Test(description ="This test is used to perfrom invalid login  " )
	  
	  public void invalidActiTimeTest() 
	  {
		  Reporter.log("invalid login is performed", true);
	  }
}
