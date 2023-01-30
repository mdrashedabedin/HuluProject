package disney.hulu.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import disney.hulu.pageAction.HuluSearchResultActions;

public class HuluSearchResultSteps {
	
	HuluSearchResultActions HuluSearchResultActionsobj = new HuluSearchResultActions();
	
	@Then("^Chose Your Plan Page Should Appear$")
	public void chose_Your_Plan_Page_Should_Appear() throws Throwable {
		HuluSearchResultActionsobj.chsUrPlnPg();
	 
	}
	
	@When("^Click on Hulu\\+Live TV Select button$")
	public void click_on_Hulu_Live_TV_Select_button() throws Throwable {
		HuluSearchResultActionsobj.clkslctlivetv();
	}
	
	
	@When("^Click on Looking For Our Student Discount$")
	public void click_on_Looking_For_Our_Student_Discount() throws Throwable {
		HuluSearchResultActionsobj.clkStdntDscntLnk();
	}
	
	@When("^Enter E-mail$")
	public void enter_E_mail() throws Throwable {
		HuluSearchResultActionsobj.entrEmail();
	}

	@When("^Enter Wrong Password$")
	public void enter_Wrong_Password() throws Throwable {
		HuluSearchResultActionsobj.entrPsswrd();
	}

	@Then("^Click Log In$")
	public void click_on_Log_In() throws Throwable {
		HuluSearchResultActionsobj.clkLogInbttn();
	}

	
	
	
	
	
	

}
