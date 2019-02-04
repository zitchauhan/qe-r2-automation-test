package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;

import cucumber.api.java.en.Then;

public class R1_CCAM_Generic_90_Web extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO ccAplicationModal_PO = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R1_PLCC_Registration_PO plccRegistration_PO = PageFactory.initElements(driver,R1_PLCC_Registration_PO.class);
	@Then("^user expect error message on first name field$")
	public void user_expect_error_message_on_first_name_field() throws Throwable {
		plccRegistration_PO.verifypresenceofFNErrorMSgCCAMErrorMsg();
	}

	@Then("^user expect error message on last name field$")
	public void user_expect_error_message_on_last_name_field() throws Throwable {
		plccRegistration_PO.verifypresenceofLNErrorMSgCCAMErrorMsg();
	}

}
