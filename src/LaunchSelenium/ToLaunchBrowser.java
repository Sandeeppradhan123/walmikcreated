package LaunchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchBrowser {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		
		password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
//		driver.quit();
//		driver.close();
		
		
		
		
	}

}
