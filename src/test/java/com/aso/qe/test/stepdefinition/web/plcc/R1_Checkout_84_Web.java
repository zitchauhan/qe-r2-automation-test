package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Mobile_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.stepdefinition.web.Common_Web_SD;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_Checkout_84_Web extends CommonActionHelper{
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R2_CheckOut_PO checkout_po = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO myAccountPage_po = PageFactory.initElements(getDriver(), R2_MyAccount_PO.class);
	private static final Logger logger = Logger.getLogger(Common_Web_SD.class);
	R1_PLCC_Mobile_PO plccMobile_po= PageFactory.initElements(driver, R1_PLCC_Mobile_PO.class);
	
	@Then("^delete all credit cards from My Account$")
	public void delete_all_credit_cards_from_My_Account() throws Throwable {
		try {
			myAccountPage_po.deleteAllCreditCardsFromMyAccount();
			Thread.sleep(3000);
		} catch (Exception e) {
			logger.debug("Exception Message: "+e.getMessage());
		}
	}
	@When("^user click on Payments link$")
	public void user_click_on_Payments_link() throws Throwable {
		/*try {
			myAccountPage_po.myAccount_MyAccountList_Payment_lnk.click();
		} catch (Exception e) {
			logger.debug("Exception Message: "+e.getMessage());
		}*/

		try {
			plccMobile_po.verifyPresenceOfPaymentLink();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
