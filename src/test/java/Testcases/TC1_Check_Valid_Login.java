package Testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Config;
import Base.POM_initialize;
import Utility.ListenersDefiniClass;
import Utility.RetryAnalyser;

@Listeners(ListenersDefiniClass.class)
public class TC1_Check_Valid_Login extends Config 
{
	
	@Test(retryAnalyzer = RetryAnalyser.class) // Retry the testcase when it fails - Retry Analyzer
	public void Valid_Login() {
		try {
			// get the method name
			/*
			 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
			 * System.out.println("*************Current Method - " +
			 * stackTraceElements[0].getMethodName()+" *************");
			 */

			// Call username method by getting the username value from property file
			POMpages.OrangeLogin.Enter_username(Utility.getdata_propertyfile.getusername());
			// Call password method by getting the password value from property file
			POMpages.OrangeLogin.Enter_password(Utility.getdata_propertyfile.getpassword());
			// Call submit method to submit - login the application
			POMpages.OrangeLogin.Click_Submit();
			// Assert.assertTrue(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void beforeTest() {
		try {
			TestcaseID = getClass().getName(); // Get the name of the current class - TestcaseID
			System.out.println("****************" + TestcaseID + "*******************");
			// Set the test case ID to use in the screenshot method to save name...
			launch_Browser(); // Launch the browser

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
//	@BeforeSuite
//	public void beforesuite()
//	{
//		TestcaseID = getClass().getName();
//	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		quitbrowser();
	}

}
