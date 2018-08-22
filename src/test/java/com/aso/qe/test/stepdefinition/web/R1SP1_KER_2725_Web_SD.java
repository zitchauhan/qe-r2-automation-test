package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
import com.aso.qe.test.pageobject.SIT_PO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_2725_Web_SD extends CommonActionHelper {
	PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver,
			GlobalElementHeader_HomePO.class);
	public SIT_PO HomePagePo = PageFactory.initElements(driver, SIT_PO.class);

	@Then("^Verify the Promotional Eyebrow appears above the Product Name$")
	public void verify_the_Promotional_Eyebrow_appears_above_the_Product_Name() throws Throwable {
//		scrollPageToWebElement(pdpPageObj.btnProductCardimage);
//		assertTrue(isDisplayed(pdpPageObj.txtPromotional));
	assertTrue(clickOnButton(pdpPageObj.clickOnFirstIMG));
	assertTrue(isDisplayed(pdpPageObj.txtPromotional));
	}

	@Then("^Verify Product Name is avilaible$")
	public void verify_Product_Name_is_avilaible() throws Throwable {
		assertTrue(isDisplayed(pdpPageObj.txtProdctText));
	}

	@Then("^Verify Product Price is available$")
	public void verify_Product_Price_is_available() throws Throwable {
		assertTrue(isDisplayed(pdpPageObj.txtProdctPrice));
	}

	@Then("^Verify review star is displayed$")
	public void verify_review_star_is_displayed() throws Throwable {
		assertTrue(isDisplayed(pdpPageObj.bthStars));
	}

	@Then("^Verify review Link is available and clickable$")
	public void verify_review_Link_is_available_and_clickable() throws Throwable {
		assertTrue(clickOnButton(pdpPageObj.bthStars));
	}

	@Then("^Verify Promotional Messaging displayed for the selected product$")
	public void verify_Promotional_Messaging_displayed_for_the_selected_product() throws Throwable {
		assertTrue(isDisplayed(pdpPageObj.txtPromotionalmsg));
	}

	@Then("^user click on cta in Shop Collection$")
	public void user_click_on_cta_in_Shop_Collection() throws Throwable {
	
		
		//clickOnLink(HomePagePo.ShopCollectionCTA);
	
		//clickOnLink(SIT_HomePagePageObject.ShopCollectionCTA);
	}
	
	@Then("^click on the prodct card in home page$")
	public void click_on_the_prodct_card_in_home_page() throws Throwable {
		waitForPageLoad(driver);//RKA 14 Aug
		Thread.sleep(10000);
		Actions hover=new Actions(getDriver());
		hover.moveToElement(pdpPageObj.btnProdctimage).build().perform();
		
		scrollPageToWebElement(pdpPageObj.btnProdctimage);
		pdpPageObj.clickProdcutCardimage();
	    
	}
	
	@Then("^user verify the eyebrow ratings and the Promo message in PDP$")
	public void user_verify_the_eyebrow_ratings_and_the_Promo_message_in_PDP()
	{
		assertTrue(pdpPageObj.checkPresence());
		
	} 
}
