package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;

import cucumber.api.java.en.Then;

public class R1_REG_50_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Registration_PO plccPageObjects = PageFactory.initElements(driver, R1_PLCC_Registration_PO.class);

	@Then("^user expect Please enter the First Name to be present$")
	public void user_expect_Please_enter_the_First_Name_to_be_present() throws Throwable {
		plccPageObjects.verifypresenceofFirstNameErrorMessage();

	}

	@Then("^user expect Please enter a Last Name to be present$")
	public void user_expect_Please_enter_a_Last_Name_to_be_present() throws Throwable {
		plccPageObjects.verifypresenceofLastNameErrorMessage();
	}

	@Then("^user expect Please enter an email address to be present$")
	public void user_expect_Please_enter_an_email_address_to_be_present() throws Throwable {
		plccPageObjects.verifypresenceofEmailAddressErrorMessage();
	}

	@Then("^user expect Please enter the Password to be present$")
	public void user_expect_Please_enter_the_Password_to_be_present() throws Throwable {
		plccPageObjects.verifypresenceofPasswordErrorMessage();
	}

	@Then("^user expect Address is required to be present$")
	public void user_expect_Address_is_required_to_be_present() throws Throwable {
		plccPageObjects.verifypresenceofAddressErrorMessage();
	}

	@Then("^user expect Zip code is required Name to be present$")
	public void user_expect_Zip_code_is_required_Name_to_be_present() throws Throwable {
		plccPageObjects.verifypresenceofZipErrorMessage();
	}

	@Then("^user expect City is required Name to be present$")
	public void user_expect_City_is_required_Name_to_be_present() throws Throwable {
		plccPageObjects.verifypresenceofCityErrorMessage();
	}

	@Then("^user expect State is required to be present$")
	public void user_expect_State_is_required_to_be_present() throws Throwable {
		plccPageObjects.verifypresenceofStateErrorMessage();
	}

	@Then("^user expect Mobile number is required to be present$")
	public void user_expect_Mobile_number_is_required_to_be_present() throws Throwable {
		plccPageObjects.verifypresenceofMobileErrorMessage();
	}
	
	//PLCC-129
	@Then("^user enter Phone number \"(.*?)\"$")
	public void user_enter_Phone_number(String arg1) throws Throwable {
		plccPageObjects.enterInvalidPhoneNumber(arg1);
		assertTrue(isDisplayed(plccPageObjects.addressPhoneField));
		waitForElement(plccPageObjects.addressPhoneField);
	}
	@Then("^user expect Invalid Zip code to be present$")
	public void user_expect_Invalid_Zip_code_to_be_present() throws Throwable {
		plccPageObjects.verifypresenceofInvalidZipCodeErrorMessage();
	}
	@Then("^user expect Mobile number can't be less than ten digits to be present$")
	public void user_expect_Mobile_number_can_t_be_less_than_ten_digits_to_be_present() throws Throwable {
		plccPageObjects.verifypresenceofInvalidMobileNumberErrorMessage();
	}
}
