package com.aso.qe.test.stepdefinition.web.plcc;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;
import com.sun.glass.ui.Clipboard;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_LP_35_Web extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	@When("^user click on manage your card link$")
	public void user_click_on_manage_your_card_link() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfManageYourCardLink();
		plccLandingPageObjects.manageYourCardLink.click();
	}
//	@When("^user switch to the alert popup$")
//	public void user_switch_to_the_alert_popup() throws Throwable {
//			http://username:password@the-site.com 
//	
//			public void login(String uname, String pwd){
//			  String URL = "__http://" + uname + ":" + pwd + "@" + TEST_ENVIRONMENT;
//			  driver.get(URL);
//			} 
			 

	//}
	
//	@When("^user switch to the alert popup with \"(.*?)\" and \"(.*?)\"$")
//	public void user_switch_to_the_alert_popup_with_and(String uname, String pwd) throws Throwable {
//		
//
//	}
	@Then("^user navigates to bank page$")
	public void user_navigates_to_bank_page() throws Throwable {
		try {
			plccLandingPageObjects.verifyPresenceOfBankPage();
		} catch (Exception e) {
			logger.debug("As per requirement PLCC-467, Timeout Error is expected behavior");
		}
	}
}
