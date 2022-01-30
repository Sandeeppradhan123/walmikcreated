package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	
@Parameters	
@Test
	
	public void testcase1(String env)
	
	{
		int i = 30;
		int j=  20;
	
		boolean k = i<j;
		
		boolean l = i>j;
		
		org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();
		
		
		
		sa.assertFalse(k, "this test case is failed");
		
		System.out.println("after soft assert failed");
		
		sa.assertAll();
	}
}
