package com.actions;
 
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
 
import com.locators.MyAccountLocators;
import com.utility.Helper_Class;
 
public class MyAccountAction {
	WebDriver driver = Helper_Class.getDriver();
	MyAccountLocators myaccountlocators;
	Actions action = new Actions(driver);
 
	public MyAccountAction() {
		myaccountlocators = new MyAccountLocators();
		PageFactory.initElements(Helper_Class.getDriver(), myaccountlocators);
	}
	
	//Function to reuse for clicking purpose
	public void clickFunction(WebElement webElement) {
		Helper_Class.actions.moveToElement(webElement).click().build().perform();
	}
	public void javascriptClick(WebElement webElement) {
		Helper_Class.jse.executeScript("arguments[0].click()", webElement);	
	}
	
	//Clicking Signin Button to update and search products
	public void clickSignInButton() {
		Helper_Class.wait.until(ExpectedConditions.elementToBeClickable(myaccountlocators.signInBtn));
		clickFunction(myaccountlocators.signInBtn);		
	}
//	public void clickSignInButton() {
//		myaccountlocators.signInBtn.click();
//	}
	
	//Entering userName
	public void enterUserName(String username) {
		myaccountlocators.email.sendKeys(username);
	}
	public void enterPassword(String pwd) {
		myaccountlocators.enterPwd.sendKeys(pwd);
	}
	
	//Clickcing My Account to update profile
	public void clickMyAccount() {
		javascriptClick(myaccountlocators.clickMyAccount);
}
 
//	public void clickMyAccount() {
//		myaccountlocators.clickMyAccount.click();
//	}
	public void clickLoginButton() {
		myaccountlocators.loginBtn.click();
	}
	
	//After entering valid credentials clicking login Button
	public void setPwd(String password) {
		myaccountlocators.enterPwd.sendKeys(password);
	}
 
	//Setting lastName in My profile
	public void setLastName(String lastName) {
		myaccountlocators.sendLastName.sendKeys(lastName);
	}
 
	//Clicking female radio Button
	public void clickFemale() {
		myaccountlocators.femaleRadioButton.click();
	}
 
	//Selecting Date of Birth
	public void selectDOB() {
		myaccountlocators.dateofbirth.click();
	}
	public void selectDateofBirthValue() {
		myaccountlocators.dateofBirthValue.click();
	}
 
	public void selectMonthOfBirthValue() {
		myaccountlocators.monthOfBirthvalue.click();
	}
	public void selectMonthOfBirth() {
		myaccountlocators.monthOfBirth.click();
	}
	public void selectYearOdBirth() {
		myaccountlocators.yearOfBirth.click();
	}
	public void selectYearOfBirthValue() {
		myaccountlocators.yearOfBirthValue.click();
	}
 
	public void selectCountry() {
		myaccountlocators.country.click();
	}
 
	public void selectCountryValue() {
		myaccountlocators.countryValue.click();
	}
 
	public void selectState() {
		myaccountlocators.state.click();
	}
 
	public void selectStateValue() {
		myaccountlocators.stateValue.click();
	}
 
	public void sendCity(String city) {
		myaccountlocators.myAccountCity.sendKeys(city);
	}
 
	public void sendZipcode(String zipcode) {
		myaccountlocators.myAccountPinCode.sendKeys(zipcode);
	}
 
	public void clickSubmitButton() {
		myaccountlocators.myAccountSubmitButton.click();
	}
 
	public String verifySuccessfulText() {
		return myaccountlocators.successfullText.getText();
	}
	public void signInDetails(String username,String password) {
		enterUserName(username);
		enterPassword(password);
	}
	public void MyProfileDetails(String lastName,String city,String zipcode) {
		setLastName(lastName);
		sendCity(city);
		sendZipcode(zipcode);
	}
	//My Order Action
 
	public void clickMyOrder() {
		myaccountlocators.myOrderclick.click();
	}
 
	public void clickFromDate() {
		myaccountlocators.myOrderFromDate.click();
	}
 
	public void clickDate() {
		myaccountlocators.fromdateValue.click();
	}
 
	public void clickToDate() {
		myaccountlocators.myOrderToDate.click();
	}
 
	public void clickToDateValue() {
		myaccountlocators.toDate.click();
	}
	public void clickSearchButton() {
		myaccountlocators.myOrderSearchButton.click();
	}
 
	public String getOrderVerifyText() {
		return myaccountlocators.myOrderVerifyText.getText();
 
	}
 
	public String getNoOrderText() {
		return myaccountlocators.NoOrdersfound.getText();
 
	}
	//My Shopping List Locators
	public void clickMyShoppingList() {
		myaccountlocators.myShoppingListClick.click();
	}
	public String verifyShoppingListText() {
		return myaccountlocators.shoppingListText.getText();
	}
	//My saved cart Action 
	public void clickShoppingCart() {
		myaccountlocators.savedCartClick.click();
	}
	public String verifyShoppingCartText() {
		return myaccountlocators.savedCartText.getText();
	}
 
	//My saved Addresses
	public void clickMySavedAddress() {
		myaccountlocators.clicksavedAddressClick.click();
	}
	public String verifySavedAddress() {
		return myaccountlocators.savedAddressText.getText();
	}
	//Change Password
	public void clickMyPassword() {
		myaccountlocators.clickMyPassword.click();
	}
	public void sendCurrentPassword(String currentPassword) {
		myaccountlocators.currentPassword.sendKeys(currentPassword);
	}
	public void sendNewPassword(String newPassword) {
		myaccountlocators.newPassword.sendKeys(newPassword);
	}
	public void sendConfirmNewPassword(String confirmNewPassword) {
		myaccountlocators.changeConfirmNewPassword.sendKeys(confirmNewPassword);
	}
	public void submitClick() {
		myaccountlocators.clickSubmit.click();
	}
	//Updating password
	public void sendNewPasswordValues(String currentPassword,String newPassword,String confirmNewPassword) {
		sendCurrentPassword(currentPassword);
		sendNewPassword(confirmNewPassword);
		sendConfirmNewPassword(confirmNewPassword);
	}
	//Searching products and filtering price in ascending Order
	public void clickSports() {
		action.moveToElement(myaccountlocators.sportsTab).click().perform();
	}
	public void clickEnglishWillow() {
		action.moveToElement(myaccountlocators.englishWillow).click().build().perform();
	}
	public void clickSortBy() {
		myaccountlocators.sortByPrice.click();
	}
	public void clickPrice() {
		myaccountlocators.price.click();
	}
	public void getGrid() {
		List<WebElement> element = Helper_Class.getDriver().findElements(By.xpath(myaccountlocators.gridValues));
		int size = element.size();
		System.out.println("Count of products diplayed = " + size);
		for (WebElement element1 : element) {
			System.out.println("Product Name :" + element1.getText());
		}
	}
	public void orderList() {
		List<WebElement> orders = Helper_Class.getDriver().findElements(By.xpath(myaccountlocators.orderList));
		int size = orders.size();
		System.out.println("Count of products diplayed = " + size);
		for (WebElement listOrders : orders) {
			System.out.println("Product Name :" + listOrders.getText());
		}
	}
	public String savedAddresses() {
		return myaccountlocators.savedAddresses.getText();
	}
	public String verifyAddressName() {
		return myaccountlocators.verifyAddress.getText();
	}
}