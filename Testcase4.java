package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase4 
{
	 Launch fab=new Launch();
	 ExcelOp eo= new ExcelOp();
	Object[] data=new Object[1];
	WebDriver dr;
	String u,p;
	@BeforeClass
	  public void log()
	{
		String str=eo.operations(0, 0,"register");
		String str1=eo.operations(0, 1,"register");
		fab.login(str, str1);	
	}
	
	  @Test
	  public void delcourse()
	  {
		  fab.unsubscribe();
		  System.out.println("unsubscribed");
	  }
}
