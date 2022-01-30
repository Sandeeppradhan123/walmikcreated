package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLogMethod {
	
    @Test(priority = 2)
	
	public void login() 
	{
		
		System.out.println("login test case");
		Reporter.log("login test case 1", false);
		
	}
	
	@Test(priority = 1)
	
	public void Searchbox() 
	{
		
		System.out.println("searchbox test case");
		Reporter.log("searchbox test case 1", true);
		
	}
	
	@Test(priority = 3)
	
	public void Buybutton()
	{
		
		System.out.println("buybutton test case");
		Reporter.log("buybutton test case 1", false);
	}

}
