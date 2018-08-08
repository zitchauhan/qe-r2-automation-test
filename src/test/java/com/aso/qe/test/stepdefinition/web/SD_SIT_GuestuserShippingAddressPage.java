package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_GuestuserShippingAddressPageObject;

import cucumber.api.java.en.Then;

public class SD_SIT_GuestuserShippingAddressPage extends CommonActionHelper{	
	
	SIT_GuestuserShippingAddressPageObject guestaddress= PageFactory.initElements(driver, SIT_GuestuserShippingAddressPageObject.class);
	//GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	
	@Then("^user should enter the shipping Address details$")
	public void user_should_enter_the_shipping_Address_details() throws Throwable {
		guestaddress.enterFirstName();
		guestaddress.enterLastName();
		guestaddress.enterAddress();
		guestaddress.enterZipCode();
		//guestaddress.enterCity();
		//guestaddress.SelectState();
		guestaddress.enterPhoneNumber();
		guestaddress.enterEmail();
	}

}
