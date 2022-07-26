package pompage2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage2 {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement userid;
	
	@FindBy(xpath="//*[@id='pass']")
	WebElement pass;
	
	@FindBy(xpath="//*[@name='login']")
	WebElement loginbutton;
	
	public LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginfbvalidcredentials()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebElement userid = driver.findElement(By.xpath("//*[@id='email']"));
		
		userid.sendKeys("pradhan.sandeep786@gmail.com");
		
		//WebElement pass = driver.findElement(By.xpath("//*[@id='pass']"));
		
		pass.sendKeys("sandy12345mns");
		
		//WebElement loginbutton = driver.findElement(By.xpath("//*[@name='login']"));
		
		loginbutton.click();
		
	}
	
	public boolean geturl()
	{
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='a8c37x1j ms05siws hwsy1cff b7h9ocf4 py1f6qlh em6zcovv'])[1]")));
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("facebook.com"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
