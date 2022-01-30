package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	
	public void testcase1()
	{
	
	Assert.assertTrue(false, "test case failed");	
		
	}
	
	@Test
	
	public void login()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("txtUsername"));
		
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		
		password.sendKeys("admin1243");
		
		WebElement btn = driver.findElement(By.name("Submit"));
		
		btn.click();
		
		WebElement msg = driver.findElement(By.xpath("//*[@id='spanMessage']"));

			String actualmsg = msg.getText();
			
			System.out.println(actualmsg);
			
			boolean ispresent = actualmsg.contains("Invalid credentials");
			
			Assert.assertTrue(ispresent);
		
			
		
	}

}
