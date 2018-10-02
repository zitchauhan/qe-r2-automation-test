package com.aso.qe.test.stepdefinition.web; 

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K5892_SD extends CommonActionHelper {
	R2_R1_Fun_PO funpo=PageFactory.initElements(driver,R2_R1_Fun_PO.class );
	R2_CheckOut_PO chpo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO mpo=PageFactory.initElements(driver, R2_MyAccount_PO.class);
	@Then("^user click on checkout from ATC pop up$")
	public void user_click_on_checkout_from_ATC_pop_up() throws Throwable 
	{
	    clickOnButton(funpo.checkoutBtnATC);
	    
	}
	
	@Then("^user click on credit card dropdown$")
	public void user_click_on_credit_card_dropdown() throws Throwable {
	   clickOnButton(chpo.chooseCreditcard_Dd);
	}
	@Then("^user click on Add new credit card$")
	public void user_click_on_Add_new_credit_card() throws Throwable {
	    clickOnButton(chpo.AddNewCreditCard_Txt);
	}

	@Then("^user fill the credit card detail of checkout page$")
	public void user_fill_the_credit_card_detail_of_checkout_page() throws Throwable {
		setInputText(chpo.CreditCardNumber_Input, webPropHelper.getTestDataProperty("CardVISA"));
		setInputText(chpo.ExpirationDate_Input, webPropHelper.getTestDataProperty("ExpDate"));
		setInputText(chpo.Cvv_Input, webPropHelper.getTestDataProperty("ThreeDigitCVV"));
		setInputText(chpo.EmailAddressforOrderConfirmation_Input, webPropHelper.getTestDataProperty("EmployeeEmailAddress"));
		clickOnButton(chpo.ReviewOrder_Btn);
		
	}

	@Then("^user click on place order button$")
	public void user_click_on_place_order_button() throws Throwable {
	   clickOnButton(chpo.btnPlaceOrderPaymentPage);
	   Thread.sleep(Constants.thread_highest);
	}



	@Then("^user fill expired credit card detail$")
	public void user_fill_expired_credit_card_detail() throws Throwable {
		setInputText(mpo.txtCreditCardNumber, webPropHelper.getTestDataProperty("CardVISA"));
		setInputText(mpo.txtExpiryDate, webPropHelper.getTestDataProperty("ExpiredcreditcardEXPdate"));
		setInputText(mpo.txtCVV, webPropHelper.getTestDataProperty("ThreeDigitCVV"));
	
		 
	}

	
	
}
