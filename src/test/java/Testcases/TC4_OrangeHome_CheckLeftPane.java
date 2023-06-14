package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Config;
import POMpages.Orangehome;
import Utility.Commonmethods;
import Utility.ListenersDefiniClass;
import Utility.RetryAnalyser;

@Listeners(ListenersDefiniClass.class)

public class TC4_OrangeHome_CheckLeftPane extends Config {
	@Test(retryAnalyzer = RetryAnalyser.class, enabled = true) // Retry when the test case fails = Retry Analyzer
	public void Admincheck() {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Orangehome.AdminClick();
	}

	@Test(retryAnalyzer = RetryAnalyser.class, enabled = true) // Retry when the test case fails = Retry Analyzer
	public void PIMcheck() {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Orangehome.PIMClick();
	}

	@Test(retryAnalyzer = RetryAnalyser.class, enabled = true) // Retry when the test case fails = Retry Analyzer

	public void Dashboardcheck() {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Orangehome.DashboardClick();
	}

	@Test(retryAnalyzer = RetryAnalyser.class, enabled = true) // Retry when the test case fails = Retry Analyzer
	public void Directorycheck() {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Orangehome.DirectoryClick();
	}

	@Test(priority = 2, enabled = true)
	public void Maintenancecheck() {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Orangehome.MaintenanceClick();

	}

	@Test(retryAnalyzer = RetryAnalyser.class, enabled = true) // Retry when the test case fails = Retry Analyzer
	public void Leavecheck() {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Orangehome.LeaveClick();
	}

	@Test(retryAnalyzer = RetryAnalyser.class, enabled = true) // Retry when the test case fails = Retry Analyzer
	public void Performancecheck() {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Orangehome.PerformanceClick();
	}

	@Test(priority = 1, enabled = true)
	public void Questioncheck() {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Orangehome.QuestionClick();

	}

	@Test(retryAnalyzer = RetryAnalyser.class, enabled = true) // Retry when the test case fails = Retry Analyzer
	public void Recruitmentcheck() {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Orangehome.RecruitmentClick();
	}

	@Test(priority = -1, enabled = true)
	public void Timecheck() {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Orangehome.TimeClick();
	}

	@Test(retryAnalyzer = RetryAnalyser.class, enabled = true) // Retry when the test case fails = Retry Analyzer
	public void Searchcheck() {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Orangehome.searchtext("ssd");
	}

	@Test(retryAnalyzer = RetryAnalyser.class, enabled = true) // Retry when the test case fails = Retry Analyzer
	public void MyInfocheck() {
		// get the method name
		/*
		 * StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		 * System.out.println("*************Current Method - " +
		 * stackTraceElements[0].getMethodName()+" *************");
		 */

		Orangehome.MyInfoClick();
	}

	@BeforeMethod
	public void beforeMethod() throws Exception 
	{
		TestcaseID = getClass().getName(); // Get the name of the current class - TestcaseID
		System.out.println("****************" + TestcaseID + "*******************");
		launch_Browser();
		launch_URL();
		Commonmethods.loginsuccess();
		
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(6000);
		quitbrowser();
	}

}
