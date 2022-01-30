package sleniumcomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdownHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://zoom.us/signup");
	    
	   
	    
	    for(int i=10; i<11;i++)
	    {
	    	
	    
	    driver.findElement(By.xpath("//*[@id='select-0']")).click();
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='select-item-select-0-"+i+"']")).click();
	    }
	    for(int i=14; i<15;i++)
	    {
	    	
	    
	    driver.findElement(By.xpath("//*[@id='select-1']")).click();
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='select-item-select-1-"+i+"']")).click();
	    }
	    for(int i=95; i<96;i++)
	    {
	    	
	    
	    driver.findElement(By.xpath("//*[@id='select-2']")).click();
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='select-item-select-2-"+i+"']")).click();
	    }
	   
	    driver.findElement(By.xpath("//*[@class='zm-button__slot']")).click();
	}

}
