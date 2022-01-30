package LaunchSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchSelenium {
	
	
		
		public static void main(String[] args) throws InterruptedException {
					System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					
					driver.get("https://accounts.google.com/b/0/AddMailService");
					
					Thread.sleep(2000);
					
					driver.get("https://www.google.com/search?q=kite+login&rlz=1C1CHZN_enIN978IN978&oq=&aqs=chrome.1.35i39i362l3j46i39i199i362i465j35i39i362j46i39i199i291i362j35i39i362l2.2803540162j0j7&sourceid=chrome&ie=UTF-8");
					
					driver.navigate().back();     // to perform back operation
					
					driver.navigate().forward();  //to perform forword operation
					
					Thread.sleep(2000);
					
					driver.navigate().refresh();  //to perform refresh operation
					
					driver.manage().window().maximize(); // to maximize the window
					
					Thread.sleep(3000);
					
					driver.close();  // to close the browserh
					
					
		}



}
