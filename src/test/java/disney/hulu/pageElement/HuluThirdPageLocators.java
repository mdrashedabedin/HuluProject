package disney.hulu.pageElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HuluThirdPageLocators {

	@FindBy (xpath = "//div[@class='panel account__panel large']")
	public WebElement accntcrtpgloc;
	
	@FindBy (xpath = "//button[@class='button--cta Masthead__input-cta smooth-transition css-j12r4o']")
	public WebElement clkSngUp;
	
}
