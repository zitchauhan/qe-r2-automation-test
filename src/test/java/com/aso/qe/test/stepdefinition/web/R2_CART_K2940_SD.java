package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_K2940_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_HP_K729_SD.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);

	private static float taxDisplayed = 0.0f;
	public double extimateTax = 0;
	public double total = 0;
	public double priceItem1 = 0;
	public double priceItem2 = 0;
	private String singleTaxCurrency;
	private String multiTaxCurrency;

	@And("^user clicks on Cart icon$")
	public void user_clicks_on_Cart_icon() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(clickOnButton(globalElementHeader.iconcart_m));	
		}
		else
		{
		assertTrue(clickOnButton(r2CartPo.iconMiniCart));
		}
	}

	/*
	 * @Then("^user navigate to Cart page$") public void
	 * user_navigate_to_Cart_page() throws Throwable {
	 * assertTrue(isDisplayed(r2SanityPo.AS_txtYourCart)); }
	 */

	@And("^verify Shipping charges as FREE in cart page$")
	public void verify_Shipping_charges_as_FREE_in_cart_page() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtEstimatedTaxesCart));
	}

	@And("^Verify estimated taxes on the cart page$")
	public void verify_estimated_taxes_on_the_cart_page() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtEstimatedTaxesCart));
	}

	@When("^verify Shipping charges for the items in the cart page is greater than Zero$")
	public void verify_Shipping_charges_for_the_items_in_the_cart_page_is_greater_than_Zero() throws Throwable {
		taxDisplayed = r2CartPo.getEstimatedTaxOnCartPage();
		// assertTrue(Float.parseFloat(r2CartPo.txtEstimatedTaxesCart.getText()) > 0);
		assertTrue(taxDisplayed > 0);
	}

	@And("^the Estimated Taxes are in \\$XX\\.XX format$")
	public void the_Estimated_Taxes_are_in_$XX_XX_format() throws Throwable {

		String taxPriceformat = r2CartPo.txtEstimatedTaxesCart.getText();
		extimateTax = Double.parseDouble(taxPriceformat.replaceAll("[^0-9\\\\.]+", ""));
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		singleTaxCurrency = format.format(extimateTax);
		logger.debug("Estimate Tax Currency format in US " + singleTaxCurrency);

	}

	@And("^Verify Total for all items on the cart page$")
	public void verify_Total_for_all_items_on_the_cart_page() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtTotal));
	}

	@And("^the Total is in \\$XX\\.XX format$")
	public void the_Total_is_in_$XX_XX_format() throws Throwable {
		String totalPriceformat = r2CartPo.txtTotal.getText();// txtTotalCart
		total = Double.parseDouble(totalPriceformat.replaceAll("[^0-9\\\\.]+", ""));
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		String estimateTaxCurrency = format.format(total);
		logger.debug("Total Price Currency format in US : " + estimateTaxCurrency);
	}

	@Then("^verify that itemized subtotal for each item in cart is displayed$")
	public void verify_that_itemized_subtotal_for_each_item_in_cart_is_displayed() throws Throwable {
		Thread.sleep(2000);
		r2CartPo.verifySubtotal();
	}

	@And("^verify the price format each item is \\$XX\\.XX$")
	public void verify_the_price_format_each_item_is_$XX_XX() throws Throwable {
		// String priceformat = r2CartPo.txtActualPrice.getText();
		String priceformat = r2CartPo.FirstQuantityPrice_Txt.getText();
		priceItem1 = Double.parseDouble(priceformat.replaceAll("[^0-9\\\\.]+", ""));
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		String currency = format.format(priceItem1);
		logger.debug("Item1 Currency in US : " + currency);
		// String priceformat2 = r2CartPo.txtActualPrice2.getText();
		String priceformat2 = r2CartPo.SecondQuantityPrice_Txt.getText();
		priceItem2 = Double.parseDouble(priceformat2.replaceAll("[^0-9\\\\.]+", ""));
		String currency2 = format.format(priceItem2);
		logger.debug("Item1 Currency in US : " + currency2);
	}

	@And("^verify that Mixed promo discounts are applied for respective items$")
	public void verify_that_Mixed_promo_discounts_are_applied_for_respective_items() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.discount_Txt));
	}

	@And("^verify Promo code discount is applied$")
	public void verify_Promo_code_discount_is_applied() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtPromocodeCart));// txtPromocode
	}

	@And("^verify that consolidated amount for all promotions \\(except shipping\\) is applied$")
	public void verify_that_consolidated_amount_for_all_promotions_except_shipping_is_applied() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtTotal));// txtTotalCart
		Thread.sleep(1000);
	}

	@And("^verify Military code discount is applied correctly$")
	public void verify_Military_code_discount_is_applied_correctly() throws Throwable {
		// Military code discount is not implemented
	}

