package com.actions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.AllLocators;
import com.utility.Helper_Class;

public class AllActions {

	AllLocators AllLocators = null;
	int size = 0;
	Actions act = null;
	Select sel = null;
	WebDriverWait wait = new WebDriverWait(Helper_Class.getDriver(),Duration.ofSeconds(10));

	public AllActions() {
		AllLocators = new AllLocators();
		PageFactory.initElements(Helper_Class.getDriver(), AllLocators);
		act = new Actions(Helper_Class.getDriver());
	}

	public static void clickElement(WebDriver driver, WebElement element) {
		// Check if the element is visible and clickable
		if (element.isDisplayed() && element.isEnabled()) {
			// Perform the click action
			element.click();
		} else {
			// Throw an exception or handle the error
			System.out.println("Element is not visible or clickable");
		}
	}

	// Actions for the Login Feature
	// Clicks of login feature
	public void clickSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(AllLocators.signin));
		clickElement(Helper_Class.getDriver(), AllLocators.signin);
	}

	public void signButton() {
		wait.until(ExpectedConditions.elementToBeClickable(AllLocators.signButton));
		clickElement(Helper_Class.getDriver(), AllLocators.signButton);
	}

	public void ForgorPass() {
		wait.until(ExpectedConditions.elementToBeClickable(AllLocators.forgot));
		clickElement(Helper_Class.getDriver(), AllLocators.forgot);
	}

	public void submit() {
		wait.until(ExpectedConditions.elementToBeClickable(AllLocators.emailsubmit));
		clickElement(Helper_Class.getDriver(), AllLocators.emailsubmit);
	}

	public void logout()throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(AllLocators.check2));
		clickElement(Helper_Class.getDriver(), AllLocators.check2);
	}

	// Getting the data from data table
	public void credentials(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> signUpForm = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : signUpForm) {
			String email = data.get("email");
			String pass = data.get("pass");
			Login(email, pass);
		}
	}

	// Giving input using SendKeys
	public void setemail(String email) {
		AllLocators.email.sendKeys(email);
	}

	public void setpass(String pass) {
		AllLocators.pass.sendKeys(pass);
	}

	public void username(String email) {
		AllLocators.username.sendKeys(email);
	}

	// Getting String data for Asserts
	public String getVerifyText1() {
		return AllLocators.check1.getText();
	}

	public String getVerifyText2() {
		return AllLocators.check2.getText();
	}

	public String getVerifyText() {
		return AllLocators.check.getText();
	}

	// Getting both email and password in a single functionality
	public void Login(String email, String pass) {
		setemail(email);
		setpass(pass);
	}

	// Actions for the Get to know us Feature
	// Clicks of Get to know us feature
	public void clickabout() {
		clickElement(Helper_Class.getDriver(), AllLocators.about);
	}

	public void clickcontact() {
		clickElement(Helper_Class.getDriver(), AllLocators.contact);
	}

	public void clickinquiry() {
		clickElement(Helper_Class.getDriver(), AllLocators.inquiry);
	}

	public void clickteam() {
		clickElement(Helper_Class.getDriver(), AllLocators.team);
	}

	// Getting String data for Asserts
	public String VerifyTextabout() {
		return AllLocators.aboutcheck.getText();
	}

	public String VerifyTextcontact() {
		return AllLocators.contactcheck.getText();
	}

	public String VerifyTextinquiry() {
		return AllLocators.inquirycheck.getText();
	}

	public String VerifyTextteam() {
		return AllLocators.teamcheck.getText();
	}

	// Action for changing tab
	public void changetab() {
		for (String tab : Helper_Class.getDriver().getWindowHandles()) {
			Helper_Class.getDriver().switchTo().window(tab);
		}
	}

	// Action for Scroll function
	public void scroll() {
		Helper_Class.jse.executeScript("window.scrollBy(0,500)");
	}

	public void scrollAll() {
		Helper_Class.jse.executeScript("window.scrollBy(0,document.body.ScrollHeight)");
	}

	// Actions for Fitness Feature
	// Actions using Mouse actions
	public void selectFitness() {
		act.moveToElement(AllLocators.fit).perform();
	}

	public void selectcycle() {
		act.moveToElement(AllLocators.cycle).click().build().perform();
	}

	// Sort option using select method
	public void sort() {
		sel = new Select(AllLocators.sort);
		sel.selectByIndex(1);
	}

	// selecting the brand filters
	public void selectBrand() {
		clickElement(Helper_Class.getDriver(), AllLocators.brand);

	}

	// Getting the number of product from the list
	public void printList() {
		List<WebElement> element = Helper_Class.getDriver().findElements(By.xpath(AllLocators.listPath));
		size = element.size();
		System.out.println("Count of products diplayed = " + size);
		for (WebElement element1 : element) {
			System.out.println("Product Name :" + element1.getText());
		}
	}
}
