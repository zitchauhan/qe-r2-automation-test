package com.aso.qe.test.stepdefinition.web; 

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K5892_SD extends CommonActionHelper {
	R2_R1_Fun_PO funpo=PageFactory.initElements(driver,R2_R1_Fun_PO.class );
	R2_CheckOut_PO chpo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	@Then("^user click on checkout from ATC pop up$")
	public void user_click_on_checkout_from_ATC_pop_up() throws Throwable {
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

	
	
	
}
