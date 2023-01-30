package disney.hulu.pageAction;

import org.openqa.selenium.support.PageFactory;

import disney.hulu.pageElement.HuluSearchResultLocators;
import disney.utilities.SetupDrivers;

public class HuluSearchResultActions {
	
	HuluSearchResultLocators HuluSearchResultLocatorsobj;
	
	public  HuluSearchResultActions(){
		HuluSearchResultLocatorsobj = new HuluSearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, HuluSearchResultLocatorsobj);
	}
	
	public void chsUrPlnPg(){
		HuluSearchResultLocatorsobj.dsnyBndlPgLoc.isDisplayed();
	}
	
	public void clkslctlivetv(){
		HuluSearchResultLocatorsobj.btnSlct.click();
	}
	
	public void clkStdntDscntLnk(){
		HuluSearchResultLocatorsobj.clkStdntLnk.click();
		
	}
	
	public void entrEmail() throws Exception {
		HuluSearchResultLocatorsobj.fldEmail.sendKeys("rishi@asdf.com");
		Thread.sleep(3000);
	}
	
	public void entrPsswrd() throws Exception {
		HuluSearchResultLocatorsobj.fldPsswrd.sendKeys("1234asdf");
		Thread.sleep(3000);
	}
	
	public void clkLogInbttn(){
		HuluSearchResultLocatorsobj.clkLogIn.click();
		
	}

}
