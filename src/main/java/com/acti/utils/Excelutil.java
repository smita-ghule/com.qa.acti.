package com.acti.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {

	XSSFWorkbook wb;
	//This constructor helps us to load the excel file when this class is called
	
	public Excelutil(String excelpath) {
		try
		{
			File src = new File(excelpath);
			FileInputStream fls = new FileInputStream(src);
			wb = new XSSFWorkbook(fls);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("unable to load the excel sheet please check the path" +e.getMessage());}
		}

	//this method is used to get the active rows from the excel sheet.
	
	public int getRows(int sheetnum)
	{
		
		int rows=wb.getSheetAt(sheetnum).getLastRowNum()+1;
		return rows;
		
	}
	
	//this method is used to get the data from excel cell.
	public String getcellData(int Sheetnum, int row,int col)
	{
		
		
		
		String data=wb.getSheetAt(Sheetnum).getRow(row).getCell(col).toString();
		return data;
	}
	
 
}


