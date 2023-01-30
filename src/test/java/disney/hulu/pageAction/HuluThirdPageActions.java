package disney.hulu.pageAction;

import org.openqa.selenium.support.PageFactory;

import disney.hulu.pageElement.HuluThirdPageLocators;
import disney.utilities.SetupDrivers;

public class HuluThirdPageActions {
	
	HuluThirdPageLocators HuluThirdPageLocatorsobj;
	
	public HuluThirdPageActions(){
		HuluThirdPageLocatorsobj = new HuluThirdPageLocators();
		PageFactory.initElements(SetupDrivers.driver, HuluThirdPageLocatorsobj);
	}

	public void crtAccntPageAppr(){
		HuluThirdPageLocatorsobj.accntcrtpgloc.isDisplayed();
	}
	
	public void clkSngUpNwLnk(){
		HuluThirdPageLocatorsobj.clkSngUp.click();
	}
	
	
}
