package sleniumcomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTextTobeChangeByValue {
	
	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://chercher.tech/practice/explicit-wait");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id='populate-text']")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, 60);
			
			wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='h2']"), "selenium Webdriver"));
			
			
	}

}
