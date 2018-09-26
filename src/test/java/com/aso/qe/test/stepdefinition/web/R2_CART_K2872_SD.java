package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_FindStore_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class R2_CART_K2872_SD extends CommonActionHelper {
	
	private static final Logger logger = Logger.getLogger(R2_Cart_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_FindStore_PO r2FindaStoretPo = PageFactory.initElements(driver, R2_FindStore_PO.class);
	R2_R1_Fun_PO r2R1FunPO=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	
	
	
	@When("^user clicks on Find a Store$")
	public void user_clicks_on_Find_a_Store() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.lnkFindaStoreHomePage));
	}

	@Then("^user enter \"(.*?)\" in Find a Store Model$")
	public void user_enter_in_Find_a_Store_Model(String arg1) throws Throwable {
	    setInputText(r2CartPo.inputFindaStoreHomePage, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user click on submit button$")
    public void user_click_on_submit_button() throws Throwable {
           if("mobile".equalsIgnoreCase(testtype)){      
                  assertTrue(clickOnButton(r2FindaStoretPo.btnZipcodeSubmit_m));
                  Thread.sleep(5000);
           }else {
                  assertTrue(clickOnButton(r2CartPo.btnZipcodeSubmit));
                  Thread.sleep(2000); 
           }
           
    }


	@Then("^user verify the results based on entering zipcode$")
	public void user_verify_the_results_based_on_entering_zipcode() throws Throwable {
		waitForElement(r2CartPo.txtStoreResult);
		assertTrue(isDisplayed(r2CartPo.txtStoreResult));
	}
	
	@And("^user verify Find a Store popup$")
	public void user_verify_Find_a_Store_popup() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtFindaStore));
	}
	
	@And("^user verify Find a Store popup is closed$")
	public void user_verify_Find_a_Store_popup_is_closed() throws Throwable {
		assertFalse(isDisplayed(r2CartPo.txtFindaStore));
	}
	
	@And("^user should be able to see the View Next five Stores button$")
	public void user_should_be_able_to_see_the_View_Next_five_Stores_button() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.btnViewTheNext5Stores));
	}
	
	@Then("^verify Static error message$")
	public void verify_Static_error_message() throws Throwable {
	    String errorMsg= "Sorry! There are no stores within 250 miles.Please order online or try new ZIP code.";
	    String getErrorMsg= r2CartPo.txtStaticErrorMsg.getText();
	    if(getErrorMsg.equals(errorMsg))
	    {
	    		logger.info("Error messsage is displaying Properly");
	    }else {
	    	   	logger.info("Error messsage is not displaying Properly");
	    }
	}
	
	
	@Then("^user click on plus icon in Store Address drawer$")
	public void user_click_on_plus_icon_in_Store_Address_drawer() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.iconPlusStoreAddressDrawer));
	}
	
	@Then("^user click on all plus icon in Store Address drawer$")
	public void user_click_on_all__plus_icon_in_Store_Address_drawer() throws Throwable {
		for ( WebElement plusIcon : r2CartPo.iconPlusAllStoreAddressDrawer) {
		    
		    	assertTrue(clickOnButton(plusIcon));
		    }
		}
		
	
	@Then("^user click on minus icon in Store Address drawer$")
	public void user_click_on_minus_icon_in_Store_Address_drawer() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.iconMinusStoreAddressDrawer));
		}
	
	@Then("^user verify minus icon in Store Address drawer$")
	public void user_verify_minus_icon_in_Store_Address_drawer() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.iconMinusStoreAddressDrawer));
		}

	@And("^user click on Make My store button$")
	public void user_click_on_Make_My_store_button() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.btnMakeMyStore));
	}
	
	@And("^user verify Make My store button$")
	public void user_verify_Make_My_store_button() throws Throwable {
		
		for ( WebElement buttonStore : r2CartPo.btnAllMakeMyStore) {
		    
	    	assertTrue(isDisplayed(buttonStore));
	    }
		
	}
	
	
	@And("^user click on View Next five Stores button$")
	public void user_click_on_View_Next_five_Stores_button() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.btnViewTheNext5Stores));
	}
	
	@And("^user verify the all the results$")
	public void user_verify_the_all_the_results() throws Throwable {
		waitForElement(r2CartPo.txtStoreResult);
		assertTrue(isDisplayed(r2CartPo.txtStoreResult));
	}
	
	
	@And("^user should be able to see the store Details including its address, phone number, Driving Directions link, Store Open days/hours$")
	public void user_should_be_able_to_see_the_store_Details_including_its_address_phone_number_Driving_Directions_link_Store_Open_days_hours() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtAddress));
		assertTrue(isDisplayed(r2CartPo.txtPhoneNumber));
		assertTrue(isDisplayed(r2CartPo.txtDrivingDirection));
		assertTrue(isDisplayed(r2CartPo.txtStoreOpendays_hours));
	}
	
	@And("^user should click on Driving Direction$")
	public void user_should_click_on_Driving_Direction() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.txtDrivingDirection));
		Thread.sleep(3000);
		 Set handles= driver.getWindowHandles();
		 for (String handle : driver.getWindowHandles()) {
			 	        	
	        	driver.switchTo().window(handle);

	        	}
		
		
	}
	
	@Then("^user should be redirected to the Google Maps in new tab/window$")
	public void user_should_be_redirected_to_the_Google_Maps_in_new_tab_window() throws Throwable {
		String currentURL = getCurrentPageURL();
		if(currentURL.contains("https://www.google.com/maps/dir/?key=AIzaSyCCQv_rjCCq_X9E6kHDTTiec-NRSY19Smc&api=1&/origin=29.7457034,-95.7405139&destination=29.7846,-95.7725")) {
			logger.debug("User is successfully navigated to Google Maps page with URL :: " + currentURL  );
		}
		else {
			logger.debug("User is not able to navigate to Google Maps instead navigated to URL :: " + currentURL  );
		}
		
	}
	
	
	@Then("^verify the components in Find a Store Model$")
	public void verify_the_components_in_Find_a_Store_Model() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.googleMap));
		assertFalse(isDisplayed(r2CartPo.txtYourStore));
		for(WebElement miles: r2CartPo.txtDistanceinMiles) {
			assertTrue(isDisplayed(miles));
		}
		for ( WebElement plusIcon : r2CartPo.iconPlusAllStoreAddressDrawer) {
		    
	    	assertTrue(isDisplayed(plusIcon));
	    }
		
	}
	
	@And("^click on Change Location link$")
	public void click_on_Change_Location_link() throws Throwable {
	    assertTrue(clickOnButton(r2CartPo.lnkChangeLocationCart));
	}
	
	
	@And("^verify Change Location link$")
	public void verify_Change_Location_link() throws Throwable {
	    assertTrue(isDisplayed(r2CartPo.lnkChangeLocationCart));
	}

	@Then("^Find in Store modal should get open$")
	public void find_in_Store_modal_should_get_open() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtFindaStore));
	}
	
	@And("^user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails$")
	public void user_should_be_able_to_see_the_BOPIS_availability_as_Cart_Items_available_Not_available_for_Pickup_with_product_image_thumbnails() throws Throwable {
		for(WebElement bopisavailablity: r2CartPo.txtBopisAvailablity) {
			if(bopisavailablity.equals("Items Not Available for Pickup")) {
				logger.info("Items Not Available for Pickup");
			}
			else if(bopisavailablity.equals("Cart Items available")) {
				logger.info("Cart Items available");
			}
			else {
				logger.info("No Items are available");
			}
		}
				
			
			for(WebElement imagethumbnalis: r2CartPo.txtBopisImageThumbnails) {
				assertTrue(isDisplayed(imagethumbnalis));
		
			}
	}
	
	@And("^user click on Find a Store in PDP page$")
	public void user_click_on_Find_a_Store_in_PDP_page() throws Throwable {
		assertTrue(clickOnButton(r2FindaStoretPo.lnkFindaStorePDP));
	}
	
	@Then("^Close X Find a store Modal$")
	public void close_X_Find_a_store_Modal() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.btnFindStoreClose));
		assertFalse(isDisplayed(r2CartPo.txtFindaStore));
	}
	
	@And("^user is able to see Change Pickup Location link$")
	public void user_is_able_to_see_Change_Pickup_Location_link() throws Throwable {
		assertTrue(isDisplayed(r2R1FunPO.lnkPickupLocation)); 
	}
	
	@Then("^user should not be able to see the 'View Next (\\d+) Stores' button\"$")
	public void user_should_not_be_able_to_see_the_View_Next_Stores_button(int arg1) throws Throwable {
		assertFalse(isDisplayed(r2CartPo.btnViewTheNext5Stores));
	}
	
	@When("^user lands on the PLP page with Filter Drawer$")
	public void user_lands_on_the_PLP_page_with_Filter_Drawer() throws Throwable {
		 if("mobile".equalsIgnoreCase(testtype)){   
			 scrollPageToWebElement(r2R1FunPO.DdFilter_M);
			  assertTrue(clickOnButton(r2R1FunPO.DdFilter_M));
			  assertTrue(clickOnButton(r2R1FunPO.txtShippingPickupFilterDrawer));
              Thread.sleep(5000);
       }else {
    	   assertTrue(clickOnButton(r2R1FunPO.txtShippingPickupFilterDrawer));
              Thread.sleep(2000); 
       }
		
	}
	
	@And("^user is able to see Change Pickup Location link in PLP$")
	public void user_is_able_to_see_Change_Pickup_Location_link_in_PLP() throws Throwable {
		assertTrue(isDisplayed(r2R1FunPO.lnkPLPChangePickupLocation)); 
	}
	
	@Then("^clicks on the Change Pickup Location link in PLP$")
	public void clicks_on_the_Change_Pickup_Location_link_in_PLP() throws Throwable {
		assertTrue(clickOnButton(r2R1FunPO.lnkPLPChangePickupLocation)); 
		Thread.sleep(2000);
	}

		
}
