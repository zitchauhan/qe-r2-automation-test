package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_AutomationSanitySuite_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_AutomationSanitySuite_SD.class);
	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);
	
	
	@Then("^user clicks on the burger menu$")
	public void user_clicks_on_the_burger_menu() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnBurgerMenu));
	}
	
	@And("^verify Order Summary in Cart$")
	public void verify_Order_Summary_in_Cart() throws Throwable {
		r2SanityPo.verifyOrderSummaryOnCartPage();
	}

	@Then("^apply /fire condition based promotions once the cart has verified that correct conditions have been met$")
	public void apply_fire_condition_based_promotions_once_the_cart_has_verified_that_correct_conditions_have_been_met() throws Throwable {
	   
	}

	@And("^customer must see the following at Order Summary in Cart\\(Promo Code and associated discount as -\\$XX\\.XX \\(must be total order discount\\) And Total price must be updated to reflect discount\\)$")
	public void customer_must_see_the_following_at_Order_Summary_in_Cart_Promo_Code_and_associated_discount_as_$XX_XX_must_be_total_order_discount_And_Total_price_must_be_updated_to_reflect_discount() throws Throwable {
	    
	}

	@When("^navigates to PDP page$")
	public void navigates_to_PDP_page() throws Throwable {
	   
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
		Thread.sleep(1000);
	}
	
	@And("^user navigate to Cart page$")
	public void user_navigate_to_Cart_page() throws Throwable {
		assertTrue(isDisplayed(r2SanityPo.AS_txtYourCart));
	}

	@When("^incrases the \"(.*?)\" to X$")
	public void incrases_the_to_X(String arg1) throws Throwable {
		Thread.sleep(1000);
		String quantityprice = r2SanityPo.AS_txtQuantityPrice.getText();
	    logger.info("Quantity:"+quantityprice);
	    Thread.sleep(1000);
		r2SanityPo.AS_inputQty.clear();
		Thread.sleep(1000);
		setInputText(r2SanityPo.AS_inputQty, arg1);
		Thread.sleep(1000);
		r2SanityPo.AS_clkOutside.click();
		Thread.sleep(1000);
		
	}

	@And("^modified quantity should get updated$")
	public void modified_quantity_should_get_updated() throws Throwable {
		Thread.sleep(1000);
		String quantity = r2SanityPo.AS_inputQty.getText();
	    logger.info("Modified Quantity:"+quantity);
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

	/*@And("^user click on Add to cart button$")
	public void user_click_on_Add_to_cart_button() throws Throwable {
	    
	}*/

	@Then("^click the Remove Quantity link$")
	public void click_the_Remove_Quantity_link() throws Throwable {
		assertTrue(clickOnButton(r2SanityPo.AS_btnRemoveFromCart));
		Thread.sleep(50000);
	}

	@And("^verify item is removed from the cart$")
	public void verify_item_is_removed_from_the_cart() throws Throwable {
		assertFalse(isDisplayed(r2SanityPo.AS_btnRemoveFromCart));
	    
	}


	@And("^user click on guest user$")
	public void user_click_on_guest_user() throws Throwable {
	    
	}
	
	@When("^user enters promocode And clicks on Apply$")
	public void user_enters_promocode_And_clicks_on_Apply() throws Throwable {
	    
	}
	
	@And("^user must see the following details Promo Code and associated discount And Total price$")
	public void user_must_see_the_following_details_Promo_Code_and_associated_discount_And_Total_price() throws Throwable {
	    
	}
	
	@When("^user clicks on Remove promocode$")
	public void user_clicks_on_Remove_promocode() throws Throwable {
	    
	}
	
	@Then("^promocode should get removed and associated discount should get remove And Total price must be updated with reflect amount$")
	public void promocode_should_get_removed_and_associated_discount_should_get_remove_And_Total_price_must_be_updated_with_reflect_amount() throws Throwable {
	    
	}
	
	@Then("^user view the items in order summary details \\(Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes\\)$")
	public void user_view_the_items_in_order_summary_details_Subtotal_Estimated_Shipping_In_Store_Pickup_Estimated_Taxes() throws Throwable {
		
		r2SanityPo.verifyOrderSummaryOnCartPage();
	}

	@And("^user view and Applied Promotions/Discounts\"(.*?)\" \\(promo code, Military ID, Promotions\\)$")
	public void user_view_and_Applied_Promotions_Discounts_promo_code_Military_ID_Promotions(String promo) throws Throwable{
		r2SanityPo.verifyAppliedPromoOnCartPage(promo);
	}

	@Then("^user verifiy Order Total$")
	public void user_verifiy_Order_Total() throws Throwable {
		assertTrue(isDisplayed(r2SanityPo.AS_txtTotalCart));
	}
	
	@And("^User click on continue shopping$")
	public void user_click_on_continue_shopping() throws Throwable {
	    
	}

	@And("^User is able to see the selected variant image as thumbnail$")
	public void user_is_able_to_see_the_selected_variant_image_as_thumbnail() throws Throwable {
	    
	}
	
	@And("^User navigates to PDP page$")
	public void user_navigates_to_PDP_page() throws Throwable {
		

	}
	
	
	@Then("^user clicks on one of the category and navigates to LOne$")
	public void user_clicks_on_one_of_the_category_and_navigates_to_LOne_page() throws Throwable {
		assertTrue((clickOnButton(r2SanityPo.AS_btnShopCategory)));
		assertTrue(clickOnButton(r2SanityPo.AS_btnClothingCategory));
		//Thread.sleep(20000);

	}

	@Then("^user clicks on one of the subcategory and navigates to LTwo$")
	public void user_clicks_on_one_of_the_subcategory_and_navigates_to_LTwo_page() throws Throwable {
		assertTrue(clickOnButton(r2SanityPo.AS_secCategory_CLP));
		//Thread.sleep(20000);

	}


	@Then("^user clicks on one of the product category and navigates to LThree$")
	public void user_clicks_on_one_of_the_product_category_and_navigates_to_LThree_page() throws Throwable {
		assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
		//Thread.sleep(20000);
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
			Actions hover = new Actions(getDriver());
			hover.moveToElement(r2SanityPo.AS_btnClothingCategory).build().perform();
			assertTrue(clickOnButton(r2SanityPo.AS_btnMensShirt_Men_Clothing_Shop));
		}

	}
	
	
	@Then("^user clicks on the product card and navigates to PDP$")
	public void user_clicks_on_the_product_card_and_navigates_to_PDP_of_the_product() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2SanityPo.AS_productPLP1_Mobile));
		}else {
			assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
		}


	}
	@Then("^user click on the product image in cart page$")
	public void user_click_on_the_product_image_in_cart_page() throws Throwable {
		assertTrue(clickOnButton(r2SanityPo.AS_productImage));
	} 
		
	

}
