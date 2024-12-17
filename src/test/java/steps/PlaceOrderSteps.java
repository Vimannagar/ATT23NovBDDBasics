package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderSteps {
	
	AddToCartSteps addToCart;
	
	public PlaceOrderSteps(AddToCartSteps addToCart)
	{
		this.addToCart = addToCart;
	}
	
	@When("I click on place order button")
	public void i_click_on_place_order_button() {
	   System.out.println("Place order clicked");
	}

	@Then("order should get placed")
	public void order_should_get_placed() {
	   System.out.println("Order placed!!!");
	   
	   System.out.println("The product id value is : "+addToCart.getProductId());
	}
	
	@Then("I verify the id available")
	public void validateOrderId()
	{
		System.out.println("The product id value from scenario 2 is : "+addToCart.getProductId());
	}


}
