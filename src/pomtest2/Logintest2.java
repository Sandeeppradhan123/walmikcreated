package pomtest2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintest2 extends BaseTest2 {
	
	
	@Test
	
	public void verifyurl()
	{
		lp2.loginfbvalidcredentials();
		boolean booleanvalue = lp2.geturl();
		
		Assert.assertTrue(booleanvalue, "test case get failed");
	}

}
