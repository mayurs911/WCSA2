package pageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class TestActiTimeInvalidLogin extends BaseTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");
	
		for (int i = 1; i <= rc; i++) 
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			// perform invalid login
			lp.invalidLoginActiTime(invalidUsername, invalidPassword);
				}

		}
	}

