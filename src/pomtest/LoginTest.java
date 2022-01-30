package pomtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pompage.LoginPage;

public class LoginTest extends BaseTest {
	
	
	@Test(priority = 1)
	
	public void LoginToApp() 
	{
		
		lp.InitialLogin();
		lp.FinalLogin();
		
	}
	
	@Test (priority = 2)
	public void VerifyUrl() 
	{
		
		boolean valuereturn = lp.GetUrl();
		
		Assert.assertTrue(valuereturn, "test case failed");
		
	}
	
	

}
