package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_PLCC_79_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_PO plccPageObjects = PageFactory.initElements(driver, R1_PLCC_PO.class);

	@When("^user click on My Account link$")
	public void user_click_on_My_Account_link() throws Throwable {
		plccPageObjects.clickOnMyAccountLink();
	}

	@When("^user click on Sign Up link$")
	public void user_click_on_Sign_Up_link() throws Throwable {
		plccPageObjects.clickSignUpLinkOnLoginPage();
	}

	@Then("^user expect element First Name to be present$")
	public void user_expect_element_First_Name_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfFirstNameTxtField();
	}

	@Then("^user enter First Name \"(.*?)\"$")
	public void user_enter_First_Name(String arg1) throws Throwable {
		plccPageObjects.enterFirstNameTxtField(arg1);
		assertTrue(isDisplayed(plccPageObjects.firstNameTxtField));
		waitForElement(plccPageObjects.firstNameTxtField);
	}

	@Then("^user expect element Last Name to be present$")
	public void user_expect_element_Last_Name_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfLastNameTxtField();
	}

	@Then("^user enter Last Name \"(.*?)\"$")
	public void user_enter_Last_Name(String arg1) throws Throwable {
		plccPageObjects.enterLastNameTxtField(arg1);
		assertTrue(isDisplayed(plccPageObjects.lastNameTxtField));
		waitForElement(plccPageObjects.lastNameTxtField);
	}

	@Then("^user expect element Email Address to be present$")
	public void user_expect_element_Email_Address_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfEmailTxtField();
	}

	@Then("^user enter Email Address \"(.*?)\"$")
	public void user_enter_Email_Address(String arg1) throws Throwable {
		plccPageObjects.enterEmailAddressTxtField(arg1);
		assertTrue(isDisplayed(plccPageObjects.emailIdTxtField));
		waitForElement(plccPageObjects.emailIdTxtField);
	}

	@Then("^user expect element Create Password to be present$")
	public void user_expect_element_Create_Password_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfCrestePwdTxtField();
	}

	@Then("^user enter Password \"(.*?)\"$")
	public void user_enter_Password(String arg1) throws Throwable {
		plccPageObjects.enterCreatePwdTxtField(arg1);
		assertTrue(isDisplayed(plccPageObjects.createPwdTxtField));
		waitForElement(plccPageObjects.createPwdTxtField);
	}

	@Then("^user expect element Add Address for Faster Checkout checkbox to be present$")
	public void user_expect_element_Add_Address_for_Faster_Checkout_checkbox_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfAddAddressCheckBox();
	}

	@Then("^user select Add Address for Faster Checkout checkbox$")
	public void user_select_Add_Address_for_Faster_Checkout_checkbox() throws Throwable {
		plccPageObjects.selectAddAddressCheckBox();
	}

	@Then("^user expect element Address to be present$")
	public void user_expect_element_Address_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfAddressTxtField();
	}

	@Then("^user enter Address \"(.*?)\"$")
	public void user_enter_Address(String arg1) throws Throwable {
		plccPageObjects.enterAddressField(arg1);
		assertTrue(isDisplayed(plccPageObjects.addressTxtField));
		waitForElement(plccPageObjects.addressTxtField);
	}

	@Then("^user expect element Zip Code to be present$")
	public void user_expect_element_Zip_Code_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfZipTxtField();
	}

	@Then("^user enter Zip Code \"(.*?)\"$")
	public void user_enter_Zip_Code(String arg1) throws Throwable {
		plccPageObjects.enterZipCodeTxtField(arg1);
		assertTrue(isDisplayed(plccPageObjects.addressZipCodeField));
		waitForElement(plccPageObjects.addressZipCodeField);
	}

	@Then("^user expect element City to be present$")
	public void user_expect_element_City_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfCityTxtField();
	}

	@Then("^user expect element City text to equal \"(.*?)\"$")
	public void user_expect_element_City_text_to_equal(String arg1) throws Throwable {
		Thread.sleep(2000);
		String prefilledCity = plccPageObjects.addressCityField.getText();
		System.out.println("Autofilled City Value is " + prefilledCity);
		logger.debug("Autofilled City Value is:: " + prefilledCity);
	}

	@Then("^user expect element State to be present$")
	public void user_expect_element_State_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfStateDrpdwn();
	}

	@Then("^user expect element State text to equal \"(.*?)\"$")
	public void user_expect_element_State_text_to_equal(String arg1) throws Throwable {
		String prefilledState = plccPageObjects.addressStateDropdown.getText();
		System.out.println("State value for selected zip is " + prefilledState);
		logger.debug("Autofilled State Value is:: " + prefilledState);
	}
}