package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	// CTRL + SHIFT + O
	
	@Given("user should be at loginpage")
	public void user_should_be_at_loginpage() {
	   System.out.println("navigating to login page");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
	   System.out.println("Entered username is : "+string);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
	    System.out.println("Entered password is : "+string);
	}

	@When("user click on submit {int} button")
	public void user_click_on_submit_button(Integer int1) {
	   System.out.println("clicked on submit button and the value of parameter is : "+int1);
	}

	@Then("user should get logged into app")
	public void user_should_get_logged_into_app() {
	    System.out.println("Login validated!!!");
	}


}
