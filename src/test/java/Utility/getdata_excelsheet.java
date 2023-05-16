package Utility;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getdata_excelsheet {
	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	static String FilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\Excelfiles\\Testdata_Login.xlsx";
	// static String SheetName;

	public static ArrayList<Object[]> getTableArray(String sheet) throws Exception {
		
		FileInputStream ExcelFile = new FileInputStream(FilePath);
		
		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);
		
		ExcelWSheet = ExcelWBook.getSheet(sheet);
		
		XSSFRow row = ExcelWSheet.getRow(0);
		
		int colNum = row.getLastCellNum();
		

		ArrayList<Object[]> datalist = new ArrayList<Object[]>(); // Very important

		// you can write a function as well to get Column count
		
		for (int i = 1; i <= ExcelWSheet.getLastRowNum(); i++) {
			
			String username = "", password = "";
			
			for (int j = 0; j <= row.getLastCellNum(); j++) 
			{
				  
				if (j == 0) {
					username = getCellData(i, j);
					//System.out.println(username);
				}
				else if (j == 1) 
				{
					password = getCellData(i, j);
					//System.out.println(password);
								
				}	

			}
			Object ob[] = {username, password};
			datalist.add(ob);			
		}
		return datalist;
	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		return CellData;
	}
}