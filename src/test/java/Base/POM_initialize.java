package Base;

import org.openqa.selenium.WebDriver;

import POMpages.OrangeAdmin;
import POMpages.OrangeLeave;
import POMpages.OrangeLogin;
import POMpages.OrangeMyInfo;
import POMpages.OrangePIM;
import POMpages.OrangeTime;
import POMpages.Orangehome;
import POMpages.Recruitment;

public class POM_initialize {
	
	public static void pagefactory_init_initialize(WebDriver driver) {
		
		OrangeLogin OrangeLogin_object = new OrangeLogin(driver);
		OrangeAdmin OrangeAdmin_object = new OrangeAdmin(driver);
		Orangehome Orangehome_object = new Orangehome(driver);
		OrangeLeave OrangeLeave_object = new OrangeLeave(driver);
		OrangeMyInfo OrangeMyInfo_object = new OrangeMyInfo(driver);
		OrangePIM OrangePIM_object = new OrangePIM(driver);
		OrangeTime OrangeTime_object = new OrangeTime(driver);
		Recruitment Recruitment_object = new Recruitment(driver);
		
	}

}
