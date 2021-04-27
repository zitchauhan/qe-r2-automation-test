package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import org.codehaus.plexus.logging.Logger;

import org.openqa.selenium.By;

import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.GlobalMobileHelper.Direction;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AccountPage extends GlobalMobileHelper{
	
	private AppiumDriver<MobileElement> driver;
	public AccountPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	}
	
	public boolean isAccountPageDisplayed() {
		MobileElement accountPageTitle = driver.findElement(Locators.AccountPage.accountTitle);
		return accountPageTitle.isDisplayed();
	}
	

	public void tapOnFindStoreLink() {
		GlobalMobileHelper.tapOnElement(Locators.AccountPage.findStoreLink);
	}
	

	public void tapOnCreateAnAccount() {
		GlobalMobileHelper.tapOnElement(Locators.AccountPage.createAnAccountButton);
	}

	public void tapOnCreateAnAccountOnSignUpPage() {
		GlobalMobileHelper.tapOnElement(Locators.AccountPage.createAnAccountButton);
	}
	
	public void enterFieldValuesOnAddAddress(String value, String field) {
		switch(field) {
			case "First Name":
				GlobalMobileHelper.setText(Locators.AddAddress.inputFirstName, value,Locators.AddAddress.addAddressHeader);
				break;
			case "Last Name":
				GlobalMobileHelper.setText(Locators.AddAddress.inputLastName, value,Locators.AddAddress.addAddressHeader);
				break;
			case "Address":
				GlobalMobileHelper.setText(Locators.AddAddress.inputAddress, value,Locators.AddAddress.addAddressHeader);
				break;
			case "Apt Number":
				GlobalMobileHelper.setText(Locators.AddAddress.inputAptNumber, value,Locators.AddAddress.addAddressHeader);
				break;
			case "ZIP Code":
				GlobalMobileHelper.setText(Locators.AddAddress.inputZipCode, value,Locators.AddAddress.addAddressHeader);
				break;
			case "City":
				GlobalMobileHelper.setText(Locators.AddAddress.inputCity, value,Locators.AddAddress.addAddressHeader);
				break;
			case "Phone":
				GlobalMobileHelper.setText(Locators.AddAddress.inputPhone, value,Locators.AddAddress.addAddressHeader);
				break;
			default:
				throw new IllegalStateException("Wrong field");
		}
	}

	public boolean validateState(String state) {
		String displayedState = GlobalMobileHelper.getElementText(Locators.AddAddress.inputState);
		return displayedState.equals(state);
	}

	public void tapOnAddNewAddress() {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		GlobalMobileHelper.tapOnElement(Locators.AddressBook.buttonAddNewAddress);
	}

	public void validateError(String field) {
		switch(field) {
		case "First Name":
			GlobalMobileHelper.isElementDisplayed(Locators.AddAddress.lblFirstNameError);
			break;
		case "Last Name":
			GlobalMobileHelper.isElementDisplayed(Locators.AddAddress.lblLastNameError);
			break;
		case "Apt Number":
			GlobalMobileHelper.isElementDisplayed(Locators.AddAddress.lblAdditionalAddressError);
			break;
		case "ZIP Code":
			GlobalMobileHelper.isElementDisplayed(Locators.AddAddress.lblZipCodeError);
			break;
		case "State":
			GlobalMobileHelper.isElementDisplayed(Locators.AddAddress.lblStateError);
			break;
		case "Phone":
			GlobalMobileHelper.isElementDisplayed(Locators.AddAddress.lblPhoneNoError);
			break;
		default:
			throw new IllegalStateException("Wrong field");
	}
	}

	public boolean isAddressBookButtonDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.AccountPage.addressBookButton);
	}
	
	public void tapOnAddressBookButton() {
		GlobalMobileHelper.tapOnElement(Locators.AccountPage.addressBookButton);
	}

	public boolean isAddAddressScreenDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.AccountPage.addressBookHeader);
	}

	public void selectAddress(String addressNum) {
		List<MobileElement>savedAddressesList = driver.findElements(Locators.AddressBook.savedAddresses);
		if(addressNum.equalsIgnoreCase("Default")||addressNum.equalsIgnoreCase("First"))
			GlobalMobileHelper.tapOnElement(savedAddressesList.get(0));
		else if(addressNum.equalsIgnoreCase("second"))
			GlobalMobileHelper.tapOnElement(savedAddressesList.get(1));
		else if(addressNum.equalsIgnoreCase("any")) {
			int randomNum= GlobalMobileHelper.randomInteger(0,savedAddressesList.size()-1);
	 		GlobalMobileHelper.tapOnElement(savedAddressesList.get(randomNum));
		}
	}

	public void verifydefaultAddress(String status) {
		swipeScreen(Direction.UP,2);
	switch (status) {
	case "not present":
		assertFalse("Default address is present",GlobalMobileHelper.isElementDisplayed(Locators.AccountPage.defaultAddressCheckbox));
		break;
	case "not selected":
		assertFalse("Default address is selected",driver.findElement(Locators.AccountPage.defaultAddressCheckbox).isSelected());
		break;
	case "selected and disabled":
		assertTrue("Default address is not selected already",driver.findElement(Locators.AccountPage.defaultAddressCheckbox).isEnabled());
		GlobalMobileHelper.tapOnElement(Locators.AccountPage.defaultAddressCheckbox);
		assertTrue("Default address is not disabled",driver.findElement(Locators.AccountPage.defaultAddressCheckbox).isEnabled());
		break;
	default: throw new IllegalStateException("Option did not matach");
	}
	}

	// Methode to Click on My account card page
	 public void tabOnButtonOnAccountCardsPage(String btnName) {
		if(btnName.equalsIgnoreCase("Add new Academy card tile")) {
			
			GlobalMobileHelper.tapOnElement(Locators.MyAccountPayment.buttonaddacacemycard);

			
		}else if(btnName.equalsIgnoreCase("Add new credit card tile")){
			
			GlobalMobileHelper.tapOnElement(Locators.MyAccountPayment.buttonaddcreditcard);
		}else if(btnName.equalsIgnoreCase("existing aso card button")){
			
			GlobalMobileHelper.tapOnElement(Locators.MyAccountPayment.existingasocard);

		}else {
			
			throw new UnsupportedOperationException("Given button type not defined");

		}
		
		
	}
	 
	 // To Verify element on my account  welcome page 
	 public boolean VarifyElementPresenseOnAccountPage(String elementName) {
		if(elementName.equalsIgnoreCase("welcome section")) {
			
			return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountwelcomePage.MyAcademy);

			
		}else if(elementName.equalsIgnoreCase("buttonOrders")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountwelcomePage.buttonOrders);
			
        }else if(elementName.equalsIgnoreCase("buttonProfile")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountwelcomePage.buttonProfile);
			
        }else if(elementName.equalsIgnoreCase("buttonAddressbook")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountwelcomePage.buttonAddressbook);
			
        }else if(elementName.equalsIgnoreCase("buttonWishlist")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountwelcomePage.buttonWishlist);
			
        }else if(elementName.equalsIgnoreCase("buttonPayment")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountwelcomePage.buttonPayment);
			
			

		}else {
			
			throw new UnsupportedOperationException("Given Element type not defined");

		}
		
		
	}



	// To enter cards details on aso card page 
	public void enterCardDetails(String fieldName) {
 		String keywordValue = PropertiesHelper.getInstance().getMobileTestDataProperty(fieldName);
 		String element = null;
 		if(fieldName.equalsIgnoreCase("ASOCard")){
 			GlobalMobileHelper.setText(Locators.Addnewasocreditcard.Asocardtextbox, keywordValue,Locators.Addnewasocreditcard.Setasdefaultcheckbox);

 			
 		}else if(fieldName.equalsIgnoreCase("ccfirstname")){

 			GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingFirstName, keywordValue,Locators.MyAccountBillingAddress.BilingLastName);
 		}else if(fieldName.equalsIgnoreCase("ccnewfirstname")){

 			GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingFirstName, keywordValue,Locators.MyAccountBillingAddress.BilingLastName);
	
	 	}else if(fieldName.equalsIgnoreCase("ccLastname")){
	 		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingLastName, keywordValue,Locators.MyAccountBillingAddress.BilingAddressText);
	 	
	 	}else if(fieldName.equalsIgnoreCase("ccAddress")){

	 		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingAddressText, keywordValue,Locators.MyAccountBillingAddress.BilingAptName);
	 		
	 	}else if(fieldName.equalsIgnoreCase("ccaprtname")){
	 		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingAptName, keywordValue,Locators.MyAccountBillingAddress.BilingZipCode);
	 		
	 		
	 	}else if(fieldName.equalsIgnoreCase("cczipcode")){
	 		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingZipCode, keywordValue,Locators.MyAccountBillingAddress.BilingCity);
	 	
	 	}else if(fieldName.equalsIgnoreCase("entercccity")){
		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingCity, keywordValue,Locators.MyAccountBillingAddress.BilingPhoneNumber);	
		
	 	}else if(fieldName.equalsIgnoreCase("ccmobilenumber")){
		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingPhoneNumber, keywordValue);
		GlobalMobileHelper.tapOnElement(Locators.MyAccountBillingAddress.LabelBillingAddress);
	}else {
		
		throw new UnsupportedOperationException("Given Element type not defined");
	}
	}
	  

	public void tabOnButtonOnAccountPage(String btnName) {
			if(btnName.equalsIgnoreCase("payment button")) {
				
				GlobalMobileHelper.tapOnElement(Locators.MyAccountwelcomePage.buttonPayment);

				
			}else if(btnName.equalsIgnoreCase("wishlist button")){
				
				GlobalMobileHelper.tapOnElement(Locators.MyAccountwelcomePage.buttonWishlist);
			}else if(btnName.equalsIgnoreCase("address book")){
				
				GlobalMobileHelper.tapOnElement(Locators.MyAccountwelcomePage.buttonAddressbook);

			}else {
				
				throw new UnsupportedOperationException("Given button type not defined");

			}
		
	}

	// to vefiry element on my account cards page 
	public boolean VarifyElementPresenseOnAccountCardsPage(String elementName) {
		if(elementName.equalsIgnoreCase("payment header")) {
			
			return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountPayment.Paymenttitle);

			
		}else if(elementName.equalsIgnoreCase("Saved Cards label")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountPayment.SavedCardslabel);
		}else if(elementName.equalsIgnoreCase("Aso card button")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountPayment.buttonaddacacemycard);
		}else if(elementName.equalsIgnoreCase("add credit card button")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountPayment.buttonaddcreditcard);
}else if(elementName.equalsIgnoreCase("existing aso card")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountPayment.existingasocard);
}else if(elementName.equalsIgnoreCase("savedCardsDefault")){
	
	return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountPayment.SavedCardsDefault);
			
		}else {
			
			throw new UnsupportedOperationException("Given Element type not defined");

		}
		
	}

	// to check element presence on my account card page
	public boolean VarifyElementPresenseOnAsoCardsPage(String elementName) {
		if(elementName.equalsIgnoreCase("add new Aso card")) {
			
			return GlobalMobileHelper.isElementDisplayed(Locators.Addnewasocreditcard.AddnewAsocrerditCardlabel);

			
		//}else if(elementName.equalsIgnoreCase("Add new credit car")){
			
			//return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountPayment.SavedCardslabel);
			
		}else {
			
			throw new UnsupportedOperationException("Given Element type not defined");

		}
		
	}
