package uiappfeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	HomePage homepage = new HomePage(DriverFactory.getDriver());
	
	@Given("user is at landing page")
	public void user_is_at_landing_page() {
	    
		WebDriver driver = DriverFactory.getDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.navigate().refresh();
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String string) {
	   
		String titleOfPage = homepage.getTitleOfPage();
		
		boolean isPresent = titleOfPage.contains(string);
		
		Assert.assertTrue(isPresent);
	}

	@Then("cart icon should get displayed")
	public void cart_icon_should_get_displayed() {
	  
	boolean isVisibled = homepage.isCartIconDisplayed();
	
	Assert.assertEquals(isVisibled, true);
	}

	@When("user clicks on deals")
	public void user_clicks_on_deals() {
	   homepage.checkoutDealsSection();
	}

	@Then("user should redirects to helmets deal section")
	public void user_should_redirects_to_helmets_deal_section() {
	  
		boolean isDisplayed = homepage.helmetSection();	
		
		Assert.assertEquals(isDisplayed, true);
		
	}


}
