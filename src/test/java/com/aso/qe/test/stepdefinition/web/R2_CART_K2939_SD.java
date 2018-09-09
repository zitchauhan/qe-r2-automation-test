package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_K2939_SD extends CommonActionHelper {

	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_MyAccount_PO r2MyAccountPO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_R1_Fun_PO r2R1FunPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R1_PDP_PO r1PDPPO = PageFactory.initElements(driver, R1_PDP_PO.class);

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
		assertTrue(isDisplayed(r2CartPo.txtActualPrice));// txtActualPrice
	}

	@Then("^user verify price of items more than one quantity$")
	public void user_verify_price_of_items_more_than_one_quantity() throws Throwable {
		r2SanityPo.AS_inputQty.clear();
		getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String quantity = PropertiesHelper.getInstance().getTestDataProperty("quantity");
		setInputText(r2SanityPo.AS_inputQty, quantity);
		getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		r2SanityPo.AS_clkOutside.click();
		getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@And("^user verify Remove cart link$")
	public void user_verify_Remove_cart_link() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.btnRemoveCart));
	}

	@And("^user verify add to wishlist$")
	public void user_verify_add_to_wishlist() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.btn_AddToWishList));// btnWlist
	}

	@Then("^user verify Discount messaging and Promotional messaging$")
	public void user_verify_Discount_messaging_and_Promotional_messaging() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.discount_Txt));// txtPromoCode1
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

		assertTrue(isEnabled(r2CartPo.rbShipToMe));
	}

	@Then("^in-stores radio button is deselected$")
	public void in_stores_radio_button_is_deselected() throws Throwable {
		if (!r2CartPo.rbInStorePickUp.isSelected()) {
			assertTrue(isDisplayed(r2CartPo.rbInStorePickUp));
		}
	}

	@Then("^in-stores information is hided$")
	public void in_stores_information_is_hided() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.rbInStorePickUp));
	}

	@Then("^Shipping date information is displayed$")
	public void shipping_date_information_is_displayed() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtEstArrival));
	}

	@Then("^user will verify if Shipping date information is displayed$")
	public void user_will_verify_if_Shipping_date_information_is_displayed() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtEstArrival));
	}

	@Then("^user click on the product name in cart page$")
	public void user_click_on_the_product_name_in_cart_page() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.lnkProducttext));
	}

	@When("^user will verify in-store pick up radio button is selected with \"(.*?)\"$")
	public void user_will_verify_in_store_pick_up_radio_button_is_selected_with(String arg1) throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			globalElementHeader.clickOnBurgerMenu();
			r2CartPo.selectStore(webPropHelper.getTestDataProperty(arg1));
			assertTrue(clickOnButton(r2CartPo.rbInStorePickUp));
		} else {
			r2CartPo.selectStore(webPropHelper.getTestDataProperty(arg1));
			assertTrue(clickOnButton(r2CartPo.rbInStorePickUp));
		}
	}

	@Then("^user will verify Shipping radio button is deselected$")
	public void user_will_verify_Shipping_radio_button_is_deselected() throws Throwable {

		if (!r2CartPo.rbShipToMe.isSelected()) {
			assertTrue(isDisplayed(r2CartPo.rbShipToMe));
		}
	}

	@Then("^user will verify if in-stores information is hidden$")
	public void user_will_verify_if_in_stores_information_is_hidden() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.rbShipToMe));
	}

	@Then("^verify user can begin checkout$")
	public void verify_user_can_begin_checkout() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2CartPo.btn_checkOut_OrderSummary));
		} else {
			assertTrue(clickOnButton(r2CartPo.btnCartCheckout));// btnCheckout
		}
	}

	@Then("^user clicks change \"(.*?)\" code$")
	public void user_clicks_change_code(String arg1) throws Throwable {
		assertTrue(clickOnButton(r2CartPo.lnkChangeZipCode));// changeZIPCode
		setInputText(r2CartPo.inputZipCode, webPropHelper.getTestDataProperty(arg1));// inputZIPCode
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		assertTrue(clickOnButton(r2CartPo.btnCartSubmit)); // submitZIPCode
	}

	@When("^user verify the Est\\.Arrival Tool Tip is present$")
	public void user_verify_the_Est_Arrival_Tool_Tip_is_present() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.iconTolltip));
	}

	@When("^user selects the Quantity field$")
	public void user_selects_the_Quantity_field() throws Throwable {
		assertTrue(isDisplayed(r2SanityPo.AS_inputQty));
	}

	@Then("^verfiy quantiy field is activated$")
	public void verfiy_quantiy_field_is_activated() throws Throwable {
		assertTrue(isEnabled(r2SanityPo.AS_inputQty));
	}

	@When("^user clicks on Move to Wish list link \"(.*?)\" OR exisiting wishlink$")
	public void user_clicks_on_Move_to_Wish_list_link_OR_exisiting_wishlink(String arg1) throws Throwable {
		assertTrue(clickOnButton(r2CartPo.btn_AddToWishList));

	}

	@Then("^user enter the Zipcode in \"(.*?)\"$")
	public void user_enter_the_Zipcode_in(String arg1) throws Throwable {
		r2CartPo.txtZipCode.clear();
		setInputText(r2CartPo.txtZipCode, webPropHelper.getTestDataProperty(arg1));
		assertTrue(clickOnButton(r2CartPo.btnZipCode));
		assertTrue(clickOnButton(r2CartPo.storeNames_txt));
		assertTrue(clickOnButton(r2CartPo.makeMyStore_btn));
		getDriver().navigate().refresh();
	}

	@Then("^user views a Disclaimer message$")
	public void user_views_a_Disclaimer_message() throws Throwable {
		assertTrue(isDisplayed(r2R1FunPO.Disclaimer_Txt));
	}

	@When("^clicks on Read More Link$")
	public void clicks_on_Read_More_Link() throws Throwable {
		assertTrue(clickOnButton(r2R1FunPO.SeeMore_lnk));
	}

	@Then("^a drawer is expanded to show full message$")
	public void a_drawer_is_expanded_to_show_full_message() throws Throwable {
		assertTrue(isDisplayed(r2R1FunPO.Disclaimer_Full_Txt));
	}

	// @Then("^item is moved from cart to the wish list$")
	// public void item_is_moved_from_cart_to_the_wish_list() throws Throwable {
	// assertTrue(isDisplayed(r2CartPo.continueShopping_btn));
	//
	//
	// }

	@Then("^in Product blade, radio button against In-store Pick-up should be suppressed$")
	public void in_Product_blade_radio_button_against_In_store_Pick_up_should_be_suppressed() throws Throwable {
		if (!r2CartPo.rbInStorePickUp.isSelected()) {
			assertTrue(isDisplayed(r2CartPo.rbInStorePickUp));
		}
	}

	@Then("^Ship to Me radio button should be selected by default$")
	public void ship_to_Me_radio_button_should_be_selected_by_default() throws Throwable {
		if (r2CartPo.rbShipToMe.isSelected()) {
			assertTrue(isEnabled(r2CartPo.rbShipToMe));
		}
	}

	@Then("^in Product blade, radio button against Ship to Me should be suppressed$")
	public void in_Product_blade_radio_button_against_Ship_to_Me_should_be_suppressed() throws Throwable {
		if (!r2CartPo.rbShipToMe.isSelected()) {
			assertTrue(isEnabled(r2CartPo.rbShipToMe));
		}
	}

	@When("^In-store pickup radio button should be selected by default$")
	public void in_store_pickup_radio_button_should_be_selected_by_default() throws Throwable {
		if (r2CartPo.rbInStorePickUp.isSelected()) {
			assertTrue(isDisplayed(r2CartPo.rbInStorePickUp));
		}
	}

	@Then("^User navigates till PDP of soccer Bundle items$")
	public void user_navigates_till_PDP_of_soccer_Bundle_items() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(2000);
			assertTrue(clickOnButton(r1PDPPO.btnSportsCategory_M));
			Thread.sleep(2000);
			assertTrue(clickOnButton(r2R1FunPO.Soccer_lnk_m));
			Thread.sleep(2000);
			assertTrue(clickOnButton(r2R1FunPO.Soccer_to_lnk));
			Thread.sleep(2000);
		} else {
			Thread.sleep(3000);
			assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
			Thread.sleep(2000);
			Actions hover = new Actions(getDriver());
			hover.moveToElement(r1PDPPO.btnSportsCategory_M).build().perform();
			Thread.sleep(2000);
			assertTrue(clickOnButton(r2R1FunPO.Soccer_lnk));
			Thread.sleep(2000);
		}
	}

	@Then("^user click on soccer item$")
	public void user_click_on_soccer_item() throws Throwable {
		assertTrue(clickOnButton(r2R1FunPO.Socceritem_lnk));
	}

	@Then("^User click on the product image of soccer item package$")
	public void user_click_on_the_product_image_of_soccer_item_package() throws Throwable {
		assertTrue(clickOnButton(r2R1FunPO.Socceritem_Pdp_lnk));
	}

	@Then("^Verify the nextstep functionality$")
	public void verify_the_nextstep_functionality() throws Throwable {
		Actions hover = new Actions(getDriver());
		hover.moveToElement(r2R1FunPO.Soccersize_btn);
		assertTrue(clickOnButton(r2R1FunPO.Soccersize_btn));
		assertTrue(clickOnButton(r1PDPPO.btnNextStep));
		assertTrue(clickOnButton(r2R1FunPO.Soccersize_btn));
		assertTrue(clickOnButton(r1PDPPO.btnNextStep));
		assertTrue(clickOnButton(r2R1FunPO.Soccersize_btn));
		assertTrue(clickOnButton(r1PDPPO.btnAddToCart1));

	}

	@Then("^Verify that Move to Wishlist Link is not displayed for Gift Card\\(s\\) and Bundle Item\\(s\\)$")
	public void verify_that_Move_to_Wishlist_Link_is_not_displayed_for_Gift_Card_s_and_Bundle_Item_s()
			throws Throwable {
		assertFalse(isDisplayed(r2CartPo.btn_AddToWishList));
	}

}
