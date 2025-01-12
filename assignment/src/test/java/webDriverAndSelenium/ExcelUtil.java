package webDriverAndSelenium;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtil {

	    public static Object[][] readExcelData(String filePath, String sheetName) throws IOException {
	        FileInputStream file = new FileInputStream(new File(filePath));
	        Workbook workbook = new XSSFWorkbook(file);
	        Sheet sheet = workbook.getSheet(sheetName);
	        int rows = sheet.getPhysicalNumberOfRows();
	        int cols = sheet.getRow(0).getPhysicalNumberOfCells();
	        
	        Object[][] data = new Object[rows-1][cols];  // Assuming the first row is the header
	        
	        for (int i = 1; i < rows; i++) {
	            Row row = sheet.getRow(i);
	            for (int j = 0; j < cols; j++) {
	                data[i-1][j] = row.getCell(j).toString();  // Read data from the row and column
	            }
	        }
	        
	        workbook.close();
	        return data;
	    }
	}


