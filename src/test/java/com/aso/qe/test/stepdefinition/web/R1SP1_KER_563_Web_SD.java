package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.PLP_PO;
import cucumber.api.java.en.And;

public class R1SP1_KER_563_Web_SD extends CommonActionHelper{
	PLP_PO plp_po=PageFactory.initElements(driver, PLP_PO.class);


	@And("^User should be able to click on clear all button$")
	public void User_should_be_able_to_click_on_clear_all_button() throws Throwable{
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(plp_po.lnkClearAllMobile));
		}else {
			assertTrue(clickOnButton(plp_po.lnkClearAll));
		}
	}
}
