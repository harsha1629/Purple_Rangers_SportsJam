package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentLocators {
	@FindBy(xpath="//input[@class='mj_btnbg BuyNow']")
	public WebElement Add;
	
	@FindBy(xpath="//input[@id='btnSinglePagecheckout']")
	public WebElement Pay;
	
	@FindBy(xpath="//input[@class='maintxt InputUserName']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@id='chkIhavePassword_V2']")
	public WebElement hole;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	public WebElement Password;
	
	@FindBy(id = "Step1continue")
	public WebElement Continue;
	
	@FindBy(xpath ="//input[@id='ShipFirstName']")
	public WebElement Name;
	
	@FindBy(xpath="//input[@id='ShipLastName']")
	public WebElement LastName;
	
	@FindBy(xpath="//input[@id='ShipAddress1']")
	public WebElement Address;
	
	@FindBy(xpath ="//input[@id='ShipZip']")
	public WebElement Code;
	
	@FindBy(xpath="//select[@id='ShipCountry']")
	public WebElement Country;
	
	@FindBy(xpath="//select[@id='ShipCountry']//child::option[text()='India']")
	public WebElement CountryIndia;
	
	
	@FindBy(xpath="//select[@id='ShipState']")
	public WebElement State;
	
	@FindBy(xpath ="//select[@id='ShipState']//child::option[text()='Tamil Nadu']")
	public WebElement StateTamil;
	
	@FindBy(xpath ="//input[@class='maintxt ac_input']" )
	public WebElement City;
	
	@FindBy(xpath="//input[@id='ShipMobile']")
	public WebElement Mobile;
	

	
	@FindBy(xpath="//input[@id='Step2continue']")
	public WebElement Continee;
	
	@FindBy(xpath="(//input[@id='Step3continue'])[1]")
	public WebElement Contineee;
	
	@FindBy(xpath="(//input[@class='mj_btnbg'])[6]")
	public WebElement PayNow;
	
	@FindBy(xpath="//span[text()='Billing Information']")
	public WebElement Ass;
	
}
