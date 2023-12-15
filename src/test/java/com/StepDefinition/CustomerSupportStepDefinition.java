package com.StepDefinition;

import org.testng.Assert;
import com.actions.CustomerSupportActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerSupportStepDefinition {
	
	CustomerSupportActions Product = new CustomerSupportActions();
	

	@When("User clicks Gift Voucher")
	public void user_clicks_gift_voucher() {
		
		
		Product.scrollAll();
		Product.clickGift();
	}

	@When("user clicks Image")
	public void user_clicks_image() {
	    
		Product.clickImage();
	}

	@Then("user clicks add to cart")
	public void user_clicks_add_to_cart() {
		Product.clickCart();
	}

	@When("User clicks Reward Points")
	public void user_clicks_reward_points() {
		Product.clickReward();
	}

	@Then("REWARD POINTS message is shown")
	public void reward_points_message_is_shown() {
	    Assert.assertTrue(Product.getPointsVerifyText().contains("REWARD POINTS"));
	}

	@When("User clicks Buyers Guide")
	public void user_clicks_buyers_guide() {
		Product.clickBuyers();
	}

	@Then("Buyers Guide message is shown")
	public void buyers_guide_message_is_shown() {
		Assert.assertTrue(Product.getGuideVerifyText().contains("Buyer's Guide"));
	}

	@When("User clicks Customized Services")
	public void user_clicks_customized_services() {
		Product.clickCutomerized();
	}

	@Then("CUSTOMIZED SERVICES message is shown")
	public void customized_services_message_is_shown() {
	    Assert.assertTrue(Product.getServiceVerifyText().contains("CUSTOMIZED SERVICES"));
	}

	@When("User clicks Express Shipping")
	public void user_clicks_express_shipping() {
		Product.clickExpress();
	}

	@Then("DELIVERY INFORMATION message is shown")
	public void delivery_information_message_is_shown() {
	   Assert.assertTrue(Product.getInformationVerifyText().contains("DELIVERY INFORMATION"));
	}

	@When("User clicks Secure Shopping")
	public void user_clicks_secure_shopping() {
		Product.clickSecure();
	}

	@Then("PRIVACY AND SECURITY POLICY message is shown")
	public void privacy_and_security_policy_message_is_shown() {
	    Assert.assertTrue(Product.getShoppingVerifyText().contains("PRIVACY AND SECURITY POLICY"));
	}

	@When("User clicks {int}% Authentic")
	public void user_clicks_authentic(Integer int1) {
		Product.clickAuthentic();
	}

	@Then("AUTHENTICITY @ SPORTSJAM.IN message is shown")
	public void authenticity_sportsjam_in_message_is_shown() {
	   Assert.assertTrue(Product.getSportsVerifyText().contains("AUTHENTICITY @ SPORTSJAM.IN"));
	}



	
}
