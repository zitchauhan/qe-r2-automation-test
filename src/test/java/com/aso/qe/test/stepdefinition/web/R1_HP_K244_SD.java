package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_HomePage_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.Then;

public class R1_HP_K244_SD extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_HP_K244_SD.class);
	R1_SearchProduct_PO searchProductPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
	R1_HomePage_PO HomePagePOM = PageFactory.initElements(getDriver(), R1_HomePage_PO.class);


	@Then("^user is able to scroll till Featured categroy component$")
	public void user_is_able_to_scroll_till_Featured_categroy_component() throws Throwable {
		scrollPageToWebElement(HomePagePOM.secFeaturedCategory);

	}

	@Then("^user is able to see number of category card displayed in a row$")
	public void user_is_able_to_see_number_of_category_card_displayed_in_a_row() throws Throwable {

		int tileCount = HomePagePOM.getCategoryTileCount(HomePagePOM.prdTileFeaturedCategory_Row);
	    logger.debug("Featured Category Tile Count :: "+tileCount);
	}

	@Then("^user clicks on one of the category card and navigates to category$")
	public void user_clicks_on_one_of_the_category_card_and_navigates_to_category() throws Throwable {
		waitForPageLoad(driver);
		Thread.sleep(4000);
		String currentURL = getCurrentPageURL();
		assertTrue(clickOnButton(HomePagePOM.prdTileFeaturedCategory));
		String changedURL = getCurrentPageURL();
		logger.debug("Before Clicking product tile of Featured Category" + currentURL);
		logger.debug("After Clicking product tile of Featured Category" + changedURL);;
		assertNotEquals(changedURL, currentURL);
	}


}
