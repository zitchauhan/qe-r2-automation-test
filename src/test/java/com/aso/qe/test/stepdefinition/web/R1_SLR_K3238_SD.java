package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_SLR_K3238_SD extends CommonActionHelper{
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	public R1_SearchProduct_PO searchProductPO = PageFactory.initElements(driver, R1_SearchProduct_PO.class);
	public R1_PLP_PO plp_po = PageFactory.initElements(driver, R1_PLP_PO.class);
	public R1_PDP_PO pdp_po = PageFactory.initElements(driver, R1_PDP_PO.class);
	String shootingName =  "";
	String wordContains="Shot";
	String offCode="?affcode=42";
	

	@When("^user navigates to PLP of outdoor$")
	public void user_navigates_to_PLP_of_outdoor() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			isClickable(globalElementHeader.txtOutDoor_M);
			Thread.sleep(1000);
			assertTrue(clickOnButton(globalElementHeader.txtOutDoor_M));
			Thread.sleep(1000);
			assertTrue(clickOnButton(globalElementHeader.txtShooting_M));
			 assertTrue(clickOnButton(globalElementHeader.txtShootingNavg_M));
		}
		else
		{
			Thread.sleep(3000);
			assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
			Actions hover = new Actions(getDriver());
			hover.moveToElement(globalElementHeader.txtOutDoor).build().perform();
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.txtShooting));
			
		}
	}

	    

	@Then("^user clicks on the shooting and navigates to PDP of the product$")
	public void user_clicks_on_the_shooting_and_navigates_to_PDP_of_the_product() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(plp_po.drpdwnSortByScrollMobile);
			Thread.sleep(1000);
			assertTrue(clickOnButton(plp_po.productPLP1_Mobile));
		}
		else
		{
			assertTrue(clickOnButton(plp_po.productName));
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
		waitForElement(pdp_po.txtProductTitle);
		if("mobile".equalsIgnoreCase(testtype)) {
		//assertFalse(wordContains.contains(globalElementHeader.txtimageShooting.getText()));
		 assertFalse(wordContains.contains(pdp_po.txtProductTitle.getText()));
		}
		else
		{
			assertFalse(wordContains.contains(pdp_po.txtProductTitle.getText()));
		}
	}
}


