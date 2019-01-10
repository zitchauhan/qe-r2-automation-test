package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.Set;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Release_Issue_Web_SD extends CommonActionHelper {
	
	private static final Logger logger = Logger.getLogger(Release_Issue_Web_SD.class);
	R1_GlobalElementHeader_Home_PO globalElementHeaderHomePO = PageFactory.initElements(getDriver(),
			R1_GlobalElementHeader_Home_PO.class);
	R1_SearchProduct_PO searchProductPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
	R1_FindStore_PO findStorePO = PageFactory.initElements(getDriver(), R1_FindStore_PO.class);
	R2_CheckOut_PO checkoutPO = PageFactory.initElements(getDriver(), R2_CheckOut_PO.class);
	R1_PDP_PO pdpPO = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R1_PLP_PO plpPO = PageFactory.initElements(getDriver(), R1_PLP_PO.class);
	R2_Cart_PO cartPO = PageFactory.initElements(getDriver(), R2_Cart_PO.class);

	@And("^user navigates to hunting accessories category$")
	public void user_navigates_to_hunting_accessories_category() throws InterruptedException {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeaderHomePO.txtOutDoor_M));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeaderHomePO.txtHunting_M));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeaderHomePO.clickHunting_M));
			Thread.sleep(2000);
		} else {
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeaderHomePO.btnShopCategory));
			Actions hover = new Actions(getDriver());
			hover.moveToElement(globalElementHeaderHomePO.txtOutDoor).build().perform();
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeaderHomePO.txtHunting));
			Thread.sleep(2000);
		}
		assertTrue(clickOnButton(globalElementHeaderHomePO.clickHuntingAccessories));
	}

	@Then("^user select the category as scents$")
	public void user_select_the_category_as_scents() throws InterruptedException {
		waitForElement(globalElementHeaderHomePO.clickCategoryScentsEliminators);
		isDisplayed(globalElementHeaderHomePO.clickCategoryScentsEliminators);
		assertTrue(clickOnButton(globalElementHeaderHomePO.clickCategoryScentsEliminators));
		Thread.sleep(2000);
		assertTrue(clickOnButton(globalElementHeaderHomePO.clickCategoryScents));
	}

	@Then("^user select the category as scents eliminator$")
	public void user_select_the_category_as_scents_eliminator() throws InterruptedException {
		waitForElement(globalElementHeaderHomePO.clickCategoryScentsEliminators_M);
		isDisplayed(globalElementHeaderHomePO.clickCategoryScentsEliminators_M);
		assertTrue(clickOnButton(globalElementHeaderHomePO.clickCategoryScentsEliminators_M));
	}

	@Then("^user select the category scent$")
	public void user_select_the_category_as_scent() throws InterruptedException {
		waitForElement(globalElementHeaderHomePO.clickCategoryScents_M);
		isDisplayed(globalElementHeaderHomePO.clickCategoryScents_M);
		Thread.sleep(2000);
		assertTrue(clickOnButton(globalElementHeaderHomePO.clickCategoryScents_M));

	}

	@And("^user check for the product having for special pricing call message on product card$")
	public void user_check_for_the_product_having_for_special_pricing_call_message_in_product_card() {
		boolean flag = false;
		while (flag = false) {
			flag = isDisplayed(globalElementHeaderHomePO.forSpecialPricingMessage);
			if (flag = true) {
				assertTrue(isDisplayed(globalElementHeaderHomePO.forSpecialPricingMessage));
			} else {
				assertTrue(clickOnButton(globalElementHeaderHomePO.btnNext));
			}
		}
	}

	@Then("^user verify the special pricing number \"(.*?)\"$")
	public void user_verify_the_special_pricing_number(String expectedNumber) {
		String number = globalElementHeaderHomePO.specialPriceMobileNumber.getText();
		System.err.println("Expected : "+webPropHelper.getTestDataProperty(expectedNumber)+" Actual : "+number);
		assertEquals(number, webPropHelper.getTestDataProperty(expectedNumber));
	}

	@And("^user expands the category icon$")
	public void user_expands_the_category_icon() {
		waitForElement(searchProductPO.openCategoryFacetMobile);
		assertTrue(clickOnButton(searchProductPO.openCategoryFacetMobile));
	}
	
	@And("^user enter the email address for order confirmation$")
	public void user_enter_the_email_address_for_order_confirmation() {
		setInputText(checkoutPO.EmailAddressforOrderConfirmation_Input, webPropHelper.getTestDataProperty("Login_username"));
	}
	
	@Then("^user verify the age restriction checkbox$")
	public void user_verify_the_age_restriction_checkbox() {
		Actions hover = new Actions(driver);
		hover.moveToElement(checkoutPO.ageRestrictionCheckBox).click().build().perform();
	}
	
	@And("^user verify the ammo disclaimer on PDP$")
	public void user_verify_the_ammo_disclaimer_on_PDP() {
		assertTrue(isDisplayed(pdpPO.legalMessageAmmoPDP));
	}
	
	@And("^user verify the ammo disclaimer on cart$")
	public void user_verify_the_ammo_disclaimer_on_cart() {
		assertTrue(isDisplayed(cartPO.leaglMessageAmmoCart));
	}

	@And("^user navigates to ammuniation category$")
	public void user_navigates_to_ammuniation_category() throws InterruptedException {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeaderHomePO.txtOutDoor_M));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeaderHomePO.clickShooting_M));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeaderHomePO.clickAmmo_M));
		} else {
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeaderHomePO.btnShopCategory));
			Actions hover = new Actions(getDriver());
			hover.moveToElement(globalElementHeaderHomePO.txtOutDoor).build().perform();
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeaderHomePO.clickAmmo));
		}
	}

	@And("^user verify the PPU in PLP page$")
	public void user_verify_the_PPU_in_PLP_page() {
	for(WebElement messagePPU : plpPO.ppuMessagePLP) {
		boolean flag=false;
		flag=isDisplayed(messagePPU);
		if(flag) {
			assertTrue(flag);
			break;
		}
		else {
			logger.debug("************PPU MESSAGE NOT FOUND************");
			assertTrue(flag);
		}
	}
	}
	
	@And("^user verify that the store name is clickable$")
	public void user_verify_that_the_store_name_is_clickable() {
		assertTrue(clickOnButton(pdpPO.storeNameClick));
		Set<String> handles= driver.getWindowHandles();
		 for (String handle : handles) {
	        	driver.switchTo().window(handle);
	        	}
	}
	
	@And("^user check that the selected store is closed$")
	public void user_check_that_the_selected_store_is_closed() {
		boolean flag = false;
		flag= isDisplayed(findStorePO.storeClosed);
		if(flag) {
		assertTrue(flag);
		}
		else {
			logger.debug("************SELECTED STORE IS NOT CLOSED**************");
		}
	}

}

