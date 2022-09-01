package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void method1()
  {
	  Reporter.log("before test method 1",true);
  }
  @BeforeMethod
  public void method2()
  {
	  Reporter.log("before method method2",true);
  }
  @BeforeClass
  public void method3()
  {
	  Reporter.log("before class method3",true);
  }
  
  @BeforeSuite
  public void method4()
  {
	  Reporter.log("before suite method4",true);
  }
  //____________________________________________________________//
  @AfterMethod
  public void method5()
  {
	  Reporter.log("After method method5",true);
  }
  
  @AfterSuite
  public void method6()
  {
	  Reporter.log("After suite method5",true);
  }
}
