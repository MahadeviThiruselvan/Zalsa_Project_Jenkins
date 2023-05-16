package Testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.BrowserLaunch;
import Base.Variables;
import POMpages.OrangeLogin;

public class TC2_Check_ForgotPassword extends BrowserLaunch{
  @Test
  public void forgotpassworddisplay()
  {	
	  try
	  {
	  OrangeLogin ob = new OrangeLogin(Variables.driver);
	  POMpages.OrangeLogin.Click_forgetpassword();
	  assertEquals(driver.getTitle(), "forgotpassword");
	  }
	  catch(Exception e)
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
		
	} catch (Exception e) {
		
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
