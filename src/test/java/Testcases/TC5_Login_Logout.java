package Testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Config;
import Utility.Commonmethods;
import Utility.ListenersDefiniClass;

@Listeners(ListenersDefiniClass.class)
public class TC5_Login_Logout extends Config {
	@Test
	public void Login_Logout() throws Exception {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Commonmethods.loginsuccess(); // Login using the method
		Commonmethods.logout(); // Logout using the method
	}

	@BeforeTest
	public void beforeMethod() throws Exception 
	{
		TestcaseID = getClass().getName(); // Get the name of the current class - TestcaseID
		System.out.println("****************" + TestcaseID + "*******************");
		launch_Browser();
		launch_URL();
		
	}

	@AfterTest
	public void afterMethod() throws InterruptedException {
		quitbrowser();

	}

}
