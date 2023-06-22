package Maven_TestNGNew.Maven_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;



public class ExcelDataprovider {
@DataProvider(name="testdata")
  public  Object[][] logincredientials() throws IOException {
	  File file=new File("C:\\Users\\swarn\\eclipse-workspace\\Maven_TestNG\\Resources\\Textfile.xlsx");
	  FileInputStream excelfile=new FileInputStream(file);
	  XSSFWorkbook workbook=new XSSFWorkbook(excelfile);
	 XSSFSheet sheet=workbook.getSheet("Sheet1");
	 int rowcount=sheet.getLastRowNum();
	 System.out.println(rowcount);
	 int colcount=sheet.getRow(0).getLastCellNum();
	 Object[][] data=new Object[rowcount][colcount];
	 for(int i=1;i<rowcount-1;i++) {
		 for(int j=0;j<colcount;j++) {
			 DataFormatter df=new DataFormatter();
			data[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		 
		 }
	 return data;
	  
	  
  }
}
