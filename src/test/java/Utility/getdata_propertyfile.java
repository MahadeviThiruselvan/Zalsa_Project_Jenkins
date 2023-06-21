package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class getdata_propertyfile 
{
	
	// Path of property file
	static String Path = System.getProperty("user.dir") +"\\src\\test\\resources\\Propertyfile\\base.properties";
	static Properties prop = new Properties();  // initialize property class
	
	public static String getbrowser() throws Exception
	{
		readpropertyfile();	// Read the property file...
		return prop.getProperty("Browser");		// get the browser value
	}
	
	public static String getURL() throws Exception
	{
		readpropertyfile();	// Read the property file...
		return prop.getProperty("URL");		// get the URL value
	}
	
	public static String getusername() throws Exception
	{
		readpropertyfile();	// Read the property file...
		return prop.getProperty("username");	// get the Userame value
		
	}
	public static String getpassword() throws Exception
	{
		readpropertyfile();	// Read the property file...
		return prop.getProperty("password");	// get the password value
		
	}
	public static void readpropertyfile() throws Exception   // method to read the property file...
	{
		FileInputStream file = new FileInputStream(Path);
		prop.load(file);
	}



}
