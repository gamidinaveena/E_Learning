package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase2 
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
    
  for(int i=0;i<1;i++) 		
  {
			for(int j=0;j<3;j++)
			{
				data[i][j]=eo.operations(i, j,"coucre");
 			}
 		}	  
   }
   
   @Test(dataProvider="coucre")
   public void addcourse(String course,String code,String type)
   {
	 System.out.println("course created:" +course+ " " +code+ " " +type) ;
	 l.coursecreate(course, code,type);
	 
   }
   
   @DataProvider(name="coucre")
   public Object[][] getdata()
   {
     return data;
   }

}
