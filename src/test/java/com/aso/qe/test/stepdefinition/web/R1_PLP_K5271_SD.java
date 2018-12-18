package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PLP_PO;

import cucumber.api.java.en.Then;

public class R1_PLP_K5271_SD extends CommonActionHelper {
	R1_PLP_PO plp_po = PageFactory.initElements(getDriver(), R1_PLP_PO.class);

	@Then("^scroll down and verfiy Featured Categories$")
	public void scroll_down_and_verfiy_Featured_Categories() throws Throwable {
		plp_po.verifyFeaturedCategoriesText();
	}

	@Then("^click on SearchDex link$")
	public void click_on_SearchDex_link() throws Throwable {
		plp_po.clickSearchDexLink();
	}


}
