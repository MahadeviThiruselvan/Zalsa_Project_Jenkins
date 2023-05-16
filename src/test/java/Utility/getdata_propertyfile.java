package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class getdata_propertyfile 
{
	
	static String Path = "C:\\Users\\user\\OneDrive\\Desktop\\KNOWLEDGE REPOSITORY\\Selenium Framework\\Programs\\Zalsa_Project\\src\\test\\resources\\Propertyfile\\base.properties";
	static Properties prop = new Properties();
	
	public static String getbrowser() throws Exception
	{
		readpropertyfile();
		return prop.getProperty("Browser");		
	}
	
	public static String getURL() throws Exception
	{
		readpropertyfile();
		return prop.getProperty("URL");		
	}
	
	public static String getusername() throws Exception
	{
		readpropertyfile();
		return prop.getProperty("username");
		
	}
	public static String getpassword() throws Exception
	{
		readpropertyfile();
		return prop.getProperty("password");
		
	}
	public static void readpropertyfile() throws Exception
	{
		FileInputStream file = new FileInputStream(Path);
		prop.load(file);
	}



}
