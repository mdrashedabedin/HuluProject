package disney.hulu.pageAction;

import org.openqa.selenium.support.PageFactory;

import disney.hulu.pageElement.HuluHomepageLocators;
import disney.utilities.SetupDrivers;

public class HuluHomepageActions {
	//hello test git
	//Test Git branch

	HuluHomepageLocators HuluHomepageLocatorsobj;
	
	public HuluHomepageActions(){
		HuluHomepageLocatorsobj = new HuluHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, HuluHomepageLocatorsobj);
	}
	
	public void clkDsnyBndl(){
		HuluHomepageLocatorsobj.btnDsnyBndl.click();
	}
	
	public void clkOnlyHuluPlan(){
		HuluHomepageLocatorsobj.clkHuluOnly.click();
	}
	
	public void clkLogInHome(){
		HuluHomepageLocatorsobj.hmPgLogIn.click();
	}
	
	

}
