package sleniumcomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildbrowserPopupHndling {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
					
			driver.manage().window().maximize();
					
			driver.get("https://groww.in/");

			driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Login/Register']")).click();
			
			
			driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("abcd@gmail");
	}

}
