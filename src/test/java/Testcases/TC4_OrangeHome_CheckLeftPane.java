package Testcases;

import org.testng.annotations.Test;

import Base.BrowserLaunch;
import POMpages.Orangehome;
import Utility.Commonmethods;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TC4_OrangeHome_CheckLeftPane extends BrowserLaunch {
	@Test
	public void Admincheck() 
	{
		Orangehome.AdminClick();
	}
	@Test
	public void PIMcheck() 
	{
		Orangehome.PIMClick();
	}
	@Test
	public void Dashboardcheck() 
	{
		Orangehome.DashboardClick();
	}
	@Test
	public void Directorycheck() 
	{
		Orangehome.DirectoryClick();
	}
	@Test
	public void Maintenancecheck() 
	{
		Orangehome.MaintenanceClick();
	}
	@Test
	public void Leavecheck() 
	{
		Orangehome.LeaveClick();
	}
	
	@Test
	public void Performancecheck() 
	{
		Orangehome.PerformanceClick();
	}
	@Test
	public void Questioncheck() 
	{
		Orangehome.QuestionClick();
	}
	@Test
	public void Recruitmentcheck() 
	{
		Orangehome.RecruitmentClick();
	}
	@Test
	public void Timecheck() 
	{
		Orangehome.TimeClick();
	}
	@Test
	public void Searchcheck() 
	{
		Orangehome.searchtext("ssd");
	}
	
	@Test
	public void MyInfocheck() 
	{
		Orangehome.MyInfoClick();
	}
	
	

	@BeforeMethod
	public void beforeMethod() throws Exception 
	{
		launch_Browser();
		launch_URL();
		Commonmethods.loginsuccess();
	}

	@AfterMethod
	public void afterMethod() 
	{
		quitbrowser();
	}

}
