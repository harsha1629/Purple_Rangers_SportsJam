package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

public class SearchLocators {
	public static WebDriver driver = new EdgeDriver();
//  driver.get("https://www.sportsjam.in/?gclid=CjwKCAiA9dGqBhAqEiwAmRpTCxueb33WYRFpuxae9Er7iynUVaTHeXauzUQzgNOZ50n5X3SL86MazxoC9ToQAvD_BwE");
//	 public static WebElement search = driver.findElement(By.xpath("//input[@id='txtSearch']).value='cricket'"));
//	 public static WebElement click1 = driver.findElement(By.xpath("//input[@class='mj_btnbg FormSectionDefaultButton']"));
//	 public static WebElement check = driver.findElement(By.xpath("//h4[@class='mtb-title'])[1]"));
//	public static void main(String[] args) {
//		WebDriver driver = new EdgeDriver();
//     driver.manage().window().maximize();
//     driver.get("https://www.sportsjam.in/?gclid=CjwKCAiA9dGqBhAqEiwAmRpTCxueb33WYRFpuxae9Er7iynUVaTHeXauzUQzgNOZ50n5X3SL86MazxoC9ToQAvD_BwE");
//     WebElement search = driver.findElement(By.xpath("//input[@id='txtSearch']"));
//     WebElement click1 = driver.findElement(By.xpath("//input[@class='mj_btnbg FormSectionDefaultButton']"));
//	    box(driver,search,click1,"shoes");
//
//	}
//	public void box(WebDriver driver, WebElement Element,WebElement Element1, String a) {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].value='"+a+"'",Element);
//		js.executeScript("arguments[0].click()",Element1);
//	}
//	public  void click() {
//		box(driver,search,click1,"shoes");
//		}
//	public String Verify() {
//		return check.getText();
//	}
	
	
		@FindBy(id= "txtSearch")

		public WebElement Search;

		@FindBy(id="btnSearch")

		public WebElement button;

		@FindBy(xpath ="//*[@id=\"517144_CU00034424\"]/div[1]/div/div[2]/div[2]/a[1]/img")

		public WebElement check;

		
		@FindBy(xpath = "//div[@class='ctl_aboutbrand']//child::h1")	
		public  WebElement checkValue;
		
		@FindBy(id= "txtSearch")

		public WebElement Searchone;

		@FindBy(id="btnSearch")

		public WebElement buttonOne;
//		(//div[@class='bucket_left'])[1]
//				//*[@id=\"517144_CU00032811\"]/div[1]/div/div[2]/div[2]/a[1]/img
		@FindBy(xpath = "(//div[@class='bucket_left']//child::img[@class='mtb-img'])[1]")

		public WebElement checkProductwo;
		
		@FindBy(xpath = "(//div[@class='bucket_left']//child::h4)[1]")	
		public  WebElement checkAssert;
			
		public  String SearchListOne="//div[@class='bucket_left']" ;
		public  String SearchListOTwo="//div[@class='bucket_left']" ;
		
//		public WebElement checkAssert;
		
		

}