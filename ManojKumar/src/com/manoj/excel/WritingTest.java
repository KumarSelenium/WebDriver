package com.manoj.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingTest {

	public static void main(String[] args) throws Exception 
	{
File srcFie=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFie);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		ws.getRow(1).createCell(2).setCellValue("Manoj");
		ws.getRow(2).createCell(2).setCellValue("Selenium");
		ws.getRow(3).createCell(2).setCellValue("Vasu");
		
		FileOutputStream fos=new FileOutputStream(srcFie);
		
		wb.write(fos);
		wb.close();

	}

}
