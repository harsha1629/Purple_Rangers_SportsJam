package com.locators;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
public class AddToCartLoacators {
	
	@FindBy(xpath="//input[@id='txtSearch']")
	public WebElement search;
	
	@FindBy(xpath="//input[@class='mj_btnbg FormSectionDefaultButton']")
	public WebElement searc;
	
	@FindBy(xpath="//*[@id=\"517144_CU00348724\"]/div[1]/div/div[2]")
    public WebElement Image;
	
	@FindBy(xpath="//input[@class='mj_btnbg BuyNow']")
    public WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"517144_CU00344584\"]/div[1]/div/div[2]/div[2]/a[1]/img")
    public WebElement SecondProduct;
	
	@FindBy(xpath="(//input[@class='mj_btnbg'])[2]")
    public WebElement SecondCart;
	
	

	@FindBy(xpath="//a[@class='buttonlnk']")
    public WebElement cart;
	
	@FindBy(xpath="//input[@id='btnRemove']")
    public WebElement Remove;
	
	@FindBy(xpath="//span[@class='ptitle']")
    public WebElement letter;
	
	@FindBy(xpath="//li[@class='productname']//child::span[@class='ptitle']")
    public WebElement empty;

	
	
	
}
