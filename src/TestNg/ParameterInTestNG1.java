package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterInTestNG1 {
	
	WebDriver driver;
	@Parameters("browsers")
	@Test 
	public void logintoBrowser(String browsername)
	{
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			
		}
		else
		{
//			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
//			
//			 driver = new geckoDriver();
			
			System.out.println("firefox is running");
		}
		
		
	}

}
