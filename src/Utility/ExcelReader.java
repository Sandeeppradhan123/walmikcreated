package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	public static void WriteData() throws IOException
	{
		 String path = System.getProperty("user.dir")+"\\testdata.xlsx";
			
			File src = new File(path); 
			
			FileInputStream fis = new FileInputStream (src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sh1 = wb.getSheet("testsheet2");
			
			File fout = new File(path); 
			
			FileOutputStream fos = new FileOutputStream(fout);
			// to add data in existing rows and column
			//sh1.getRow(3).getCell(1).setCellValue("sandip");
			// to add data in rows and column which is not present in excel
			sh1.createRow(21).createCell(2).setCellValue("pradhanpatil1");
			sh1.createRow(33).createCell(3).setCellValue("aurangabad2");
			
			wb.write(fos);
		
		
	}
	
	public static String ExcelHandling(int row,int coulmn) throws FileNotFoundException
	{
		String path = System.getProperty("user.dir")+"\\testdata.xlsx";
		
		File src = new File(path);
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook xsw = new XSSFWorkbook();
		
		XSSFSheet sh1 = xsw.getSheet("sheet1");
		
		String value = sh1.getRow(2).getCell(1).getStringCellValue();
		System.out.println(value+"value we get");
		
		DataFormatter df = new DataFormatter( );
		
		String formattostring = df.formatCellValue(sh1.getRow(row).getCell(coulmn));
		
		return formattostring;
		
	}
	
	public static String getData(int row , int coulmn) throws IOException
	{
		WriteData();
		ExcelHandling(2, 1);
        String path = System.getProperty("user.dir")+"\\testdata.xlsx";
		
		File src = new File(path); 
		
		FileInputStream fis = new FileInputStream (src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("sheet1");
		
	//	String value = sh1.getRow(6).getCell(0).getStringCellValue();
		
		DataFormatter df = new DataFormatter();
		
		String cellvalue = df.formatCellValue(sh1.getRow(row).getCell(coulmn));
		
		return cellvalue;
		 
	}
		
	
	
	
	public static void main(String[] args) throws IOException 
	{
		
WriteData();
		String path = System.getProperty("user.dir")+"\\testdata.xlsx";
		
		File src = new File(path); 
		
		FileInputStream fis = new FileInputStream (src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("sheet1");
		
	//	String value = sh1.getRow(6).getCell(0).getStringCellValue();
		
		DataFormatter df = new DataFormatter();
		
		String value = df.formatCellValue(sh1.getRow(6).getCell(0));
		
		System.out.println(value);
	}

}
