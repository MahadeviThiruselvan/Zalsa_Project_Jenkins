package POMpages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Variables;

public class OrangeLogin extends Variables
{
	// Constructor to initialize initElements
	public OrangeLogin()
	{
		PageFactory.initElements(driver, this);
	}	

	// Identifying the elements using @FindBy  - Page Factory
	@FindBy(xpath = "//input[@placeholder='Username']")
	private static WebElement loginusername;
	@FindBy(xpath = "//div[@class='orangehrm-login-error']//following-sibling::form//following::div//input[@placeholder='Password']")
	private static WebElement Password;
	@FindBy(xpath = "//div[@class='orangehrm-login-form']//following-sibling::form//following-sibling::div[3]/button")
	private static WebElement Loginbtn;
	@FindBy(xpath = "//div[@class='orangehrm-login-forgot']/p")
	private static WebElement forgotpassword;
	
	// Method to interact with elements...
	public static void Enter_username(String username)
	{
		//Include explicit wait for the elements
		new WebDriverWait(driver,Duration.ofSeconds(6)).until(ExpectedConditions.visibilityOf(loginusername)).clear();
		//loginusername.clear();
		loginusername.sendKeys(username);
	}
	public static void Enter_password(String password)
	{
		new WebDriverWait(driver,Duration.ofSeconds(6)).until(ExpectedConditions.visibilityOf(Password)).clear();
		//Password.clear();
		Password.sendKeys(password);
	}
	public static void Click_Submit()
	{
		new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(Loginbtn));
		Loginbtn.click();
	}
	public static void Click_forgetpassword()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(forgotpassword));
		forgotpassword.click();
	}	
}


