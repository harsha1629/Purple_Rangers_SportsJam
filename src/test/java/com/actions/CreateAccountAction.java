package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.CreateAccountLocators;
import com.utility.HelperClass;

public class CreateAccountAction {
	CreateAccountLocators accountLocators;
	
	public CreateAccountAction() {
		accountLocators = new CreateAccountLocators();
		PageFactory.initElements(HelperClass.getdriver(), accountLocators);
		
	}
	
	public void clickCreateAccount() {
		accountLocators.createAccountClick.click();
	}

	public void sendingFirstName(String sendFirstName) {
		accountLocators.createfirstname.sendKeys(sendFirstName);
	}
	
	public void sendingPhoneNumber(String sendmobileNumber) {
		accountLocators.createMobileNumber.sendKeys(sendmobileNumber);
	}
	
	public void sendingEmail(String sendEmail) {
		accountLocators.createEmail.sendKeys(sendEmail);
	}
	
	public void sendingPassword(String sendPassword) {
		accountLocators.createPassword.sendKeys(sendPassword);
	}
	
	public void sendingConfirmPassword(String sendConfirmPassword) {
		accountLocators.createConfirmPassword.sendKeys(sendConfirmPassword);
	}
	
	public void ClickingSubmitButton() {
		accountLocators.createSubmitButton.click();
	}
}
