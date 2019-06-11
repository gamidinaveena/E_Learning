package Testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch 
{
	WebDriver dr;
	
	public void login(String log,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver74.exe");
		dr=new ChromeDriver();
		dr.get("http://elearningm1.upskills.in");
		dr.findElement(By.xpath("//*[@id='login']")).sendKeys(log);
		dr.findElement(By.xpath("//*[@id='password']")).sendKeys(pwd);
		dr.findElement(By.xpath("//*[@id='form-login_submitAuth']")).click();
		//dr.findElement(By.xpath("//*[@id='coursesCollapse']/div/ul/li[1]/a")).click();
		
		
	}
	
	public void coursecreate(String course,String code,String type)
	{
		
		dr.findElement(By.xpath("//input[@id='title']")).sendKeys(course);
		
		dr.findElement(By.xpath("//button[@id='advanced_params']")).click();
		
		WebElement w=dr.findElement(By.xpath("//*[@id='add_course_category_code']"));
		Select sel = new Select(w);
		sel.selectByIndex(1);
	
		dr.findElement(By.id("add_course_wanted_code")).sendKeys(code);
		
		WebElement we=dr.findElement(By.xpath("//*[@id='add_course_course_language']"));
		Select sel1= new Select(we);
		sel1.selectByIndex(5);
		
		dr.findElement(By.xpath("//*[@id='add_course_submit']")).click();
		
		//dr.findElement(By.xpath("//*[@id='course_tools']/div[1]/div/div[1]/a")).click();
		
//		WebDriverWait wt=new WebDriverWait(dr,30);
//		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='course_tools']/div[1]/div/div[1]/a")));
	
		//dr.findElement(By.xpath("//html")).sendKeys(type);	
		///html
		//html
		
		//dr.findElement(By.xpath("//button[@id='introduction_text_intro_cmdUpdate']")).click();
	}
	
	public void description(String t,String c)
	{
		dr.findElement(By.xpath("//*[@id='toolimage_6442']")).click();
		// xpath=//a[@id='istooldesc_6250']
		//*[@id="istooldesc_6394"]
		//*[@id="toolimage_6418"]
		//a[contains(text(),'Course description')
		
		dr.findElement(By.xpath("//*[@id='toolbar']/div/div/a[1]/img")).click();
		
		dr.findElement(By.xpath("//*[@id='course_description_title']")).sendKeys(t);
		
		dr.findElement(By.xpath("//body")).sendKeys(c);
		
		dr.findElement(By.xpath("//button[@id='course_description_submit']")).click();
		
		
	}
	
	public void unsubscribe()
	{
		dr.findElement(By.xpath("//*[@id='page']/div/div[2]/div/div/div[2]/h4/a")).click();
		
		dr.findElement(By.xpath("//*[@id='istooldesc_5827']")).click();
	 
		dr.findElement(By.xpath("//input[@name='user[]']")).click();
	 
		dr.findElement(By.xpath("//a[contains(text(),'Unsubscribe')]")).click();
	 
		Alert a=dr.switchTo().alert();
	 
		a.accept();
	}
	
	public void catalog(String n)
	{
		dr.findElement(By.xpath("//*[@id='coursesCollapse']/div/ul/li[4]/a")).click();
		
		dr.findElement(By.xpath("//*[@id='cm-content']/div/div[1]/div/div/div/div[1]/form/div/input")).sendKeys(n);
		
		dr.findElement(By.xpath("//*[@id='cm-content']/div/div[1]/div/div/div/div[1]/form/div/div/button")).click();
	}
	
	public void Test() throws InterruptedException
	{
		dr.findElement(By.xpath("//*[@id='page']/div/div[1]/div/div/div[2]/h4/a")).click();
		
		dr.findElement(By.xpath("//*[@id='istooldesc_3622']")).click();
		
		Thread.sleep(8000);
		
		//dr.findElement(By.xpath("//tr[@id='9']/td[2]/a")).click();
		dr.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/work/work_list_all.php?cidReq=ICEANDFIRE&id_session=0&gidReq=0&gradebook=0&origin=&id=9']")).click();
		
		Thread.sleep(8000);
		dr.findElement(By.xpath("(//img[@alt='Correct and rate'])[2]")).click();
		
		Thread.sleep(8000);
		dr.switchTo().frame((WebElement)dr.findElement(By.xpath("//*[@id='cke_1_contents']/iframe")));
		dr.findElement(By.cssSelector("body")).sendKeys("khjhf");
		
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id='send_email']/label/text()")).click();
		
		dr.findElement(By.xpath("//*[@id='work_comment_button']")).click();
		//*[@id="work_comment_button"]
		
	}
	
	public void Report()
	{
		dr.findElement(By.xpath("//*[@id='page']/div/div[1]/div/div/div[2]/h4/a")).click();

		dr.findElement(By.xpath("//*[@id='istooldesc_3631']")).click();
		
		//dr.findElement(By.xpath(""))
	}
	}
