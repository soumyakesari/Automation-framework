package com.app.android.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.app.androidapp.init.Constants;

public class ExcelLibrary
{
	
	public String getDataFromExcel(String sheetName,int row, int col)
	{
		try
		{
			FileInputStream file = new FileInputStream(new File(Constants.ExcelPath));
			String data = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(col).toString();
			return data;
		}
		catch(Exception e)
		{
			return "";
		}
	}



public void writeDataToExcel(String sheetName, int row, int cell, String value) 
{
	try {
		FileInputStream file = new FileInputStream(new File(Constants.ExcelPath));
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheetName);
		sh.createRow(row).createCell(cell).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(Constants.ExcelPath);
		wb.write(fos);
	}
	catch(Exception e)
	{

	}
}
}


