package testngFlag; // invocationCount attribute tells how many times TestNG should run a test method

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
  @Test(invocationCount = 9)
  public void f()
  {
	  Reporter.log("create and delete user", true);
  }
}
