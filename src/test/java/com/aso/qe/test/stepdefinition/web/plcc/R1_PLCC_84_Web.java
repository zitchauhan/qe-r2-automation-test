package com.aso.qe.test.stepdefinition.web.plcc;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_PLCC_84_Web extends CommonActionHelper{
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R2_CheckOut_PO checkout_po = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO myAccountPage_po = PageFactory.initElements(getDriver(), R2_MyAccount_PO.class);
	
	
	@Then("^delete all credit cards from My Account$")
	public void delete_all_credit_cards_from_My_Account() throws Throwable {
		myAccountPage_po.deleteAllCreditCardsFromMyAccount();
	}
	@When("^user click on Payments link$")
	public void user_click_on_Payments_link() throws Throwable {
		myAccountPage_po.myAccount_MyAccountList_Payment_lnk.click();
	}
	
}
