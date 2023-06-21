package POMpages;

import org.openqa.selenium.support.PageFactory;

import Base.Variables;

public class OrangeMyInfo extends Variables {
	
	// Constructor to initialize initElements
	
	public OrangeMyInfo()
	{
		PageFactory.initElements(driver, this);
		
	}
}
