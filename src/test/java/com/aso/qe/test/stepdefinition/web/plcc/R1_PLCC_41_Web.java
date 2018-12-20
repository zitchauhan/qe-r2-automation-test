package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_PLCC_41_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_PO plccPageObjects = PageFactory.initElements(driver, R1_PLCC_PO.class);

	@Then("^user click on Add Company name, Apt\\. Number, etc\\. \\(Optional\\) link$")
	public void user_click_on_Add_Company_name_Apt_Number_etc_Optional_link() throws Throwable {
		plccPageObjects.clickOnAddMoreAddressDetails();
	}

	@Then("^user expect element Add company name, Apt\\.Number, etc\\. \\(Optional\\) to be present$")
	public void user_expect_element_Add_company_name_Apt_Number_etc_Optional_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfAddMoreAddressDetails();
	}

	@Then("^user expect element Phone number to be present$")
	public void user_expect_element_Phone_number_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfPhoneNumberTxtField();
	}

	@Then("^user expect element SIGN UP to be present$")
	public void user_expect_element_SIGN_UP_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfSignUpBtnRegistrationPage();
	}

	@Then("^user expect element User Select Address to be present$")
	public void user_expect_element_User_Select_Address_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfUserSelectedAddressBtn();
	}

}
