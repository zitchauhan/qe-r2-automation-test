package com.aso.qe.test.stepdefinition.web;



import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_SIT_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_K3613_SD extends CommonActionHelper {
	
	R2_Cart_PO r2CartPO=PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_R1_Fun_PO r2R1FunPO=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_Sanity_PO r2SanityPo=PageFactory.initElements(driver,R2_Sanity_PO.class);
	R1_FindStore_PO findStorePo=PageFactory.initElements(driver,R1_FindStore_PO.class);
	R1_PDP_PO pdpPo=PageFactory.initElements(driver,R1_PDP_PO.class);
	
	String limitedStockMessage="";
	int addedQuantityInCart=0;
	
	
	@When("^clicks on the Select Store link in the header$")
	public void clicks_on_the_Select_Store_link_in_the_header() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype))
				{
			assertTrue(clickOnButton(r2CartPO.lnkFindAStore_M));
				}else
				{
		assertTrue(clickOnButton(r2CartPO.lnkFindaStoreHomePage));
				}
	}

	@Then("^user should be able to see the Find a Store modal prompting up$")
	public void user_should_be_able_to_see_the_Find_a_Store_modal_prompting_up() throws Throwable {
		assertTrue(isDisplayed(r2CartPO.fieldStoreModal));		
	}
	
	@Then("^user enters ZIP \"(.*?)\" code manually in the search input bar$")
	public void user_enters_ZIP_code_manually_in_the_search_input_bar(String zipcode) throws Throwable {
		waitForElement(r2CartPO.textzipCode);
		setInputText(r2CartPO.textzipCode,  webPropHelper.getTestDataProperty(zipcode));
	}

	@Then("^Clicks submit button$")
	public void clicks_submit_button() throws Throwable {
		assertTrue(clickOnButton(r2CartPO.submitZipCode));		
	}

	@Then("^store results should get displayed on the basis of ZIPCode entered$")
	public void store_results_should_get_displayed_on_the_basis_of_ZIPCode_entered() throws Throwable {
		assertTrue(isDisplayed(r2CartPO.storeDetails));
		Thread.sleep(Constants.thread_medium);
		
	}

	@Then("^user clicks on one of the category and navigates to LOne SOF$")
	public void user_clicks_on_one_of_the_category_and_navigates_to_LOne_page_SOF() throws Throwable {
		   if("mobile".equalsIgnoreCase(testtype)){      
			  // waitForElement(r2SanityPo.AS_btnShopCategory_m);
				//assertTrue((clickOnButton(r2SanityPo.AS_btnShopCategory_m)));
				assertTrue(clickOnButton(r2R1FunPO.btnOutdoorCategory));
				Thread.sleep(Constants.thread_medium);
        }else {
        	waitForElement(r2SanityPo.AS_btnShopCategory);
    		assertTrue((clickOnButton(r2SanityPo.AS_btnShopCategory)));
    		assertTrue(clickOnButton(r2R1FunPO.btnOutdoorCategory));
    		Thread.sleep(Constants.thread_medium);
        }
				
	}
	@Then("^user clicks on one of the subcategory and navigates to LTwo SOF$")
	public void user_clicks_on_one_of_the_subcategory_and_navigates_to_LTwo_page_SOF() throws Throwable {
		   if("mobile".equalsIgnoreCase(testtype)){      
			   waitForElement(r2R1FunPO.secCategory_CLPMobile);
				assertTrue(clickOnButton(r2R1FunPO.secCategory_CLPMobile));
				assertTrue(clickOnButton(r2R1FunPO.productPLP_m));
				Thread.sleep(Constants.thread_medium);
        }else {
        	waitForElement(r2R1FunPO.secCategory_CLP);
    		assertTrue(clickOnButton(r2R1FunPO.secCategory_CLP));
    		assertTrue(clickOnButton(r2R1FunPO.productPLP));
    		Thread.sleep(Constants.thread_medium);
        }
		

	}
	@Then("^user clicks on one of the product category and navigates to LThree SOF$")
	public void user_clicks_on_one_of_the_product_category_and_navigates_to_LThree_page_SOF() throws Throwable {
		   if("mobile".equalsIgnoreCase(testtype)){      
			   waitForElement(r2R1FunPO.AS_productPLP1_m);
	    		assertTrue(clickOnButton(r2R1FunPO.AS_productPLP1_m));
	    		Thread.sleep(Constants.thread_medium);
        }else {
        	waitForElement(r2SanityPo.AS_productPLP1);
    		assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
    		Thread.sleep(Constants.thread_medium);
        }
		
	}
	
	@Then("^clicks on the Change Pickup Location link$")
	public void clicks_on_the_Change_Pickup_Location_link() throws Throwable {
		isDisplayed(r2R1FunPO.ChooseLocation_Lnk);
		Thread.sleep(Constants.thread_medium);
		assertTrue(clickOnButton(r2R1FunPO.ChooseLocation_Lnk));   
	}

	@Then("^user should be able to see the Find a Store modal$")
	public void user_should_be_able_to_see_the_Find_a_Store_modal() throws Throwable {
		assertTrue(isDisplayed(r2CartPO.fieldStoreModal)); 
	}
	
	@And("^user verify the store corresponding to zipcode entered \"(.*?)\"$")
	public void user_verify_the_store_corresponding_to_zipcode_entered(String zipcode) {
		boolean flag=false;
		System.err.println("Expected: "+webPropHelper.getTestDataProperty(zipcode)+ " we get :" +findStorePo.storeZipCode.getText());
		flag= findStorePo.storeZipCode.getText().contains(webPropHelper.getTestDataProperty(zipcode));
		if(flag) {
			assertTrue(flag);
		}
		else {
			assertTrue(flag);
		}
	}
	
	@Then("^user verify the limited stock message$")
	public void user_verify_the_limited_stock_message() {
		waitForElement(r2CartPO.txtLimitedStockPDP);
		limitedStockMessage=r2CartPO.txtLimitedStockPDP.getText();
		String arr[] = limitedStockMessage.split("to");
		String arr1[]=arr[1].split(" ");
		addedQuantityInCart=Integer.parseInt(arr1[1]);
		assertTrue(isDisplayed(r2CartPO.txtLimitedStockPDP));
	}
	
	@And("^user verify shipping fee for the ship to home product$")
	public void user_verify_shipping_fee_for_the_ship_to_home_product()  {
		waitForElement(r2CartPO.shiptohomeshippingfee);
		limitedStockMessage=r2CartPO.shiptohomeshippingfee.getText();
		System.err.println(limitedStockMessage);
		//String arr[] = limitedStockMessage.split("$");
		//String arr1[]=arr[1].split(" ");
		assertTrue((limitedStockMessage.contains("$")));
	    
	}
	
	@And("^User verify that the limited quantity is added to cart$")
	public void User_verify_that_the_limited_quantity_is_added_to_cart() {
		System.err.println(r2CartPO.limitedQuantityAddedInCart.getAttribute("value"));
		assertTrue(addedQuantityInCart==Integer.parseInt(r2CartPO.limitedQuantityAddedInCart.getAttribute("value")));
			
	}
	
	@And("^user Verify that Pickup icon must be greyed out$")
	public void user_Verify_that_Pickup_icon_must_be_greyed_out() {
		assertTrue(isDisplayed(pdpPo.pickUpIconGreyedOut));
	}
	
	
	@And("^message \"(.*?)\" with Store Name is displayed$")
	public void message_with_Store_Name_is_displayed(String pdpMessage) {
		assertTrue(r2R1FunPO.pdpInventoryMessage.getText().equalsIgnoreCase(webPropHelper.getTestDataProperty(pdpMessage)));
		assertTrue(isDisplayed(r2R1FunPO.pdpStoreName));
	}
	
	@And("^user should be able to see Item Not Available for Pickup message$")
	public void user_should_be_able_to_see_Item_Not_Available_for_Pickup_message() {
		assertTrue(isDisplayed(r2R1FunPO.notAvailableMessageFindAStore));
	}
	
	@And("^user click on change Location link PDP$")
	public void user_click_on_change_Location_link_PDP() {
		assertTrue(clickOnButton(r2R1FunPO.lnkPickupLocationPDP));
	}
	

}
