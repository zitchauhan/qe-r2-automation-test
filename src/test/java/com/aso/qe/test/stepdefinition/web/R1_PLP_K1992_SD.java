package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1_PLP_K1992_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_1992_Web_SD.class);
	R1_PLP_PO plp_po = PageFactory.initElements(getDriver(), R1_PLP_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(getDriver(), R1_GlobalElementHeader_Home_PO.class);
	String categoryName =  "";


	@Then("^User navigates PLP having related categories$")
	public void User_navigates_PLP_having_related_categories() throws InterruptedException {
		if ("mobile".equalsIgnoreCase(testtype)) {

			assertTrue(clickOnButton(globalElementHeader.txtOutDoor_M));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.txtShooting_M));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.txtShootingNavg_M));
			Thread.sleep(2000);

		} else {
			Thread.sleep(3000);
			assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
			Thread.sleep(2000);
			Actions hover = new Actions(getDriver());
			hover.moveToElement(globalElementHeader.btnOutdoorsCategory).build().perform();
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.btnAutomotiveTowing_Shop));
			Thread.sleep(2000);
		}

	}
	
	@Given("^user is able to see Related Categories in the filters$")
	public void user_is_able_to_see_Related_Categories_in_the_filters() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			waitForElement(plp_po.lnkRelatedCategories_Mobile);
			assertTrue(isDisplayed(plp_po.lnkRelatedCategories_Mobile));
		}else {
			waitForElement(plp_po.lnkRelatedCategories);
			assertTrue(isDisplayed(plp_po.lnkRelatedCategories));
		}

	}

	@Then("^user clicks on the Related Categories drawer$")
	public void user_clicks_on_the_Related_Categories_drawer() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(plp_po.lnkRelatedCategories_Mobile));
		}else {
			assertTrue(clickOnButton(plp_po.lnkRelatedCategories));
		}
	}

	@Then("^user clicks on one of the links in the drawer$")
	public void user_clicks_on_one_of_the_links_in_the_drawer() throws Throwable {
		
		if("mobile".equalsIgnoreCase(testtype)) {
			categoryName=plp_po.lnkCategories_RelatedCategories_Mobile.getText();
			assertTrue(clickOnButton(plp_po.lnkCategories_RelatedCategories_Mobile));
		}else {
			categoryName=plp_po.lnkCategories_RelatedCategories.getText();
			assertTrue(clickOnButton(plp_po.lnkCategories_RelatedCategories));
			System.err.println(categoryName);
			
		}
	}

//SID 27-August
	@Then("^user navigates to the respected link$")
	public void user_navigates_to_the_respected_link() throws Throwable {
		boolean flag=false;
		waitForElement(plp_po.txtSectionTitle);
		flag=categoryName.toLowerCase().contains(plp_po.txtSectionTitle.getText().toLowerCase());
		if(flag==false) {
			Assert.fail();
		}

	}
	
}

