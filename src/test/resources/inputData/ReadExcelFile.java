package inputData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelFile {

	
	@Test
	public void readExcelFile() throws IOException {
		
		String filePath = "C:\\rtlWS\\com.ts.htle\\src\\test\\resources\\inputData\\Data.xlsx";
		
		File file = new File(filePath); // creates file
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet1= workbook.getSheetAt(0);
		String data0=sheet1.getRow(0).getCell(0).getErrorCellString();
		System.out.println(data0);
		
		
	}
}
