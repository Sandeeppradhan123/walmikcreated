package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPClass {
	@DataProvider(name = "testdata")
	
	public static String[][] Dptest() throws IOException
	{
		
		 String path = System.getProperty("user.dir")+"\\DPtest.xlsx";
			
			File src = new File(path); 
			
			FileInputStream fis = new FileInputStream (src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sh1 = wb.getSheet("Sheet1");
			
			int row = sh1.getLastRowNum();
			
			int col = sh1.getRow(0).getLastCellNum();
			
			System.out.println("number of rows are:"+row);
			
			System.out.println("number of col are:"+col);
			
			String[][] Data  = new String [row] [col];
			
			for(int i=1;i<=row;i++)
			{
				for(int j=0;j<col;j++)
				{
					Data [i-1][j]=sh1.getRow(i).getCell(j).getStringCellValue();
				}
			}
		return Data;
		
	}
	
	public static void main(String[] args) throws IOException {
		Dptest();
	}

	
}
