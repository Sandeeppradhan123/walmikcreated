package LaunchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("pradhan.sandeep786@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement passw = driver.findElement(By.id("pass"));
		
		passw.sendKeys("sandy12345mns");
		
		Thread.sleep(2000);
		
		WebElement loginbtn = driver.findElement(By.id("loginbutton"));

		loginbtn.click();
		
		

		
		
	}

}
