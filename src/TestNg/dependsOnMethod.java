package TestNg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethod {
	
@Test(priority = 2)
	
	public void login() 
	{
		
		System.out.println("login test case");
		
		Assert.fail();
	}
	
	@Test(priority = 1,dependsOnMethods = "login")
	
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