// Click on Aso card page 
	public void tabOnButtonOnAsoCardsPage(String btnName) {
		if(btnName.equalsIgnoreCase("save card button")) {
			
			GlobalMobileHelper.tapOnElement(Locators.MyAccountBillingAddress.SaveCreditcardbutton);

			// add that element here on you want to click on add new aso card 
		}else if(btnName.equalsIgnoreCase("backbutton")){
			
			GlobalMobileHelper.tapOnElement(Locators.Addnewasocreditcard.buttonback);
		}else if(btnName.equalsIgnoreCase("alertmodal")){
			
			GlobalMobileHelper.tapOnElement(Locators.Addnewasocreditcard.ErrorModal);
}else if(btnName.equalsIgnoreCase("cancell")){
			
			GlobalMobileHelper.tapOnElement(Locators.Addnewasocreditcard.Cancelalertbutton);
}else if(btnName.equalsIgnoreCase("continue")){
	
	GlobalMobileHelper.tapOnElement(Locators.Addnewasocreditcard.Continuealertbutton);
}else if(btnName.equalsIgnoreCase("deletecardbutton")){
	
	GlobalMobileHelper.tapOnElement(Locators.Addnewasocreditcard.DeleteCardbutton);

		}else {
			
			throw new UnsupportedOperationException("Given button type not defined");

		}
		
		
	}
		
	

	public void tapOnOrderButton() {
		GlobalMobileHelper.tapOnElement(Locators.AccountPage.ordersLabel);
	}

	public void enterOrderID(String args) {
		GlobalMobileHelper.setText(Locators.AccountPage.orderIdInput, args);
	}

	public void enterOrderZipCode(String args) {
		GlobalMobileHelper.setText(Locators.AccountPage.billingZipCode, args);
	}

	public void tapOnOrderCheckButton() {
		GlobalMobileHelper.tapOnElement(Locators.AccountPage.buttonCheck);
	}

	public void tapOnOrderButtonInOrderScreen() {
		GlobalMobileHelper.tapOnElement(Locators.OrdersPage.orderTotalbutton);
	}

	public boolean isPaymentDetailsScreenDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.paymentDetailsScreenHeader);
	}

	public boolean isOrderSummaryLabelDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.orderSummarylabel);
	}

	public boolean isPaymentMethodLabelDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.paymentMethodLabel);
	}

	public void addCreditCardHolderName(String cardHolderName) {
		driver.findElement(Locators.AccountPage.creditCardHOlderName).sendKeys(cardHolderName);
		
	}

	public void addCreditCardNumber(String cardNumber) {
		driver.findElement(Locators.AccountPage.creditCardNumber).sendKeys(cardNumber);
		
	}

	public void addCreditCardExpiryDate(String expiryDate) {
		driver.findElement(Locators.AccountPage.creditCardExpiry).sendKeys(expiryDate);
		
	}

	public void addCreditCardCvv(String cvvNumber) {
		driver.findElement(Locators.AccountPage.creditCardCvvNumber).sendKeys(cvvNumber);
		
	}

	public boolean isCreditCardDetailspageDisplayed() {
	
		return GlobalMobileHelper.isElementDisplayed(Locators.AccountPage.creditCardPageTitle);
		
	}

	public boolean isAlertPopUpDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.AccountPage.alertPopUPCreditCard);
		
	}

	public void enterCreditCardDetails(String fieldName) {
		
		String keywordValue = PropertiesHelper.getInstance().getMobileTestDataProperty(fieldName);
 		String element = null;
 		if(fieldName.equalsIgnoreCase("ASOCard")){
 			GlobalMobileHelper.setText(Locators.Addnewasocreditcard.Asocardtextbox, keywordValue,Locators.Addnewasocreditcard.Setasdefaultcheckbox);

 			
 		}else if(fieldName.equalsIgnoreCase("ccfirstname")){

 			GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingFirstName, keywordValue,Locators.MyAccountBillingAddress.BilingLastName);
 		}else if(fieldName.equalsIgnoreCase("ccnewfirstname")){

 			GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingFirstName, keywordValue,Locators.MyAccountBillingAddress.BilingLastName);
	
	 	}else if(fieldName.equalsIgnoreCase("ccLastname")){
	 		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingLastName, keywordValue,Locators.MyAccountBillingAddress.BilingAddressText);
	 	
	 	}else if(fieldName.equalsIgnoreCase("ccAddress")){

	 		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingAddressText, keywordValue,Locators.MyAccountBillingAddress.BilingAptName);
	 		
	 	}else if(fieldName.equalsIgnoreCase("ccaprtname")){
	 		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingAptName, keywordValue,Locators.MyAccountBillingAddress.BilingZipCode);
	 		
	 		
	 	}else if(fieldName.equalsIgnoreCase("cczipcode")){
	 		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingZipCode, keywordValue,Locators.MyAccountBillingAddress.BilingCity);
	 	
	 	}else if(fieldName.equalsIgnoreCase("entercccity")){
		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingCity, keywordValue,Locators.MyAccountBillingAddress.BilingPhoneNumber);	
		
	 	}else if(fieldName.equalsIgnoreCase("ccmobilenumber")){
		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingPhoneNumber, keywordValue);
		GlobalMobileHelper.tapOnElement(Locators.MyAccountBillingAddress.LabelBillingAddress);
	}else {
		
		throw new UnsupportedOperationException("Given Element type not defined");
	}
	}

	public void tapOnLoginBtn() {
		GlobalMobileHelper.tapOnElement(Locators.AccountPage.loginLink);
		
	}

	public void isBillingAddressSectionDisplayed() {
		GlobalMobileHelper.isElementDisplayed(Locators.AccountPage.billingAddressTitle);

	}

	public boolean isCreditCardsDisplayed() {
		List<MobileElement> ls = driver.findElements(By.xpath(""));
		if(ls.size()!=0) {
			return true;
		}else {
			return false;
		}

	}

	public void tapOnSetDefaultCheckbox() {
		GlobalMobileHelper.tapOnElement(Locators.AccountPage.setAsDefaultCheckBox);

	}

	public boolean verifyDefaultcreditCard() {
		List<MobileElement> ls = driver.findElements(By.xpath(""));
		boolean stat =false;
		for(int i = 1; i<=ls.size(); i++) {
			if(i==1) {
				 stat = ls.get(i).isDisplayed();

			}
		}
		return stat;


	}

	public boolean isSetAsDefaultNotDisplayed() {
		return !GlobalMobileHelper.isElementDisplayed(Locators.MyAccountPayment.setAsDefaultCheckbox);
	}

	public boolean isDefaultCheckBoxChecked() {
		return GlobalMobileHelper.isElementSelected(Locators.MyAccountPayment.setAsDefaultCheckbox);
	}

	public boolean isDefaultCheckBoxDisabled() {
		return !GlobalMobileHelper.isElementEnabled(Locators.MyAccountPayment.setAsDefaultCheckbox);
	}

	public boolean isGreetingMessageDisplayed() {
		 return GlobalMobileHelper.isElementDisplayed(Locators.AccountPage.greetingMessage);
	}
}
