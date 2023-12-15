package com.StepDefinition;

import org.testng.Assert;

import com.actions.SearchActions;
import com.utility.Helper_Class;
import com.utility.SearchProperties;
import com.utility.properties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition {
	SearchActions action= new SearchActions();
	SearchProperties pro = new SearchProperties();
	@Given("User is on SportsJam HomePage")
	public void user_is_on_sports_jam_home_page() {
		Helper_Class.openPage(pro.url);
	}

	@When("User clicking the searchbar and user give the  keyword")
	public void user_clicking_the_searchbar_and_user_give_the_keyword() {
		action.clickSearch(pro.valueone);
		Helper_Class.log.info("User Enter the ProductOne");
	}

	@When("User click the Search option")
	public void user_click_the_search_option() {
		action.clickbutton();
		Helper_Class.log.info("User Click  the Serach button ");
	}
	@When("User getting the Number of product list displayed")
	public void user_getting_the_number_of_product_list_displayed() {
	    action.gettingListOfProducts();
	    Helper_Class.log.info("User get   the list of the product one ");
	    
	}

	@When("User clicks the product in the list")
	public void user_clicks_the_product_in_the_list() {
		action.clickproduct();
		Helper_Class.log.info("User Click  the first Product in the List");
	}

	@Then("User successfully Search the product")
	public void user_successfully_search_the_product() {
		action.clickcheckvalue();
	    Assert.assertTrue(action.clickcheckvalue().contains("DSC PREMIUM CRICKET SET"));
	    Helper_Class.log.info("User Assert  the Product");
	    System.out.println("User Successfully search the first product");
	}
	
	@When("User clicking the searchbar and user give the  keywordtwo.")
	public void user_clicking_the_searchbar_and_user_give_the_keywordtwo() {
		action.clickSearch(pro.valuetwo);
		Helper_Class.log.info("User Enter the ProductTwo");
	}
	@When("User getting the Number of product2 list displayed")
	public void user_getting_the_number_of_product2_list_displayed() {
		action.gettingListOfProductstwo();
	    Helper_Class.log.info("User get   the list of the product one ");
	}

	@When("User clicks the product in the listtwo")
	public void user_clicks_the_product_in_the_listtwo() {
		action.clickcheckbuttonone();
		Helper_Class.log.info("User Click the Product in the list");
	}
	@Then("User successfully Search the product2")
	public void user_successfully_search_the_product2() {
	    Assert.assertTrue(action.verifyAssert().contains("Adidas Oceaunz Club Football (Bright Blue/White, Size 5)"));
	    Helper_Class.log.info("User Assert the Product");
	    System.out.println("User Successfully search the second product");
	    
	}




}
