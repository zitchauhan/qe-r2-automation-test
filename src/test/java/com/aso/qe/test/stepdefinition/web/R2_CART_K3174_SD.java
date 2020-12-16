package com.aso.qe.test.stepdefinition.web;



import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
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
				Thread.sleep(Constants.thread_medium);
        }else {
        	waitForElement(r2SanityPo.AS_btnShopCategory);
    		assertTrue((clickOnButton(r2SanityPo.AS_btnShopCategory)));
    		assertTrue(clickOnButton(r2R1FunPO.btnOutdoorCategory));
    		Thread.sleep(Constants.thread_medium);
        }
				
	}
	@Then("^user clicks on one of the subcategory and navigates to LTwo Instore Pickup$")
	public void user_clicks_on_one_of_the_subcategory_and_navigates_to_LTwo_page_Instore_Pickup() throws Throwable {
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
	@Then("^user clicks on one of the product category and navigates to LThree Instore Pickup$")
	public void user_clicks_on_one_of_the_product_category_and_navigates_to_LThree_page_Instore_Pickup() throws Throwable {
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

	@Then("^user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers$")
	public void user_should_see_unselected_checkbox_acknowledgement_with_appropriate_age_restriction_disclaimers()
			throws Throwable {
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(r2CheckoutPo.ShipToStoreforSOF_compliance_Txt));

	}

	@Then("^user click on edit button in ship to store$")
	public void user_click_on_edit_button_in_ship_to_store() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.checkoutEditShipToStore_btn));
	}

	@Then("^user click on checkbox in special order ship to store section$")
	public void user_click_on_checkbox_in_special_order_ship_to_store_section() throws Throwable {
		Actions hover = new Actions(driver);
		hover.moveToElement(r2CheckoutPo.selectCheckbox).click().build().perform();
	}

	@Then("^user click on go to payment section$")
	public void user_click_on_go_to_payment_section() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.ShipToStoreforSOF_Payment_Btn));
		
	}

	@And("^user fill the payment details for sof guest user$")
	public void user_fill_the_payment_details_for_sof_guest_user() throws InterruptedException {
		//waitForElement(r2CheckoutPo.CardholderName_Input);
		//KG changed on 19 Nov for handling inner form
		waitForInnerFormElement(r2CheckoutPo.CardholderName_Input,"first-data-payment-field-name"); 
		SwitchToDefaultFrame();
		waitForElement(r2CheckoutPo.ZipCode_Input);
		r2CheckoutPo.ZipCode_Input.clear();
		Thread.sleep(5000);
		driver.switchTo().frame("first-data-payment-field-name");
		waitForElement(r2CheckoutPo.CardholderName_Input);
		setInputText(r2CheckoutPo.CardholderName_Input, webPropHelper.getTestDataProperty("CardholderName"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("first-data-payment-field-card");
		setInputText(r2CheckoutPo.CreditCardDetails_Input, webPropHelper.getTestDataProperty("CreditCardNumber"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("first-data-payment-field-exp");
		setInputText(r2CheckoutPo.ExpDate_Input, webPropHelper.getTestDataProperty("ExpDate"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("first-data-payment-field-cvv");
		setInputText(r2CheckoutPo.PassCvv_Input, webPropHelper.getTestDataProperty("CVV"));
		driver.switchTo().defaultContent();
		
		setInputText(r2CheckoutPo.FirstName_Input, webPropHelper.getTestDataProperty("FirstName"));
		setInputText(r2CheckoutPo.LastName_Input, webPropHelper.getTestDataProperty("LastName"));
		setInputText(r2CheckoutPo.PhoneNumber_Input, webPropHelper.getTestDataProperty("PhoneNumber"));
		setInputText(r2CheckoutPo.Adderss_Input, webPropHelper.getTestDataProperty("Address"));
		setInputText(r2CheckoutPo.ZipCode_Input, webPropHelper.getTestDataProperty("zipcode"));
		Thread.sleep(Constants.thread_medium);
		setInputText(r2CheckoutPo.EmailAddressforOrderConfirmation_Input,webPropHelper.getTestDataProperty("EmailAddress"));
		Thread.sleep(Constants.thread_medium);
		waitForElement(r2CheckoutPo.ReviewOrder_Btn);
		assertTrue(clickOnButton(r2CheckoutPo.ReviewOrder_Btn));
		Thread.sleep(Constants.thread_highest);
		
		//for popup modal after review for SOF orders
		if(isDisplayed(r2CheckoutPo.ContinueReviewCTA))
		{
			assertTrue(clickOnButton(r2CheckoutPo.ContinueReviewCTA));
			Thread.sleep(Constants.thread_high);
		}
	}
	
	@And("^user fill the payment details for sof registered user$")
	public void user_fill_the_payment_details_for_sof_registered_user() throws InterruptedException {
		try {
			Thread.sleep(Constants.thread_medium);
//		waitForElement(r2CheckoutPo.CreditCardNumber_Input);
//		r2CheckoutPo.ZipCode_Input.clear();
//		setInputText(r2CheckoutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty("CreditCardNumber"));
//		setInputText(r2CheckoutPo.ExpirationDate_Input, webPropHelper.getTestDataProperty("ExpDate"));
			setInputText(r2CheckoutPo.Cvv_Input, webPropHelper.getTestDataProperty("CVV"));
//		setInputText(r2CheckoutPo.FirstName_Input, webPropHelper.getTestDataProperty("FirstName"));
//		setInputText(r2CheckoutPo.LastName_Input, webPropHelper.getTestDataProperty("LastName"));
//		setInputText(r2CheckoutPo.PhoneNumber_Input, webPropHelper.getTestDataProperty("PhoneNumber"));
//		setInputText(r2CheckoutPo.Adderss_Input, webPropHelper.getTestDataProperty("Address"));
//		setInputText(r2CheckoutPo.ZipCode_Input, webPropHelper.getTestDataProperty("zipcode"));
//		Thread.sleep(Constants.thread_medium);
//		setInputText(r2CheckoutPo.EmailAddressforOrderConfirmation_Input,webPropHelper.getTestDataProperty("EmailAddress"));
			Thread.sleep(Constants.thread_medium);
			assertTrue(clickOnButton(r2CheckoutPo.ReviewOrder_Btn));
			Thread.sleep(Constants.thread_highest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
