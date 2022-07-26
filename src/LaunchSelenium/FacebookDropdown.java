package LaunchSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDropdown {
	
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
         driver.get("https://www.facebook.com/signup");	
		driver.manage().window().maximize();
		
		
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));
		
		int numberofdays = days.size();
		System.out.println(numberofdays);
		
		for(WebElement actualday:days)
		{
			
			String date = actualday.getText();
			if(date.equals("15"))
			{
				actualday.click();
			}
		}
	}

}
