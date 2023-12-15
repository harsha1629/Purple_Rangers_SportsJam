package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerSupportLocators {
	@FindBy(xpath="//li[@class='icon1']//child::a[text()='E-gift Voucher']")
	public static WebElement Gift;
	
	@FindBy(xpath="//a[text()='100% Authentic']")
	public WebElement Image;
	
	@FindBy(xpath="//input[@value='Add to Cart']")
	public WebElement Cart;
	
	@FindBy(xpath="//a[text()='Reward Points']")
	public WebElement Reward;
	
	@FindBy(xpath="//a[text()='Buyers Guide']")
	public WebElement Buyers;
	
	@FindBy(xpath="//a[text()='Customized Services']")
	public WebElement Cutomerized;
	
	@FindBy(xpath="//a[text()='Express shipping']")
	public WebElement Express;
	
	@FindBy(xpath="//a[text()='Secure Shopping']")
	public WebElement Secure;
	
	@FindBy(xpath="//a[text()='100% Authentic']")
	public WebElement Authentic;
	
	@FindBy(xpath="//div[@class='subheading_r']//child::h2")
	public WebElement Points;
	
	@FindBy(xpath="//div[@class='contentarea']//child::p")
	public WebElement Guide;
	
	@FindBy(xpath="//div[@class='subheading_r']//child::h2")
	public WebElement Service;
	
	@FindBy(xpath="//div[@class='subheading_r']//child::h2")
	public WebElement Information;
		
	@FindBy(xpath="//div[@class='subheading_r']//child::h2")
	public WebElement Shopping;
	
	@FindBy(xpath="//div[@class=\"subheading_r\"]//child::h2")
	public WebElement Sports;
	
	


	

}
