package com.StepDefinition;

import org.testng.Assert;
import com.actions.AddToCartActions;
import com.actions.PaymentActions;
import com.utility.AddToCart;
import com.utility.Helper_Class;
import com.utility.Payment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDefinition {
	PaymentActions Process =new PaymentActions();
	Payment Pay =new Payment();
	AddToCart Add = new AddToCart();
	AddToCartActions Cart = new AddToCartActions();
	
	@Given("Launch URL to open SportsJam")
	public void launch_url_to_open_sports_jam() {
		Helper_Class.openPage(Add.url);
		
	}


	@When("user trying to search product")
	public void user_trying_to_search_product() {
		Cart.Search(Add.search);
		Helper_Class.log.info("search product");
	}

	@When("user clicks search button")
	public void user_clicks_search_button() {
		Cart.clickSearc();
	    Helper_Class.log.info("search product");
	}

	@When("user clicks item from product list")
	public void user_clicks_item_from_product_list() {
		Cart.clickimage();
	    Helper_Class.log.info("search product");
	}

	@When("User trying to add product to cart and goes back to the previous window")
	public void user_trying_to_add_product_to_cart_and_goes_back_to_the_previous_window() {
		Cart.clickaddtocart();
		Helper_Class.getDriver().navigate().back();
		Helper_Class.log.info("search product");

	}
@When("user clicks the second product")
public void user_clicks_the_second_product() throws InterruptedException {

	Cart.clickSecondProduct();
    Helper_Class.log.info("second product");
}

 @When("user clicks add to cart for second product")
public void user_clicks_add_to_cart_for_second_product() {
	 Cart.clickSecondCart();
	Helper_Class.log.info("add to cart for second product");
}
	@When("User clicks on Cart")
	public void user_clicks_on_cart() {
		Cart.clickcart();
		Helper_Class.log.info("click the cart");
	}

	@Then("The item is shown on the cart")
	public void the_item_is_shown_on_the_cart() {
		Assert.assertTrue(Cart.getVerifyText().contains("Salomon X Ultra 2 Hiking Shoes (Black/Grey) ( Size (UK)=9 )"));
	}
	
	@When("user clicks remove from cart")
	public void user_clicks_remove_from_cart() {
		Cart.clickRemove();
	  Helper_Class.log.info("remove from cart");
	}

	@Then("the updated Cart is shown")
	public void the_updated_cart_is_shown() {
	    Assert.assertTrue(Cart.getEmptyVerifyText().contains("Adidas Essential Star Running Shoes ( Size (UK)=6 )"));
	}
}

