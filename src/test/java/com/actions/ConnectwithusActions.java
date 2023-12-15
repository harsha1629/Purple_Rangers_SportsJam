package com.actions;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.locators.ConnectwithusLocators;
import com.locators.SearchLocators;
import com.utility.Helper_Class;

public class ConnectwithusActions {
	WebDriver driver = Helper_Class.getDriver();
	ConnectwithusLocators connect= new ConnectwithusLocators();
	public ConnectwithusActions(){
		connect = new ConnectwithusLocators();
		PageFactory.initElements(Helper_Class.getDriver(), connect);
	}
		public void clicfacebook() {
			connect.clickfb.click();
			
		}
		public String clickclicfacebook() {
			return connect.checkfb.getText();
		}
		public void clictwitter() {
			connect.clicktwitter.click();
			
		}
		public String clickclictwitter() {
			return connect.checktwitter.getText();
		}
		public void clicinstagram() {
			connect.clicktinsta.click();
			
		}
		public String clickclicinstagram() {
			return connect.checkinsta.getText();
		}
//		public void clicyoutube() {
//			connect.clickyoutube.click();
//			
//		}
//		public String clickclicyoutube() {
//			return connect.checkyoutube.getText();
//		}
			public void changetab() {
				Set<String> allWindows = driver.getWindowHandles();
				for (String tab : Helper_Class.getDriver().getWindowHandles()) {
					Helper_Class.getDriver().switchTo().window(tab);
			    }
		
			}
		}
		
	


