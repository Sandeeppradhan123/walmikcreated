package TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GroupingOfTestCases {
	
@Test(priority = 1, groups = "regression")
	
	public void login() 
	{
		
		System.out.println("login test case");
		
		
	}
	
	@Test(priority = 2,groups = "functional")
	
	public void Searchbox() 
	{
		
		System.out.println("searchbox test case");
		
	}
	
	@Test(priority = 3,groups = {"functional","regression"} )
	
	public void Buybutton()
	{
		
		System.out.println("buybutton test case");
	}
	
	@Test (priority = 5,groups = {"regression","sanity"})
	public void Alert()
	{
		System.out.println("alert");
	}
	
	@Test(priority = 6,groups = {"functional","sanity"})
	public void avtar()
	{
		System.out.println("avtar test case");
	}
	
	@Test(priority = 7,groups = {"sanity"})
	
	public void performence()
	{
		
	System.out.println("performance test case ");
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
