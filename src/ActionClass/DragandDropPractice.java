package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropPractice {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		
		Actions act = new Actions(driver);
		
		WebElement dragobject = driver.findElement(By.xpath("//*[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		
		WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		act.dragAndDrop(dragobject, droppable).perform();
		
		driver.switchTo().parentFrame();
		
		act.dragAndDropBy(dragobject, 420, 0).perform();
		
	}

}
