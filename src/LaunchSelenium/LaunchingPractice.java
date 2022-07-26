package LaunchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement linksonwebpage = driver.findElement(By.tagName("a"));
		
		System.out.println(linksonwebpage);
		
//		Thread.sleep(2000);
//		
//		driver.get("https://www.facebook.com/login/");
//		
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
//		
//		Thread.sleep(2000);
//
//		driver.manage().window().maximize();
//		
//		Thread.sleep(2000);
//
//		
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//
//		
//		driver.close();
		
	}

}

