package sleniumcomponents;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.manage().window().maximize();
		
		String parentid = driver.getWindowHandle();
		
		System.out.println(parentid);
		
		WebElement hrmlink = driver.findElement(By.xpath("(//*[@target='_blank'])[1]"));
		
		hrmlink.click();
		
		Set<String> allwindid = driver.getWindowHandles();
		
		System.out.println(allwindid);
		
		for(String windid:allwindid)
			
		{
			
			System.out.println(windid);
			if(!(windid.equals(parentid)))
		    {
				driver.switchTo().window(windid);
				driver.get("https://www.google.co.in/");
			}
			
		}
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
	}

}
