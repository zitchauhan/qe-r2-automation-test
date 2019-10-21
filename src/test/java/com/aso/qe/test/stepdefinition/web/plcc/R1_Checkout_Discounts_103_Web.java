package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_Checkout_Discounts_103_Web extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R2_CheckOut_PO checkout_po = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_SearchProduct_PO r1_SearchPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader_HomePO = PageFactory.initElements(getDriver(),
			R1_GlobalElementHeader_Home_PO.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	

@When("^usr click on view cart and navigates to cart page$")
public void usr_click_on_view_cart_and_navigates_to_cart_page() throws Throwable {
	Thread.sleep(5000);
	genericPO.verifyPresenceOfViewCartBtn();
	genericPO.viewCartBtn.click();
	Thread.sleep(10000);
}

@When("^user click on add promo code link on cart page$")
public void user_click_on_add_promo_code_link_on_cart_page() throws Throwable {
	try {
		genericPO.addPromoCodeLink.click();
		Thread.sleep(10000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@When("^user enter promocode \"(.*?)\" on cart page$")
public void user_enter_promocode_on_cart_page(String arg1) throws Throwable {
	try {
		genericPO.promoCodeInputField.click();
		genericPO.enterPromoCode(arg1);
		assertTrue(isDisplayed(genericPO.promoCodeInputField));
		waitForElement(genericPO.promoCodeInputField);
	} catch (Exception e) {
		logger.debug("Exception Message");
	}
}

@When("^click on submit promo code button$")
public void click_on_submit_promo_code_button() throws Throwable {
	try {
		genericPO.verifyPresenceOfSubmitPromoCard();
		genericPO.submitPromoCode.click();
		Thread.sleep(5000);
	} catch (Exception e) {
		logger.debug("Exception Message"+e.getMessage());
	}
}

@Then("^user expect fifteen dollars discount$")
public void user_expect_fifteen_dollars_discount() throws Throwable {
	try {
		genericPO.verifyPresenceOfFiftennDollarsOff();
	} catch (Exception e) {
		logger.debug("Exception message for Fifteen dollers: "+e.getMessage());
	}
}
@Then("^user expect ten dollars discount$")
public void user_expect_ten_dollars_discount() throws Throwable {
	try {
		genericPO.verifyPresenceOfFiftennDollarsOff();
	} catch (Exception e) {
		logger.debug("Exception message for Fifteen dollers: "+e.getMessage());
	}
}
@When("^user element expect promo code section to be present$")
public void user_element_expect_promo_code_section_to_be_present() throws Throwable {
	try {
		genericPO.verifyPresenceOfPromoCodeSection();
		String orderSummary = genericPO.addPromoSection.getText();
		logger.debug(orderSummary);
	} catch (Exception e) {
		logger.debug("Exception message : "+e.getMessage());
	}
	
}

@Then("^user click on remove promo card link$")
public void user_expect_element_credit_card_text_field_is_present() throws Throwable {
	genericPO.verifyPresenceOfRemovePromoCard();
	genericPO.removePromoCodeLink.click();
	Thread.sleep(3000);
}
@Then("^user expect discount text to be present$")
public void user_expect_discount_text_to_be_present() throws Throwable {
	try {
		genericPO.verifyPresenceOfDiscountText();
		Thread.sleep(5000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Then("^user clicks on checkout button on cart page$")
public void user_clicks_on_checkout_button_on_cart_page() throws Throwable {
	try {
		genericPO.verifyPresenceOfCheckoutLinkOnCartPage();
		clickOnButton(genericPO.checkoutBtnATCCartPage);
		Thread.sleep(8000);
	} catch (Exception e) {
		logger.debug("Exception Message: "+e.getMessage());
	}
}
@Then("^user increases quantity \"(.*?)\" of product$")
public void user_increases_quantity_of_product(String arg1) throws Throwable {
	Thread.sleep(2000);
	clickOnButton(genericPO.quantityInputField);
	clearInputBox(genericPO.quantityInputField);
//	genericPO.quantityInputField.click();
	genericPO.enterItemQuantity(arg1);
	assertTrue(isDisplayed(genericPO.quantityInputField));
	waitForElement(genericPO.quantityInputField);
	Thread.sleep(10000);
}
@When("^user clicks on cart icon$")
public void user_clicks_on_cart_icon() throws Throwable {
	genericPO.cartIcon.click();
}
}