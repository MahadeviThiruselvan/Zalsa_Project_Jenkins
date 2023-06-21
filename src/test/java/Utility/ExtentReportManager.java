package Utility;

import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Base.Variables;

public class ExtentReportManager {
	static ExtentReports extent;
    static ExtentTest test;
    static String path = System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\";

	public static void extentsetup(String testcaseID)
	{
		extent = new ExtentReports(path+"ExtentReport"+".html",true);
        extent.addSystemInfo("Host Name", "Local Host");
        extent.addSystemInfo("Environment", "QA");
        extent.addSystemInfo("User Name", "Mahadevi");
	}
	
	public static void testpass()
	{
		test = extent.startTest(Variables.MethodID);
		test.log(LogStatus.PASS, "Testcondition Passed","Basic Test");
	}
	
	public static void testfail()
	{
		test = extent.startTest(Variables.MethodID);
		test.log(LogStatus.FAIL, "Testcondition Failed");
	}
	
	public static void afterEachtest(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(LogStatus.FAIL, result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
        } else {
            test.log(LogStatus.PASS, "Test passed");
        }
        extent.endTest(test); 
              
    }
	public static void flushCloseExtent()
	{
		extent.flush();		
	}
	

}
