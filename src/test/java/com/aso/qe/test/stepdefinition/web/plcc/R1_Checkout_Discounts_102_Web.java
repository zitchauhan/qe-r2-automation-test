package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.When;

public class R1_Checkout_Discounts_102_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
		
	@When("^user click on ship it button$")
	public void user_click_on_ship_it_button() throws Throwable {
		
		Thread.sleep(4000);
		assertTrue(isDisplayed(genericPO.shipItButton));
		assertTrue(clickOnButton(genericPO.shipItButton));
	}
}
