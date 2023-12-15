package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConnectwithusLocators {
		@FindBy(xpath="//li[@class='mob-icon']//child::a[1]")
		public WebElement clickfb;
		@FindBy(xpath="(//span[text()='Connect with SportsJam.in on Facebook'])[1]")
		public WebElement checkfb;
		
		
		@FindBy(xpath="//li[@class='mob-icon']//child::a[2]")
		public WebElement clicktwitter;
		@FindBy(id="modal-header")
		public WebElement checktwitter;
		
		@FindBy(xpath="//li[@class='mob-icon']//child::a[3]")
		public WebElement clicktinsta;
		@FindBy(xpath="//h1[@class='_ap3a _aaco _aacu _aacx _aad6 _aade']")
		public WebElement checkinsta;
		
//		@FindBy(xpath="//li[@class='mob-icon']//child::a[4]")
//		public WebElement clickyoutube;
//		@FindBy(xpath="(//div[@id='wrapper'])[2]")
//		public WebElement checkyoutube;
}
