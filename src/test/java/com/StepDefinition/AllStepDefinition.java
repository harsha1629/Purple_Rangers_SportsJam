package com.StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.actions.AllActions;
import com.utility.ExcelReader;
import com.utility.Helper_Class;
import com.utility.properties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllStepDefinition {
	AllActions action = new AllActions();
	properties pro = new properties();
	ExcelReader el = new ExcelReader();

	@Given("user is in the home page of sportsjam")
	public void user_is_in_the_home_page_of_sportsjam() {
		Helper_Class.openPage(pro.url);
		Helper_Class.log.info("User is in the home page.");

	}

	@Given("User clicks the log in button")
	public void user_clicks_the_log_in_button() {
		action.clickSignIn();
		Helper_Class.log.info("User clicks one the login button");
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		action.signButton();
		Helper_Class.log.info("User clicks ont the login button");
	}

	@Then("User is shown looged in to the website")
	public void user_is_shown_looged_in_to_the_website() throws InterruptedException {
		Assert.assertTrue(action.getVerifyText2().contains("Logout"));
		Helper_Class.log.info("User is shown the loggen in message");
		action.logout();
	}

	@Then("User is shown No customer account found message")
	public void user_is_shown_no_customer_account_found_message() {
		Assert.assertTrue(
				action.getVerifyText1().contains("There is no account existing with the details mentioned by you."));
		Helper_Class.log.info("User is shown no existing account message ");
	}

	@When("User clicks the forrgot password button")
	public void user_clicks_the_forrgot_password_button() {
		action.ForgorPass();
		Helper_Class.log.info("User clicks forgot password");
	}

	@When("User gives valid emailid")
	public void user_gives_valid_emailid() {
		action.username(pro.vaild_email);
		Helper_Class.log.info("User enters the valid email id");
	}

	@When("user enter the details using sheetname  {string} and rownumber {int}")
	public void user_enter_the_details_using_sheetname_and_rownumber(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = el.getData(
				"C:\\Users\\ssenthilvel\\eclipse-workspace\\Purple_Rangers-Pilot_Project\\SportsJam\\src\\test\\resources\\Features\\ExcelReaderSheet.xlsx",
				sheetname);
		String skill = testdata.get(rownumber).get("email");
		action.username(skill);
		Helper_Class.log.info("User takes values from an excel sheet to enter the email address");
	}

	@When("the user clicks submit")
	public void the_user_clicks_submit() {
		action.submit();
		Helper_Class.log.info("User clicks the submit button");
	}

	@Then("a pop is shown with a message sucessfully sent recovery email")
	public void a_pop_is_shown_with_a_message_sucessfully_sent_recovery_email() {
		Assert.assertTrue(
				action.getVerifyText().contains("Successfully sent the password reset link To the registered email."));
		Helper_Class.log.info("User is sent a password recoy mail to the registed mail id");
	}

	@When("User gives valid Credentials")
	public void user_gives_valid_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		action.credentials(dataTable);

		Helper_Class.log.info("User enters valid credentials ");
	}

	@When("User gives Invalid Credentials")
	public void user_gives_invalid_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		action.credentials(dataTable);
		Helper_Class.log.info("User enters invalid credentials ");
	}

	@When("User clicks About us")
	public void user_clicks_about_us() {
		action.scrollAll();
		action.clickabout();
		Helper_Class.log.info("User clicks the about us option");
	}

	@Then("Hello  Strikers message is shown")
	public void hello_strikers_message_is_shown() {
		action.changetab();
		Assert.assertTrue(action.VerifyTextabout().contains("Hello  Strikers!"));
		Helper_Class.log.info("User is shown Hello Striker message");
	}

	@When("User clicks contact us")
	public void user_clicks_contact_us() {
		action.scrollAll();
		action.clickcontact();
		Helper_Class.log.info("User clicks the contach us option");
	}

	@Then("Sportsjam.in Showrooms message is shown")
	public void sportsjam_in_showrooms_message_is_shown() {
		action.changetab();
		Assert.assertTrue(action.VerifyTextcontact().contains("Inquiry & Feedback Form"));
		Helper_Class.log.info("User is shown Inquiry & Feedback Form option");
	}

	@When("User clicks inqury\\/feedback")
	public void user_clicks_inqury_feedback() {
		action.scrollAll();
		action.clickinquiry();
		Helper_Class.log.info("User clicks the inqury/feedback option");
	}

	@Then("Sportsjam.in Showrooms message is showns")
	public void sportsjam_in_showrooms_message_is_showns() {
		action.changetab();
		Assert.assertTrue(action.VerifyTextinquiry().contains("Inquiry & Feedback Form Details"));
		Helper_Class.log.info("User is shown ");
	}

	@When("User clicks sportsjam team")
	public void user_clicks_sportsjam_team() {
		action.scrollAll();
		action.clickteam();
		Helper_Class.log.info("User clicks the option Inquiry & Feedback Form Details option");
	}

	@Then("WHO WE ARE @ SPORTSJAM.IN message is shown")
	public void who_we_are_sportsjam_in_message_is_shown() {
		action.changetab();
		Assert.assertTrue(
				action.VerifyTextteam().contains("At Sportsjam.in, he leads Operations & Business Development."));
		Helper_Class.log.info("User is shown At Sportsjam.in, he leads Operations & Business Development. message");
	}

	@When("User selects fitness")
	public void user_selects_fitness() {
		action.selectFitness();
		Helper_Class.log.info("User selects the fitness option");
	}

	@When("User selects the cycle option")
	public void user_selects_the_cycle_option() {
		action.selectcycle();
		Helper_Class.log.info("User selects the cycle option");
	}

	@When("User sorts the product to low to high")
	public void user_sorts_the_product_to_low_to_high() {
		action.sort();
		Helper_Class.log.info("User Sorts the product to low to high");
	}

	@When("User selects the Giants brand")
	public void user_selects_the_giants_brand() {
		action.selectBrand();
		Helper_Class.log.info("User selects the Giants Brand");
	}

	@Then("User verifies the number of products displayed")
	public void user_verifies_the_number_of_products_displayed() throws InterruptedException {
		Thread.sleep(3000);
		action.printList();
		Helper_Class.log.info("User verifies the number of products displayed");
	}

}
