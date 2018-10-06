package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertFalse;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.framework.common.WaiterHelper;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_PDP_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K6655_SD extends CommonActionHelper {
	
	
	R2_PDP_PO r2PdpPo = PageFactory.initElements(driver, R2_PDP_PO.class);
	R2_R1_Fun_PO r2R1FunPO=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_Sanity_PO r2SanityPo=PageFactory.initElements(driver,R2_Sanity_PO.class);
	R2_MyAccount_PO r2_MyAccount_PO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R1_PDP_PO r1PDPPO = PageFactory.initElements(driver, R1_PDP_PO.class);
	
	@Then("^Verify that Enable Buy Now button is displayed on PDP$")
	public void verify_that_Enable_Buy_Now_button_is_displayed_on_PDP() throws Throwable {
		
		assertTrue(isDisplayed(r2PdpPo.EnableBuyNow_btn));
	}
	
	@When("^User clicks on Enable Buy Now button$")
	public void user_clicks_on_Enable_Buy_Now_button() throws Throwable {
		assertTrue(clickOnButton(r2PdpPo.EnableBuyNow_btn));
		Thread.sleep(Constants.thread_highest); 
	}
	
	@Then("^user should not able to see the Enable BUY NOW button on the PDP$")
	public void user_should_not_able_to_see_the_Enable_BUY_NOW_button_on_the_PDP() throws Throwable {
		
		assertFalse(isDisplayed(r2PdpPo.EnableBuyNow_btn));
	}
	
	@Then("^user clicks on one of the subcategory and navigates to LTwo Baits$")
	public void user_clicks_on_one_of_the_subcategory_and_navigates_to_LTwo_Baits() throws Throwable {
		 if("mobile".equalsIgnoreCase(testtype)){ 
			 waitForElement(r2R1FunPO.Baits_secCategory_CLP_m);
			 assertTrue(clickOnButton(r2R1FunPO.Baits_secCategory_CLP_m));
			 assertTrue(clickOnButton(r2R1FunPO.Baits_productPLP_m));
			 Thread.sleep(Constants.thread_medium); 
		 }else {
			 waitForElement(r2R1FunPO.Baits_secCategory_CLP);
			 assertTrue(clickOnButton(r2R1FunPO.Baits_secCategory_CLP));
			 assertTrue(clickOnButton(r2R1FunPO.Baits_productPLP));
			 Thread.sleep(Constants.thread_medium); 
		}
	}
	
	@Then("^user should not able to see the BUY NOW button on the PDP$")
	public void user_should_not_able_to_see_the_BUY_NOW_button_on_the_PDP() throws Throwable {
		waitForElement(r2PdpPo.Default_Payment_Option_btn);
		assertTrue(isDisplayed(r2PdpPo.Default_Payment_Option_btn));
		
	}
	
	@Then("^user clicks on one of the product category and navigates to LThree Baits$")
	public void user_clicks_on_one_of_the_product_category_and_navigates_to_LThree_Baits() throws Throwable {
		
		if("mobile".equalsIgnoreCase(testtype)){ 
			 waitForElement(r2R1FunPO.Baits_productPLP1_m);
			 assertTrue(clickOnButton(r2R1FunPO.Baits_productPLP1_m));
			 waitForElement(r2R1FunPO.Baits_productPLP1_m);
			 waitForElement(r2SanityPo.AS_productPLP1);
			 assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
			 Thread.sleep(Constants.thread_medium); 
		 }else {
			 waitForElement(r2SanityPo.AS_productPLP1);
			 assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
			 Thread.sleep(Constants.thread_medium); 		
	}
}
//	@Then("^User enters Payment details$")
//	public void User_enters_Payment_details() throws Throwable {
//		
//		setInputText(r2PdpPo.Credit_CardNumber_txt, "");
//		
//	}
//	
	
	
	
	
	@Then("^user enters creditcardnumber \"(.*?)\"$")
	public void user_enters_creditcardnumber(String arg1) throws Throwable {
		setInputText(r2PdpPo.Credit_CardNumber_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enters creaditcardExp \"(.*?)\"$")
	public void user_enters_creaditcardExp(String arg1) throws Throwable {
		setInputText(r2PdpPo.Credit_Card_Expriration_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enters creditcardcvv \"(.*?)\"$")
	public void user_enters_creditcardcvv(String arg1) throws Throwable {
		setInputText(r2PdpPo.Credit_Card_Cvv_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enters billingfirstname \"(.*?)\"$")
	public void user_enters_billingfirstname(String arg1) throws Throwable {
		setInputText(r2PdpPo.BillingFirstName_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enters billinglastname \"(.*?)\"$")
	public void user_enters_billinglastname(String arg1) throws Throwable {
		setInputText(r2PdpPo.BillingLastName_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enters billingaddress \"(.*?)\"$")
	public void user_enters_billingaddress(String arg1) throws Throwable {
		setInputText(r2PdpPo.BllingAddress_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enters billingzipcode \"(.*?)\"$")
	public void user_enters_billingzipcode(String arg1) throws Throwable {
		setInputText(r2PdpPo.BillingZipCode_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enters billingphonenumber \"(.*?)\"$")
	public void user_enters_billingphonenumber(String arg1) throws Throwable {
		setInputText(r2PdpPo.BillingPhone_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enters billingemail \"(.*?)\"$")
	public void user_enters_billingemail(String arg1) throws Throwable {
		setInputText(r2PdpPo.BillingEmail_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user clicks on paymentsubmit button$")
	public void user_clicks_on_paymentsubmit_button() throws Throwable {
		assertTrue(clickOnButton(r2PdpPo.PaymentFormSubmit_btn));
		Thread.sleep(Constants.thread_medium);
		
	}
	
	@Then("^delete the payment details in myaccount$")
	public void delete_the_payment_details_in_myaccount() throws Throwable {
		assertTrue(clickOnButton(r2_MyAccount_PO.myAccount_MyAccountList_Payment_lnk));
		assertTrue(clickOnButton(r2_MyAccount_PO.btnRemove));
		Thread.sleep(Constants.thread_medium);
		
	}
	
	@Then("^user is allowed to enter first name \"(.*?)\"$")
	public void user_is_allowed_to_enter_first_name(String arg1) throws Throwable {
		setInputText(r2PdpPo.Shipping_First_Name_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user is allowed to enter last name \"(.*?)\"$")
	public void user_is_allowed_to_enter_last_name(String arg1) throws Throwable {
		setInputText(r2PdpPo.Shipping_Last_Name_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user is allowed to enter address \"(.*?)\"$")
	public void user_is_allowed_to_enter_address(String arg1) throws Throwable {
		setInputText(r2PdpPo.Shipping_Address_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user is allowed to enter zipcode \"(.*?)\"$")
	public void user_is_allowed_to_enter_zipcode(String arg1) throws Throwable {
		setInputText(r2PdpPo.Shipping_ZipCode_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user is allowed to enter phone number \"(.*?)\"$")
	public void user_is_allowed_to_enter_phone_number(String arg1) throws Throwable {
		setInputText(r2PdpPo.Shipping_Phone_txt, webPropHelper.getTestDataProperty(arg1));
	}
	
	@When("^user clicks on add default payment option$")
	public void user_clicks_on_add_default_payment_option() throws Throwable {
		assertTrue(clickOnButton(r2PdpPo.Add_Default_Payment_Option_btn));
		Thread.sleep(5000);
		
	}
	
	@Then("^Verify nextstep functionality$")
	public void verify_nextstep_functionality() throws Throwable {
		Actions hover = new Actions(getDriver());
		hover.moveToElement(r2R1FunPO.Soccersize_btn);
		assertTrue(clickOnButton(r2R1FunPO.Soccersize_btn));
		assertTrue(clickOnButton(r1PDPPO.btnNextStep));
		assertTrue(clickOnButton(r2R1FunPO.Soccersize_btn));
		assertTrue(clickOnButton(r1PDPPO.btnNextStep));
		assertTrue(clickOnButton(r2R1FunPO.Soccersize_btn));
	}
	
	
	

}
