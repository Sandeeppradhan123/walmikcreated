package custamizationofxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indexing {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
        WebElement username = driver.findElement(By.name("txtUsername"));
		
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		
		password.sendKeys("admin123");
		
         WebElement btn = driver.findElement(By.name("Submit"));
		
		btn.click();
		
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		
	
		
		for(int i=1;i<44;i++) 
		{
			
		driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
		 // driver.findElement(By.xpath("(//*[contains(@id,'defaultList__csrf_token')])["+i+"]")).click();
	}
		
		
		}

}
