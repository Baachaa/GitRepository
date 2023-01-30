package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultiple {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\balachandar\\Desktop\\ExcelRead\\Internals.xlsx");
		FileInputStream fI = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fI);
		Sheet sheet = w.getSheet("Students");
		w.close();
		for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			for(int j=0; j<10;j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				switch(cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					break;
				default:
					double numericCellValue = cell.getNumericCellValue();
					long integer = (long)numericCellValue;
					BigDecimal convert = BigDecimal.valueOf(integer);
					String string = convert.toString();
					System.out.println(string);
					
				}
				}
				
			}
		}
		
	}


