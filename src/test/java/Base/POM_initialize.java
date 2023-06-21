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
	
	public static void pagefactory_init_initialize() {
		
		//Creating the object for all POM classes to invoke constructor
		// The POM class (init) elements get initialized
		
		OrangeLogin OrangeLogin_object = new OrangeLogin();
		OrangeAdmin OrangeAdmin_object = new OrangeAdmin();
		Orangehome Orangehome_object = new Orangehome();
		OrangeLeave OrangeLeave_object = new OrangeLeave();
		OrangeMyInfo OrangeMyInfo_object = new OrangeMyInfo();
		OrangePIM OrangePIM_object = new OrangePIM();
		OrangeTime OrangeTime_object = new OrangeTime();
		Recruitment Recruitment_object = new Recruitment();
		
	}

}
