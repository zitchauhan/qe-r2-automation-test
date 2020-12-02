package com.aso.qe.test.stepdefinition.web;



import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K2867_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_CHECKOUT_K2867_SD.class);
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	public String storeDetails;
	public String newStoreDetails;
	

	
	@Then("^user click on In-Store Pick up edit button$")
	public void user_click_on_In_Store_Pick_up_edit_button() throws Throwable {
		isDisplayed(r2CheckoutPo.EditStorPickUp_Btn);
		assertTrue(clickOnButton(r2CheckoutPo.EditStorPickUp_Btn));
	}
	
	
	@Then("^Verify that the store details are displayed in Store pickup drawer$")
	public void verify_that_the_store_details_are_displayed_in_Store_pickup_drawer() throws Throwable {
	  storeDetails = r2CheckoutPo.StoreNameandAddress_Txt.getText();
	  logger.debug("Store Name and Address :: " + storeDetails);
		
	}

	@And("^user click on change Location link$")
	public void user_click_on_change_Location_link() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.ChangeLocation_Lnk));
	}

	@And("^user selects a new store from Find a Store modal \"(.*?)\"$")
	public void user_selects_a_new_store_from_Find_a_Store_modal(String arg1) throws Throwable {
		try{
			r2CartPo.inputFindaStoreHomePage.clear();
			setInputText(r2CartPo.inputFindaStoreHomePage, webPropHelper.getTestDataProperty(arg1));
		assertTrue(clickOnButton(r2CartPo.btnZipcodeSubmit));
		Thread.sleep(Constants.thread_medium);
		for ( WebElement plusIcon : r2CartPo.iconPlusAllStoreAddressDrawer) {
		    
	    	assertTrue(clickOnButton(plusIcon));
	    }
		
		
		int myStore= r2CartPo.btnAllMakeMyStore.size();
			for(int i=0;i<myStore;i++){
			Thread.sleep(Constants.thread_highest);
			r2CartPo.btnAllMakeMyStore.get(3).click();
			Thread.sleep(Constants.thread_highest);
				    
		}
	}
	catch (IndexOutOfBoundsException error) {
	    
	}
	
} 

	@Then("^Verify that the new selected store details are displayed in Store pickup drawer$")
	public void verify_that_the_new_selected_store_details_are_displayed_in_Store_pickup_drawer() throws Throwable {
		newStoreDetails = r2CheckoutPo.StoreNameandAddress_Txt.getText();
		  logger.debug("Store Name and Address :: " + newStoreDetails);
		  assertTrue(isDisplayed(r2CheckoutPo.StoreNameandAddress_Txt));
		assertNotEquals(newStoreDetails,storeDetails);
	
	}

	@When("^user clicks on Who is picking up the order dropdown$")
	public void user_clicks_on_Who_is_picking_up_the_order_dropdown() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.mePlusAlternatePickUp_Drpdwn));
	}

	@And("^user selects a new option from drop down$")
	public void user_selects_a_new_option_from_drop_down() throws Throwable {
		//assertTrue(clickOnButton(r2CheckoutPo.SeeInStorePickupInstructions_Select_Dd));
		Thread.sleep(Constants.thread_medium);
		Actions hover=new Actions(getDriver());
		hover.click(r2CheckoutPo.mePlusAlternatePickUp_Drpdwn).build().perform();
		hover.click(r2CheckoutPo.mePlusAlternatePickUp_Drpdwn).build().perform();
		hover.sendKeys(Keys.DOWN,Keys.ENTER).build().perform();
		//hover.sendKeys(r2CheckoutPo.MePickUp_Drpdwn, Keys.DOWN,Keys.ENTER).build().perform();
		Thread.sleep(Constants.thread_medium);
	}

	@And("^the selected value is displayed$")
	public void the_selected_value_is_displayed() throws Throwable {
		assertTrue(isDisplayed(r2CheckoutPo.mePlusAlternatePickUp_Drpdwn));
		
	}
	
	@Then("^Verify that See In-Store Pickup Instructions expands$")
	public void verify_that_See_In_Store_Pickup_Instructions_expands() throws Throwable 
	{
		assertTrue(clickOnButton(r2CheckoutPo.SeeInStorePickupInstructions_Dd));
	}

	@And("^verify that see in-store pickup instructions are displayed$")
	public void verify_that_see_in_store_pickup_instructions_are_displayed() throws Throwable {
		assertTrue(isDisplayed(r2CheckoutPo.SeeInStorePickupInstructions_Msg));
	}

	@When("^user clicks on Go to payment CTA$")
	public void user_clicks_on_Go_to_payment_CTA() throws Throwable {
//		isDisplayed(r2CheckoutPo.Pickup_Term_Checkbox);
//		moveHover(r2CheckoutPo.Pickup_Term_Checkbox);
//		assertTrue(clickOnButton(r2CheckoutPo.Pickup_Term_Checkbox));
//		assertTrue(clickOnRadioButton(r2CheckoutPo.Pickup_Term_Checkbox));
		Thread.sleep(Constants.thread_high);
		//if(isDisplayed(r2CheckoutPo.Pickup_Term_Checkbox))
		r2CheckoutPo.JS_Click(r2CheckoutPo.Pickup_Term_Checkbox);
		r2CheckoutPo.userClicksOnGotoPaymentCTA();		
	}
	
	@Then("^Verify that user navigate to payment drawer$")
	public void verify_that_user_navigate_to_payment_drawer() throws Throwable {
		assertTrue(isDisplayed(r2CheckoutPo.PaymentHeader_Txt));
	}

	
}
