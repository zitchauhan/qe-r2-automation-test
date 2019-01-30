package com.aso.qe.test.stepdefinition.web.plcc;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;

import cucumber.api.java.en.Given;

public class R1_LP_38_Web extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	
	@Given("^user expect element AcademyCreditCard link to be present$")
	public void user_expect_element_AcademyCreditCard_link_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfAcademyCreditCardFooterLink();
	}
}
