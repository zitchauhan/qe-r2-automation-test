package com.aso.qe.test.stepdefinition.web;



import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_K3174_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_R1_Fun_PO r2R1FunPO=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_Sanity_PO r2SanityPo=PageFactory.initElements(driver,R2_Sanity_PO.class);
	
	
	@Then("^user clicks on one of the category and navigates to LOne Instore Pickup$")
	public void user_clicks_on_one_of_the_category_and_navigates_to_LOne_page_Instore_Pickup() throws Throwable {
		   if("mobile".equalsIgnoreCase(testtype)){      
			  // waitForElement(r2SanityPo.AS_btnShopCategory_m);
				//assertTrue((clickOnButton(r2SanityPo.AS_btnShopCategory_m)));
				assertTrue(clickOnButton(r2R1FunPO.btnOutdoorCategory));
				Thread.sleep(3000);
        }else {
        	waitForElement(r2SanityPo.AS_btnShopCategory);
    		assertTrue((clickOnButton(r2SanityPo.AS_btnShopCategory)));
    		assertTrue(clickOnButton(r2R1FunPO.btnOutdoorCategory));
    		Thread.sleep(3000);
        }
				
	}
	@Then("^user clicks on one of the subcategory and navigates to LTwo Instore Pickup$")
	public void user_clicks_on_one_of_the_subcategory_and_navigates_to_LTwo_page_Instore_Pickup() throws Throwable {
		   if("mobile".equalsIgnoreCase(testtype)){      
			   waitForElement(r2R1FunPO.secCategory_CLPMobile);
				assertTrue(clickOnButton(r2R1FunPO.secCategory_CLPMobile));
				assertTrue(clickOnButton(r2R1FunPO.productPLP_m));
				Thread.sleep(3000);
        }else {
        	waitForElement(r2R1FunPO.secCategory_CLP);
    		assertTrue(clickOnButton(r2R1FunPO.secCategory_CLP));
    		assertTrue(clickOnButton(r2R1FunPO.productPLP));
    		Thread.sleep(3000);
        }
		

	}
	@Then("^user clicks on one of the product category and navigates to LThree Instore Pickup$")
	public void user_clicks_on_one_of_the_product_category_and_navigates_to_LThree_page_Instore_Pickup() throws Throwable {
		   if("mobile".equalsIgnoreCase(testtype)){      
			   waitForElement(r2R1FunPO.AS_productPLP1_m);
	    		assertTrue(clickOnButton(r2R1FunPO.AS_productPLP1_m));
	    		Thread.sleep(3000);
        }else {
        	waitForElement(r2SanityPo.AS_productPLP1);
    		assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
    		Thread.sleep(3000);
        }
		
	}
/*	
	@Then("^user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers$")
	public void user_should_see_unselected_checkbox_acknowledgement_with_appropriate_age_restriction_disclaimers() throws Throwable {
	    assertTrue(isDisplayed(r2CheckoutPo.Checkout_SeeInStorePickupInstructions_chk));
	    assertTrue(isDisplayed(r2CheckoutPo.Checkout_SeeInStorePickupInstructionsAgeRestriction_txt));
	}
	
	@Then("^user click on edit button in ship to store$")
	public void user_click_on_edit_button_in_ship_to_store() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.checkoutEditShipToStore_btn));
	}*/

	/*@Then("^user click on checkbox in special order ship to store section$")
	public void user_click_on_checkbox_in_special_order_ship_to_store_section() throws Throwable {
	  
	}

	@Then("^user click on go to payment section$")
	public void user_click_on_go_to_payment_section() throws Throwable {
	   
	}*/
}
