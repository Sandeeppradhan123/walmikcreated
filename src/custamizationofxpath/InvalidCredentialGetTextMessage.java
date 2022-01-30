package custamizationofxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidCredentialGetTextMessage {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.id("txtUsername")); //
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin1234");
		
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		WebElement message = driver.findElement(By.xpath("//*[@id='spanMessage']"));
		
		String actualmessage = message.getText();
		
		System.out.println(actualmessage);
			
		
	}

}
