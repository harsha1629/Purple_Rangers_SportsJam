package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountLocators {
	WebDriver driver;
	
		
	@FindBy(xpath = "//a[text()='Create Account']")
	public WebElement createAccountClick;

	@FindBy(id = "txtFirstName")
	public WebElement createfirstname;

	@FindBy(xpath = "//span[@class='txt155']//child::input[1]")
	public WebElement createMobileNumber;

	@FindBy(name = "txtUserName")
	public WebElement createEmail;

	@FindBy(css = "input.maintxt.InputPassWord")
	public WebElement createPassword;

	@FindBy(id = "txtConfirmPassword")
	public WebElement createConfirmPassword;

	@FindBy(name = "btnSubmit")
	public WebElement createSubmitButton;
	
	@FindBy(xpath = "//a[text()='Logout']")
	public WebElement logoutbtn;


}
