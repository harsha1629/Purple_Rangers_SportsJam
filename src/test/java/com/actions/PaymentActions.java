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
	public void Email(String a ) {
		payLoacators.Email.sendKeys(a);
	}
	public void clickhole( ) {
		payLoacators.hole.click();
	}
	public void Password(String b) {
		payLoacators.Password.sendKeys(b);
	}
	public void clickContinue( ) {
		payLoacators.Continue.click();
	}
	public void Name(String c ) {
		payLoacators.Name.clear();
		payLoacators.Name.sendKeys(c);
	}
	public void LastName(String d ) {
		payLoacators.LastName.clear();
		payLoacators.LastName.sendKeys(d);
	}
	public void Address(String e ) {
		payLoacators.Address.clear();
		payLoacators.Address.sendKeys(e);
	}
	
	public void Code(String f ) {
		payLoacators.Code.clear();
		payLoacators.Code.sendKeys(f);
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
	public void City(String k ) {
		payLoacators.City.clear();
		payLoacators.City.sendKeys(k,Keys.TAB);
		
		}
	
	public void Mobile(String l ) {
		payLoacators.Mobile.clear();
		payLoacators.Mobile.sendKeys(l);
	}
//	public void clickCheckBox( ) {
//		payLoacators.CheckBox.click();
//	}
	public void clickContinee() {
		payLoacators.Continee.click();
	}
	public void clickContineee( ) {
		payLoacators.Contineee.click();
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
