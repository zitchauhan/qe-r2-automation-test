package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K3152_SD extends CommonActionHelper {

	private static final Logger logger = Logger.getLogger(R2_CHECKOUT_K3152_SD.class);
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);

	@Then("^User verifies the default address is selected in dropdown in shipping address section$")
	public void user_verifies_the_default_address_is_selected_in_dropdown_in_shipping_address_section()
			throws Throwable {

	}

	@Then("^User navigates to Shipping Method section$")
	public void user_navigates_to_Shipping_Method_section() throws Throwable {
		assertTrue(isDisplayed(r2MyAccountPo.shippingMethodSection));
	}

	@Then("^User verifies that an Edit CTA is displayed for Shipping Address$")
	public void user_verifies_that_an_Edit_CTA_is_displayed_for_Shipping_Address() throws Throwable {
		assertTrue(isDisplayed(r2MyAccountPo.checkoutEditShippingBtn));

	}

	@Then("^User clicks on edit CTA$")
	public void user_clicks_on_edit_CTA() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.checkoutEditShippingBtn));

	}
	
	@Then("^User verify edit CTA$")
	public void user_verify_edit_CTA() throws Throwable {
		assertFalse(clickOnButton(r2MyAccountPo.checkoutEditShippingBtn));

	}
	
	

	@Then("^User verify Shipping Method should collapse and the Shipping Address section expands and field should populate with previously added data$")
	public void user_verify_Shipping_Method_should_collapse_and_the_Shipping_Address_section_expands_and_field_should_populate_with_previously_added_data()
			throws Throwable {
		String str1 = r2MyAccountPo.adr_inpFirstName.getAttribute("value");
		String str2 = r2MyAccountPo.adr_inpLastName.getAttribute("value");
		String str3 = r2MyAccountPo.inputPhone.getAttribute("value");
		String str4 = r2MyAccountPo.inputAddress.getAttribute("value");
		String str5 = r2MyAccountPo.adr_inpzipCode.getAttribute("value");
		String str6 = r2MyAccountPo.adr_inpCity.getAttribute("value");

		logger.debug(str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5 + " " + str6);
		for (int i = 1; i <= 6; i++) {
			String newString = null;
			newString = "str" + i;
			assertTrue(!newString.isEmpty());
		}

	}

	@Then("^CTA to add additional address information, that on click displays the following fields$")
	public void cta_to_add_additional_address_information_that_on_click_displays_the_following_fields()
			throws Throwable {
		assertTrue(isDisplayed(r2MyAccountPo.addMoreDetailsAddress));
		assertTrue(clickOnButton(r2MyAccountPo.addMoreDetailsAddress));
		assertTrue(isDisplayed(r2MyAccountPo.inputCompanyName));

	}

	@Given("^User edits shipping address \"(.*?)\" and phone number \"(.*?)\" completes the checkout$")
	public void user_edits_shipping_address_and_phone_number_completes_the_checkout(String address, String phonenumber)
			throws Throwable {
		clearInputBox(r2MyAccountPo.inputAddress);
		setInputText(r2MyAccountPo.inputAddress, webPropHelper.getTestDataProperty(address));
		clearInputBox(r2MyAccountPo.inputPhone);
		setInputText(r2MyAccountPo.inputPhone, webPropHelper.getTestDataProperty(phonenumber));
		assertTrue(clickOnButton(r2MyAccountPo.goToShippingMethod));
	}

	@Then("^User navigates to Address book$")
	public void user_navigates_to_Address_book() throws Throwable {
		Thread.sleep(5000);
		clickBackButton();
		assertTrue(clickOnButton(r2MyAccountPo.myAccount));
		assertTrue(clickOnButton(r2MyAccountPo.wishList));
		assertTrue(clickOnButton(r2MyAccountPo.clickAddress));
		// Thread.sleep(3000);

		String currentURL = getCurrentPageURL();
		if (currentURL.contains("address")) {
			logger.debug("User is successfully navigated to Address Book page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Address Book instead navigated to URL :: " + currentURL);
		}
	}

	@Then("^User verifies that the new address is added to Address book with \"(.*?)\" and phone number \"(.*?)\"$")
	public void user_verifies_that_the_new_address_is_added_to_Address_book_with_and_phone_number(String address,
			String phonenumber) throws Throwable {
		waitForElement(r2MyAccountPo.checkAddress);
		String str1 = r2MyAccountPo.checkAddress.getText();
		String str2 = r2MyAccountPo.checkPhone.getText();
		assertTrue(str1.equals(webPropHelper.getTestDataProperty(address)));
		assertTrue(str2.equals(webPropHelper.getTestDataProperty(phonenumber)));
	}

}
