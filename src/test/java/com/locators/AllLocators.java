package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllLocators {

	// Locators for the Login feature

	// SendKeys Webelement
	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_UserName")
	public WebElement email;
	@FindBy(xpath = "//div//child::span[@class='userpwdvalidator']//following::input[@name='Password']")
	public WebElement pass;
	@FindBy(xpath = "//div[@id='EmailTextDiv']//input")
	public WebElement username;

	// Click functionality weblements
	@FindBy(xpath = "//a[text()='Sign in']")
	public WebElement signin;
	@FindBy(linkText = "Forgot Password")
	public WebElement forgot;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_LoginImageButton")
	public WebElement signButton;
	@FindBy(id = "btnsubmit")
	public WebElement emailsubmit;

	// Asserts Locations
	@FindBy(id = "lblError")
	public WebElement check;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_FailureText")
	public WebElement check1;
	@FindBy(css = "a[href='https://www.sportsjam.in/LogOut.aspx']")
	public WebElement check2;

	// Locators for the Get to know us feature

	// Click functionality weblements
	@FindBy(xpath = "//div[@class='new_fotter']//ul//li//a[text()='About Us']")
	public WebElement about;
	@FindBy(css = "a[href='//www.sportsjam.in/Contactus']")
	public WebElement contact;
	@FindBy(xpath = "//ul[@class='utilitynav']//child::a[text()='Inquiry / Feedback']")
	public WebElement inquiry;
	@FindBy(xpath = "//ul[@class='utilitynav']//parent::a[text()='Sportsjam Team']")
	public WebElement team;

	// Asserts Locations
	@FindBy(xpath = "//div[@class='htmlbucket']//p//following::p//strong[1]")
	public WebElement aboutcheck;
	@FindBy(xpath = "//div[@class='subheading_r']//child::h2[text()='Inquiry & Feedback Form']")
	public WebElement contactcheck;
	@FindBy(xpath = "//h2[text()='Inquiry & Feedback Form Details']")
	public WebElement inquirycheck;
	@FindBy(xpath = "//div[@class='htmlbucket']//p[5]//span//span")
	public WebElement teamcheck;

	// Locators for the Login feature

	// Click functionality weblements
	@FindBy(xpath = "//span[@class=\"main_navbtn_m\" and contains(text(),'Fitness')]")
	public WebElement fit;
	@FindBy(xpath = "//a[@href=\"https://www.sportsjam.in/cycles\" and contains(text(),'Cycles')]//parent::li//parent::ol/li/a")
	public WebElement cycle;
	@FindBy(id = "drpSort")
	public WebElement sort;
	@FindBy(xpath = "//a[@title='Go to Giant']//parent::td")
	public WebElement brand;

	// List locators for finding number of products
	public String listPath = "//div[@class='bucket_left']/h4";

}
