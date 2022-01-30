package LaunchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//2.LOGIN BY USING CLASSNAME OR NAME LOCATOR
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfeqaO77rdfNPRmJzTjSjKd37rVmeQL-2Q6zOd63fHICq71F84l4MpqUSliqupTXZSAM7dx5dIWUI3W84fQwxGjYCdxHBzALcX4KOCHC5UosCA&smuh=28915&lh=Ac97g24njuk_JfQJquw");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("email"));
		
		username.sendKeys("pradhan.sandeep786@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		
		password.sendKeys("sandy12345mns");
		
		WebElement btn = driver.findElement(By.name("login"));
		
		btn.click();

		
		
	
	}
	

}
