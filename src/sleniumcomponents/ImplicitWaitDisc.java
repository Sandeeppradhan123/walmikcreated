package sleniumcomponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWaitDisc {
	
	

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
        org.openqa.selenium.interactions.Actions act = new Actions(driver);
         
		WebElement searchfield = driver.findElement(By.xpath("//*[@name='q']"));
		
		act.sendKeys(searchfield, "india").sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//*[text()='State Bank of India']")).click();
		
	}

	
}
