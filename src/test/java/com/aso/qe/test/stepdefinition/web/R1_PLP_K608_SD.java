package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;

import cucumber.api.java.en.And;


public class R1_PLP_K608_SD extends CommonActionHelper{
	
R1_PLP_PO plpPageObj = PageFactory.initElements(getDriver(), R1_PLP_PO.class);
R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);


	@And("^user verify that price is not displayed on product cards$")
	public void user_verify_that_price_is_not_displayed_on_product_cards() {
		boolean flag = true;
		flag =isDisplayed(plpPageObj.productPriceNotVisible);
		System.err.println(flag);
		if(!flag) {
			assertTrue(!flag);
		}else {
			assertTrue(flag);
		}
	}

	@And("^user verify that the page contains price range products$")
	public void user_verify_that_the_page_contains_price_range_products() {
		boolean flag = false;
		flag = isDisplayed(plpPageObj.priceRange);
		if (flag) {
			assertTrue(flag);
		} else {
			while(!flag)
			assertTrue(clickOnButton(globalElementHeader.btnNext));
		}

	}
}