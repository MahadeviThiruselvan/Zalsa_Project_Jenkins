package Testcases;

import org.testng.annotations.Test;

import Base.BrowserLaunch;
import Utility.Commonmethods;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TC5_Login_Logout extends BrowserLaunch{
  @Test
  public void f() throws Exception {
	  Commonmethods.loginsuccess();	 
  }
  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	  launch_Browser();
	  launch_URL();	   
  }
  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	  quitbrowser();
  }

}
