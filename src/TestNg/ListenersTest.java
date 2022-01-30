package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersTest {
	static WebDriver driver;
	@Test
	public void logintoapp() 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("txtUsername"));
		
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		
		password.sendKeys("admin1234");
		
		WebElement btn = driver.findElement(By.name("Submit"));
		
		btn.click();

		String url = driver.getCurrentUrl();
		
		boolean ispresent = url.contains("dashboard");
		
		Assert.assertTrue(ispresent);
		
		}
	@Test
	public void testcase2()
	{
		
		
		int i = 30;
		int j=  20;
	
		boolean k = i<j;
		
		boolean l = i>j;
		
		Assert.assertTrue(k);
		
		
		
		
		
		
		
		
		
	}

}
