package uiappfeature;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;
import qa.DriverFactory2;

public class SearchSteps {
	
	SearchPage search = new SearchPage(DriverFactory2.getDriver());
	
	@When("user searches for {string} in text box")
	public void user_searches_for_in_text_box(String string) {
		search.searchingProduct(string);
	}

	@Then("mobile search results should displayed")
	public void mobile_search_results_should_displayed() {
	 boolean isGettingDisplayed = search.verifyMobile();
	 
	 Assert.assertEquals(isGettingDisplayed, true);
	 
	}

}
