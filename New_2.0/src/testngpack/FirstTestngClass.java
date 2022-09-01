package testngpack;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestngClass {
	
	@Test
	public void method1() 
	{
		Reporter.log("method1 executed", true);
	}
	
	@Test
	public void method2() 
	{
		Reporter.log("method2 executed", true);
	}
	
	@Test
	public void method3() 
	{
		Reporter.log("method3 executed", true);
	}
	
	
	@Test
	public void method4() 
	{
		int i=1;
		int l=0;
		int res=i/l;
		System.out.println(res);
		Reporter.log("method4 executed", true);
	}
	
	@Test
	public void method5() 
	{
		Reporter.log("method5 executed", true);
	}
	
	
}
