package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file---->WorkBook----->SHeets------>Rows----->Cells

public class ReadingDataFromExecel {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\Testdata\\Book1.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet =workbook.getSheet("Sheet1");
		
		
	}
	
}
