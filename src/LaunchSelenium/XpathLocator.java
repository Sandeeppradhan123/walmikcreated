package LaunchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class XpathLocator {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/i/flow/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pradhan.sandeep786@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sandy12345mns");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
