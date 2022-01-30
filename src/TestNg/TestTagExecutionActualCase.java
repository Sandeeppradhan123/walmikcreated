package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestTagExecutionActualCase {
	
	@Parameters("url")
	@Test
	
	public void NavToUrl(String website)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
				
		
		if(website.contains("facebook"))
		{
			driver.get("https://www.facebook.com/");
		}
		else if(website.contains("google"))
		{
			driver.get("https://www.google.com/");
		}
		
	}

}
