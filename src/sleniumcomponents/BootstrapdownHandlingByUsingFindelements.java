package sleniumcomponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapdownHandlingByUsingFindelements {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		List<WebElement> day = driver.findElements(By.xpath("//*[@id='day']//option"));
		
		for(WebElement actualday:day)
		{
			String datevalues = actualday.getText();
			System.out.println(datevalues);
			if(datevalues.equals("15"))
			{
				actualday.click();
			}
		}
		
		List<WebElement> month = driver.findElements(By.xpath("//*[@id='month']//option"));
		
		for(WebElement actualmonth:month)
		{
			String monthvalues = actualmonth.getText();
			System.out.println(monthvalues);
			if(monthvalues.equals("Jun"))
			{
				actualmonth.click();
			}
			
			}
		
		List<WebElement> year = driver.findElements(By.xpath("//*[@id='year']//option"));
		
		for(WebElement actualyear:year)
		{
			String yearvalue = actualyear.getText();
			System.out.println(yearvalue);
			
			if(yearvalue.contains("1996"))
			{
				actualyear.click();
			}
			
		}
		
      
	}

}
