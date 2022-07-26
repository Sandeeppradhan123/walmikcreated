package pomtest1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest1 extends BaseTest1 {
	
	
	@Test(priority = 1)
	
	public void LoginToApp()
	{
		
		lp1.initiallogin();
		lp1.finallogin();
		
	}
	
	@Test(priority = 2)
	
	public void verifyurl()
	{
		boolean valuereturned = lp1.geturl();
		
		Assert.assertTrue(valuereturned, "test case failed");
	}

}
