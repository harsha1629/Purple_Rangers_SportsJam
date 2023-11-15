package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportsLocators {
	@FindBy(xpath = "(//span[@class='main_navbtn_m'])[1]")
	WebElement sportsTab;

	//User trying to click product from sports
	@FindBy(xpath = "//a[text()='English Willow']")
	WebElement cricketEnglishWillow;

	//User clicking filter of brand
	@FindBy(xpath = "(//div[@id='headingvar'])[3]")
	WebElement batSize;

	//User clicking filter of FootBallSize
	@FindBy(xpath = "//span[text()='Bat Weight']")
	WebElement BatWeight;

	//User clicking filter of availability
	@FindBy(xpath = "//span[text()='Availability']")
	WebElement Filteravailability;

	// Clicking FootBall
	@FindBy(xpath = "//h4[text()='Adidas Oceaunz Club Football (Bright Blue/White, Size 5)']")
	WebElement clickFootBall;

	//User trying to add product to Cart
	@FindBy(xpath = "//input[@class='mj_btnbg BuyNow']")
	WebElement clickingAddToCart;
	
	//User trying to View cart
	@FindBy(xpath = "//a[@class='buttonlnk']")
	WebElement viewCart;

	//User trying click remove product from cart
	@FindBy(id = "btnRemove")
	WebElement removeButton;

	//User trying click proceed to Pay from add to cart
	@FindBy(id = "btnSinglePagecheckout")
	WebElement proceedToPay;

}
