package LaunchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NmaeandClassLocator {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com/login/");
		 
		 WebElement username = driver.findElement(By.name("email"));
		 
		 username.sendKeys("pradhan.sandeep786@gmail.com");
		 
		WebElement pass = driver.findElement(By.name("pass"));
		
		pass.sendKeys("sandy12345mns");
		//Thread.sleep(2000);

		
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
//		Thread.sleep(2000);
//		driver.close();
		
	//	pass.clear();
		
	}

}
