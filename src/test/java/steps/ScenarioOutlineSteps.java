package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("user is at signup page")
	public void user_is_at_signup_page() {
	  System.out.println("given statement");
	}

	@When("user enters name as {string} over form")
	public void user_enters_name_as_over_form(String userName) {
	    System.out.println("Entered name as : "+userName);
	    
	    if(userName.equals("Diana"))
	    {
	    	throw new NullPointerException("This is failed deliberately");
	    }
	}

	@When("user select gender as {string}")
	public void user_select_gender_as(String string) {
	    System.out.println("Gender selected as : "+string);
	}

	@When("user select the slotnumber as {int}")
	public void user_select_the_slotnumber_as(Integer int1) {
	   System.out.println("Selected slot is "+int1);
	}

	@Then("user gets created")
	public void user_gets_created() {
	   System.out.println("User creation validated!!!");
	}
	
	@Given("user is at login")
	public void user_is_at_login() {
	   System.out.println("navigate to login screen");
	}

	@When("user perform login")
	public void user_perform_login() {
		System.out.println("Perform login");
	}

	@Then("home page should get displayed")
	public void home_page_should_get_displayed() {
		System.out.println("home page validated");
	}
	
	
	


}
