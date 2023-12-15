package com.StepDefinition;

import org.testng.Assert;

import com.actions.ConnectwithusActions;
import com.actions.ShoesActions;
import com.utility.Helper_Class;
import com.utility.SearchProperties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoesStepDefinition {
	SearchProperties pro = new SearchProperties();
	ShoesActions actions= new ShoesActions();
	@Given("User is on SportsJam in HomePage")
	public void user_is_on_sports_jam_in_home_page() {
		Helper_Class.openPage(pro.url);
	}

	@When("User is clicking shoes")
	public void user_is_clicking_shoes() {
		actions.clickShoes();
	}

	@When("user is selecting Football")
	public void user_is_selecting_football() {
	    actions.clickfootball();
	}

//	@When("User clicking Brand")
//	public void user_clicking_brand() {
//		 actions.checbrand();
//	}

	@When("User Selecting the Brand")
	public void user_selecting_the_brand() {
		 actions.clicbrand();
	}

	@When("User clicking Shoes category")
	public void user_clicking_shoes_category() {
		 actions.checshoescategory();
	}

	@When("User Selecting the Shoes category")
	public void user_selecting_the_shoes_category() {
		 actions.clicshoescategory();
	}

	@When("User clicking Soccer Shoe Type")
	public void user_clicking_soccer_shoe_type() {
		 actions.checshoestype();
	}

	@When("User Selecting the Soccer Shoe Type")
	public void user_selecting_the_soccer_shoe_type() {
		 actions.clicshoestype();
	}

	@When("User clicking Size")
	public void user_clicking_size() {
		 actions.checsize();
	}

	@When("User Selecting the Size")
	public void user_selecting_the_size() {
		 actions.clicsize();
	}

	@When("User clicking Availability")
	public void user_clicking_availability() {
		 actions.checAvailability();
	}

	@When("User Selecting the Availability")
	public void user_selecting_the_availability() {
		 actions.clicAvailability();
	}

	@Then("User should able to see available shoes Successfully")
	public void user_should_able_to_see_available_shoes_successfully() {
		Assert.assertTrue(actions.checAssert().contains("Adidas X 15.4 Turf Football Shoes"));
	}




}
