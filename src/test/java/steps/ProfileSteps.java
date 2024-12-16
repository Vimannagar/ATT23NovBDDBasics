package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {

	
	@Given("I am at home page")
	public void i_am_at_home_page() {
	  System.out.println("Given Statement");
	}

	@When("I click on add button")
	public void i_click_on_add_button() {
	  System.out.println("adding the profile");
	}

	@When("I enter the data")
	public void i_enter_the_data() {
	   System.out.println("data entered");
	}

	@Then("Profile should get created")
	public void profile_should_get_created() {
	    System.out.println("Profile Created!!!");
	}

	@When("I click on edit button")
	public void i_click_on_edit_button() {
	   System.out.println("handling edit button");
	}

	@When("I update the data")
	public void i_update_the_data() {
	 System.out.println("Editing the data");
	}

	@Then("Profile should get updated")
	public void profile_should_get_updated() {
	    System.out.println("Data updated!!!");
	}

	@When("I click on delete button")
	public void i_click_on_delete_button() {
	    System.out.println("Handling delete button");
	}

	@Then("Profile should get deleted")
	public void profile_should_get_deleted() {
	  System.out.println("Profile deleted!!");
	}
}
