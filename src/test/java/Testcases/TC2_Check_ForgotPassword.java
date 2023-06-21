package Testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Config;
import Utility.ListenersDefiniClass;
import Utility.RetryAnalyser;

@Listeners(ListenersDefiniClass.class)
public class TC2_Check_ForgotPassword extends Config 
{

	@Test(retryAnalyzer = RetryAnalyser.class)  // Retry the testcase when it fails - Retry Analyzer
	public void forgotpassworddisplay() {
		try {
			// get the method name
						/*
						StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
				        System.out.println("*************Current Method - " +
				        stackTraceElements[0].getMethodName()+" *************");	*/
			
			// Call forgetpassword method to click on forgetpassword
			POMpages.OrangeLogin.Click_forgetpassword();
			// assertEquals(driver.getTitle(), "OrangeHRM","Not Equal");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@BeforeSuite
//	public void beforesuite()
//	{
//		TestcaseID = getClass().getName();
//	}
	
	@BeforeTest
	public void beforeSuite() {
		try {
			TestcaseID = getClass().getName();  // Get the name of the current class - TestcaseID
			System.out.println("****************" + TestcaseID + "*******************");
			launch_Browser();	// Launch the browser and open the application
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@AfterTest
	public void afterSuite() throws InterruptedException {
		quitbrowser();
	}

}
