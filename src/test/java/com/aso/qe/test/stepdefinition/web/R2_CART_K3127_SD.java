package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CART_K3127_SD extends CommonActionHelper {

	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);

	@And("^User verifies and click the shipping policy link$")
	public void user_verifies_and_click_the_shipping_policy_link() throws Throwable {
		scrollPageToWebElement(r2CartPo.lnkShippingPolicy);
		assertTrue(clickOnButton(r2CartPo.lnkShippingPolicy));
	}

	@Then("^User is navigated to Shipping Charges page$")
	public void user_is_navigated_to_Shipping_Charges_page() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtShippingCharges));
	}

	@And("^User verifies and click the Return policy link$")
	public void user_verifies_and_click_the_Return_policy_link() throws Throwable {
		scrollPageToWebElement(r2CartPo.lnkReturnPolicy);
		assertTrue(clickOnButton(r2CartPo.lnkReturnPolicy));
	}

	@Then("^User is navigated to Return Policy page$")
	public void user_is_navigated_to_Return_Policy_page() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtReturnPolicy));
	}

	@Then("^User verifies the accepted payment icons\\( paypal/VISA/Mastercard/America express/Discover\\)$")
	public void user_verifies_the_accepted_payment_icons_paypal_VISA_Mastercard_America_express_Discover()
			throws Throwable {
		scrollPageToWebElement(r2CartPo.iconVisa);
		assertTrue(isDisplayed(r2CartPo.iconVisa));
		assertTrue(isDisplayed(r2CartPo.iconMasterCard));
		assertTrue(isDisplayed(r2CartPo.iconPaypal));
		assertTrue(isDisplayed(r2CartPo.iconGooglePay));
		assertTrue(isDisplayed(r2CartPo.iconApplePay));
		assertTrue(isDisplayed(r2CartPo.iconAmericanExpress));
		assertTrue(isDisplayed(r2CartPo.iconDiscover));
	}

	@Then("^User navigats to the item eligible for item level promo$")
	public void user_navigats_to_the_item_eligible_for_item_level_promo() throws Throwable {
		waitForElement(r2SanityPo.AS_btnShopCategory);
		assertTrue((clickOnButton(r2SanityPo.AS_btnShopCategory)));
		assertTrue(clickOnButton(r2CartPo.subCategoryCycling));
		Thread.sleep(1000);
		assertTrue(clickOnButton(r2CartPo.shopByCategory2));
		assertTrue(clickOnButton(r2CartPo.facetDrawerGender));
		Thread.sleep(2000);
		assertTrue(clickOnButton(r2CartPo.selectGenderGirl));
		assertTrue(clickOnButton(r2CartPo.iconfacetDrawerBrand));
		assertTrue(clickOnButton(r2CartPo.chboxBrandDiamondback));
		assertTrue(clickOnButton(r2CartPo.selectProductCycle));
	}

	@Then("^discount value applied against the individual line item$")
	public void discount_value_applied_against_the_individual_line_item() throws Throwable {
		driver.navigate().refresh();
		Thread.sleep(2000);
		isDisplayed(r2CartPo.txtLineItemDiscount);
	}

	@Then("^customer must see the associated discount as -\\$XX\\.XX \\(total order discount\\) at Order Summary in Cart$")
	public void customer_must_see_the_associated_discount_as_$XX_XX_total_order_discount_at_Order_Summary_in_Cart()
			throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtAppliedTotalDisc));
		String str1 = r2CartPo.txtAppliedTotalDisc.getText();
		assertTrue(str1.contains("-$"));
	}

	@Then("^verify PayPal Checkout is dispalyed$")
	public void verify_PayPal_Checkout_is_dispalyed() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.btnPayPalCheckout));
	}
	
	@Then("^total price must be updated to reflect discount$")
	public void total_price_must_be_updated_to_reflect_discount() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtDiscountTotal));
	}

	@Then("^associated discount should get remove$")
	public void associated_discount_should_get_remove() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtAppliedTotalDisc));
	}

	@Then("^total price must be updated with reflect amount$")
	public void total_price_must_be_updated_with_reflect_amount() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtRemoveDiscountTotal));
	}

}
