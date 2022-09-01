package takeScreenShotDynamically;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomeListner.class)

public class TestFlipkart extends BaseTest {
 
	
	@BeforeMethod
  public void setUp() 
 {
	  initalization();	  
  }
 
  @Test
  public void FlipkartTest1()
  {
	  Assert.fail();
  }
  
  @Test
  public void FlipkartTest2()
  {
	  Assert.fail();
  }
  
  @Test
  public void FlipkartTest3()
  {
	  Assert.fail();
  }
  
  @Test
  public void FlipkartTest4()
  {
	  Assert.fail();
  }
  @Test
  public void FlipkartTest5()
  {
	  Assert.fail();
  }
  @AfterMethod
  public void tearDown() {
	  driver.close();
	  
  }
  
  
}
