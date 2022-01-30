package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionHower {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.manage().window().maximize();
		
		
		
		WebElement username = driver.findElement(By.id("txtUsername")); //
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		 WebElement btn = driver.findElement(By.name("Submit"));
			
	     btn.click();
	     
	    WebElement admintab = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
	     
	     Actions act = new Actions(driver);
	     
	     act.moveToElement(admintab).perform();
	     
	     WebElement userarrow = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
	     
	     Thread.sleep(2000);
	     act.moveToElement(userarrow).perform();
	     
	    // driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
	     
	     act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
	     
	     
			
	     
	
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
	}

}
