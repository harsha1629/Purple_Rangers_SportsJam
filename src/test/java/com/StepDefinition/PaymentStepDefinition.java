package com.StepDefinition;

import org.testng.Assert;
import com.actions.PaymentActions;
import com.utility.Helper_Class;
import com.utility.Payment;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentStepDefinition {
	
	PaymentActions Process =new PaymentActions();
	Payment pay =new Payment();
	
   @When("User trying to add product to cart")
   public void user_trying_to_add_product_to_cart() {
	   Process.clickAdd();
    Helper_Class.log.info("add the product to cart");
   }
   
	@When("user clicks proceed to pay")
	public void user_clicks_proceed_to_pay() {
		Process.clickPay();
	Helper_Class.log.info("proceed to pay");
	}
	    

	@When("User enters email,password,holebutton and clicking continue")
	public void user_enters_email_password_holebutton_and_clicking_continue() {
		Process.Email(pay.Email);
		Process.clickContinue();
	    Helper_Class.log.info("enter the email password and click");
	}

	@When("User entering Name,LastName,Address,Zipcode,Country,State,mobileNo,clicking continue")
	public void user_entering_name_last_name_address_zipcode_country_state_mobile_no_clicking_continue() {
		Process.ADetails(pay.Name, pay.LastName, pay.Address, pay.Code, pay.City, pay.Mobile);
		Process.Country();
		Process.CountryIndia();
		Process.State();
		Process.StateTamil();
		Process.clickContinee();
	  Helper_Class.log.info("enter name adress and click");
	}

	@When("User verifying Order Details,contine")
	public void user_verifying_order_details_contine() {
		Process.clickContineee();
		Process.clickPayNow();
	    Helper_Class.log.info("verifying order details");
	}

	@Then("user trying to click payNow")
	public void user_trying_to_click_pay_now() {
	   Assert.assertTrue(Process.getVerifyText().contains("Billing Information"));
	}


}
