package POMpages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import Base.Variables;

public class OrangeAdmin extends Variables{
	
	// Constructor to initialize initElements
	public OrangeAdmin()
	{
		
		PageFactory.initElements(driver, this);
		
	}

}
