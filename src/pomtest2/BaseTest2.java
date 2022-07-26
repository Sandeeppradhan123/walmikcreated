package pomtest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompage2.LoginPage2;

public class BaseTest2 {
	
	static WebDriver driver;
	LoginPage2 lp2;
	
	@BeforeSuite
	public void initbrowser()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 
		 ChromeOptions option = new ChromeOptions();
		 
		 option.addArguments("--disable-notifications");
		 option.addArguments("--start-maximized");
			
		 driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
			
	     driver.get("https://www.facebook.com/");	
	}
	
	@BeforeClass
	public void createobject()
	{
		 lp2 = new LoginPage2(driver);
	}

}
