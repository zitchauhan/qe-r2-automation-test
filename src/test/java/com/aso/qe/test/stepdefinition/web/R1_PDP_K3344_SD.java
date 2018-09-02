package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_PDP_K3344_SD extends CommonActionHelper{
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R1_PLP_PO plpPO = PageFactory.initElements(getDriver(), R1_PLP_PO.class);
	R1_SearchProduct_PO searchproductpo = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
		
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
	
	//SID 28-August
	@And("^user click on category tab$")
	public void user_click_on_category_tab() {
		assertTrue(clickOnButton(searchproductpo.openCategoryFacetMobile));
	}

	//SID 28-August
	@And("^user click on football helmets$")
	public void user_click_on_football_tab() {
		if ("mobile".equalsIgnoreCase(testtype)) {
			waitForElement(plpPO.linkFootballHelmets);
			assertTrue(clickOnButton(plpPO.linkFootballHelmets));
		} else {
			waitForElement(plpPO.linkFootballHelmets_Desktop);
			assertTrue(clickOnButton(plpPO.linkFootballHelmets_Desktop));
		}

	}
}

