package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends Variables 
{
	public void launch_Browser() throws Exception 
	{
		Browser = Utility.getdata_propertyfile.getbrowser();
		//System.out.println(Browser);
		
		if (Browser.equalsIgnoreCase("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			//System.out.println(driver);
			driver.manage().window().maximize();
		} 
		else if (Browser.equalsIgnoreCase("Safari")) 
		{
			driver = new SafariDriver();
			driver.manage().window().maximize();
		}
		//Launch the web application
		launch_URL();
		// Initialize the POM pages i.e init elements 
		POM_initialize.pagefactory_init_initialize(driver);
	}

	public void launch_URL() throws Exception 
	{
		url = Utility.getdata_propertyfile.getURL();
		//System.out.println(url);
		driver.get(url);
						
	}

	public void quitbrowser() 
	{
		driver.quit();
	}
	
	public void closebrowser() 
	{
		driver.close();
	}

}
