package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;

public class R2_MYACCOUNT_K4330_SD extends CommonActionHelper {

	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);

	@Then("^user navigates from Order successful page to Orders in my account$")
	public void user_navigates_from_Order_successful_page_to_Orders_in_my_account() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2MyAccountPo.myAccount_txt_Mobile));
			assertTrue(clickOnButton(r2MyAccountPo.burgerMenu_Orders_lnk));
		} else {
			assertTrue(clickOnButton(r2MyAccountPo.lnkSignIn));
			assertTrue(clickOnButton(r2MyAccountPo.myAccount_MyAccountList_Orders_lnk));
		}
	}
}
