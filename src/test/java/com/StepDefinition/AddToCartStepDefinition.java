package com.StepDefinition;

import org.testng.Assert;

import com.actions.AddToCartActions;

import com.actions.PaymentActions;

import com.utility.Helper_Class;

import com.utility.properties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDefinition {
	PaymentActions bb = new PaymentActions();
	AddToCartActions adc = new AddToCartActions();
	properties pr = new properties();

	@Given("Launch URL to open SportsJam")
	public void launch_url_to_open_sports_jam() {
		Helper_Class.openPage(pr.url);

	}

	@When("user trying to search product")
	public void user_trying_to_search_product() {
		adc.Search(pr.search);
		Helper_Class.log.info("search product");
	}

	@When("user clicks search button")
	public void user_clicks_search_button() {
		adc.clickSearc();
		Helper_Class.log.info("search product");
	}

	@When("user clicks item from product list")
	public void user_clicks_item_from_product_list() {
		adc.clickimage();
		Helper_Class.log.info("search product");
	}

	@When("User trying to add product to cart and goes back to the previous window")
	public void user_trying_to_add_product_to_cart_and_goes_back_to_the_previous_window() {
		adc.clickaddtocart();
		Helper_Class.getDriver().navigate().back();
		Helper_Class.log.info("search product");

	}

	@When("user clicks the second product")
	public void user_clicks_the_second_product() throws InterruptedException {

		adc.clickSecondProduct();
		Helper_Class.log.info("second product");
	}

	@When("user clicks add to cart for second product")
	public void user_clicks_add_to_cart_for_second_product() {
		adc.clickSecondCart();
		Helper_Class.log.info("add to cart for second product");
	}

	@When("User clicks on Cart")
	public void user_clicks_on_cart() {
		adc.clickcart();
		Helper_Class.log.info("click the cart");
	}

	@Then("The item is shown on the cart")
	public void the_item_is_shown_on_the_cart() {
		Assert.assertTrue(adc.getVerifyText().contains("Salomon X Ultra 2 Hiking Shoes (Black/Grey) ( Size (UK)=9 )"));
	}

	@When("user clicks remove from cart")
	public void user_clicks_remove_from_cart() {
		adc.clickRemove();
		Helper_Class.log.info("remove from cart");
	}

	@Then("the updated Cart is shown")
	public void the_updated_cart_is_shown() {
		Assert.assertTrue(adc.getEmptyVerifyText().contains("Adidas Essential Star Running Shoes ( Size (UK)=6 )"));
	}
}
