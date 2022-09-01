package testngFlag; // testng Annotation sequences execution

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationInTestNg {
  @Test
  public void f() 
  {
	  Reporter.log("TEST CASE 1 EXECUTION",true);
  }
  
  @Test
  public void f2() 
  {
	  Reporter.log("TEST CASE 2 EXECUTION",true);
  }
	@BeforeMethod
  public void beforeMethod() 
	{
		 Reporter.log("before method execution",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after method execution",true);
  }


  @BeforeClass
  public void beforeClass() {
	  Reporter.log("before class execution",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("after class execution",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("before test execution",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("after test execution",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("before suite execution",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("after suite execution",true);
  }

}
