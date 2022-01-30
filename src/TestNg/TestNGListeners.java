package TestNg;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Takescreenshot;

public class TestNGListeners extends ListenersTest implements ITestListener

{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("test case started :"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
	
	System.out.println("test case pass:"+result.getTestName());	
		
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		
	System.out.println("test case failed:"+result.getTestName());	
	
	try {
		Takescreenshot.capturescreenshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("test case started:"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) 
	{
	System.out.println("test case finish:"+context.getName());	
	}
	
	

}
