package TestNg;

import org.testng.annotations.Test;

public class ParallelExecutionOfTestTagExm1 {
	
@Test()
	
	public void login() 
	{
		
		System.out.println("login test case");
		
		
	}
	
	@Test()
	
	public void Searchbox() 
	{
		
		System.out.println("searchbox test case");
		
	}
	
	@Test()
	
	public void Buybutton()
	{
		
		System.out.println("buybutton test case");
	}


}
