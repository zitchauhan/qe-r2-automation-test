package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AccountPage {
	
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
		GlobalMobileHelper.tapOnElement(Locators.AddAddress.buttonAddNewAddress);
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
	
	public void tabOnPaymentButton() throws InterruptedException {
		GlobalMobileHelper.tapOnElement(Locators.MyAccountwelcomePage.buttonPayment);
		
			Thread.sleep(1000);
		
		
	}
	public boolean isPaymentScreenIsDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountPayment.Paymenttitle);
	}
	
	public void tabOnAddccButton() {
		GlobalMobileHelper.tapOnElement(Locators.MyAccountPayment.buttonaddcreditcard);
	}

	public boolean isaddnewcreditcardpagedisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.AddnewcrerditCardlabel);
		}

	public void tabOnAddAsoCardtile() {
		GlobalMobileHelper.tapOnElement(Locators.MyAccountPayment.buttonaddacacemycard);
		
	}

	public boolean isaddAsocardpagedisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.Addnewasocreditcard.AddnewAsocrerditCardlabel);
	
	}

	public boolean isSavedCardDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountPayment.savedCards);
	}

	public boolean isSavedDefaultCardDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.MyAccountPayment.savedCardsDefault);
	}

	public void enterAsocardnumber(String asocardnumber) {
		GlobalMobileHelper.setText(Locators.Addnewasocreditcard.Asocardtextbox, asocardnumber,Locators.Addnewasocreditcard.Setasdefaultcheckbox);
		
	}

	public void enterBillingFirstname(String billingfirstname) {
		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingFirstName, billingfirstname,Locators.MyAccountBillingAddress.BilingLastName);
		
	}

	public void enterBillinglastname(String billinglastname) {
		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingLastName, billinglastname,Locators.MyAccountBillingAddress.BilingAddressText);
		
	}

	public void enterBillingaddressname(String billingaddressname) {
		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingAddressText, billingaddressname,Locators.MyAccountBillingAddress.BilingAptName);
		
	}

	public void enterBillingaptname(String billingaptname) {
		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingAptName, billingaptname,Locators.MyAccountBillingAddress.BilingZipCode);
		
	}

	public void enterBillingZipCode(String billingzipcode) {
		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingZipCode, billingzipcode,Locators.MyAccountBillingAddress.BilingCity);
		
	}

	public void enterBillingCity(String billingcity) {
		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingCity, billingcity,Locators.MyAccountBillingAddress.BilingPhoneNumber);
	
	}

	public void enterBillingPhoneNumber(String billingphonenumber) {
		GlobalMobileHelper.setText(Locators.MyAccountBillingAddress.BilingPhoneNumber, billingphonenumber);
		GlobalMobileHelper.tapOnElement(Locators.MyAccountBillingAddress.LabelBillingAddress);
	}

	public void tabOnSaveCardButton() {
		GlobalMobileHelper.tapOnElement(Locators.MyAccountBillingAddress.SaveCreditcardbutton);
		
	}

	
	
	  
}
