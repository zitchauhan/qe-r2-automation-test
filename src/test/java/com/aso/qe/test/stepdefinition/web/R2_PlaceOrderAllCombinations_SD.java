package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.Given;

public class R2_PlaceOrderAllCombinations_SD extends CommonActionHelper {
	R1_PDP_PO pdpPageObj = PageFactory.initElements(driver, R1_PDP_PO.class);
	R2_R1_Fun_PO r2R1FunPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);

	@Given("^user click on Add to Cart Button for \"(.*?)\"$")
	public void user_click_on_Add_to_Cart_Button_for(String arg1) throws Throwable {
		if (arg1.equalsIgnoreCase("MultiSKUProduct")) {
			Actions hover = new Actions(getDriver());
			hover.moveToElement(pdpPageObj.imgSubHelmetsCategory);
			assertTrue(clickOnButton(pdpPageObj.imgSubHelmetsCategory));
			pdpPageObj.checkBtnNext();
			assertTrue(clickOnButton(pdpPageObj.btnNextStep));
			pdpPageObj.checkBtnaddToCartMultipleSKUPackage();
			assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
		} else if (arg1.equalsIgnoreCase("Bundle Product")) {
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
			if (!(isEnabled(pdpPageObj.addSelectionsToCart)))
				assertTrue(clickOnButton(pdpPageObj.increaseQuantityForBaitProduct));
			assertTrue(clickOnButton(pdpPageObj.addSelectionsToCart));
		} else {
			throw new NullPointerException("Please verify the parameter");
		}

	}

	@Given("^user deletes all existing gift cards$")
	public void user_deletes_all_existing_gift_card() throws Throwable {
		// if(isDisplayed((myAccountPo.btnAddGiftCardPlusIcon))){
		waitForPageLoad(driver);
		for (WebElement btnRemove : r2MyAccountPo.btnRemoveGiftCardList) {
			// if(isDisplayed(btnRemove))
			assertTrue(clickOnButton(btnRemove));
			Thread.sleep(Constants.thread_low);
		}
		// }

	}

	@Given("^user creates an account$")
	public void user_creates_an_account() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2R1FunPO.lnkSignInMobile));
		} else
			assertTrue(clickOnButton(r2MyAccountPo.lnkSignIn));
		assertTrue(clickOnButton(r2MyAccountPo.lnkSignUp));
		setInputText(r2MyAccountPo.inputFirstName, webPropHelper.getTestDataProperty("FirstName"));
		setInputText(r2MyAccountPo.inputLastName, webPropHelper.getTestDataProperty("LastName"));
		setInputText(r2MyAccountPo.inputEmailAddress, r2MyAccountPo.generateRandomEmailId());
		setInputText(r2MyAccountPo.inputCreatePassword, webPropHelper.getTestDataProperty("NewPassword"));
		assertTrue(clickOnButton(r2MyAccountPo.btnSignUp));
		Thread.sleep(Constants.thread_medium);
		assertTrue(isDisplayed(r2MyAccountPo.myAccount_SignUp_CongratulationsMessage_txt));
	}

}
