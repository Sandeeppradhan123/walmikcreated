package TestNg;

import org.testng.annotations.Test;

public class DependsOnMethod2 {
	
	
	@Test (priority = 4, dependsOnMethods = "TestNg.dependsOnMethod.Searchbox")
	
	public void alert()
	{
		
		System.out.println("alert method");
		
	}

}
