package sleniumcomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationBoxPopUpHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
					
			driver.manage().window().maximize();
					
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

			WebElement confirmationbutton = driver.findElement(By.xpath("//*[@name='confirmation']"));
			
			confirmationbutton.click();
			
			Thread.sleep(2000);
			
			String textonpopup = driver.switchTo().alert().getText();
			
			System.out.println(textonpopup);
			
			driver.switchTo().alert().dismiss();
	}

}
