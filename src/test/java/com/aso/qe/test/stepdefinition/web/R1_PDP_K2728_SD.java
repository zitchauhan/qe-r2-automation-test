package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;


import cucumber.api.java.en.Then;

public class R1_PDP_K2728_SD extends CommonActionHelper {
	R1_PLP_PO plpPageObj = PageFactory.initElements(getDriver(), R1_PLP_PO.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	private static final Logger logger = Logger.getLogger(R1_PDP_K2728_SD.class);
	
	@Then("^user able to see promo offer in grid and navigate to pdp of the product and see the same promocode in PDP$")
	public void user_able_to_see_promo_offer_in_grid_and_navigate_to_pdp_of_the_product_and_see_the_same_promocode_in_PDP() throws Throwable {
		
	   if(isDisplayed(plpPageObj.prdctWithPromoOffer)) {
	   assertTrue(clickOnButton(plpPageObj.prdctWithPromoOffer));
	   waitForPageLoad(driver);
	   Thread.sleep(3000);
	   assertTrue(isDisplayed(pdpPageObj.txtPromoCodePDP));
	   }else {
		   logger.debug("There are no promo offers product");
	   }
	}

	@Then("^User navigates to page having promo content$")
	 public void User_navigates_to_page_having_promo_content() throws Throwable {
	  
		Thread.sleep(3000);
		assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
		Thread.sleep(3000);
		Actions hover = new Actions(getDriver());
		hover.moveToElement(globalElementHeader.btnClothingCategory).build().perform();
		Thread.sleep(3000);
		assertTrue(clickOnButton(globalElementHeader.lnkPromoAvailable));
		Thread.sleep(3000);
		
		
		
		
	}
}
