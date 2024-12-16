package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("I am at login page")
	public void preRequisite()
	{
		System.out.println("Given statement is executing");
	}
	
	@When("I enter username")
	public void enteringUsername()
	{
		System.out.println("Username entered");
	}
	
	
	@When("I enter password")
	public void enteringPassword()
	{
		System.out.println("Password entered");
	}
	
	@When("I click on login button")
	public void clickOnLogin()
	{
		System.out.println("clicked on login");
	}
	
	@Then("I should get logged into application")
	public void validatingLogin()
	{
		System.out.println("Login validated!!!");
	}
	
	


	
	@Then("I should verify title of page")
	public void validateTitle()
	{
		System.out.println("Title validated!!");
	}
}
