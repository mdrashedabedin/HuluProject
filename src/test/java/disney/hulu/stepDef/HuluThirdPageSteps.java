package disney.hulu.stepDef;

import cucumber.api.java.en.Then;
import disney.hulu.pageAction.HuluThirdPageActions;

public class HuluThirdPageSteps {
	
	HuluThirdPageActions HuluThirdPageActionsobj = new HuluThirdPageActions();

	@Then("^Create your Account Page should Appear$")
	public void create_your_Account_Page_should_Appear() throws Throwable {
		HuluThirdPageActionsobj.crtAccntPageAppr();
	}
	
	@Then("^Click on Sign Up Now$")
	public void click_on_Sign_Up_Now() throws Throwable {
		HuluThirdPageActionsobj.clkSngUpNwLnk();
		
	}
	
}
