package sleniumcomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandlingByUsingSalectClass {
	public static void main(String[] args) throws InterruptedException {
		
	
			
		   System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
					
			WebDriver driver = new ChromeDriver();
					
			driver.manage().window().maximize();
					
//			driver.get("https://www.facebook.com/signup");
//					
//			WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
//			
//			
//		     Select daysel = new Select(day);			
//			
//		     daysel.selectByVisibleText("23");
//		     
//		     Thread.sleep(2000);
//		     
//		     daysel.selectByIndex(15);
//		     
//		     Thread.sleep(2000);
//		     
//		     daysel.selectByValue("10");

			driver.get("https://www.facebook.com/signup");
			
			WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
			
			Select dayselect = new Select(day);
			
			dayselect.selectByIndex(29);
			Thread.sleep(2000);
			dayselect.selectByValue("11");
			Thread.sleep(2000);

			dayselect.selectByVisibleText("12");
		     
		
		

	}
	
	}


