package com.aso.qe.test.stepdefinition.web.plcc;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;

import cucumber.api.java.en.Then;
public class R1_PLCC_37_Web  extends CommonActionHelper  {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	@Then("^user expect Preescreen Code Text Field is to be present$")
	public void user_expect_Preescreen_Code_Text_Field_is_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfPreescreenTextField();
	}
	@Then("^user enter Preescreen Code \"(.*?)\"$")
	public void user_enter_Preescreen_Code(String arg1) throws Throwable {
		plccLandingPageObjects.enterPrescreenCode(arg1);
		assertTrue(isDisplayed(plccLandingPageObjects.prescreenCodeTextField));
		waitForElement(plccLandingPageObjects.prescreenCodeTextField);
	}
	@Then("^user expect Preescreen Error Code is to be present$")
	public void user_expect_Preescreen_Error_Code_is_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfPreescreenErrorCode();
	}
}
