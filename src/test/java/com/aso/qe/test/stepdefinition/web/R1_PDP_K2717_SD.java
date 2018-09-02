package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_PDP_K2717_SD extends CommonActionHelper {

	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R1_PDP_PO pdp_po=PageFactory.initElements(driver, R1_PDP_PO.class);
	
//	SID 28-August
//	@Then("^user search \"(.*?)\" in search box$")
//	public void user_search_in_search_box(String arg1) throws Throwable {
//	   waitForPageLoad(driver);
//	   Thread.sleep(2000);
//		setInputText(pdp_po.searchbox, webPropHelper.getTestDataProperty("NotSoldInStore")); 
//		clickOnButton(pdp_po.searchMagnifyingBtm);
//		
//	}	
	
	@Then("^user verify not sold in store text on PDP$")
	public void user_verify_not_sold_in_store_text_on_PDP() throws Throwable {
	   String actData=getText(pdp_po. txtNotSoldInStore).toLowerCase();
	   assertEquals("not sold in stores", actData);
	}
	
	
	
	
	
	
	
	
	

}
