package sleniumcomponents;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ExcelReader;
import Utility.ReadDataFromPropertiesFile;

public class LogInToOrangeByUsingExcelReader {
	
public static void main(String[] args) throws IOException {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	
	
	
	driver.get(ReadDataFromPropertiesFile.readConfigData("testsiteurl"));
	
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.name("txtUsername"));
	
	username.sendKeys(ExcelReader.getData(0, 0));
	
	WebElement password = driver.findElement(By.name("txtPassword"));
	
	password.sendKeys(ExcelReader.getData(0, 1));
	
	WebElement btn = driver.findElement(By.name("Submit"));
	
	btn.click();
}

}
