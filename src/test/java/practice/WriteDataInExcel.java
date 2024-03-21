package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// open created excel file in java doc format
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\WriteTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet("Sheet1");
		//creating cell and set value
		sh.createRow(0).createCell(0).setCellValue("mahesh");
		sh.getRow(0).createCell(1).setCellValue("babu");
		sh.getRow(0).createCell(2).setCellValue("odisha");
		
		sh.createRow(1).createCell(0).setCellValue("imran");
		sh.getRow(1).createCell(1).setCellValue("ali");
		sh.getRow(1).createCell(2).setCellValue("bangaluru");
		
		//save the data in a excel file
		FileOutputStream fos= new FileOutputStream(".\\src\\test\\resources\\WriteTestData.xlsx");
		wb.write(fos);
		
		
	}

}
