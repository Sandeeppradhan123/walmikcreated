package pompage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage1 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id='userid']") 
	WebElement username;
	
	@FindBy(xpath="//*[@id='password']") 
	WebElement password;
	
	@FindBy(xpath="//*[@type='submit']") 
	WebElement loginbutton;
	
	@FindBy(xpath="//*[@id='pin']") 
	WebElement pinfield;
	
	
	
	public LoginPage1(WebDriver driver)
	{
		
		this.driver=driver;
		 wait = new WebDriverWait(driver,30);
		PageFactory.initElements(driver, this);
		
	}
	
	public void initiallogin()
	{
		
		//WebElement username = driver.findElement(By.xpath("//*[@id='userid']"));
		
		username.sendKeys("VU4678");
		
		//WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		
		password.sendKeys("sandy12345mns");
		
		//WebElement loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
		
		loginbutton.click();
	}
	
	public void finallogin()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebElement pinfield = driver.findElement(By.xpath("//*[@id='pin']"));
		
		pinfield.sendKeys("982227");
		
		loginbutton.click();
	}
	
	public boolean geturl()
	{
	
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@type='button']")));
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
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
