package custamizationofxpath;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Takescreenshot;

public class CantainsMethod {
	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@id,'emai')]")).sendKeys("pradhan.sandeep786@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sandy12345mns");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'u_0_d_')]")).click();
		
		Takescreenshot.capturescreenshot(driver, "fbscrshot1");
		                                                                     
	}

}
