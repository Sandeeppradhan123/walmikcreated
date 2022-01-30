package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookSignuppageaction {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		
		Actions act = new Actions(driver);
		
		act.click(firstname).perform();
		
		act.sendKeys("sandip").sendKeys(Keys.TAB).sendKeys("pradhan").sendKeys(Keys.TAB).sendKeys("9822275831").build().perform();
		
	}

}
