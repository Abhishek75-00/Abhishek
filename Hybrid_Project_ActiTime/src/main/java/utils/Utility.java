package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void capture(WebDriver driver,int testid ,String methodName) throws IOException   {
		// TODO Auto-generated method stub

		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date date=new Date();
		String dateTime=sdf.format(date);
		
		String screenshotName=dateTime+"_"+ testid +"_"+methodName;
		//Takes screenshot using Webdriver 
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	String dest="C:\\Users\\Abhishek\\eclipse-workspace\\Hybrid_Project_ActiTime\\test-output\\ScreenShot\\"+screenshotName+".png";
	File Destination=new File(dest);
FileHandler.copy(source, Destination);		
		//ImageIO.write(ImageIO.read(source), "png", Destination);
	}
	 private static final String FILE_NAME="src/main/resources/test-data/test12345.xlsx";
	   
	   public static String fetchExcelData(String sheetName ,int row , int cell) {
		   
		   String data=null;
		   FileInputStream file=null;
		   Workbook workbook =null;
		   
		   try {
			   file=new FileInputStream(FILE_NAME);
			   workbook=new XSSFWorkbook(file);
			   Sheet sheet=workbook.getSheet(sheetName);
			   Row rowObj=sheet.getRow(row);
			   Cell cellobj=rowObj.getCell(cell);
			   data =cellobj.getStringCellValue();
		   }
		   catch(IOException e) {
			   e.printStackTrace();
		   }
		   finally {
			   try {
				   if(data!=null) {
					   file.close();
				   }
				   if(workbook != null) {
					   file.close();
				   }
				   if(file !=null) {
					   file.close();
				   }
			   }
			   catch(IOException e) {
				   e.printStackTrace();
			   }
			   }
		   return data;
		   }
	    
}
	

		   
			   
			   
		   
	   
	   

	