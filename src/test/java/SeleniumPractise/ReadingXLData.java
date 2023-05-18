package SeleniumPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingXLData {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.switchTo().window(null);
		
		
		
		/*
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\AutoTestData.xlsx");
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet  = workbook.getSheet("Test Sheet");
		
		int rows = sheet.getLastRowNum();
		
		int column = sheet.getRow(0).getLastCellNum();
		
		System.out.println(rows);
		System.out.println(column);
		
		
		for(int i=0;i<=rows;i++)
			
		{
			XSSFRow Row = sheet.getRow(i);
			
			for(int j=0;j<column;j++)
			{
				
				String Cell = Row.getCell(j).toString();
				if(i==0) {
					System.out.print("      " +Cell);
				}
				else
				{
					System.out.print(" " +Cell);
				}
				
				
			}
			System.out.println("   ");
		}
		
	
		
		
		
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\AutoTestData2.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("All Plan Data");
		XSSFRow row  = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Peddireddy");
				

		
		
		
		
		//sheet.createRow(0).createCell(0).setCellValue("Peddireddy Hari");
		
		workbook.write(file);
		
		workbook.close(); 
		file.close();
			*/
		String word  = "welcome";
		int count = 0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
			{
				System.out.println(word.charAt(i));
				count++;
			}
			
		}	
		System.out.println(count);
		
		int sum=ReadingXLData.num(2000,1400,6000);
		System.out.println(sum);
		
	
		
		
	}
	
	
	
	public static int num(int sal ,int a,int b)
	{
		
		int sum=0;
//		sal = 2000;
//		a=2000;
//		b=5000;
		sum=sal+a+b;
		return sum;
		
	}
}
