package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.text.NumberFormat;
import java.util.Locale;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_KER_2940_Web_SD extends CommonActionHelper {

	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);

	public double extimateTax = 0;
	public double total = 0;
	public double priceItem1 = 0;
	public double priceItem2 = 0;
	

	@When("^User adds items to the cart \\(in store pickup\\)$")
	public void user_adds_items_to_the_cart_in_store_pickup() throws Throwable {

	}

	@And("^user clicks on Cart icon$")
	public void user_clicks_on_Cart_icon() throws Throwable {

	}

	/*
	 * @Then("^user navigate to Cart page$") public void
	 * user_navigate_to_Cart_page() throws Throwable {
	 * assertTrue(isDisplayed(r2SanityPo.AS_txtYourCart)); }
	 */

	@And("^verify Shipping charges as FREE in cart page$")
	public void verify_Shipping_charges_as_FREE_in_cart_page() throws Throwable {

	}

	@When("^user adds items from PDP page and Navigates to Cart Page$")
	public void user_adds_items_from_PDP_page_and_Navigates_to_Cart_Page() throws Throwable {

	}

	@And("^Verify estimated taxes on the cart page$")
	public void verify_estimated_taxes_on_the_cart_page() throws Throwable {

	}

	@And("^the Estimated Taxes are in \\$XX\\.XX format$")
	public void the_Estimated_Taxes_are_in_$XX_XX_format() throws Throwable {
		
		String taxPriceformat = r2CartPo.txtEstimatedTaxesCart.getText();
		extimateTax =  Double.parseDouble(taxPriceformat.replaceAll("[^0-9\\\\.]+", ""));
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		String estimateTaxCurrency = format.format(extimateTax);
		System.out.println("Estimate Tax Currency format in US : " + estimateTaxCurrency);
		
	}

	@And("^Verify Total for all items on the cart page$")
	public void verify_Total_for_all_items_on_the_cart_page() throws Throwable {

	}

	@And("^the Total is in \\$XX\\.XX format$")
	public void the_Total_is_in_$XX_XX_format() throws Throwable {
		String totalPriceformat = r2CartPo.txtTotalCart.getText();
		total =  Double.parseDouble(totalPriceformat.replaceAll("[^0-9\\\\.]+", ""));
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		String estimateTaxCurrency = format.format(total);
		System.out.println("Total Price Currency format in US : " + estimateTaxCurrency);
	}

	@Then("^verify that itemized subtotal for each item in cart is displayed$")
	public void verify_that_itemized_subtotal_for_each_item_in_cart_is_displayed() throws Throwable {
		Thread.sleep(2000);
		r2CartPo.verifySubtotal();
	}

	
	
	@And("^verify the price format each item is \\$XX\\.XX$")
	public void verify_the_price_format_each_item_is_$XX_XX() throws Throwable {
		String priceformat = r2CartPo.txtActualPrice.getText();
		priceItem1 =  Double.parseDouble(priceformat.replaceAll("[^0-9\\\\.]+", ""));
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		String currency = format.format(priceItem1);
        System.out.println("Item1 Currency in US : " + currency);
        String priceformat2 = r2CartPo.txtActualPrice2.getText();
        priceItem2 =  Double.parseDouble(priceformat2.replaceAll("[^0-9\\\\.]+", ""));
        String currency2 = format.format(priceItem2);
        System.out.println("Item1 Currency in US : " + currency2);
       	}

	@And("^verify Sub total is the sum of the prices of all in-stock items in cart$")
	public void verify_Sub_total_is_the_sum_of_the_prices_of_all_in_stock_items_in_cart() throws Throwable {

	}

	@Then("^Authenticated user logs in and added items to the cart with multiple mixed promo codes$")
	public void authenticated_user_logs_in_and_added_items_to_the_cart_with_multiple_mixed_promo_codes()
			throws Throwable {

	}

	@And("^verify that Mixed promo discounts are applied for respective items$")
	public void verify_that_Mixed_promo_discounts_are_applied_for_respective_items() throws Throwable {

	}

	@And("^verify Promo code discount is applied$")
	public void verify_Promo_code_discount_is_applied() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtPromocode));
	}

	@And("^verify that consolidated amount for all promotions \\(except shipping\\) is applied$")
	public void verify_that_consolidated_amount_for_all_promotions_except_shipping_is_applied() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtTotalCart));
		Thread.sleep(1000);
	}

	@And("^verify Military code discount is applied correctly$")
	public void verify_Military_code_discount_is_applied_correctly() throws Throwable {

	}

	@And("^user view and Applied Promotions/Discounts$")
	public void user_view_and_Applied_Promotions_Discounts() throws Throwable {
//		r2SanityPo.verifyAppliedPromoOnCartPage();
	}
	
	
	@Then("^verify price of each item in the cart$")
	public void verify_price_of_each_item_in_the_cart() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtActualPrice));
		assertTrue(isDisplayed(r2CartPo.txtActualPrice2));
	}
	
	
	@And("^user view and Applied Promotions/Discounts \"(.*?)\"$")
	public void user_view_and_Applied_Promotions_Discounts(String arg1) throws Throwable 
	{
		r2SanityPo.verifyAppliedPromoOnCartPage(arg1);
	}
	
	
}
