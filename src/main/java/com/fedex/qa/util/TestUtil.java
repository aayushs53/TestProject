package com.fedex.qa.util;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fedex.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static final long Page_Load_TimeOut = 30;

	public static final long Implicit_Wait = 20;
	

	
	public static String TESTDATA_SHEET_PATH = "/Users/aayush/eclipse-workspace/FreeCRMTest/src/main/java/com/fedex/qa/testdata/TrackingTestData.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	public static Object[][] getTestData(String sheetName){
		FileInputStream file= null;
		
		try {
			
			 file= new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			book= WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		sheet= book.getSheet(sheetName);
		
		Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i=0; i < sheet.getLastRowNum(); i++) {
			for(int k=0; i < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k]= sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
	}
}
	
	


