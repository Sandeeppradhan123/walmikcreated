package TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {
	
	@AfterSuite
	public void aftersuite()
	{
		
	System.out.println("After suite");	
		
	}
	
	
	@BeforeTest
	public void BeforeTest()
	{
		
	System.out.println("before test");	
		
	}
	
	@AfterTest
	
	public void AfterTest()
	{
		
		System.out.println("aftertest");
			
	}
	
	@Test
	public void dashboard()
	{
		
	System.out.println("Dashboard test case running");	
		
	}

}
