package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K6941_SD extends CommonActionHelper {

	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);

	@Then("^user enter the emailaddress \"(.*?)\" in signin page$")
	public void user_enter_the_emailaddress_in_signin_page(String arg1) throws Throwable {
		if (arg1 != "BlankEmailAddress")
			setInputText(r2MyAccountPo.inputEmailAddressSignIn, webPropHelper.getTestDataProperty(arg1));
	}
	
	@Then("^user enter the password \"(.*?)\"$")
	public void user_enter_the_password(String arg1) throws Throwable {
		if (arg1 != "BlankPassword")
			setInputText(r2MyAccountPo.inputPasswordSignIn, webPropHelper.getTestDataProperty(arg1));
	}
	
	@Then("^user enter random email address in signup page$")
	public void user_enter_random_email_address_in_signup_page() throws Throwable {
		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString();
		String txtemailaddress_random = "abc" + randomUUIDString + "@gmail.com";
		setInputText(r2MyAccountPo.inputEmailAddress, txtemailaddress_random);//KER-6941 CR-Rk 3-Sep
	}
	@Then("^user enter random \"(.*?)\" in signup page$")
	public void user_enter_random_in_signup_page(String arg1) throws Throwable {
		//UUID uuid = UUID.randomUUID();
		//String randomUUIDString = uuid.toString();
		//String txtemailaddress_random = "abc" + randomUUIDString + "@gmail.com";
		setInputText(r2MyAccountPo.inputEmailAddress, arg1); //KER-6941 CR-Rk 3-Sep
	}
}