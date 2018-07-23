package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1SP1_KER_3238_Web_SD extends CommonActionHelper{
	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	public SearchProductPO searchProductPO = PageFactory.initElements(driver, SearchProductPO.class);
	String shootingName =  "";
	String wordContains="Shot";
	String offCode="?affcode=42";
	

	@When("^user navigates to PLP of outdoor$")
	public void user_navigates_to_PLP_of_outdoor() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			isClickable(globalElementHeader.txtOutDoor_M);
			assertTrue(clickOnButton(globalElementHeader.txtOutDoor_M));
			Thread.sleep(5000);
		}
		else
		{
			assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
		}
	}

	    

	@Then("^user clicks on the shooting and navigates to PDP of the product$")
	public void user_clicks_on_the_shooting_and_navigates_to_PDP_of_the_product() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			isClickable(globalElementHeader.txtShooting_M);
			assertTrue(clickOnButton(globalElementHeader.txtShooting_M));
			Thread.sleep(5000);
			isClickable(globalElementHeader.txtShootingNavg_M);
	        assertTrue(clickOnButton(globalElementHeader.txtShootingNavg_M));
	        Thread.sleep(5000);
		}
		else
		{
			assertTrue(clickOnButton(globalElementHeader.txtShooting));
		}
	}

	@Then("^User should add affcode into current url$")
	public void user_should_add_affcode_into_current_url() throws Throwable {
		String actualUrl=getCurrentPageURL();
		String offCodeUrl= actualUrl+offCode;
		getDriver().get(offCodeUrl);
        assertTrue(offCodeUrl.contains(shootingName));
	}

	@Then("^User should not able to see shooting products$")
	public void user_should_not_able_to_see_shooting_products() throws Throwable {
		waitForElement(globalElementHeader.txtimageShooting);
		if("mobile".equalsIgnoreCase(testtype)) {
		//assertFalse(wordContains.contains(globalElementHeader.txtimageShooting.getText()));
		 assertTrue(wordContains.contains(globalElementHeader.txtimageShooting.getText()));
		}
		else
		{
			assertTrue(wordContains.contains(globalElementHeader.txtimageShooting.getText()));
		}
	}
}


