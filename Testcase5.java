package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase5 
{
	Launch fab=new Launch();
	 ExcelOp eo= new ExcelOp();
	
	WebDriver dr;
	
	@BeforeClass
	  public void log()
	{
	
		String str=eo.operations(0, 0,"register");
		String str1=eo.operations(0, 1,"register");
		fab.login(str, str1);
		
	}
 @Test
 public void search() 
 {
	  fab.catalog("Ruby");
		 
 }
 
 

}
