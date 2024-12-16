package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignSteps {

	@Given("user is at campaigns page")
	public void user_is_at_campaigns_page() {
	 System.out.println("Nav to campaigns page");
	}

	@When("user click on create campaign button")
	public void user_click_on_create_campaign_button() {
	  System.out.println("clicked on campaign button");
	}

	@When("user click on save button")
	public void user_click_on_save_button() {
	    System.out.println("campaign saved");
	}

	@Then("campaign should get created")
	public void campaign_should_get_created() {
	  System.out.println("campaign created");
	}

	@When("user click on edit camapaign")
	public void user_click_on_edit_camapaign() {
	   System.out.println("Updating campaign");
	}

	@When("user enters the time")
	public void user_enters_the_time() {
	   System.out.println("entered the time");
	}

	@Then("campaign should get scheduled")
	public void campaign_should_get_scheduled() {
	    System.out.println("Campaign scheduled!!!");
	}

	@When("user click on send campaign")
	public void user_click_on_send_campaign() {
	   System.out.println("Sending emails");
	}

	@Then("campaign should get sent to contacts")
	public void campaign_should_get_sent_to_contacts() {
	   System.out.println("Emails triggered!!");
	}
	
	
}
