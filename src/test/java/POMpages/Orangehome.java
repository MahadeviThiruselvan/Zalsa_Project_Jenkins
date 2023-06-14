package POMpages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import Base.Variables;

public class Orangehome extends Variables
{
	// Constructor to initialize initElements
		public Orangehome()
		{
			PageFactory.initElements(driver,this);		
		}
	
		
	// Identifying the elements using @FindBy  - Page Factory
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
	private static WebElement Search;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[1]/a/span")
	private static WebElement Admin;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[2]/a/span")
	private static WebElement PIM;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[3]/a/span")
	private static WebElement Leave;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[4]/a/span")
	private static WebElement Time;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[5]/a/span")
	private static WebElement Recuitment;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[6]/a/span")
	private static WebElement MyInfo;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[7]/a/span")
	private static WebElement Performance;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[8]/a/span")
	private static WebElement Dashboard;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[9]/a/span")
	private static WebElement Directory;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[10]/a/span")
	private static WebElement Maintenance;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[11]/a/span")
	private static WebElement Buzz;
	
	@FindBy(xpath = "//div[@class='oxd-topbar-body-nav-slot']/button")
	private static WebElement Questionbutton;
	
	// Method to interact with elements.
	
	public static void AdminClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.visibilityOf(Admin));
		Admin.click();
	}
	public static void PIMClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.visibilityOf(PIM));
		PIM.click();
	}
	public static void LeaveClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.visibilityOf(Leave));
		Leave.click();
	}
	public static void TimeClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.visibilityOf(Time));
		Time.click();
	}
	
	public static void RecruitmentClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.visibilityOf(Recuitment));
		Recuitment.click();
	}
	
	public static void MyInfoClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.visibilityOf(MyInfo));
		MyInfo.click();
	}
	
	public static void PerformanceClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.visibilityOf(Performance));
		Performance.click();
	}
	
	public static void DashboardClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.visibilityOf(Dashboard));
		Dashboard.click();
	}
	
	public static void DirectoryClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.visibilityOf(Directory));
		Directory.click();
	}
	
	public static void MaintenanceClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Maintenance));
		Maintenance.click();
	}
	
	public static void QuestionClick()
	{
		new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.visibilityOf(Questionbutton));
		Questionbutton.click();
	}
	public static void searchtext(String data) 
	{
		new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys(data+Keys.ENTER);
	}
	
	


}
