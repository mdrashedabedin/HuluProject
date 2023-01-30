package disney.hulu.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import disney.hulu.pageAction.HuluHomepageActions;

public class HuluHomepageSteps {
	
	HuluHomepageActions HuluHomepageActionsobj = new HuluHomepageActions();
	
	@Given("^Hulu Homepage is open$")
	public void hulu_Homepage_is_open() throws Throwable {
	  
	}

	@When("^Click On Get The Disney Bundle$")
	public void click_On_Get_The_Disney_Bundle() throws Throwable {
	   HuluHomepageActionsobj.clkDsnyBndl();
	}
	
	@When("^Click on Sign up for Hulu Only$")
	public void click_on_Sign_up_for_Hulu_Only() throws Throwable {
		HuluHomepageActionsobj.clkOnlyHuluPlan();
	}

	@When("^Click on Log In$")
	public void click_on_Log_In() throws Throwable {
		HuluHomepageActionsobj.clkLogInHome();
	}
	
	
	

}
