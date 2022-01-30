package sleniumcomponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluientWait1 {
public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/explicit-wait");
		
		driver.manage().window().maximize();
		
		
	    FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    		                    .withTimeout(Duration.ofSeconds(60))
	    		                    .pollingEvery(Duration.ofSeconds(5));
	    driver.findElement(By.xpath("//*[@id='populate-text']")).click();
	    wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='h2']"), "Selenium Webdriver"));
		
		
	
}
}
