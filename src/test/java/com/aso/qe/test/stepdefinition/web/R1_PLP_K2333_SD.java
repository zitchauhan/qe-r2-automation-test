package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_PLP_K2333_SD extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_PLP_K2333_SD.class);
	R1_SearchProduct_PO searchProductPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);;



	@When("^User navigates till L2 page$")
	public void user_navigates_till_L2_page() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){
			Common_Web_SD.globalElementHeader.navigateToL2PageViaClick_Mobile();
		} else{
			Common_Web_SD.globalElementHeader.navigateToL2ViaClick_Desktop();
		}
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^User scroll to facets$")
	public void user_scroll_to_facets() throws Throwable {
		scrollPageToWebElement(searchProductPO.btnBuyNowHeroImage);
	}

	@Then("^User verify default Category facet expand and all other facets are collapsed$")
	public void user_verify_default_Category_facet_expand_and_all_other_facets_are_collapsed() throws Throwable {
		logger.debug("check category facet is expand");

		if("mobile".equalsIgnoreCase(testtype)){
			Thread.sleep(1000);
			List<WebElement> openCategory = driver.findElements(By.xpath("//div[contains(@data-auid,'facetdrawer_drawer_Category_m')]//i[@class='academyicon icon-minus']"));
			String categoryOpenCount = ""+openCategory.size();
			assertEquals(categoryOpenCount,"1");
		}else {
			List<WebElement> openCategory = driver.findElements(By.xpath("//div[contains(@data-auid,'facetdrawer_drawer_Category')]//i[@class='academyicon icon-minus']"));
			String categoryOpenCount = ""+openCategory.size();
			assertEquals(categoryOpenCount,"1");
		}


		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(searchProductPO.txtCategoryFacetOpenMobile));
		}else {
			assertTrue(isDisplayed(searchProductPO.txtCategoryFacetOpen));
		}
	}

}
