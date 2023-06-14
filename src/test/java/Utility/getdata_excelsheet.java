package Utility;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getdata_excelsheet 
{
	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	static String FilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\Excelfiles\\Testdata_Login.xlsx";
	

	// Read the excelsheet using POI - Return as ArrayList<Object[]>
	public static ArrayList<Object[]> getTableArray(String sheet) throws Exception 
	{
		// The path of excelsheet
		FileInputStream ExcelFile = new FileInputStream(FilePath);
		
		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);  // Identify the workbook
		
		ExcelWSheet = ExcelWBook.getSheet(sheet); // Identify the Sheet
		
		XSSFRow row = ExcelWSheet.getRow(0);	// Identify the first row
		
		int colNum = row.getLastCellNum();	// Identify the number of columns in the first row
		

		ArrayList<Object[]> datalist = new ArrayList<Object[]>(); // Very important

		// you can write a function as well to get Column count
		
		for (int i = 1; i <= ExcelWSheet.getLastRowNum(); i++) { // Traverse from row 1 to last row - index-0 is the header
			
			String username = "", password = "";
			
			for (int j = 0; j <= row.getLastCellNum(); j++) // Cell starts with index 0 to last cell in a row
			{
				  
				if (j == 0) { // Username lies in index[0] position
					username = getCellData(i, j);
					//System.out.println(username);
				}
				else if (j == 1) // Password lies in index[1] position
				{
					password = getCellData(i, j);
					//System.out.println(password);
								
				}	

			}
			//for each iteration do the following
			Object ob[] = {username, password};  // Assign the username and password as a object
			datalist.add(ob);	// Assign the above object to a ArrayList...
		}
		return datalist;  // return the ArrayList to the dataprovider as ArrayList<Object> 
	}

	public static String getCellData(int RowNum, int ColNum) throws Exception 
	{
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum); // Get the reference of a cell using row and column number
		String CellData = Cell.getStringCellValue(); // Get the value of a cell using reference
		return CellData;  // return the data of the cell
	}
}