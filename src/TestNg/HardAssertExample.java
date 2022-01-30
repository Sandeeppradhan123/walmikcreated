package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
	
	@Test
	
	public void testcase1()
	
	{
		int i = 30;
		int j=  20;
	
		boolean k = i<j;
		
		boolean l = i>j;
		
		Assert.assertFalse(k, "test case failed");
		//Assert.assertFalse(l, "test case failed looked it");
	}
	
	@Test
	
	public void testcase2()
	
	{
		String s = "velocity";
		
		String s2 = "veelocity";
		
		Assert.assertEquals(s, s2);
		
		
	}

}
