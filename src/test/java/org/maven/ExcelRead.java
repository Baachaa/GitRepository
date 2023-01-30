package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
	File f = new File ("C:\\Users\\balachandar\\Desktop\\ExcelRead\\Internals.xlsx");
	FileInputStream f1 = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(f1);
	Sheet sheet = w.getSheet("Sheet2");
	w.close();
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	for(int i=1;i<2;i++) {
		String userName = sheet.getRow(i).getCell(0).getStringCellValue();
		String  passWord= sheet.getRow(1).getCell(1).getStringCellValue();
		WebElement name = driver.findElement(By.id("email"));
		WebElement pswd = driver.findElement(By.name("pass"));
		name.sendKeys(userName);
		pswd.sendKeys(passWord);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}
	}

}
