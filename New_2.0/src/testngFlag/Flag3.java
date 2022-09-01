package testngFlag; // priority flag

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  
	@Test(priority = 5)
	  public void a() 
	  {
		  Reporter.log("a method", true);
	  }
	  
	@Test
	  public void b() 
	  {
		  Reporter.log("b method", true);
	  }
	  
	  @Test(priority = 4)
	  public void c() 
	  {
		  Reporter.log("c method", true);
		  
	  }
	  
	  @Test(priority = 3)
	  public void d() 
	  {
		  Reporter.log("d method", true);
	  }
	  
	  @Test(priority = 2)
	  public void e() 
	  {
		  Reporter.log("e method", true);
	  }
	  
	  @Test(priority = 1)
	  public void f() 
	  {
		  Reporter.log("f method", true);
	  }

  }

