package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_HomePage_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_HP_K3184_SD extends CommonActionHelper {

	R1_GlobalElementHeader_Home_PO geh_po = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R1_HomePage_PO hp_p = PageFactory.initElements(driver, R1_HomePage_PO.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	private static final Logger logger = Logger.getLogger(R1_HP_K3184_SD.class);

	@Then("^User click on shop Gift Cards Link and navigate to Gift Card LAnding page$")
	public void user_click_on_shop_Gift_Cards_Link_and_navigate_to_Gift_Card_LAnding_page() throws Throwable {

		waitForPageLoad(driver);
		Thread.sleep(Constants.thread_low);
		scrollPageToWebElement(geh_po.lnkgiftcards);
		waitForElement(geh_po.lnkgiftcards);
		assertTrue(clickOnButton(geh_po.lnkgiftcards));

	}

	@And("^user click on shop gift card CTA$")
	public void user_click_on_shop_gift_card_CTA() {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(hp_p.btnShopGiftCards_M));
		} else {
			assertTrue(clickOnButton(hp_p.btnShopGiftCards));
		}
	}

	// SID 9-Oct
	@Then("^user add it to cart$")
	public void user_add_it_to_cart() throws InterruptedException {
		Boolean flag = pdpPageObj.giftCardColor();
		if (flag) {
			assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
			waitForElement(pdpPageObj.secAddToCartPopup);
			assertTrue(isDisplayed(pdpPageObj.secAddToCartPopup));
		} else {
			logger.debug("**********GIFT CARD IS OUT OF STOCK***************");
		}
	}

	@And("^user click on shop bulk gift card CTA$")
	public void user_click_on_shop_bulk_gift_card_CTA() {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(hp_p.btnShopBulkGiftCards_M));
		} else {
			assertTrue(clickOnButton(hp_p.btnShopBulkGiftCards));
		}
	}

	@Then("^user verify shop gift card button in gift card landing page$")
	public void user_verify_shop_gift_card_button_in_gift_card_landing_page() throws Throwable {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isClickable(hp_p.btnShopGiftCards_M));
		} else {
			assertTrue(isClickable(hp_p.btnShopGiftCards));
		}
	}

	@Then("^user scroll to service on footer and expand service$")
	public void user_scroll_to_service_on_footer_and_expand_service() throws Throwable {
		waitForPageLoad(driver);

		Thread.sleep(Constants.thread_low);
		assertTrue(clickOnButton(geh_po.expandall_Academy_services));
		assertTrue(clickOnButton(geh_po.lnkgiftcards));
	}

	@Then("^User verify shop Bulk Gift Cards btn in gift card landing page$")
	public void user_verify_shop_Bulk_Gift_Cards_btn_in_gift_card_landing_page() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isClickable(hp_p.btnShopBulkGiftCards_M));
		} else {
			assertTrue(isClickable(hp_p.btnShopBulkGiftCards));
		}

	}

	@Then("^verify check balance CTA button in gift card landing page$")
	public void verify_check_balance_CTA_button_in_gift_card_landing_page() throws Throwable {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isClickable(hp_p.btnCheckBalance_CTA_M));
		} else {
			assertTrue(isClickable(hp_p.btnCheckBalance_CTA));
		}

	}

	@Then("^user select the standard gift card$")
	public void user_select_the_standard_gift_card() {
					assertTrue(clickOnButton(geh_po.giftCards.get(0)));
			}
		
			

	// SID 9-Oct
	@Then("^user select the standard gift card and add it to cart$")
	public void user_select_the_standard_gift_card_and_add_it_to_cart() {
		int numberOfGiftCards = geh_po.giftCards.size();
		for (int i = 0; i < numberOfGiftCards; i++) {
			String giftCardName = geh_po.giftCards.get(i).getText();
			if (!giftCardName.toLowerCase().contains("bulk")) {
				assertTrue(clickOnButton(geh_po.giftCards.get(i)));
				Boolean flag = false;
				try {
					if (i != (numberOfGiftCards - 1)) {
						flag = geh_po.outOfStockMessage.isDisplayed();
						if (flag) {
							driver.navigate().back();
							Thread.sleep(5000);
						}
					} else {
						flag = geh_po.outOfStockMessage.isDisplayed();
						if (flag) {
							logger.debug("***********GIFT CARD IS OUT OF STOCK***************");
						}
					}
				} catch (Exception e) {
					assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
					waitForElement(pdpPageObj.secAddToCartPopup);
					assertTrue(isDisplayed(pdpPageObj.secAddToCartPopup));
					break;

				}
			}
		}
	}

}
