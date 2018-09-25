package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.Given;

public class R2_PlaceOrderAllCombinations_SD extends CommonActionHelper 
{
	R1_PDP_PO pdpPageObj = PageFactory.initElements(driver, R1_PDP_PO.class);
	R2_R1_Fun_PO r2R1FunPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_MyAccount_PO myAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);

	@Given("^user click on Add to Cart Button for \"(.*?)\"$")
	public void user_click_on_Add_to_Cart_Button_for(String arg1) throws Throwable {
		if (arg1.equalsIgnoreCase("MultiSKUProduct")) {
			assertTrue(clickOnButton(pdpPageObj.availableColorForMultiSkuProduct));
			assertTrue(clickOnButton(pdpPageObj.availableSizeForMultiSkuProduct));
			assertTrue(clickOnButton(pdpPageObj.btnNextStep));
			assertTrue(clickOnButton(pdpPageObj.availableColorForMultiSkuProduct));
			assertTrue(clickOnButton(pdpPageObj.availableSizeForMultiSkuProduct));
			assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
		} else if(arg1.equalsIgnoreCase("Bundle Product")) {
			assertTrue(clickOnButton(pdpPageObj.availableColorForBundleProduct));
			assertTrue(clickOnButton(pdpPageObj.availableSizeForBundleProduct));
			assertTrue(clickOnButton(pdpPageObj.availableWidthForBundleProduct));
			assertTrue(clickOnButton(pdpPageObj.btnNextStep));
			assertTrue(clickOnButton(pdpPageObj.availableColorForMultiSkuProduct));
			assertTrue(clickOnButton(pdpPageObj.availableSizeForMultiSkuProduct));
			assertTrue(clickOnButton(pdpPageObj.btnNextStep));
			assertTrue(clickOnButton(pdpPageObj.availableBallColorForBundleProduct));
			assertTrue(clickOnButton(pdpPageObj.availableBallSizeForBundleProduct));
			assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
		} else if (arg1.equalsIgnoreCase("Bait Product")) {
			if(!(isEnabled(pdpPageObj.addSelectionsToCart)))
				assertTrue(clickOnButton(pdpPageObj.increaseQuantityForBaitProduct));
			assertTrue(clickOnButton(pdpPageObj.addSelectionsToCart));
		}else {
			throw new NullPointerException("Please verify the parameter");
		}

	}
	
	@Given("^user deletes all existing gift cards$")
	public void user_deletes_all_existing_gift_card() throws Throwable {
//		if(isDisplayed((myAccountPo.btnAddGiftCardPlusIcon))){
		waitForPageLoad(driver);
			for(WebElement btnRemove: myAccountPo.btnRemoveGiftCardList) {
//		    	if(isDisplayed(btnRemove))
		    		assertTrue(clickOnButton(btnRemove));
		    		Thread.sleep(2000);
			}
//		}

	}

}
