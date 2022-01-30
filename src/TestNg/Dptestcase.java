package TestNg;

import org.testng.annotations.Test;

public class Dptestcase {
	
	
	@Test(dataProvider = "testdata", dataProviderClass = TestNg.DPClass.class)
	
	public void testcase(String s1 ,String s2)
	{
		
		System.out.println(s1+" "+s2);
		
	}

}
