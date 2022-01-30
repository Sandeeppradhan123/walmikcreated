package TestNg;

import org.testng.annotations.Test;

public class Enabled {
	
@Test(priority = 2,enabled = true)
	
	public void login() 
	{
		
		System.out.println("login test case");
		
		
	}
	
	@Test(priority = 1,enabled = false)
	
	public void Searchbox() 
	{
		
		System.out.println("searchbox test case");
		
	}
	
	@Test(priority = 3,enabled = true)
	
	public void Buybutton()
	{
		
		System.out.println("buybutton test case");
	}

}
