package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import cucumber.api.java.en.And;

public class R1_PDP_K3774_SD extends CommonActionHelper{
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	
	@And("^verfiy attribute in Multiple SKU PDP$")
	public void verfiy_attribute_in_Multiple_SKU_PDP() throws Throwable {
		Actions hover=new Actions(getDriver());
		hover.moveToElement(pdpPageObj.imgSubHelmetsCategory);
		assertTrue(clickOnButton(pdpPageObj.imgSubHelmetsCategory));
		pdpPageObj.checkBtnNext();
		assertTrue(clickOnButton(pdpPageObj.btnNextStep));
		pdpPageObj.addToCartAvailability();
		assertTrue(isDisplayed(pdpPageObj.btnAddToCart));
	}
	
}

