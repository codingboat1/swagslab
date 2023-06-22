package com.swaglabs.utlity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class Testdataprovider  {
	public XSSFWorkbook wb;
	public Testdataprovider() throws Exception{
	//File file=new File("./Testdata/datasheet.xlsx");
	FileInputStream fis=new FileInputStream("./Testdata/datasheet.xlsx");
	 wb=new XSSFWorkbook(fis);
	}
	public double getexcelIntergerdata(int row,int col) {
		return	wb.getSheet("Login").getRow(row).getCell(col).getNumericCellValue();
	}

	public String getexcelStringdata(int row, int col) {
		return 	wb.getSheet("Login").getRow(row).getCell(col).getStringCellValue();
	
	}

}
