package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Config extends Variables 
{
	public void launch_Browser() throws Exception 
	{
		// Read the browser details from property file
		Browser = Utility.getdata_propertyfile.getbrowser();
		
		//Verify the browser value and open corresponding value
		
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
		
		// Initialize the POM pages i.e init elements - initializing the constructor of the class
		POM_initialize.pagefactory_init_initialize();
	}

	public void launch_URL() throws Exception 
	{
		// Get the URL of the Application from the property file.
		url = Utility.getdata_propertyfile.getURL();
		// Open the URL of the Application
		driver.get(url);
						
	}

	public void quitbrowser() 
	{
		// Quit the  browser
		driver.quit();
	}
	
	public void closebrowser() 
	{
		// Close the browser
		driver.close();
	}

}
