package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

	
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	WebElement textField;
	
	@FindBy(xpath = "//*[@id='nav-search-submit-button']")
	WebElement searchIcon;
	
	
	
}
