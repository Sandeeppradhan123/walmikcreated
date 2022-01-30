package custamizationofxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Startwith {
	
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
	        WebElement username = driver.findElement(By.name("txtUsername"));
			
			username.sendKeys("admin");
			
			 driver.findElement(By.xpath("//*[starts-with(@name,'txtP')]")).sendKeys("admin123");
			
			
			
	         WebElement btn = driver.findElement(By.name("Submit"));
			
			btn.click();
			
	}
}
