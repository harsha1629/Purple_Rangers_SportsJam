package com.actions;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.locators.CustomerSupportLocators;
import com.utility.Helper_Class;

public class CustomerSupportActions {
	
	
	public void scrollAll() {
		Helper_Class.jse.executeScript("window.scrollBy(0,document.body.ScrollHeight)");
	}
	CustomerSupportLocators CustomerLocators;
	JavascriptExecutor js = (JavascriptExecutor) Helper_Class.getDriver();
	Actions act = new Actions(Helper_Class.getDriver());
	
	
	public CustomerSupportActions() {
		CustomerLocators = new CustomerSupportLocators();
		PageFactory.initElements(Helper_Class.getDriver(), CustomerLocators);
		
	}
	public void clickGift( ) {
		CustomerSupportLocators.Gift.click();
	
	}
	public void clickImage( ) {
		CustomerLocators.Image.click();
	}
	
	public void clickCart( ) {
		CustomerLocators.Cart.click();
		Helper_Class.getDriver().navigate().back();
		Helper_Class.getDriver().navigate().back();
	}
	
	public void clickReward( ) {
		CustomerLocators.Reward.click();
	}
	public void clickBuyers( ) {
		CustomerLocators.Buyers.click();
	}
	public void clickCutomerized( ) {
		CustomerLocators.Cutomerized.click();
	}
	public void clickExpress( ) {
		CustomerLocators.Express.click();
	}
	public void clickSecure( ) {
		CustomerLocators.Secure.click();
	}
	public void clickAuthentic( ) {
		Helper_Class.wait.until(ExpectedConditions.visibilityOf(CustomerLocators.Authentic));
		CustomerLocators.Authentic.click();
	}
	
	public String getPointsVerifyText() {
		return CustomerLocators.Points.getText();
	}
	
	public String getGuideVerifyText() {
		return CustomerLocators.Guide.getText();
	}
	public String getServiceVerifyText() {
		return CustomerLocators.Service.getText();
	}
	public String getInformationVerifyText() {
		return CustomerLocators.Information.getText();
	}
	public String getShoppingVerifyText() {
		return CustomerLocators.Shopping.getText();
	}
	public String getSportsVerifyText() {
		return CustomerLocators.Sports.getText();
	}
	
}

