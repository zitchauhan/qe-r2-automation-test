package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;

import cucumber.api.java.en.Then;

public class R1_LP_577_Web  extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	@Then("^user expect element error message for invalid prescreen code to be present$")
	public void user_expect_element_error_message_for_invalid_prescreen_code_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfErrorInvalidPreScreenCode();
	}
	
	@Then ("^user clicks On AddNew CreditCard in Payment Page$")
	public void click_OnAddNew_CreditCard_OnPaymentPage() throws Throwable {
		genericPO.clickOnAddNewCreditCardOnPaymentPage();
	}
	
	@Then ("^user Enters Accademy Credit Card Details$")
	public void user_Enters_Accademy_Credit_Card_Details() throws Throwable {
		genericPO.clickOnAddNewCreditCardOnPaymentPage();
	}
	
	@Then ("^User Clicks on Add New Card Button$")
	public void User_Clicks_on_Add_New_Card_Button() throws Throwable {
		genericPO.userClickonAddCreditCard();
	}
	
	@Then ("^user verify ACC Default Card$")
	public void user_verify_ACC_Default_Card() throws Throwable {
		genericPO.verifyAccademyCreditAsDefault();
	}
}
