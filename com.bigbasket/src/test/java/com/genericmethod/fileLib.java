package com.genericmethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileLib {
public String getDataFromProperties(String path,String key) throws IOException {
	FileInputStream ip=new FileInputStream(path);
	Properties prop=new Properties();
	prop.load(ip);;
	String data=prop.getProperty(key);
	return data;
//}
/*public String getExcelData(String path,String sheetname,int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream ip=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(ip);
	String data=wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
return data;
	
	//return sheetname;*/
}
	
	
	
	
}
