package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;

import cucumber.api.java.en.Then;

public class R1_PLCC_36_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	@Then("^user expect element Benefit Images to be present$")
	public void user_expect_element_Benefit_Image_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfBenefit1Image();
		plccLandingPageObjects.verifyPresenceOfBenefit2Image();
		plccLandingPageObjects.verifyPresenceOfBenefit3Image();
	}

	@Then("^user expect element Benefit Texts to be present$")
	public void user_expect_element_Benefit_Text_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfBenefit1Text();
		plccLandingPageObjects.verifyPresenceOfBenefit2Text();
		plccLandingPageObjects.verifyPresenceOfBenefit3Text();
	}

	@Then("^user expect element OfferTexts to be present$")
	public void user_expect_element_OfferText_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfOfferText1();
		plccLandingPageObjects.verifyPresenceOfOfferText2();
		plccLandingPageObjects.verifyPresenceOfOfferText3();
	}
}
