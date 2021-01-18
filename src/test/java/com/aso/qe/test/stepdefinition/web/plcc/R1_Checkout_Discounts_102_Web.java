package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class R1_Checkout_Discounts_102_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
		
	@When("^user click on ship it button$")
	public void user_click_on_ship_it_button() throws Throwable {
		waitForPageLoad(driver);

		//Thread.sleep(Constants.thread_high);
		waitForElement(genericPO.shipItButton);
		assertTrue(isDisplayed(genericPO.shipItButton));
		//assertTrue(clickOnButton(genericPO.shipItButton));  //Sachin
		//clickOnButton(genericPO.shipItButton);
		r2CheckOutPo.JS_Click(genericPO.shipItButton);


	}
	@When("^user click on store pickup button$")
	public void user_click_on_store_pickup_button() throws Throwable {
		waitForPageLoad(driver);

		//Thread.sleep(Constants.thread_high);
		waitForElement(genericPO.PickupButtonPDP);
		assertTrue(isDisplayed(genericPO.PickupButtonPDP));
		//assertTrue(clickOnButton(genericPO.shipItButton));  
		//clickOnButton(genericPO.shipItButton);
		r2CheckOutPo.JS_Click(genericPO.PickupButtonPDP);


	}
	
	
		}