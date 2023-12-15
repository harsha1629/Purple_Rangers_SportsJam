package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.AddToCartLoacators;

import com.utility.Helper_Class;

public class AddToCartActions {
	
	AddToCartLoacators cartLocators;
	
	public AddToCartActions() {
		cartLocators = new AddToCartLoacators();
		PageFactory.initElements(Helper_Class.getDriver(), cartLocators);
		
	}
	public void Search(String a ) {
		cartLocators.search.sendKeys(a);
	}
	public void clickSearc( ) {
		cartLocators.searc.click();
	}
	public void clickimage() {
		cartLocators.Image.click();
	}
	public void clickaddtocart() {
		cartLocators.addtocart.click();
	}
	
	public void clickSecondProduct() {
		cartLocators.SecondProduct.click();
	}
	public void clickSecondCart() {
		cartLocators.SecondCart.click();
	}
	
	
	public void clickcart() {
		cartLocators.cart.click();
	}
	
	public void clickRemove() {
		cartLocators.Remove.click();
	}
	public String getVerifyText() {
		return cartLocators.letter.getText();
	}
	public String getEmptyVerifyText() {
		return cartLocators.empty.getText();
	}
}
