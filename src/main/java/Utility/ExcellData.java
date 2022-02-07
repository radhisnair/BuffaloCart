package Utility;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcellData {

	
	public static Object[][] getDataFromSheet(String filepath) throws EncryptedDocumentException, IOException, InvalidFormatException 
	
	 { 			
		Object[][] data;  			
		FileInputStream inputStream = new FileInputStream(filepath); 			
		Workbook wb = WorkbookFactory.create(inputStream); 			
		Sheet s = wb.getSheet("Sheet1"); 
		
		int rowCount = s.getLastRowNum();//Returns no:of rows 
		int colCount = s.getRow(0).getLastCellNum();//Returns no:of cells/coloumns.
		data = new Object[rowCount][colCount]; 			
		for (int i = 1; i <= rowCount; i++) 
		{ 				
			for (int j = 0; j <= colCount-1; j++)
			{ 					
				if (!getCellValue(s, 0, j).equals("")) 
				{ 						
					data[i - 1][j] = getCellValue(s, i, j); 					
					} 				
				} 			
			} 
		return data; 		
		}  
	
	
	private static String getCellValue(Sheet sheet, int row, int col) 
	{ 			
		String value = ""; 			
		if (sheet.getRow(row).getCell(col) == null) 
		{ 				value = ""; 			
		} else if (sheet.getRow(row).getCell(col).getCellType() == Cell.CELL_TYPE_STRING) 
		{ 				value = sheet.getRow(row).getCell(col).getStringCellValue(); 		
		} else 
		{ 				
			sheet.getRow(row).getCell(col).setCellType(Cell.CELL_TYPE_STRING); 				
			value = sheet.getRow(row).getCell(col).getStringCellValue(); 			
			} 			
		return value; 		
			  	
	}



}



	




