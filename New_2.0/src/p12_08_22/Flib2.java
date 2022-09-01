package p12_08_22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib2 {

	// generic reusable method for read data from excel file

	public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}

	// generic reusable method for getRowCount from excel file
	public int getRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;

	}
	// generic reusable method for write data in excel file
	
	public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCount, String data) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}
	
	
	// generic reusable method to get data from properties file
	
	public String readPropertyFileData(String excelPath, String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		System.out.println(value);
		return value;
		
	}
}


