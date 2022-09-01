package testngpack;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
  @Test
  public void actiTime() 
  {
	  Reporter.log("enter the url",true);
	  SoftAssert softassert = new SoftAssert(); // soft Assert used for non critical feature for continue testing
	  softassert.assertEquals(false, true);
	  Reporter.log("verfiy the title of login page",true);
	  Reporter.log("enter the username",true);
	  Reporter.log("enter the password",true);
	  Assert.assertEquals(true, true); // Hard Assert used for critical feature for stop the testing
	  Reporter.log("click on login button",true);
	  Reporter.log("verfiy the home page",true);
	  Reporter.log("create user",true);
	  Reporter.log("delete user",true);
	  Reporter.log("create reports",true);
	  softassert.assertAll();
  }
}
