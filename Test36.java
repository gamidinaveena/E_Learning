package NextSetTC;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Testcases.ExcelOp;
import Testcases.Launch;

public class Test36
{
	Launch l=new Launch();
	ExcelOp eo= new ExcelOp();
	Object[][] data=new Object[1][3];
	WebDriver dr;
	
	@BeforeClass
	  public void CC() 
	  {
		String str=eo.operations(2, 0,"register");
		String str1=eo.operations(2, 1,"register");
		l.login(str, str1);
	  }
	
  @Test
  public void validatetest() throws InterruptedException
  {
	  l.Test();
  }
 
  
}
