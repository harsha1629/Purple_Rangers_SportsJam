package com.StepDefinition;

import org.testng.Assert;

import com.actions.PaymentActions;
import com.utility.Helper_Class;
import com.utility.properties;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentStepDefinition {
	
	PaymentActions bb =new PaymentActions();
	properties cc =new properties();
	
   @When("User trying to add product to cart")
   public void user_trying_to_add_product_to_cart() {
    bb.clickAdd();
    Helper_Class.log.info("add the product to cart");
   }
   
	@When("user clicks proceed to pay")
	public void user_clicks_proceed_to_pay() {
	bb.clickPay();
	Helper_Class.log.info("proceed to pay");
	}
	    

	@When("User enters email,password,holebutton and clicking continue")
	public void user_enters_email_password_holebutton_and_clicking_continue() {
		bb.Email(cc.Email);
	    bb.clickContinue();
	    Helper_Class.log.info("enter the email password and click");
	}

	@When("User entering Name,LastName,Address,Zipcode,Country,State,mobileNo,clicking continue")
	public void user_entering_name_last_name_address_zipcode_country_state_mobile_no_clicking_continue() {
	  bb.ADetails(cc.Name, cc.LastName, cc.Address, cc.Code, cc.City, cc.Mobile);
	  bb.Country();
	  bb.CountryIndia();
	  bb.State();
	  bb.StateTamil();
	  bb.clickContinee();
	  Helper_Class.log.info("enter name adress and click");
	}

	@When("User verifying Order Details,contine")
	public void user_verifying_order_details_contine() {
	    bb.clickContineee();
	    bb.clickPayNow();
	    Helper_Class.log.info("verifying order details");
	}

	@Then("user trying to click payNow")
	public void user_trying_to_click_pay_now() {
	   Assert.assertTrue(bb.getVerifyText().contains("Billing Information"));
	}


}
