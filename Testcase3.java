package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase3 
{
	Launch l=new Launch();
	ExcelOp eo= new ExcelOp();
	Object[][] data=new Object[1][3];
	WebDriver dr;
	
  @BeforeClass
  public void CC() 
  {
	String str=eo.operations(0, 0,"register");
	String str1=eo.operations(0, 1,"register");
	l.login(str, str1);
	
	String s=eo.operations(0, 0,"coucre");
	String s1=eo.operations(0, 1,"coucre");
	String s2=eo.operations(0, 2,"coucre");

	l.coursecreate(s,s1,s2);

  for(int i=0;i<1;i++) 		
  {
			for(int j=0;j<3;j++)
			{
				data[i][j]=eo.operations(i, j,"descrp");
 			}
  }	 
   }
  @Test(dataProvider="descrp")
  public void addcourse(String t,String c)
  {
	 System.out.println("descrp:" +t+ " " +c);
	 l.description(t, c);
  }
  
  @DataProvider(name="descrp")
  public Object[][] getdata()
  {
    return data;
  }

}
