package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	
	public void testcase1()
	
	{
		int i = 30;
		int j=  20;
	
		boolean k = i<j;
		
		boolean l = i>j;
		
		org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();
		
		
		
	//	sa.assertFalse(k, "this test case is failed");
		sa.assertFalse(l, "test failed");
		System.out.println("after soft assert failed");
		
		sa.assertAll();
		
	}
	
	@Test
	
	public void testcase2()
	
	{
		String s1 = "sandip";
		
		String s2= "sandeep";
		org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();
		
		sa.assertEquals(s1, s2);
		
		System.out.println("string are not equals");
		
		sa.assertAll();
		
	}
	
	@Test
	
	public void testcase3()
	
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
		
		org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();

			sa.assertEquals(actualmsg, "Invalid credentials ");		
			
		
	}
	
	
	
	
	
	
	
	
	
	

}
