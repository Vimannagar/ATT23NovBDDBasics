package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {

	
	@Given("user should be logged into app")
	public void preRequisite()
	{
		System.out.println("User logged in....");
	}
	
	@When("user clicks on order button")
	public void navToOrdersPage()
	{
		System.out.println("Navigated to orders page");
		
	}
	
	@Then("user redirects to orders page")
	public void validateOrderPage()
	{
		System.out.println("Orders page validated");
	}
	
	@When("user clicks on currently placed order")
	public void handlingPlaceOrder()
	{
		System.out.println("Clicked on currently placed order");
		
	}
	
	@Then("user should see current order information")
	public void currentOderValidation()
	{
		System.out.println("Current order validated");
	}
	
	
	@When("user clicks on past order")
	public void handlingPastPlaceOrder()
	{
		System.out.println("Clicked on past placed order");
		
	}
	
	@Then("user should see past order information")
	public void pastOderValidation()
	{
		System.out.println("Past order validated");
	}
	
	@When("user clicks on cancelled order")
	public void handlingCancelledPlaceOrder()
	{
		System.out.println("Clicked on cancelled order");
		
	}
	
	@Then("user should see cancelled order information")
	public void cancelledOderValidation()
	{
		System.out.println("cancelled order validated");
	}
	
}
