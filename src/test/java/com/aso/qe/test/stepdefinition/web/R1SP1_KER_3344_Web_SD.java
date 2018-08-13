package com.aso.qe.test.stepdefinition.web;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.PDP_PO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_3344_Web_SD extends CommonActionHelper{
	PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);
		
	@Then("^verify bundle product title and image$")
	public void verify_bundle_product_title_and_image() throws Throwable {
		assertTrue(isDisplayed(pdpPageObj.txtBundle));
		assertTrue(isDisplayed(pdpPageObj.imgBundleColor));
	}
	
	@Then("^verify nextstep and edit functionality$")
	public void verify_nextstep_and_edit_functionality() throws Throwable {
		Actions hover=new Actions(getDriver());
		hover.moveToElement(pdpPageObj.imgSubHelmetsCategory);
		assertTrue(clickOnButton(pdpPageObj.imgSubHelmetsCategory));
		assertTrue(clickOnButton(pdpPageObj.btnNextStep));
		assertTrue(clickOnButton(pdpPageObj.btnEdit));
		assertTrue(clickOnButton(pdpPageObj.btnEdit));
	}

}

