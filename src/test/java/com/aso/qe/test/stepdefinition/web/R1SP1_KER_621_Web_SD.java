package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PLP_PO;
import com.aso.qe.test.pageobject.SIT_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1SP1_KER_621_Web_SD extends CommonActionHelper {
	PLP_PO plpPageObj = PageFactory.initElements(getDriver(), PLP_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver,
			GlobalElementHeader_HomePO.class);
	public SIT_PO HomePagePo = PageFactory.initElements(driver, SIT_PO.class);
	
	
	@And("^user expands the Ad badge filter$")
	public void user_expands_the_Ad_badge_filter() throws InterruptedException {
		waitForPageLoad(driver);
		waitForElement(plpPageObj.clickAdFeature);
		scrollPageToWebElement(plpPageObj.clickAdFeature);
		isDisplayed(plpPageObj.clickAdFeature);
		assertTrue(clickOnButton(plpPageObj.clickAdFeature));
		Thread.sleep(3000);
	}
	
	@Then("^user click on clearance badge$")
	public void user_click_on_clearance_badge() throws InterruptedException{
		Thread.sleep(300);
		scrollPageToWebElement(plpPageObj.btnClearance);
		isDisplayed(plpPageObj.btnClearance);
		assertTrue(clickOnButton(plpPageObj.btnClearance));
	}
	
	@Then("^user click on online badge$")
	public void user_click_on_online_badge() throws InterruptedException{
		Thread.sleep(300);
		scrollPageToWebElement(plpPageObj.btnOnline);
		isDisplayed(plpPageObj.btnOnline);
		assertTrue(clickOnButton(plpPageObj.btnOnline));
	}
	
	@Then("^user click on price badge$")
	public void user_click_on_price_badge() throws InterruptedException{
		Thread.sleep(300);
		scrollPageToWebElement(plpPageObj.btnPriceDrop);
		isDisplayed(plpPageObj.btnPriceDrop);
		assertTrue(clickOnButton(plpPageObj.btnPriceDrop));
	}
	
	@And("^user verify the clearance badge color$")
	public void user_verify_the_clearance_badge_color(){
		waitForElement(plpPageObj.colorClearance);
		scrollPageToWebElement(plpPageObj.colorClearance);
		isDisplayed(plpPageObj.colorClearance);
		String colorClearanceBadge = plpPageObj.colorHashToRGB(plpPageObj.colorClearance);
		assertEquals(colorClearanceBadge.toLowerCase(),"red");
	}
	
	@And("^user verify the online badge color$")
	public void user_verify_the_online_badge_color(){
		waitForElement(plpPageObj.colorOnline);
		scrollPageToWebElement(plpPageObj.colorOnline);
		isDisplayed(plpPageObj.colorOnline);
		String colorOnlineBadge = plpPageObj.colorHashToRGB(plpPageObj.colorOnline);
		assertEquals(colorOnlineBadge.toLowerCase(),"blue");
	}
	
	@And("^user verify the price badge color$")
	public void user_verify_the_price_badge_color(){
		waitForElement(plpPageObj.colorPriceDrop);
		scrollPageToWebElement(plpPageObj.colorPriceDrop);
		isDisplayed(plpPageObj.colorPriceDrop);
		String colorPriceDropBadge = plpPageObj.colorHashToRGB(plpPageObj.colorPriceDrop);
		assertEquals(colorPriceDropBadge.toLowerCase(),"red");
	}
	
	@And("^user verify the ship to store badge color$")
	public void user_verify_the_ship_to_store_badge_color(){
		waitForElement(plpPageObj.colorShipToStore);
		scrollPageToWebElement(plpPageObj.colorShipToStore);
		isDisplayed(plpPageObj.colorShipToStore);
		String colorPriceDropBadge = plpPageObj.colorHashToRGB(plpPageObj.colorShipToStore);
		assertEquals(colorPriceDropBadge.toLowerCase(),"blue");
	}
}