package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_AutomationSanitySuite_SD extends CommonActionHelper 
{
	
	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	public SearchProductPO searchProductPO =  PageFactory.initElements(driver, SearchProductPO.class);

	@When("^user navigates to PDP page$")
	public void user_navigates_to_PDP_page() throws Throwable {
	    
	}

	@Then("^user is navigated to Add to cart Notification popup$")
	public void user_is_navigated_to_Add_to_cart_Notification_popup() throws Throwable {
	   
	}

	@When("^navigates to PDP page$")
	public void navigates_to_PDP_page() throws Throwable {
	   
	}

	@Then("^user will click on View Cart button$")
	public void user_will_click_on_View_Cart_button() throws Throwable {
	    
	}

	@Then("^user navigate to Cart page$")
	public void user_navigate_to_Cart_page() throws Throwable {
	    
	}

	@Then("^verify Order Summary in Cart$")
	public void verify_Order_Summary_in_Cart() throws Throwable {
	    
	}

	@Then("^apply /fire condition based promotions once the cart has verified that correct conditions have been met$")
	public void apply_fire_condition_based_promotions_once_the_cart_has_verified_that_correct_conditions_have_been_met() throws Throwable {
	    
	}

	@Then("^customer must see the following at Order Summary in Cart\\(Promo Code and associated discount as -\\$XX\\.XX \\(must be total order discount\\) And Total price must be updated to reflect discount\\)$")
	public void customer_must_see_the_following_at_Order_Summary_in_Cart_Promo_Code_and_associated_discount_as_$XX_XX_must_be_total_order_discount_And_Total_price_must_be_updated_to_reflect_discount() throws Throwable {
	    
	}

	@Then("^user click on guest user$")
	public void user_click_on_guest_user() throws Throwable {
	   
	}

	@When("^user enters promocode And clicks on Apply$")
	public void user_enters_promocode_And_clicks_on_Apply() throws Throwable {
	    
	}

	@When("^user must see the following details Promo Code and associated discount And Total price$")
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
	   
	}

	@Then("^user view Applied Promotions/Discounts \\(promo code, Military ID, Promotions\\)$")
	public void user_view_Applied_Promotions_Discounts_promo_code_Military_ID_Promotions() throws Throwable {
	   
	}

	@Then("^user verifiy Order Total$")
	public void user_verifiy_Order_Total() throws Throwable {
	   
	}

	@When("^incrases the \"(.*?)\" to X$")
	public void incrases_the_to_X(String arg1) throws Throwable {
	  
	}

	@When("^modified quantity should get updated$")
	public void modified_quantity_should_get_updated() throws Throwable {
	   
	}

	@Then("^Order Summary should get recalculated$")
	public void order_Summary_should_get_recalculated() throws Throwable {
	    
	}

	@Then("^user should be able to see the increased quantity and Price in Cart Order summary$")
	public void user_should_be_able_to_see_the_increased_quantity_and_Price_in_Cart_Order_summary() throws Throwable {
	    
	}

	@Then("^click the Remove Quantity link$")
	public void click_the_Remove_Quantity_link() throws Throwable {
	   
	}

	@Then("^verify item is removed from the cart$")
	public void verify_item_is_removed_from_the_cart() throws Throwable {
	   
	}

	@Then("^user click on continue shopping$")
	public void user_click_on_continue_shopping() throws Throwable {
	   
	}

	@Then("^User is able to see the selected variant image as thumbnail$")
	public void user_is_able_to_see_the_selected_variant_image_as_thumbnail() throws Throwable {
	    
	}
	
	@Then("^user clicks on the burger menu$")
	public void user_clicks_on_the_burger_menu() throws Throwable {
	    
	}

	
	

}
