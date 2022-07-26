package LaunchSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement linkpresent = driver.findElement(By.tagName("a"));
		System.out.println(linkpresent);
		
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//*[@name='txtPassword']"));
		password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		driver.findElement(By.cssSelector("a#menu_admin_viewAdminModule")).click();
		
		 List<WebElement> checkboxes = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
		 
		 int numberofcheckbox = checkboxes.size();
		 System.out.println(numberofcheckbox);
		
		for(WebElement checkbox:checkboxes)
		{
			checkbox.getText();
			System.out.println();
			checkbox.click();
		}
	}

}
