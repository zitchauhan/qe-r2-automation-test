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

}
