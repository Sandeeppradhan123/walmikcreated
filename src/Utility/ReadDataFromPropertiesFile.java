package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {
	
	public static String readConfigData(String DataToBeRead) throws IOException
	
	{
		
		
        Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\Config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String value = prop.getProperty(DataToBeRead);
		
		return value;
	}
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\Config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String url = prop.getProperty("testsiteurl");
		
		System.out.println(url);
	}

}
