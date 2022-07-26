package ActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestionPractice1111 {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
   		driver.get("https://www.google.co.in/");
   		
   		driver.manage().window().maximize();
   		
   		
   		
   		
   		WebElement searchfield = driver.findElement(By.xpath("//*[@name='q']"));
   		
   		Actions act = new Actions(driver);
   		
   		act.click(searchfield).perform();
   		
   		act.sendKeys("selenium").perform();
   		
   		Thread.sleep(5000);
   		
   		List<WebElement> searchresult = driver.findElements(By.xpath("//*[@class='ClJ9Yb']"));
   		
   		for(WebElement searches:searchresult)
   		{
   			String singleresult = searches.getText();
   			
   			
   			if(singleresult.contains("testing"))
   			{
   				searches.click();
   				break;
   			}
   			
   			
   			
   			
   			
   			
   			
   			
   		}
   		
	}

}
