package sleniumcomponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {
	
	  public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
					
			driver.manage().window().maximize();
					
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

			WebElement alertbutton = driver.findElement(By.xpath("//*[@name='alert']"));
			
			alertbutton.click();
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		//	Thread.sleep(2000);
			
			String textonalertpopup = driver.switchTo().alert().getText();
			
			System.out.println(textonalertpopup);
			
			driver.switchTo().alert().accept();
			
			
	
	}
}
