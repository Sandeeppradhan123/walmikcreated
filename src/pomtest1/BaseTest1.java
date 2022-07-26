package pomtest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompage1.LoginPage1;

public class BaseTest1 {
	
	static WebDriver driver;
	LoginPage1 lp1;
	@BeforeSuite
	public void initbrowser()
	{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
		 driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
			
	     driver.get("https://kite.zerodha.com/");	
		
	}
	@BeforeClass
	public void createobj()
	{
		 lp1= new LoginPage1(driver);
	}

}
