package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K3168_SD extends CommonActionHelper {
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);

	@Then("^user validate all the required fields in the Payment section to be visible$")
	public void user_validate_all_the_required_fields_in_the_Payment_section_to_be_visible() throws Throwable {
		r2CheckOutPo.validatePaymentPage();
	}


	@And("^user enters \"(.*?)\" details and verify it is getting entered in Credit card section$")
	public void user_enters_details_and_verify_it_is_getting_entered_in_Credit_card_section(String cardNumber) throws Throwable {
		r2CheckOutPo.enterCardDetails(webPropHelper.getTestDataProperty(cardNumber));
		r2CheckOutPo.verifyEnterdCardNumber(webPropHelper.getTestDataProperty(cardNumber));
	}

	@Then("^user clicks on the submit button$")
	@When("^user clicks on Review order button on checkout page$")
	public void user_clicks_on_the_submit_button() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
	}

	@Then("^user enters valid expiry date \"(.*?)\"$")
	public void user_enters_valid_expiry_date(String ExpDate) throws Throwable {
		r2CheckOutPo.enterExpirationValue(webPropHelper.getTestDataProperty(ExpDate));
	}

	@Then("^user enters valid cvv value \"(.*?)\"$")
	public void user_enters_valid_cvv_value(String CVV) throws Throwable {
		r2CheckOutPo.enterCVVValue(webPropHelper.getTestDataProperty(CVV));
	}

	@Then("^user hover on the toop tip icon of CVV and verify tool tip display$")
	public void user_hover_on_the_toop_tip_icon_of_CVV_and_verify_tool_tip_display() throws Throwable {
		r2CheckOutPo.verifyCVVTooltip();
	}

	@Then("^user enter two digits in cvv and verifies the card image displayed in the credit card input section$")
	public void user_enter_two_digits_in_cvv_and_verifies_the_card_image_displayed_in_the_credit_card_input_section() throws Throwable{
		r2CheckOutPo.verifyCardImage();
	}


	@Then("^user verify entering special characters inside cvv input section$")
	public void user_verify_entering_special_characters_inside_cvv_input_section() throws Throwable {
		r2CheckOutPo.verifyErrorMsgInCVVSpecialCaharacterInput();
	}

	@Then("^user verifies visa card entery in the card fields$")
	public void user_verifies_visa_card_entery_in_the_card_fields() throws Throwable {
		r2CheckOutPo.enterVisaCardDetails();
	}

	@Then("^user verifies master card entery in the card fields$")
	public void user_verifies_master_card_entery_in_the_card_fields() throws Throwable {
		r2CheckOutPo.enterMasterCardDetails();
	}

	@Then("^user verifies Amex card entery in the card fields$")
	public void user_verifies_Amex_card_entery_in_the_card_fields() throws Throwable {
		r2CheckOutPo.enterAmexCardDetails();
	}

	@Then("^user verifies discover card entery in the card fields$")
	public void user_verifies_discover_card_entery_in_the_card_fields() throws Throwable {
		r2CheckOutPo.enterDiscoverCardDetails();
	}





}
