package testngFlag; // flag 2 : enabled flag

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
	// this test will not run itself ... it is disabled (method1 is disabled), but remaining two will run (method 2 & 3)4
	
  @Test(enabled = false)
  public void method1() 
  {
	  Reporter.log("actiTime valid",true);
  }
  @Test
  public void method2() 
  {
	  Reporter.log("actiTime create user",true);
  }
  @Test
  public void method3() 
  {
	  Reporter.log("actiTime generate report",true);
  }
  
}
