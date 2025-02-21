package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {


	
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	WebElement textField;
	
	@FindBy(xpath = "//*[@id='nav-search-submit-button']")
	WebElement searchIcon;
	
	@FindBy(xpath = "//*[@role='listitem']//*[contains(text(),'Redmi A4 5G (Sparkle')]")
	WebElement product;
	
	public SearchPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchingProduct(String textToBeSearched)
	{
		clearAndSendKeys(textField, textToBeSearched);
		click(searchIcon);
		
	}
	
	public boolean verifyMobile()
	{
		wait.until(ExpectedConditions.visibilityOf(product));
		
		boolean isDisplaying = product.isDisplayed();
		
		return isDisplaying;
		
	}
	
	
	
}
