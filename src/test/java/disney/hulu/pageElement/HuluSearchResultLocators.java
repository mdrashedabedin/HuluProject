package disney.hulu.pageElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HuluSearchResultLocators {
	
	@FindBy(xpath = "//div[@class='page__title ']")
	public WebElement dsnyBndlPgLoc;

	@FindBy (xpath = "//button[@aria-label='Select Hulu (No Ads) + Live TV, Disney+ (No Ads), and ESPN+ (With Ads) for $75.99/month*']")
	public WebElement btnSlct;
	
	@FindBy (xpath = "//div[@class ='student-discount-link student-discount-link--page-bottom']")
	public WebElement clkStdntLnk;

	@FindBy (xpath = "//input[@data-automationid = 'email-field']")
	public WebElement fldEmail;
	
	@FindBy (xpath = "//input[@type = 'password']")
	public WebElement fldPsswrd;
	
	@FindBy (xpath = "//button[@data-automationid = 'login-button']")
	public WebElement clkLogIn;
	
}
