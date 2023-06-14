package POMpages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Variables;

public class OrangeLeave extends Variables
{
	// Constructor to initialize initElements
		public OrangeLeave()
		{
			PageFactory.initElements(driver, this);		
		}
		
	// Identifying the elements using @FindBy  - Page Factory
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[1]/a")
	private static WebElement Apply;
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[2]/a")
	private static WebElement Myleave;
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[3]")
	private static WebElement Entitlements;	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[3]//li[1]/a")
	private static WebElement AddEntitlements;	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[3]//li[2]/a")
	private static WebElement EmployeeEntitlements;	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[3]//li[3]/a")
	private static WebElement MyEntitlements;	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[4]")
	private static WebElement Reports;	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[4]//li[1]/a")
	private static WebElement LeaveusageReports;
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[4]//li[2]/a")
	private static WebElement MyLeaveusageReports;
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[5]")
	private static WebElement Configure;
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[5]//li[1]")
	private static WebElement ConfigureLeavePeriod;
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[5]//li[2]")
	private static WebElement ConfigureLeaveTypes;	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[5]//li[3]")
	private static WebElement ConfigureWorkWeek;
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[5]//li[4]")
	private static WebElement ConfigureHolidays;	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[6]/a")
	private static WebElement Leavelist;
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[7]/a")
	private static WebElement AssignLeave;
	
	// Method to interact with elements...
	public static void ApplyClick()
	{
		new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(Apply));
		Apply.click();
	}
	public static void MyLeaveClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(Myleave));
		Myleave.click();
	}
	public static void EntitlementsClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(Entitlements));
		Entitlements.click();
	}
	public static void AddEntitlementsClick()
	{
		EntitlementsClick();
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(AddEntitlements));
		AddEntitlements.click();
	}
	public static void EmployeeEntitlementClick()
	{
		EntitlementsClick();
		new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(EmployeeEntitlements));
		EmployeeEntitlements.click();
	}
	public static void MyEntitlementsClick()
	{
		EntitlementsClick();
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(MyEntitlements));
		MyEntitlements.click();
	}
	public static void ReportsClick()
	{
		new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(Reports));
		Reports.click();
	}
	public static void LeaveListClick()
	{
		new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(Leavelist));
		Leavelist.click();
	}
	public static void LeaveEntitlementUsagereportClick()
	{
		ReportsClick();
		new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(LeaveusageReports));
		LeaveusageReports.click();
	}
	public static void MyLeaveEntitlementsUsagereportClick()
	{
		ReportsClick();
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(MyLeaveusageReports));
		MyLeaveusageReports.click();
	}
	public static void ConfigureClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(Configure));
		Configure.click();		
	}
	public static void ConfigureLeavePeriodClick()
	{
		ConfigureClick();
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(ConfigureLeavePeriod));
		ConfigureLeavePeriod.click();
	}
	public static void 	ConfigureLeaveTypesClick()
	{
		ConfigureClick();
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(ConfigureLeaveTypes));
		ConfigureLeaveTypes.click();
	}
	public static void ConfigureWorkWeekClick()
	{
		ConfigureClick();
		new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(ConfigureWorkWeek));
		ConfigureWorkWeek.click();
	}
	public static void ConfigureHolidays()
	{
		ConfigureClick();
		new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(ConfigureHolidays));
		ConfigureHolidays.click();
	}
	public static void AssignLeaveClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(AssignLeave));
		AssignLeave.click();		
	}
	
	
}
