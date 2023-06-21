package Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Variables;

public class Commonmethods extends Variables 
{
	// Method to make successful login 
	public static void loginsuccess() throws Exception 
	{
		POMpages.OrangeLogin.Enter_username(Utility.getdata_propertyfile.getusername());
		POMpages.OrangeLogin.Enter_password(Utility.getdata_propertyfile.getpassword());
		POMpages.OrangeLogin.Click_Submit();
	}
	
	// Method to make logout 
	public static void logout() throws Exception 
	{
	new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='oxd-userdropdown-tab']/i"))).click();
	new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='oxd-userdropdown-link'][text()='Logout']"))).click();
	}
	
	// Method to take screenshot and print in the destination
	public static void takescreenshot(String status)
	{
		try 
		{			
			String Reportpath =System.getProperty("user.dir")+ "\\src\\test\\resources\\Screenshots\\";
			TakesScreenshot screenshot =(TakesScreenshot)driver;
			File sourceSS = screenshot.getScreenshotAs(OutputType.FILE);
			//System.out.println("ReportPath -- "+Reportpath);
			File DestiSS = new File(Reportpath+TestcaseID+status+System.currentTimeMillis()+".png");
			//System.out.println("SourceSS -- "+sourceSS);
			//System.out.println("DestinSS -- "+DestiSS);
			FileUtils.copyFile(sourceSS, DestiSS);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	

}
