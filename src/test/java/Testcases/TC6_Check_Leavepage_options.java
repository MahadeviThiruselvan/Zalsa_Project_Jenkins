package Testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Config;
import POMpages.OrangeLeave;
import POMpages.Orangehome;
import Utility.Commonmethods;
import Utility.ListenersDefiniClass;

@Listeners(ListenersDefiniClass.class)
public class TC6_Check_Leavepage_options extends Config {
	@BeforeTest
	public void BeforeTest() {
		try {
			TestcaseID = getClass().getName();  // Get the name of the current class - TestcaseID
			System.out.println("****************" + TestcaseID + "*******************");
			launch_Browser();
			launch_URL();
			
			Commonmethods.loginsuccess();  // Login the page
			Orangehome.LeaveClick();  // Select Leave to validate the options in it...
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	@AfterTest
	public void AFterTest() {
		closebrowser();

	}

	@Test
	public void CheckApplyTabCheck() {
		OrangeLeave.ApplyClick();
	}

	@Test
	public void MyLeaveTabCheck() {
		OrangeLeave.MyLeaveClick();
	}

	@Test
	public void EntitlementsTabCheck() {
		OrangeLeave.EntitlementsClick();
	}

	@Test(dependsOnMethods = "EntitlementsTabCheck")   // Ensure Entitlement is available to check options under it
	public void AddEntitlementsTabCheck() {
		OrangeLeave.AddEntitlementsClick();
	}

	@Test(dependsOnMethods = "EntitlementsTabCheck")	// Ensure Entitlement is available to check options under it
	public void EmployementEntitlementsTabCheck() {
		OrangeLeave.EmployeeEntitlementClick();
	}

	@Test(dependsOnMethods = "EntitlementsTabCheck")	// Ensure Entitlement is available to check options under it
	public void MyEntitlementsTabCheck() {
		OrangeLeave.MyEntitlementsClick();
	}

	@Test
	public void ReportTabCheck() {
		OrangeLeave.ReportsClick();
	}

	@Test(dependsOnMethods = "ReportTabCheck")	// Ensure Report is available to check options under it
	public void LeaveEntitlementsUsageReportCheck() {
		OrangeLeave.LeaveEntitlementUsagereportClick();
	}

	@Test(dependsOnMethods = "ReportTabCheck")	// Ensure Report is available to check options under it
	public void MyLeaveEntitlementsUsageReportCheck() {
		OrangeLeave.MyLeaveEntitlementsUsagereportClick();
	}

	@Test
	public void LeaveListCheck() {
		OrangeLeave.LeaveListClick();
	}

	@Test
	public void AssignLeaveCheck() {
		OrangeLeave.AssignLeaveClick();
	}

	@Test
	public void ConfigureCheck() {
		OrangeLeave.ConfigureClick();
	}

	@Test(dependsOnMethods = "ConfigureCheck")	// Ensure Configure is available to check options under it
	public void ConfigureLeavePeriodCheck() {
		OrangeLeave.ConfigureLeavePeriodClick();
	}

	@Test(dependsOnMethods = "ConfigureCheck")	// Ensure Configure is available to check options under it
	public void ConfigureLeaveTypesCheck() {
		OrangeLeave.ConfigureLeaveTypesClick();
	}

	@Test(dependsOnMethods = "ConfigureCheck")  // Ensure Configure is available to check options under it
	public void ConfigureWorkWeekCheck() {
		OrangeLeave.ConfigureWorkWeekClick();
	}

	@Test(dependsOnMethods = "ConfigureCheck")  // Ensure Configure is available to check options under it
	public void ConfigureHolidaysCheck() {
		OrangeLeave.ConfigureLeavePeriodClick();
	}
}
