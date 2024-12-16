package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {

	@Given("user should be at registration page")
	public void user_should_be_at_registration_page() {
		System.out.println("Given statement");
	}

	@When("user enters data in following format")
	public void user_enters_data_in_following_format(DataTable data) {
		// accessing the data using lists

		List<List<String>> dataObject = data.asLists();

//		List<String> blueList = dataObject.get(0);

		String blueFirstIndex = dataObject.get(0).get(1);

		System.out.println(blueFirstIndex);//lastname
		
		System.out.println(dataObject);// to print total structure of data
		
List<String> listOfString = dataObject.get(1);

System.out.println(listOfString);// to print the list with first index position

//	String blueThirdIndex = blueList.get(3);
//	
//	System.out.println(blueThirdIndex);

		System.out.println("********************************");

		List<Map<String, String>> data1 = data.asMaps();

		String mobileNumber = data1.get(0).get("mobile");
		
		System.out.println(mobileNumber);

	}

	@When("click on submit button")
	public void click_on_submit_button() {
		System.out.println("clicked on submit");
	}

	@Then("account should get created")
	public void account_should_get_created() {
		System.out.println("Account created!!");
	}

}
