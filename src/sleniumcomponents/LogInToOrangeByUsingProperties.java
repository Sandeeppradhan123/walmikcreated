package sleniumcomponents;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ReadDataFromPropertiesFile;

public class LogInToOrangeByUsingProperties {
	
public static void main(String[] args) throws IOException {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	
	
	
	driver.get(ReadDataFromPropertiesFile.readConfigData("testsiteurl"));
	
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.name("txtUsername"));
	
	username.sendKeys(ReadDataFromPropertiesFile.readConfigData("Username"));
	
	WebElement password = driver.findElement(By.name("txtPassword"));
	
	password.sendKeys(ReadDataFromPropertiesFile.readConfigData("Password"));
	
	WebElement btn = driver.findElement(By.name("Submit"));
	
	btn.click();
}

}
