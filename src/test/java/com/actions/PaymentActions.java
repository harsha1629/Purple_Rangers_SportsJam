package com.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import com.locators.PaymentLocators;
import com.utility.Helper_Class;

public class PaymentActions {
PaymentLocators payLoacators;
	
	public PaymentActions() {
		payLoacators = new PaymentLocators();
		PageFactory.initElements(Helper_Class.getDriver(), payLoacators);
		
	}
	public void clickAdd( ) {
		payLoacators.Add.click();
	}
	public void clickPay( ) {
		payLoacators.Pay.click();
	}
	public void Email(String Email ) {
		payLoacators.Email.sendKeys(Email);
	}
	public void clickhole( ) {
		payLoacators.hole.click();
	}
	public void Password(String Password) {
		payLoacators.Password.sendKeys(Password);
	}
	public void clickContinue( ) {
		payLoacators.Continue1.click();
	}
	public void Name(String Name ) {
		payLoacators.Name.clear();
		payLoacators.Name.sendKeys(Name);
	}
	public void LastName(String LastName ) {
		payLoacators.LastName.clear();
		payLoacators.LastName.sendKeys(LastName);
	}
	public void Address(String Address ) {
		payLoacators.Address.clear();
		payLoacators.Address.sendKeys(Address);
	}
	
	public void Code(String Code ) {
		payLoacators.Code.clear();
		payLoacators.Code.sendKeys(Code);
	}
	
	
	public void Country() {
		
		payLoacators.Country.click();
	}
	
	public void CountryIndia() {
		payLoacators.CountryIndia.click();
	}
	public void State() {
		payLoacators.State.click();
	}
	public void StateTamil() {
		payLoacators.StateTamil.click();
	}
	public void City(String City ) {
		payLoacators.City.clear();
		payLoacators.City.sendKeys(City,Keys.TAB);
		
		}
	
	public void Mobile(String Mobile ) {
		payLoacators.Mobile.clear();
		payLoacators.Mobile.sendKeys(Mobile);
	}
	public void clickContinee() {
		payLoacators.Continue2.click();
	}
	public void clickContineee( ) {
		payLoacators.Continue3.click();
	}
	public void clickPayNow( ) {
		payLoacators.PayNow.click();
	}
	public String getVerifyText() {
		return payLoacators.Ass.getText();
	}
	public void Details(String Email,String Password) {
		Email(Email);
		Password(Password);
			}
	public void ADetails(String Name,String LastName,String Address,String Zipcode,String City,String Mobile) {
		Name(Name);
		LastName(LastName);
		Address(Address);
		Code(Zipcode);
		Mobile(Mobile);
		City(City);
		
					}

}
