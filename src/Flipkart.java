import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		
		WebElement morebutton = driver.findElement(By.xpath("//*[@class='exehdJ']"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(4000);
		
		act.moveToElement(morebutton).perform();
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
		
		
		
		
		
		
		
		
	}

}
