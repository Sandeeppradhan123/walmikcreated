package sleniumcomponents;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPractice {
	
	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.manage().window().maximize();
		
		String parentid = driver.getWindowHandle();
		
		System.out.println(parentid);
		
		WebElement link = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		
		link.click();
		
		Set<String> numberofwindow = driver.getWindowHandles();
		
		
		
		for(String windowid:numberofwindow)
		{
			if(!windowid.contains(parentid))
			{
				driver.switchTo().window(windowid);
				driver.get("https://www.google.co.in/");
			}
		}
	}

}
