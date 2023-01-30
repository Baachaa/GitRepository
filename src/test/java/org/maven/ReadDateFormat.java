package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDateFormat {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\balachandar\\Desktop\\ExcelRead\\Internals.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet sheet = w.getSheet("Traveller's List");
		w.close();
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				switch(cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					break;
				default:
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
						String format = date.format(dateCellValue);
						System.out.println(format);
					}
					else
					{
					double numericCellValue = cell.getNumericCellValue();
					long l = (long)numericCellValue;
					BigDecimal convert = BigDecimal.valueOf(l);
					String string = convert.toString();
					System.out.println(string);
					break;
				}
			}
		}
		
	}
	}
}
