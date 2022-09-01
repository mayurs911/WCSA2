package p10_08_22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib3 {

	public String readExcelData(String excelPath, String sheet, int rowCount, int cellCount) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheet);
	Row row = sh.getRow(rowCount);
	Cell cell = row.getCell(cellCount);
	String data = cell.getStringCellValue();
	return data;
	}
	
	public int getRowCount(String excelPath, String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheet);
		int rc = sh.getLastRowNum();
		return rc;
		
		
	}
}

