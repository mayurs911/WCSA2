package p09_08_22;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read6 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("sheet2");

		Row row = sh.getRow(5);

		Cell cell = row.getCell(0);

		String data = cell.getStringCellValue();
		
		System.out.println(data);
	}
}
