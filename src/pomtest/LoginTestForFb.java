package pomtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestForFb extends BaseTestForFb {
	
	
	
@Test(priority = 1)
	
	public void LoginToApp() 
	{
		
		lpb.LogintoFb();
		
		
	}
	
	@Test (priority = 2)
	public void VerifyUrl() 
	{
		
		boolean valuereturn = lpb.VerifyUrl();
		
		Assert.assertTrue(valuereturn, "test case failed");
		
	}


}
