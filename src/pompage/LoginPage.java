package pompage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage  {
	
	static WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = "//*[@id='userid']") 
	WebElement username;
	
	@FindBy(xpath = "//*[@id='password']") 
	WebElement password;
	
	@FindBy(xpath = "//*[@type='submit']") 
	WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id='pin']") 
	WebElement pin;
	
	
	
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver = driver;
		wait = new WebDriverWait(driver, 60);
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void InitialLogin()
	{
		
		username.sendKeys("VU4678");
		
		password.sendKeys("sandy12345mns");
		
		loginbutton.click();
	}
	
	public void FinalLogin() 
	{   
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		pin.sendKeys("982227");
		
		loginbutton.click();
		
		
	}
	
	public boolean GetUrl() 
	{
		
		driver.findElement(By.xpath("//*[@class='user-id']"));
		String url = driver.getCurrentUrl();
		
		       if(url.contains("dashboard"))
		    		   
				{
			     return true;
				} 
		       else
		       {
		    	   return false;
		       }
				
		
		
	}
	
	
	
	

}
