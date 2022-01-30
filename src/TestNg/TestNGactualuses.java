package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGactualuses {
	
	
	@BeforeSuite
	public void OpenBrowser()
	{
		
		System.out.println("browser get launch");
		
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		System.out.println("browser get shut");
	}
	
	@BeforeTest
	public void navtotesturl()
	{
		System.out.println("navigate to to test url");
	}
	
	@AfterTest
	public void NavBacktoOriginalUrl()
	{
		System.out.println("navigate back to original url");
	}
	
	@BeforeClass
	public void login()
	{
	System.out.println("login to app");	
	}	
		
	@AfterClass
	public void logout()
	{
		System.out.println("log off");
	}
		
	@BeforeMethod
	public void NavigatetoPage()
	{
		System.out.println("navigate to specific page");
	}
	
	@AfterMethod
	public void BacktoPreviousPage()
	{
		System.out.println("back to previous page");
	}
	
	@Test
	public void Testcase()
	{
		System.out.println("test case specific functionality");
	}
	
	
	
	
	
	
	

}
