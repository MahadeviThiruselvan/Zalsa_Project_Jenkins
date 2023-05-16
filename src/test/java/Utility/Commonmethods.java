package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Variables;

public class Commonmethods extends Variables 
{
	public static void loginsuccess() throws Exception 
	{
		POMpages.OrangeLogin.Enter_username(Utility.getdata_propertyfile.getusername());
		POMpages.OrangeLogin.Enter_password(Utility.getdata_propertyfile.getpassword());
		POMpages.OrangeLogin.Click_Submit();
	}
	
	public static void logout() throws Exception 
	{
	new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span/p[@class='oxd-userdropdown-name']"))).click();
	new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ul[@class='oxd-dropdown-menu']/li[4]"))).click();
	}

}
