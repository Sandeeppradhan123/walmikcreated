package TestNg;

import org.testng.annotations.Test;

public class InclusionExclusion {
	
	
@Test(priority = 2)
	
	public void login() 
	{
		
		System.out.println("login test case");
		
		
	}
	
	@Test(priority = 1)
	
	public void Searchbox() 
	{
		
		System.out.println("searchbox test case");
		
	}
	
	@Test(priority = 3)
	
	public void Buybutton()
	{
		
		System.out.println("buybutton test case");
	}


}
