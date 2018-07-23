package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.PLP_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1SP1_KER_1992_Web_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_1992_Web_SD.class);
	PLP_PO plp_po = PageFactory.initElements(getDriver(), PLP_PO.class);
	String categoryName =  "";


	@Given("^user is able to see Related Categories in the filters$")
	public void user_is_able_to_see_Related_Categories_in_the_filters() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(plp_po.lnkRelatedCategories_Mobile));
		}else {
			assertTrue(isDisplayed(plp_po.lnkRelatedCategories));
		}

	}

	@Then("^user clicks on the Related Categories drawer$")
	public void user_clicks_on_the_Related_Categories_drawer() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(plp_po.lnkRelatedCategories_Mobile);
			assertTrue(clickOnButton(plp_po.lnkRelatedCategories_Mobile));
		}else {
			assertTrue(clickOnButton(plp_po.lnkRelatedCategories));
		}
	}

	@Then("^user clicks on one of the links in the drawer$")
	public void user_clicks_on_one_of_the_links_in_the_drawer() throws Throwable {

		if("mobile".equalsIgnoreCase(testtype)) {
			categoryName = getText(plp_po.lnkCategories_RelatedCategories_Mobile).substring(10, 11);
			scrollPageToWebElement(plp_po.lnkCategories_RelatedCategories_Mobile);
			assertTrue(clickOnButton(plp_po.lnkCategories_RelatedCategories_Mobile));
		}else {
			categoryName = getText(plp_po.lnkCategories_RelatedCategories).substring(10, 11);;
			assertTrue(clickOnButton(plp_po.lnkCategories_RelatedCategories));
		}
	}

	@Then("^user navigates to the respected link$")
	public void user_navigates_to_the_respected_link() throws Throwable {
		String actualURL = getTitle();
		assertTrue(actualURL.contains(categoryName));

	}
	
}

