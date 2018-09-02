package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SearchProductPO;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_HP_K2993_SD extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_HP_K2993_SD.class);
	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);

	@Then("^User navigate to rebates page$")
	public void user_navigate_to_rebates_page() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.lnkrebates));
		waitForPageLoad(driver);
		Thread.sleep(2000);
		assertTrue(getTitle().contains("Rebates"));
	}

	@Then("^User able to see all neccessary details inside it$")
	public void user_able_to_see_all_neccessary_details_inside_it() throws Throwable {

		assertTrue(isDisplayed(globalElementHeader.secRebatesDetails));// every element is different in uat6 N uat9 cannot script for both
		
	}
}
