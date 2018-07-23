package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_DealsPageObject;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;

import cucumber.api.java.en.Then;

public class SD_SIT_DealsPage extends CommonActionHelper {
	
//private static final Logger logger = Logger.getLogger(SD_SIT_DealsPage.class);
GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
SIT_DealsPageObject DealsPo= PageFactory.initElements(driver, SIT_DealsPageObject.class);

@Then("^User will click on Deals Link$")
public void user_will_click_on_Deals_Link() throws Throwable {
	
	assertTrue(clickOnButton(globalElementHeader.btnDEALS));
    
}

@Then("^User will click on Daily Deals and click on product$")
public void user_will_click_on_Daily_Deals_and_click_on_product() throws Throwable {
	
	DealsPo.navigateToDealsandclickonproduct();
   
}
	
}