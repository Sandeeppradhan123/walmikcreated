package pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {
	static WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = "(//*[@type='button'])[2]") 
	WebElement getButton;
	
	@FindBy(xpath = "(//*[@type='text'])[2]") 
	WebElement searchField;
	
	@FindBy(xpath = "(//*[@type='button'])[4]") 
	WebElement buybutton;
	
	@FindBy(xpath = "//*[@type='submit']") 
	WebElement buyshare;
	
	public DashBoardPage(WebDriver driver)
	{
		
		this.driver = driver;
		wait = new WebDriverWait(driver, 60);
		PageFactory.initElements(driver, this);
	}
	
	public void SearchShare()
	{
		
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@type='button'])[2]")));
	//	WebElement getButton = driver.findElement(By.xpath("(//*[@type='button'])[2]"));
		getButton.click();
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@type='text'])[2]")));
	//	WebElement searchField = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		searchField.sendKeys("SBIN");
		Actions act = new Actions(driver);
		
		act.sendKeys(searchField,Keys.ENTER).perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@type='button'])[4]")));
		
	//	WebElement buybutton = driver.findElement(By.xpath("(//*[@type='button'])[4]"));
		
		buybutton.click();
		
	//    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));
			
	//	WebElement buyshare = driver.findElement(By.xpath("//*[@type='submit']"));
		 
		buyshare.click();
		 
		
		
	
	}	
		
	}
	


