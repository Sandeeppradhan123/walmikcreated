package TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@AfterTest
	public void Alert()
	{
		System.out.println("alert");
	}
	
	@Test
	public void avtar()
	{
		System.out.println("avtar test case");
	}

}
