package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils (String ExcelPath, String SheetName)
	{
		try{
			
		workbook = new XSSFWorkbook(ExcelPath); //"
		sheet = workbook.getSheet(SheetName);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	
	}


	public static void main(String[] args) {
		getRowCount(); 
		getColCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}

	public static int getRowCount() {
		int rowCount =0;
		try {

	
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No. of rows: " + rowCount);
		}

		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return rowCount;

	}	
	
	public static int getColCount() {
		int colCount =0;

		try {

	
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No. of cols: " + colCount);
		}

		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		
		return colCount;

	}		
	public static String getCellDataString(int rowNum, int colNum) {

		String cellData = null;
		try {

			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/ExcelTestData/testdata.xlsx");
			sheet = workbook.getSheet("Sheet1");
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);


		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}	
		
		return cellData;
	}

	public static void getCellDataNumber(int rowNum, int colNum) {

		try {

			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/ExcelTestData/testdata.xlsx");
			sheet = workbook.getSheet("Sheet1");
			Double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);


		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}	
	}
}
