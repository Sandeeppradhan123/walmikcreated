package sleniumcomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadingFile {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
				
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		WebElement choosefilebutton = driver.findElement(By.xpath("//*[@name='upload']"));
		
		              
		choosefilebutton.sendKeys("C:\\Users\\SANDIP\\Videos");
		
		
		
		
	}

}
