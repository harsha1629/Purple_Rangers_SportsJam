package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountMyOrderLocators {
	@FindBy(xpath = "(//span[@class='txt110']//child::input)[1]")
	WebElement myOrderFromDate;
	
	@FindBy(xpath = "(//span[@class='txt110']//child::input)[2]")
	WebElement myOrderToDate;
	
	@FindBy(xpath = "//div[@class='order_search']")
	WebElement myOrderId;
	
	
	//Assertion Checking
	@FindBy(xpath = "//div[@class='smallmsg_text']")
	WebElement NoOrdersfound;

}
