package Testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BrowserLaunch;
import POMpages.OrangeLogin;
import Utility.getdata_excelsheet;

public class TC3_Check_Login_Multipleuser  extends BrowserLaunch{
	 
	
	
	@Test(dataProvider = "excel" )
	  public void Login_multipleuser(String username, String password)
	  {	
		  try
		  {
		  //OrangeLogin ob = new OrangeLogin(driver);
		  POMpages.OrangeLogin.Enter_username(username);
		  POMpages.OrangeLogin.Enter_password(password);
		  Thread.sleep(2000);
		  POMpages.OrangeLogin.Click_Submit();
		  }catch(Exception e)
		  {
			  e.printStackTrace(); 
		  }
	  }
	@BeforeMethod
	  public void beforeSuite() 
	  {
		  try 
		  {
			launch_Browser();
			Thread.sleep(5000);			
		  } 
		  catch (Exception e) 
		  {
			e.printStackTrace();
		  }
	  }

	  @AfterMethod
	  public void afterSuite() throws InterruptedException 
	  {	
		  Thread.sleep(3000);
		  closebrowser();
	  }
	  
	  @DataProvider
	  public Iterator<Object[]> excel() throws Exception
	  {
		  ArrayList<Object[]> datas = getdata_excelsheet.getTableArray("Login");
		  return datas.iterator();
		
		
		  
	  }

	}
