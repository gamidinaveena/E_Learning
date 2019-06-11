package Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOp {

	public String operations(int row,int col,String sn)
	{
		String s=null;
		try
		{
			File f=new File("C:\\Users\\IBM\\Desktop\\EXCEL\\trainee.xlsx");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook j=new XSSFWorkbook(fis);
			XSSFSheet sh=j.getSheet(sn);
			XSSFRow rr= sh.getRow(row);
			XSSFCell cc= rr.getCell(col);
			
			s=cc.getStringCellValue();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return s;
	}
	
}
