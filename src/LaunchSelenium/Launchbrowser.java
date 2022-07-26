package LaunchSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		
		driver.get("https://www.facebook.com/home.php");
		
		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.close();
		Thread.sleep(3000);
		driver.quit();
	}

}
