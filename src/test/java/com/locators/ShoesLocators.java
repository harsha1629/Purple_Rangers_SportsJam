package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

public class ShoesLocators {
	public static WebDriver driver = new EdgeDriver();
	
			@FindBy(xpath ="(//span[@class='main_navbtn_m'])[3]")
			public WebElement clickShoes;
			@FindBy(xpath ="(//*[@id=\"sub_floor_1\"]/div/div/div/div/div/table/tbody/tr/td[1]/dl/dd/ol/li[4]/a)[3]")
			public WebElement clickfootball;
//			@FindBy(xpath ="(//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e'])[1] ")
//					
////			public WebElement checkBrand;
			@FindBy(xpath ="//a[@title='Go to ADIDAS']")
			public WebElement clickBrand;
			@FindBy(xpath ="(//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e'])[2]")
			public WebElement checkshoescategory;
			@FindBy(xpath ="//a[@id='Rs_CU00037272-002-1']")
			public WebElement clickshoescategory;
			@FindBy(xpath ="(//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e'])[3]")
			public WebElement checkshoestype;
			@FindBy(xpath ="//td[@class=\"rslink_id\"]//child::a[@id='Rs_CU00037272-001-2']")
			public WebElement clickshoestype;
			@FindBy(xpath ="(//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e'])[4]")
			public WebElement checksize;
			@FindBy(xpath ="//a[@id='Rs_19011']")
			public WebElement clicksize;
			
			@FindBy(xpath ="(//div[@id='headingvar'])[6]")
			public WebElement checkAvailability;
			@FindBy(xpath ="//a[@title='Go to 7']")
			public WebElement clickAvailability;
			@FindBy(xpath ="//div[@class='bucket_left']//child::h4[text()='Adidas X 15.4 Turf Football Shoes']")
			public WebElement checkAssert;
			



			
			
			

}
