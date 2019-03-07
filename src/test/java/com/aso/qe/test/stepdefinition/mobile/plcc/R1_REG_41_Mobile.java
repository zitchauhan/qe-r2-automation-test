package com.aso.qe.test.stepdefinition.mobile.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Mobile_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.When;

public class R1_REG_41_Mobile extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R2_MyAccount_PO myAccount_po= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R1_PLCC_Mobile_PO plccMobile_po= PageFactory.initElements(driver, R1_PLCC_Mobile_PO.class);
	
	@When("^user click on My Account link of mobile$")
	public void user_click_on_My_Account_link_of_mobile() throws Throwable {
		plccMobile_po.verifyPresenceOfMyAccountLinkOnMobile();
		myAccount_po.myAccount_txt_Mobile.click();
	}
}