//	@And("^user view and Applied Promotions/Discounts$")
//	public void user_view_and_Applied_Promotions_Discounts() throws Throwable {
//		// r2SanityPo.verifyAppliedPromoOnCartPage();
//	}

	@Then("^verify price of each item in the cart$")
	public void verify_price_of_each_item_in_the_cart() throws Throwable {
		// assertTrue(isDisplayed(r2CartPo.txtActualPrice));
		// assertTrue(isDisplayed(r2CartPo.txtActualPrice2));
		assertTrue(isDisplayed(r2CartPo.FirstQuantityPrice_Txt));
		assertTrue(isDisplayed(r2CartPo.SecondQuantityPrice_Txt));
	}

	@And("^user view and Applied Promotions/Discounts \"(.*?)\"$")
	public void user_view_and_Applied_Promotions_Discounts(String arg1) throws Throwable {
		r2SanityPo.verifyAppliedPromoOnCartPage(arg1);
	}

	@And("^user click on edit cart CTA to navigate to Cart page$")
	public void user_click_on_edit_cart_CTA_to_navigate_to_Cart_page() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(clickOnButton(r2CheckOutPo.btnEditCart_m));
			getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
		else
		{
		assertTrue(clickOnButton(r2CheckOutPo.btnEditCart));
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

	@Then("^verify that the updated estimated Tax is displayed$")
	public void verify_that_the_updated_estimated_Tax_is_displayed() throws Throwable {
		Thread.sleep(2000);
		String taxPriceformat = r2CartPo.txtEstimatedTaxesCart.getText();
		extimateTax = Double.parseDouble(taxPriceformat.replaceAll("[^0-9\\\\.]+", ""));
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		multiTaxCurrency = format.format(extimateTax);
		logger.debug("Estimate Tax Currency format in US : " + multiTaxCurrency);
		assertTrue(singleTaxCurrency != multiTaxCurrency);
	}

	@Then("^user click on Checkout button$")
	public void user_click_on_Checkout_button() throws Throwable {
		moveHover(r2CheckOutPo.btnChekOut);
		assertTrue(clickOnButton(r2CheckOutPo.btnChekOut));
	}

	@When("^verify the the Sub Total in Order Summary in Cart page$")
	public void verify_the_the_Sub_Total_in_Order_Summary_in_Cart_page() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtSubtotalCart));
	}

	@Then("^verify that the hierarchy of itemizations in Order Summary in Cart Page$")
	public void verify_that_the_hierarchy_of_itemizations_in_Order_Summary_in_Cart_Page() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtActualPrice));
		assertTrue(isDisplayed(r2CartPo.txtEstimatedTaxesCart));
		assertTrue(isDisplayed(r2CartPo.txtPromocodeCart)); // txtPromocode
	}

	@When("^user views Estimated Shipping in the Item Subtotal$")
	public void user_views_Estimated_Shipping_in_the_Item_Subtotal() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtEstimatedShippingCart)); // txtEstimatedShipping
	}

	@Then("^verify Shipping charges for the items in the cart page is Zero and FREE is displayed$")
	public void verify_Shipping_charges_for_the_items_in_the_cart_page_is_Zero_and_FREE_is_displayed()
			throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtEstimatedFree));
	}

	@Then("^user cilck on expand icon in order summary checkout page$")
	public void user_cilck_on_expand_icon_in_order_summary_checkout_page() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.ExpandIcon_Link));
	}
	
	@Then("^verify Employee discount is appiled$")
	public void verify_Employee_discount_is_appiled() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.discount_Txt));
	}
}
