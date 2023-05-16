package Testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.BrowserLaunch;
import Base.Variables;
import POMpages.OrangeLogin;
import Utility.getdata_propertyfile;

public class TC1_Check_Valid_Login extends BrowserLaunch{
  @Test
  public void Login()
  {	
	  try
	  {
	  
	  POMpages.OrangeLogin.Enter_username(Utility.getdata_propertyfile.getusername());
	  POMpages.OrangeLogin.Enter_password(Utility.getdata_propertyfile.getpassword());
	  POMpages.OrangeLogin.Click_Submit();
	  System.out.println("Title:  "+driver.getTitle());
	  }catch(Exception e)
	  {
		  e.printStackTrace(); 
	  }
  }
  @BeforeSuite
  public void beforeSuite() 
  {
	  try 
	  {
		launch_Browser();
		Thread.sleep(3000);
		
	} 
	  catch (Exception e) 
	  {
		
		e.printStackTrace();
	  }
  }

  @AfterSuite
  public void afterSuite() throws InterruptedException 
  {	
	  Thread.sleep(3000);
	  closebrowser();
  }

}
