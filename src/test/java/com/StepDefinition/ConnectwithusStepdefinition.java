package com.StepDefinition;

import org.testng.Assert;

import com.actions.ConnectwithusActions;
import com.actions.SearchActions;
import com.utility.Helper_Class;
import com.utility.SearchProperties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConnectwithusStepdefinition {
	ConnectwithusActions actions= new ConnectwithusActions();
	SearchProperties pro = new SearchProperties();
	@Given("user is in the home page of sportsjam page")
	public void user_is_in_the_home_page_of_sportsjam_page() {
		
		Helper_Class.openPage(pro.url);
		
	}
	@When("User clicks Facebook image")
	public void user_clicks_facebook_image() {
		actions.clicfacebook();
		Helper_Class.log.info("User Clicks the Facebook Image");
	}

	@Then("Connect with SportsJam.in on Facebook message is shown")
	public void connect_with_sports_jam_in_on_facebook_message_is_shown() throws InterruptedException {
		actions.changetab();
	    actions.clickclicfacebook();
//	    Thread.sleep(5000);
	    Assert.assertTrue(actions.clickclicfacebook().contains("Connect with SportsJam.in on Facebook"));
	System.out.println("FaceBook");
	Helper_Class.log.info("User Assert the Facebook Web page");
	
	}

	@When("User clicks Twiiter image")
	public void user_clicks_twiiter_image() {
	    actions.clictwitter();
	    Helper_Class.log.info("User Clicks the Twiiter Image");
	    
	}

	@Then("Sign in to X message is shown")
	public void sign_in_to_x_message_is_shown() {
		actions.changetab();
		actions.clickclictwitter();
	    Assert.assertTrue(actions.clickclictwitter().contains("Sign in to X"));
	    Helper_Class.log.info("User Assert the Twitter Web page");
	}

	@When("User clicks Instagram Image")
	public void user_clicks_instagram_image() {
	    actions.clicinstagram();
	    Helper_Class.log.info("User Clicks the Instagram Image");
	   
	}

	@Then("Sportsjam.in  message is showns")
	public void sportsjam_in_message_is_showns() {
		actions.changetab();
		actions.clickclicinstagram();
	    Assert.assertTrue(actions.clickclicinstagram().contains("One Stop-shop for your Sports needs! Get a huge variety to choose from, at competitive prices and quick delivery. Enjoy your game.. #SportsJamIn"));
	    Helper_Class.log.info("User Assert the Instagram Web page");
	}
	

//	@When("User clicks YouTube Image")
//	public void user_clicks_you_tube_image() {
//		actions.clicyoutube();
//		Helper_Class.log.info("User Clicks the YouTube Image");
//	}
//
//	@Then("One Stop-shop for your Sports needs! Get a huge variety to choose from message is show")
//	public void one_stop_shop_for_your_sports_needs_get_a_huge_variety_to_choose_from_message_is_show() {
//		actions.changetab();
//		actions.clickclicyoutube();
//	    Assert.assertTrue(actions.clickclicyoutube().contains("One Stop-shop for your Sports needs! Get a huge variety to choose from,"));
//	    Helper_Class.log.info("User Assert the YouTube Web page");
//	}




}
