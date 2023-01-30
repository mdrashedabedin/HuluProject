package disney.hulu.pageElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HuluHomepageLocators {

	
	@FindBy (xpath = "//span[contains(text(), 'GET THE DISNEY BUNDLE')]" )
	public WebElement btnDsnyBndl;
	
	@FindBy (xpath = "//a[@title='Sign up for Hulu only']")
	public WebElement clkHuluOnly;

	@FindBy (xpath = "//span[contains(text(), 'Log In' )]")
	public WebElement hmPgLogIn;
	
}
