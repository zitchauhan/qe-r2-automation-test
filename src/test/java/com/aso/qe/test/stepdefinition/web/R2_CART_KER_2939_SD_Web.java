package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_KER_2939_SD_Web extends CommonActionHelper {

	public GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver,
			GlobalElementHeader_HomePO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);

	@Then("^User is able to see the selected variant image as thumbnail$")
	public void user_is_able_to_see_the_selected_variant_image_as_thumbnail() throws Throwable {
		assertTrue(clickOnButton(r2SanityPo.AS_productImage));
		globalElementHeader.verifyThePDPPage();
	}

	@Then("^user views the details specific to the item\\(Thumbnail image\\)$")
	public void user_views_the_details_specific_to_the_item_Thumbnail_image() throws Throwable {
		assertTrue(isDisplayed(r2SanityPo.AS_productImage));
	}

	@Then("^user verify prodcut name and prodcut link$")
	public void user_verify_prodcut_name_and_prodcut_link() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.lnkProducttext));
	}

	@Then("^user verify color and size$")
	public void user_verify_color_and_size() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtPrdColor));
		assertTrue(isDisplayed(r2CartPo.txtPrdSize));
		
	}

	@Then("^user verify price of items for single quantity$")
	public void user_verify_price_of_items_for_single_quantity() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtActualPrice));
	}

	@Then("^user verify price of items more than one quantity$")
	public void user_verify_price_of_items_more_than_one_quantity() throws Throwable {
		r2SanityPo.AS_inputQty.clear();
		getDriver().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		String quantity=PropertiesHelper.getInstance().getTestDataProperty("quantity");  
		setInputText(r2SanityPo.AS_inputQty, quantity);
		getDriver().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		r2SanityPo.AS_clkOutside.click();
		getDriver().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
	}

	@And("^user verify Remove cart link$")
	public void user_verify_Remove_cart_link() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.btnRemoveCart));
	}

	@And("^user verify add to wishlist$")
	public void user_verify_add_to_wishlist() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.btnWlist));
	}

	@Then("^user verify Discount messaging and Promotional messaging$")
	public void user_verify_Discount_messaging_and_Promotional_messaging() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtPromoCode1));
	}

	@Then("^user verfiy disclamier message$")
	public void user_verfiy_disclamier_message() throws Throwable {

	}

	@Then("^user verify SOF pickup information$")
	public void user_verify_SOF_pickup_information() throws Throwable {

	}

	@Then("^user verify shipping information$")
	public void user_verify_shipping_information() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.rbShipToMe));
	}

	@Then("^user verify BOPIS radio button$")
	public void user_verify_BOPIS_radio_button() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.rbInStorePickUp));
	}

	@Then("^Shipping radio button is selected by default$")
	public void shipping_radio_button_is_selected_by_default() throws Throwable {

	}

	@Then("^in-stores radio button is deselected$")
	public void in_stores_radio_button_is_deselected() throws Throwable {

	}

	@Then("^in-stores information is hided$")
	public void in_stores_information_is_hided() throws Throwable {

	}

	@Then("^user enters Zip code$")
	public void user_enters_Zip_code() throws Throwable {

	}

	@Then("^Shipping date information is displayed$")
	public void shipping_date_information_is_displayed() throws Throwable {

	}

	@Then("^in-store pick up radio button is selected$")
	public void in_store_pick_up_radio_button_is_selected() throws Throwable {

	}

	@Then("^Shipping radio button is deselected$")
	public void shipping_radio_button_is_deselected() throws Throwable {

	}

	@Then("^the shipping information is hided$")
	public void the_shipping_information_is_hided() throws Throwable {

	}

	@Then("^user can begin checkout$")
	public void user_can_begin_checkout() throws Throwable {

	}

	@When("^user will verify Shipping radio button is selected by default$")
	public void user_will_verify_Shipping_radio_button_is_selected_by_default() throws Throwable {

	}
	
	@Then("^user will verify if in-stores radio button is deselected$")
	public void user_will_verify_if_in_stores_radio_button_is_deselected() throws Throwable {
	
	}

	@Then("^user will verify if Shipping date information is displayed$")
	public void user_will_verify_if_Shipping_date_information_is_displayed() throws Throwable {

	}

	@Then("^user click on the product name in cart page$")
	public void user_click_on_the_product_name_in_cart_page() throws Throwable {

	}

	@When("^user will verify in-store pick up radio button is selected$")
	public void user_will_verify_in_store_pick_up_radio_button_is_selected() throws Throwable {

	}

	@Then("^user will verify Shipping radio button is deselected$")
	public void user_will_verify_Shipping_radio_button_is_deselected() throws Throwable {

	}

	@Then("^user will verify if in-stores information is hidden$")
	public void user_will_verify_if_in_stores_information_is_hidden() throws Throwable {

	}

	@Then("^verify user can begin checkout$")
	public void verify_user_can_begin_checkout() throws Throwable {

	}
	
 
	@Then("^user clicks change \"(.*?)\" code$")
		public void user_clicks_change_code(String arg1) throws Throwable { 
		assertTrue(clickOnButton(r2CartPo.changeZIPCode));
		setInputText(r2CartPo.inputZIPCode, webPropHelper.getTestDataProperty(arg1));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		assertTrue(clickOnButton(r2CartPo.submitZIPCode));	
		} 
	 
	

}
