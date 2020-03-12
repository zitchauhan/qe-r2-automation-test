package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertTrue;

import java.security.KeyStore.SecretKeyEntry;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_HomePage_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_AutomationSanitySuite_SD extends CommonActionHelper 
{
	private static final Logger logger = Logger.getLogger(R2_AutomationSanitySuite_SD.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(getDriver(), R2_Cart_PO.class);
	R1_HomePage_PO r1HomePagePO = PageFactory.initElements(getDriver(), R1_HomePage_PO.class);
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);

	public String quantityprice;
	public String modifiedQuantityprice;

	@Then("^user clicks on the burger menu$")
	public void user_clicks_on_the_burger_menu() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnBurgerMenu));
	}
	@And("^verify Order Summary in Cart$")
	public void verify_Order_Summary_in_Cart() throws Throwable {
		r2SanityPo.verifyOrderSummaryOnCartPage();
	}
	@Then("^user is navigated to Add to cart Notification popup$")
	public void user_is_navigated_to_Add_to_cart_Notification_popup() throws Throwable 
	{
		/*Thread.sleep(2000);
		assertTrue(isDisplayed(r2SanityPo.AS_txtItemAddedSuccessfully));
		assertTrue(isDisplayed(pdpPageObj.btnViewCart));
		assertTrue(isDisplayed(pdpPageObj.btnCheckout));*/

	}
	/*Modified by rahul on 22.07.19*/
	@And("^user will click on View Cart button$")
	public void user_will_click_on_View_Cart_button() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) 
		{
			Thread.sleep(Constants.thread_high); 
			assertTrue(isDisplayed(pdpPageObj.btnViewCart_m));
			assertTrue(clickOnButton(pdpPageObj.btnViewCart_m));
			
			Thread.sleep(Constants.thread_medium);
			assertTrue(isDisplayed(r2CartPo.btnCartCheckout));
		}
		else 
		{
			Thread.sleep(Constants.thread_medium); 
			assertTrue(clickOnButton(pdpPageObj.btnViewCart));

			/**Modified from here***/
			
			Thread.sleep(Constants.thread_medium);
			assertTrue(isDisplayed(r2SanityPo.AS_btnCheckOutTop));
		}
	}
	
	@And("^user click on pick up  pdp button$")
	public void user_click_on_pick_up_pdp_button() throws Throwable {
		Thread.sleep(4000);
		isDisplayed(genericPO.PICKUPButtonPDP);
		genericPO.PICKUPButtonPDP.click(); 
	}
	
	@Then("verify shipping text in Add to cart popup$")
	public void verifyShippingTextInCartPopup() throws InterruptedException 
	{
		Thread.sleep(Constants.thread_medium);
		assertTrue(isDisplayed(pdpPageObj.shippingTxtInCartPopup));
	}
	
	@Then("verify pick up text in Add to cart popup$")
	public void verify_pick_up_text_in_Add_to_cart_popup() throws InterruptedException{
		Thread.sleep(Constants.thread_medium);
		assertTrue(isDisplayed(pdpPageObj.pickupTxtInCartPopup));
	}
	
	@And("^user navigate to Cart page$")
	public void user_navigate_to_Cart_page() throws Throwable {
		//Thread.sleep(2000);
		//assertTrue(isDisplayed(r2SanityPo.AS_txtYourCart));
	}
	@When("^enter the \"(.*?)\" to X$")
	public void enter_the_to_X(String arg1) throws Throwable {
		waitForElement(r2SanityPo.AS_txtQuantityPrice);
		quantityprice = r2SanityPo.AS_txtQuantityPrice.getText();
		logger.info("Quantity:"+quantityprice);
		Thread.sleep(Constants.thread_low); 
		r2SanityPo.AS_inputQty.clear();
		Thread.sleep(Constants.thread_low); 
		setInputText(r2SanityPo.AS_inputQty, webPropHelper.getTestDataProperty(arg1));
		Thread.sleep(Constants.thread_low); 
		r2SanityPo.AS_clkOutside.click();
		Thread.sleep(Constants.thread_low); 
	}

	@When("^enter the \"(.*?)\" to Y$")
	public void enter_the_to_Y(String arg1) throws Throwable {
		waitForElement(r2SanityPo.AS_txtQuantityPrice);
		quantityprice = r2SanityPo.AS_txtQuantityPrice.getText();
		logger.info("Quantity:"+quantityprice);
		Thread.sleep(Constants.thread_low); 
		r2SanityPo.AS_inputQty.clear();
		Thread.sleep(Constants.thread_low); 
		setInputText(r2SanityPo.AS_inputQty, webPropHelper.getTestDataProperty(arg1));
		Thread.sleep(Constants.thread_low); 
		r2SanityPo.AS_clkOutside.click();
		Thread.sleep(Constants.thread_highest); 
	}

	@When("^enter the \"(.*?)\" to Z$")
	public void enter_the_to_Z(String arg1) throws Throwable {
		waitForElement(r2SanityPo.AS_txtQuantityPrice);
		quantityprice = r2SanityPo.AS_txtQuantityPrice.getText();
		logger.info("Quantity:"+quantityprice);
		Thread.sleep(Constants.thread_low); 
		r2SanityPo.AS_inputQty.clear();
		Thread.sleep(Constants.thread_low); 
		setInputText(r2SanityPo.AS_inputQty, webPropHelper.getTestDataProperty(arg1));
		Thread.sleep(Constants.thread_low); 
		r2SanityPo.AS_clkOutside.click();
		Thread.sleep(Constants.thread_highest); 
	}

	@And("^modified quantity should get updated$")
	public void modified_quantity_should_get_updated() throws Throwable {
		Thread.sleep(Constants.thread_low); 
		modifiedQuantityprice = r2SanityPo.AS_txtQuantityPrice.getText();
		if(!modifiedQuantityprice.equals(quantityprice)) {
			logger.info("Quantity Price are modified");
		}else
		{
			logger.info("Quantity Price are not modified");
		}

	}

	@Then("^Order Summary should get recalculated$")
	public void order_Summary_should_get_recalculated() throws Throwable {
		r2SanityPo.verifyRecalculatedOrderSummaryOnCartPage();
	}

	@And("^user should be able to see the increased quantity and Price in Cart Order summary$")
	public void user_should_be_able_to_see_the_increased_quantity_and_Price_in_Cart_Order_summary() throws Throwable {
		String quantity = r2SanityPo.AS_inputQty.getText();
		logger.info("Modified Quantity:"+quantity);

		String increasedquantityprice = r2SanityPo.AS_txtQuantityPrice.getText();
		logger.info("Modified Quantity:"+increasedquantityprice);
		if(!quantity.equals(increasedquantityprice)) {
			logger.debug("Quantity is increased");
		} else
		{
			logger.debug("Quantity is not increased");
		}    
	}

	@Then("^click the Remove Quantity link$")
	public void click_the_Remove_Quantity_link() throws Throwable {
		assertTrue(clickOnButton(r2SanityPo.AS_btnRemoveFromCart));
		Thread.sleep(Constants.thread_medium);
	}

	@And("^verify item is removed from the cart$")
	public void verify_item_is_removed_from_the_cart() throws Throwable {
		waitForElement(r2CartPo.btnCrtSignIn);
		assertTrue(isDisplayed(r2CartPo.btnCrtSignIn));

	}


	@Then("^user view the items in order summary details \\(Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes\\)$")
	public void user_view_the_items_in_order_summary_details_Subtotal_Estimated_Shipping_In_Store_Pickup_Estimated_Taxes() throws Throwable {

		r2SanityPo.verifyOrderSummaryOnCartPage();
	}

	@And("^user view and Applied Promotions/Discounts\"(.*?)\" \\(promo code, Military ID, Promotions\\)$")
	public void user_view_and_Applied_Promotions_Discounts_promo_code_Military_ID_Promotions() throws Throwable{
		//		r2SanityPo.verifyAppliedPromoOnCartPage();
	}

	@Then("^user verifiy Order Total$")
	public void user_verifiy_Order_Total() throws Throwable {
		assertTrue(isDisplayed(r2SanityPo.AS_txtTotalCart));
	}


	@Then("^user clicks on one of the category and navigates to LOne$")
	public void user_clicks_on_one_of_the_category_and_navigates_to_LOne_page() throws Throwable {
		waitForElement(r2SanityPo.AS_btnShopCategory);
		assertTrue((clickOnButton(r2SanityPo.AS_btnShopCategory)));
		assertTrue(clickOnButton(r2SanityPo.AS_btnClothingCategory));
		Thread.sleep(3000);

	}


	@Then ("^User Navigates L2 form Homepage Header$")
	public void User_Navigates_L2_form_HomepageHeader() throws Exception 
	{
		waitForPageLoad(getDriver());
		globalElementHeader.navigateL2HeaderToPLP();
	}
	
	@Then ("^User Navigates L2 Dicountless product from Homepage Header$")
	public void User_Navigates_L2_Dicountless_product_from_HomepageHeader() throws Exception 
	{
		waitForPageLoad(getDriver());
		globalElementHeader.navigateL2DicountLessHeaderToPLP();
	}
	
	@Then ("^User clicks on product in PLP$")
	public void User_clicks_on_product_in_PLP() throws Exception 
	{
		waitForPageLoad(getDriver());
		clickOnButton(r2SanityPo.AS_productPLP1);
	}


	@Then("^user clicks on one of the subcategory and navigates to LTwo$")
	public void user_clicks_on_one_of_the_subcategory_and_navigates_to_LTwo_page() throws Throwable 
	{
		//////////////////////-hitain-CR----------->
		/*waitForElement(r2SanityPo.AS_secCategory_CLP);
		assertTrue(clickOnButton(r2SanityPo.AS_secCategory_CLP));
		Thread.sleep(3000);*/

	}


	@Then("^user clicks on one of the product category and navigates to LThree$")
	public void user_clicks_on_one_of_the_product_category_and_navigates_to_LThree_page() throws Throwable {
		waitForElement(r2SanityPo.AS_productPLP1);
		waitForPageLoad(getDriver());
		Thread.sleep(Constants.thread_medium);
		assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
		Thread.sleep(Constants.thread_medium);
	}

	//DELETE BELOW AFTER ALL "Add to Cart" has been changed to Ship It
	@Then("^user click on Add to Cart Button$")
	public void user_click_on_Add_to_cart_button() throws Throwable 
	{
		waitForPageLoad(getDriver());
		pdpPageObj.addToCartAvailability();
		waitForElement(pdpPageObj.btnAddToCart);
		assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
		//Thread.sleep(2000);
	}
	@Then("^user click on checkout button in continue shopping$")
	public void user_click_on_checkout_button_in_continue_shopping() throws Throwable {
		waitForPageLoad(getDriver());
		assertTrue(clickOnButton(pdpPageObj.btnCheckoutbuttonon_continueshopping));
	   
	}

	@Then("^user click on Ship It Button$")
	public void user_click_on_Ship_It_button() throws Throwable 
	{
		waitForPageLoad(getDriver());
		pdpPageObj.addToCartAvailability();
		waitForElement(pdpPageObj.shipItButton);
		assertTrue(clickOnButton(pdpPageObj.shipItButton));
		//Thread.sleep(2000);
	}

	@And("^user is able to see the product category name in section title$")
	public void user_is_able_to_see_the_product_category_name_in_section_title() throws Throwable {

		//assertTrue(isDisplayed(r2SanityPo.AS_txtSectionTitle));//Its authorable from AEM, Only validating the presence of section

	}

	@Then ("^User navigates to LThree$")
	public void User_navigates_to_L3() throws Exception 
	{
		//////////////////////-hitain-CR----------->

		globalElementHeader.navigateL2HeaderToPLP();



		/*if("mobile".equalsIgnoreCase(testtype))
		{
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.btnClothingCategory)); //4Sep
			Thread.sleep(2000);
			assertTrue(clickOnButton(r2SanityPo.AS_btnMen_Clothing_Shop));
			Thread.sleep(2000);
			assertTrue(clickOnButton(r2SanityPo.AS_btnMensShirt_Men_Clothing_Shop));
			Thread.sleep(4000);

		}else{
			assertTrue(clickOnButton(r2SanityPo.AS_btnShopCategory));
			assertTrue(clickOnButton(r2SanityPo.AS_btnClothingCategory));
			//Actions hover = new Actions(getDriver());
			//hover.moveToElement(r2SanityPo.AS_btnClothingCategory).build().perform();
			assertTrue(clickOnButton(r2SanityPo.AS_btnMen_Clothing_Shop));//danush
			assertTrue(clickOnButton(r2SanityPo.AS_btnMensShirt_Men_Clothing_Shop));
		}*/

	}

	@Then("^user clicks on the product card and navigates to PDP$")
	public void user_clicks_on_the_product_card_and_navigates_to_PDP_of_the_product() throws Throwable {
		waitForPageLoad(getDriver());
		if("mobile".equalsIgnoreCase(testtype)) 
		{
			assertTrue(clickOnButton(r2SanityPo.AS_productPLP1_Mobile));
		}
		else 
		{
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
		}


	}
	@Then("^user click on the product image in cart page$")
	public void user_click_on_the_product_image_in_cart_page() throws Throwable {
		assertTrue(clickOnButton(r2SanityPo.AS_productImage));
	} 

	@Then("^user is navigated to checkout page$")
	public void user_is_navigated_to_checkout_page() throws Throwable {
		Thread.sleep(5000);
		assertTrue(isDisplayed(r2SanityPo.headerCheckout));
	}


	@Then("^user enter the valid emailaddress \"(.*?)\" from checkout page$")
	public void user_enter_the_valid_emailaddress_from_checkout_page(String arg1) throws Throwable {
		setInputText(r1HomePagePO.inputEmail, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enter the valid password \"(.*?)\" from checkout page$")
	public void user_enter_the_valid_password_from_checkout_page(String arg1) throws Throwable {
		setInputText(r1HomePagePO.inputPassword, webPropHelper.getTestDataProperty(arg1));
	}

	@When("^user clicks on signout link in myaccount list$")
	public void user_clicks_on_signout_link_in_myaccount_list() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			if(!(isDisplayed(r2MyAccountPo.signOut_Mobile_lnk)))
				assertTrue(clickOnButton(r2MyAccountPo.myAccount_txt_Mobile));
			assertTrue(clickOnButton(r2MyAccountPo.signOut_Mobile_lnk));
		}
		else
		{
			assertTrue(clickOnButton(r2MyAccountPo.myAccount));
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(r2MyAccountPo.signOut_lnk));	
			Thread.sleep(Constants.thread_low);

		}



	}

}
