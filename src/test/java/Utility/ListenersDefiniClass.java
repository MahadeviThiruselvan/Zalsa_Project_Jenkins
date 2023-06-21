package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.github.dockerjava.api.command.StartContainerCmd;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Base.Variables;

public class ListenersDefiniClass extends Variables implements ITestListener 
{
	
	// method to get the current executing methodname - used for extent report pass fail status
    private static String getTestMethodName(ITestResult iTestResult) 
    {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

	public void onStart(ITestContext context) 
	{
		//ExtentReportManager.extentsetup(TestcaseID);	// Initialize the extent report onstartup
	}

	public void onFinish(ITestContext context) 
	{
		ExtentReportManager.flushCloseExtent();  // oncompletion of test flush the extent report
	}

	public void onTestStart(ITestResult result) 
	{
		if(TestcaseChkflag==1)  
		{
		ExtentReportManager.extentsetup(TestcaseID);	
		TestcaseChkflag++;
		}
		// Initialize the extent report onstartup
		// Get the method name and display in console - For us to know which method is running now
		MethodID = getTestMethodName(result);
		System.out.println("Method name - Listener  --- " +MethodID ); 			
	}

	public void onTestSuccess(ITestResult result) 
	{
		// takescreenshot on pass
		//Commonmethods.takescreenshot("_onTestSuccess_");
		ExtentReportManager.testpass();  // generate pass entity in extent report
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("ON TEST FAILURE");
		Commonmethods.takescreenshot("_onTestFailure_");  // takescreenshot on failure
		ExtentReportManager.testfail();   // make entity in extent report as fail
		ExtentReportManager.afterEachtest(result); // Posting the log in the report
	}

	public void onTestSkipped(ITestResult result) 
	{
		ExtentReportManager.afterEachtest(result); // Posting the log in the report		
	}
	

}
