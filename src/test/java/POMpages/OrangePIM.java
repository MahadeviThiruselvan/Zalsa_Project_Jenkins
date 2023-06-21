package POMpages;

import org.openqa.selenium.support.PageFactory;

import Base.Variables;

public class OrangePIM extends Variables{

	// Constructor to initialize initElements
	
	public OrangePIM()
	{
		PageFactory.initElements(driver, this);
	}
}
