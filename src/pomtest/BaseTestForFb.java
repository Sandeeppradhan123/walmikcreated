package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompage.LoginPage;
import pompage.LoginPageFacebook;

public class BaseTestForFb {
	
	
	
	static WebDriver driver;
	LoginPageFacebook lpb;
	@BeforeSuite
	public void initBrowser()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://www.facebook.com/login/");		
	}
	
	@BeforeClass
	public void CreateObject()
	{
		
		lpb = new LoginPageFacebook(driver);
		
	}


}
