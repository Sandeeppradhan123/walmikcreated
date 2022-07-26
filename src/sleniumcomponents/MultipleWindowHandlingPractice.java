package sleniumcomponents;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandlingPractice {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
			driver.manage().window().maximize();
			
			String parentid = driver.getWindowHandle();
			
			System.out.println(parentid);
			
			driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
			
			driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();

			driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
			
			Set<String> allwindowid = driver.getWindowHandles();
			
			int windowid = allwindowid.size();
			
			String [] id= new String [windowid];
			int i=0;
			for(String singleid:allwindowid)
			{
				id[i]=singleid;
				i++;
			}
			
			driver.switchTo().window(id[3]);
			driver.get("https://www.google.co.in/");
			
	}

}
