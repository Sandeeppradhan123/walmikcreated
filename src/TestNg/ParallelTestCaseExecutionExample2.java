package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestCaseExecutionExample2 {
	
	
	@Test
	public void LaunchingChromeForOrange()
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");


			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://opensource-demo.orangehrmlive.com/");
		

}
}