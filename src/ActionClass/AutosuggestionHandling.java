package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestionHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
   		driver.get("https://www.google.co.in/");
   		
   		driver.manage().window().maximize();
   		
   		 WebElement searchfield = driver.findElement(By.xpath("//*[@name='q']"));
   		 
   		 Actions act = new Actions(driver);
   		 
   		 act.click(searchfield).sendKeys("selenium").build().perform();
   		 
   		 Thread.sleep(2000);
   		 
   		 List<WebElement> searchresult = driver.findElements(By.xpath("//*[@jsname='bw4e9b']//span[text()='selenium']"));
   		 
   		 
   		 for(WebElement searchresults:searchresult)
   		 {
   			String numberofsearches = searchresults.getText();
   			System.out.println(numberofsearches);
   			if(numberofsearches.contains("download"))
   			{
   				searchresults.click();
   				break;
   			}
   			
   		 }
   		 
   		 

      }
	}