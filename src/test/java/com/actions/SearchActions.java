package com.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import com.locators.SearchLocators;

import com.utility.Helper_Class;

public class SearchActions {
	WebDriver driver = Helper_Class.getDriver();
//	//driver.manage().timeouts().
	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	SearchLocators Se = new SearchLocators();
	public SearchActions() {
		Se = new SearchLocators();
		PageFactory.initElements(Helper_Class.getDriver(), Se);
	}
//	public static void box(WebDriver driver, WebElement Element,WebElement Element1, String a) {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].value='"+a+"'",Element);
//		js.executeScript("arguments[0].click()",Element1);
//	}
//	
//	public  void click() {
//		box(driver,Se.search,Se.click1,"shoes");
//		}
//	public String Verify() {
//		return Se.check.getText();
//	}
	public void clickSearch(String value)
	{
		Se.Search.sendKeys(value);
	}
	public void clickbutton() {
		Se.button.click();
		
	}
	public void clickproduct() {
		Se.check.click();
	}
	public String clickcheckvalue() {
		return Se.checkValue.getText();
	}
	public void clickcheckbuttonone() {
		 Se.buttonOne.click ();
	}
//	public void  reload() throws InterruptedException{
//		Thread.sleep(2000);
//		
//		
//	}
	
//	public void clickcheckvalueTwo() {
//		 Se.checkValuetwo.click();
//	}
//	
	public String verifyAssert() {
		return Se.checkAssert.getText();
	}
	
	public void gettingListOfProducts() {
		List<WebElement> element = Helper_Class.getDriver().findElements(By.xpath(Se.SearchListOne));
		int size = element.size();
		System.out.println("Count of products diplayed = " + size);
		for (WebElement element1 : element) {
			System.out.println("Product Name :" + element1.getText());
		}
	}
		public void gettingListOfProductstwo() {
			List<WebElement> element = Helper_Class.getDriver().findElements(By.xpath(Se.SearchListOTwo));
			int size = element.size();
			System.out.println("Count of products diplayed = " + size);
			for (WebElement element1 : element) {
				System.out.println("Product Name :" + element1.getText());
			
		}
		
	}
}


