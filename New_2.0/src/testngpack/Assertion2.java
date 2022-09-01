package testngpack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion2 {
  @Test
  public void f() {
	  Reporter.log("enter url",true);
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(false, true);
	  Reporter.log("verify the title of login page",true);
	  Reporter.log("enter username",true);	  
	  Reporter.log("enter password",true);
	  Assert.assertEquals(true, true);
	  Reporter.log("click on login button");
	  Reporter.log("verify the title home page ",true);
	  Reporter.log("create user",true);
	  Reporter.log("delete user",true);
	  Reporter.log("generate report",true);
	  
  }
}
