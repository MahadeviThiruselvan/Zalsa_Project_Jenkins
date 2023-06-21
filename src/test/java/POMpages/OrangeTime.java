package POMpages;

import org.openqa.selenium.support.PageFactory;

import Base.Variables;

public class OrangeTime extends Variables {

	// Constructor to initialize initElements

	public OrangeTime()
	{
		PageFactory.initElements(driver, this);
	}
}
