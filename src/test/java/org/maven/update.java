package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class update {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\balachandar\\Desktop\\ExcelRead\\Update.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet sheet = w.getSheet("Sheet1");
		for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			for(int j=0; j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				if(stringCellValue.equalsIgnoreCase("Test")) {
					cell.setCellValue("bala1");	
				}
				else if(stringCellValue.equalsIgnoreCase("bala1")) {
					cell.setCellValue("Test");
				}
				FileOutputStream out = new FileOutputStream(f);
				w.write(out);
				
			}
		}
		System.out.println("Updated Successfully");
		
	}
}