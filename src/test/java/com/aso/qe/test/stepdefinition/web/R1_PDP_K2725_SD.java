package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_SIT_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_PDP_K2725_SD extends CommonActionHelper {
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	public R1_SIT_PO HomePagePo = PageFactory.initElements(driver, R1_SIT_PO.class);

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
		Thread.sleep(Constants.thread_highest);
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
	
	@And("^user click on \\\"([^\\\"]*)\\\" category$") 
	public void user_click_on_specific_category(String ctgry) throws Throwable{
		assertTrue(clickOnButton(globalElementHeader.btnBrandCategory));
	}
}