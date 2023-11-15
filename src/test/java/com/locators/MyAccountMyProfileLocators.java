package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyAccountMyProfileLocators {
	@FindBy(xpath = "//span[@class='divider_new']")
	WebElement clickMyAccount;

	@FindBy(id = "txtLastName")
	WebElement myAccountLastName;

	@FindBy(id = "txtAlternateEmailId")
	WebElement myAccountAlternateMail;

	@FindBy(id = "Radio2")
	WebElement femaleRadioButton;

//	@FindBy(name = "drpday")
//	WebElement dropDay;
//
//	@FindBy(xpath = "//option[@value='16']")
//	WebElement dateValue;
	//Country
	//State
	
	@FindBy(id = "drpCity")
	WebElement myAccountCity;
	
	@FindBy(id = "txtZipCode")
	WebElement myAccountPinCode;
	
	@FindBy(id = "btnSubmit")
	WebElement myAccountSubmitButton;

}
