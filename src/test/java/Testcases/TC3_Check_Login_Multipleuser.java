package Testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Config;
import POMpages.OrangeLogin;
import Utility.ListenersDefiniClass;
import Utility.getdata_excelsheet;

@Listeners(ListenersDefiniClass.class)
public class TC3_Check_Login_Multipleuser extends Config 
{


	@Test(dataProvider = "excel")  // Verify login with multiple username and password from excelsheet
	public void Login_multipleuser(String username, String password) {
		try {
			// get the method name
						/*
						StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
				        System.out.println("*************Current Method - " +
				        stackTraceElements[0].getMethodName()+" *************");	*/
			
			// Dataprovider provides the value from the excel sheet...
			POMpages.OrangeLogin.Enter_username(username); // Enter username reading from excel sheet
			POMpages.OrangeLogin.Enter_password(password);// Enter password reading from excel sheet
			POMpages.OrangeLogin.Click_Submit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void beforeTest() {
		try {
			TestcaseID = getClass().getName();  // Get the name of the current class - TestcaseID
			System.out.println("****************" + TestcaseID + "*******************");
			launch_Browser();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	@BeforeSuite
//	public void beforesuite()
//	{
//		TestcaseID = getClass().getName();
//	}
	
	@AfterTest
	public void afterSuite() throws InterruptedException 
	{
		Thread.sleep(3000);
		quitbrowser();
	}

	@DataProvider  // DataProvider provides the data by reading a excel sheet
	public Iterator<Object[]> excel() throws Exception 
	{  
		// Get values in ArrayList of Object = from a method using POI...
		ArrayList<Object[]> datas = getdata_excelsheet.getTableArray("Login");
		// return the <Object[]> value in form of iterator
		return datas.iterator(); // return the value in form of iterator
	}

}
