package sleniumcomponents;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	private static final String[][] String = null;

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.manage().window().maximize();
		
		String parentid = driver.getWindowHandle();
		
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();

		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		Set<String> allwindid = driver.getWindowHandles();
		
		
		int numberofwind = allwindid.size();
		
		String windid [] = new String [numberofwind];
		
		int i = 0;
	    for(String id:allwindid)
		{
			
	    	 windid [i] = id;
			
			i++;
			
	    }
		
		driver.switchTo().window(windid [1]);
		
		driver.get("https://www.google.co.in/");
		
		
		
		
		
		
		
		

	}

}

