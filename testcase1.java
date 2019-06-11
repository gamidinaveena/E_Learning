package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class testcase1 {
	 Launch fab=new Launch();
	 ExcelOp eo= new ExcelOp();
	Object[][] data=new Object[2][2];
	WebDriver dr;
	String u,p;
	@BeforeClass
	  public void log()
	{
	
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				data[i][j]=eo.operations(i, j,"register");
				
			}
		}	
	}
  @Test(dataProvider = "register")
  public void loginpage(String u,String p) 
  {
	  System.out.println("login " +u + " " +p);
	  fab.login(u,p);
	 
	 
  }
  
  @DataProvider(name="register")
  public Object[][] getdata()
  {
    return data;
  }
  

}
