package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.locators.SearchLocators;
import com.locators.ShoesLocators;
import com.utility.Helper_Class;

public class ShoesActions {
	WebDriver driver = Helper_Class.getDriver();
	ShoesLocators Se = new ShoesLocators();
	Actions act = new Actions(driver);
	public ShoesActions() {
		Se = new ShoesLocators();
		PageFactory.initElements(Helper_Class.getDriver(), Se);
	}
	public void clickShoes() {
		
		act.moveToElement(Se.clickShoes).perform();
		
	}
	public void clickfootball() {
		
		act.moveToElement(Se.clickfootball).click().build().perform();
		
	}
//	public void checbrand() {
//		act.moveToElement(	Se.checkBrand).click().build().perform();
//}
		
	
	public void clicbrand() {
		Se.clickBrand.click();
	}
	public void checshoescategory() {
		act.moveToElement(Se.checkshoescategory).click().build().perform();
	}
	public void clicshoescategory() {
		Se.clickshoescategory.click();
	}
	public void checshoestype() {
		act.moveToElement(Se.checkshoestype).click().build().perform();
		
	}
	public void clicshoestype() {
//		Helper_Class.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Se.clickshoestype)));
		Se.clickshoestype.click();
	}
	public void checsize() {
		act.moveToElement(Se.checksize).click().build().perform();		
	}
	public void clicsize() {
//		Helper_Class.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Se.clicksize)));
		Se.clicksize.click();
	}
	public void checAvailability() {
		act.moveToElement(Se.checkAvailability).click().build().perform();
	}
	public void clicAvailability() {
		act.moveToElement(Se.clickAvailability).click().build().perform();
		
	}
	public String checAssert() {
		return Se.checkAssert.getText();
	}

}
