package org.maven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		File f = new File ("C:\\Users\\balachandar\\Desktop\\ExcelRead\\write.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet("new");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("HelloWorld");
		FileOutputStream out = new FileOutputStream(f);
		w.write(out);
		
	}

	
}
