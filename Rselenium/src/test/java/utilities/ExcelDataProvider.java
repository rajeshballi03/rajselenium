package utilities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	@Test (dataProvider="test1Data")
	public void test1(String username, String password) { //No. of columns in your test data excel
		System.out.println(username+ " | " + password);
		
	}
	
	
	@DataProvider(name = "test1Data")
	public Object[][] getData() {
		String projectPath = System.getProperty("user.dir");		
		String excelPath = projectPath+"/ExcelTestData/testdata.xlsx";
		Object data[][] = testData(excelPath, "sheet1");
		return data;
	}
	
	
	public Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for (int i=1; i<rowCount; i++) {
			
			for(int j=0 ; j<colCount; j++) {
				
				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData+ " | ");
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		return data;
		
	}

}
