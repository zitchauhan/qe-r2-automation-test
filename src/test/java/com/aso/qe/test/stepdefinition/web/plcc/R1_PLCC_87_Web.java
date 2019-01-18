package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_PLCC_87_Web extends CommonActionHelper {
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R2_CheckOut_PO checkout_po = PageFactory.initElements(driver, R2_CheckOut_PO.class);

	@Then("^user expect element plcc card image in footer to be present$")
	public void user_expect_element_plcc_card_image_in_footer_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfPlccCreditCardInFooter();
	}

	@When("^user click on edit link of payment section$")
	public void user_click_on_edit_link_of_payment_section() throws Throwable {
		genericPO.verifyPresenceOfEditPayment_Link();
	}

	@When("^user enter expiry date \"(.*?)\"$")
	public void user_enter_expiry_date(String arg1) throws Throwable {
		genericPO.enterExpiryDateField(arg1);
		assertTrue(isDisplayed(checkout_po.txtExpirationDate));
		waitForElement(checkout_po.txtExpirationDate);
	}

	@When("^user enter cvv \"(.*?)\"$")
	public void user_enter_cvv(String arg1) throws Throwable {
		genericPO.enterCVVField(arg1);
		assertTrue(isDisplayed(checkout_po.txtCVVInput));
		waitForElement(checkout_po.txtCVVInput);
	}

	@When("^user click on REVIEW ORDER button$")
	public void user_click_on_REVIEW_ORDER_button() throws Throwable {
		genericPO.verifyPresenceOfReviewOrderButton();
		checkout_po.ReviewOrder_Btn.click();
	}

	@When("^user click on PLACE ORDER button$")
	public void user_click_on_PLACE_ORDER_button() throws Throwable {
		genericPO.verifyPresenceOfPlaceOrderButton();
		checkout_po.btnPlaceOrderPaymentPage.click();
	}

	@Then("^user navigates to order confirmation page$")
	public void user_navigates_to_order_confirmation_page() throws Throwable {
		genericPO.verifyPresenceOfOrderConfirmationPage();
		String confirmationPageDetails = genericPO.orderConfirmationPage.getText();
		System.out.println(confirmationPageDetails);
	}

	@Then("^user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present$")
	public void user_expect_element_THANKS_FOR_SUBMITTING_YOUR_ORDER_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfOrderSuccesfullStatus();
	}

	@Then("^user expect element Order Number to be present$")
	public void user_expect_element_Order_Number_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfOrderNumber();
	}

	@Then("^user expect element a confirmation email is on its way to be present$")
	public void user_expect_element_a_confirmation_email_is_on_its_way_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfEmailOnItsWayTxt();
	}

	@Then("^user expect element print link to be present$")
	public void user_expect_element_print_link_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfPrintLinkOnOrderConfirmationPage();
	}

	@Then("^user expect element my account link to be present$")
	public void user_expect_element_my_account_link_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfMyAccountLinkOnOrderConfirmationPage();
	
	}

}
