package pompage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageFacebook {
	
	WebDriver driver;
	
	public LoginPageFacebook (WebDriver driver)
	{
		
		this.driver = driver;
	}
	public void LogintoFb()
	{
		
		WebElement username = driver.findElement(By.xpath("//*[@id='email']"));
		username.sendKeys("pradhan.sandeep786@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("sandy12345mns");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
	}
	
	public boolean VerifyUrl()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@type='search']"));
		String UrlValue = driver.getCurrentUrl();
		
		if(UrlValue.contains("www.facebook.com/"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
