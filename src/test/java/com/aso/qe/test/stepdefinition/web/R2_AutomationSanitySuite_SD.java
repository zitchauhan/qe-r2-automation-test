package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_AutomationSanitySuite_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_AutomationSanitySuite_SD.class);
	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(getDriver(), R2_Cart_PO.class);
	
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
	public void user_is_navigated_to_Add_to_cart_Notification_popup() throws Throwable {
		Thread.sleep(2000);
		assertTrue(isDisplayed(r2SanityPo.AS_txtItemAddedSuccessfully));
		assertTrue(isDisplayed(pdpPageObj.btnViewCart));
		assertTrue(isDisplayed(pdpPageObj.btnCheckout));
		
	}

	@And("^user will click on View Cart button$")
	public void user_will_click_on_View_Cart_button() throws Throwable {
		assertTrue(clickOnButton(pdpPageObj.btnViewCart));
		Thread.sleep(3000);
	}
	
	@And("^user navigate to Cart page$")
	public void user_navigate_to_Cart_page() throws Throwable {
		Thread.sleep(2000);
		assertTrue(isDisplayed(r2SanityPo.AS_txtYourCart));
	}
	
		
	
	@When("^enter the \"(.*?)\" to X$")
	public void enter_the_to_X(String arg1) throws Throwable {
		quantityprice = r2SanityPo.AS_txtQuantityPrice.getText();
	    logger.info("Quantity:"+quantityprice);
	    Thread.sleep(1000);
		r2SanityPo.AS_inputQty.clear();
		Thread.sleep(1000);
		setInputText(r2SanityPo.AS_inputQty, webPropHelper.getTestDataProperty(arg1));
		Thread.sleep(1000);
		r2SanityPo.AS_clkOutside.click();
		Thread.sleep(1000);
	}

	@And("^modified quantity should get updated$")
	public void modified_quantity_should_get_updated() throws Throwable {
		Thread.sleep(1000);
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
		Thread.sleep(5000);
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

	@Then("^user clicks on one of the subcategory and navigates to LTwo$")
	public void user_clicks_on_one_of_the_subcategory_and_navigates_to_LTwo_page() throws Throwable {
		waitForElement(r2SanityPo.AS_secCategory_CLP);
		assertTrue(clickOnButton(r2SanityPo.AS_secCategory_CLP));
		Thread.sleep(3000);

	}


	@Then("^user clicks on one of the product category and navigates to LThree$")
	public void user_clicks_on_one_of_the_product_category_and_navigates_to_LThree_page() throws Throwable {
		waitForElement(r2SanityPo.AS_productPLP1);
		assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
		Thread.sleep(3000);
	}
	
	
	@Then("^user click on Add to Cart Button$")
	public void user_click_on_Add_to_cart_button() throws Throwable {
		waitForElement(r2SanityPo.AS_btnAddToCart);
		assertTrue(clickOnButton(r2SanityPo.AS_btnAddToCart));
		Thread.sleep(2000);
	}
	
	@And("^user is able to see the product category name in section title$")
	public void user_is_able_to_see_the_product_category_name_in_section_title() throws Throwable {

		assertTrue(isDisplayed(r2SanityPo.AS_txtSectionTitle));//Its authorable from AEM, Only validating the presence of section

	}
	
	@Then ("^User navigates to LThree$")
	public void User_navigates_to_L3() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)){
			Thread.sleep(2000);
			assertTrue(clickOnButton(r2SanityPo.AS_btnClothingCategory));
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
		}

	}
	
	@Then("^user clicks on the product card and navigates to PDP$")
	public void user_clicks_on_the_product_card_and_navigates_to_PDP_of_the_product() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2SanityPo.AS_productPLP1_Mobile));
		}else {
			Thread.sleep(2000);
			assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
		}


	}
	@Then("^user click on the product image in cart page$")
	public void user_click_on_the_product_image_in_cart_page() throws Throwable {
		assertTrue(clickOnButton(r2SanityPo.AS_productImage));
	} 
}
