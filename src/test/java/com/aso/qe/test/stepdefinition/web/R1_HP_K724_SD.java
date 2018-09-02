package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.ShoppingCartViewPO;

import cucumber.api.java.en.Then;

public class R1_HP_K724_SD extends CommonActionHelper {

	public ShoppingCartViewPO shoppingCartViewPO = PageFactory.initElements(getDriver(), ShoppingCartViewPO.class);;
	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);

	@Then("^User should be able to see Search Box$")
	public void user_should_be_able_to_see_Search_Box() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			globalElementHeader.validatingTxtSearchBox();
		} else {
			globalElementHeader.validatingTxtSearchBox();
		}

	}

	@Then("^navigates to LOne page$")
	public void navigates_to_LOne_page() throws Throwable {
		assertTrue((clickOnButton(globalElementHeader.btnShopCategory)));
		assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));
		Thread.sleep(20000);
	}

	@Then("^navigates to LTwo page$")
	public void navigates_to_LTwo_page() throws Throwable {
		assertTrue((clickOnButton(globalElementHeader.btnShopCategory)));
		Actions hover = new Actions(getDriver());
		hover.moveToElement(globalElementHeader.btnClothingCategory).build().perform();
		assertTrue((clickOnButton(globalElementHeader.btnMensShirt_Men_Clothing_Shop)));
	}

	@Then("^navigates to LThree page$")
	public void navigates_to_LThree_page() throws Throwable {
		assertTrue((clickOnButton(globalElementHeader.btnShopCategory)));
		Actions hover = new Actions(getDriver());
		hover.moveToElement(globalElementHeader.btnClothingCategory).build().perform();
		assertTrue((clickOnButton(globalElementHeader.btnMensShirt_Men_Clothing_Shop)));
	}

	@Then("^verfiy PDP page is display$")
	public void verfiy_PDP_page_is_display() throws Throwable {
		waitForElement(globalElementHeader.txtMensShrit);
		assertTrue(isDisplayed(globalElementHeader.txtMensShrit));
	}

}
