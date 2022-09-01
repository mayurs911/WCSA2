package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testng1 
{
  @Test
  public void a() 
  {
	  Reporter.log("a method", true);
  }
  
  
  public void b() 
  {
	  Reporter.log("b method", true);
  }
  
  @Test
  public void c() 
  {
	  Reporter.log("c method", true);
	  
  }
  
  @Test
  public void d() 
  {
	  Reporter.log("d method", true);
  }
  
  @Test
  public void e() 
  {
	  Reporter.log("e method", true);
  }
  
  @Test
  public void f() 
  {
	  Reporter.log("f method", true);
  }
  
}
