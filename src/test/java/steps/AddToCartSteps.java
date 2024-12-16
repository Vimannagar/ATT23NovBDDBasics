package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps {
	
	 String productId ;
	 
	 public String getProductId()
	 {
		 return productId;
	 }

@Given("I should be at the product page")
public void i_should_be_at_the_product_page() {
 
	System.out.println("Given  statement from Add to cart");
}

@When("I click on add to cart button")
public void i_click_on_add_to_cart_button() {
    System.out.println("Adding the product to cart");
 
    }

@Then("Product should get added")
public void product_should_get_added() {
  System.out.println("Product got added!!");
   productId = "sdhfg2bsdh2fsdbfsdbf2eef4543534";
  
}


}
