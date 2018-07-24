package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_HomePagePageObject;

import cucumber.api.java.en.Then;

public class SD_SIT_HomePage extends CommonActionHelper {

	// private static final Logger logger = Logger.getLogger(SD_SIT_HomePage.class);
	 
	 public SIT_HomePagePageObject homePagePo= PageFactory.initElements(driver, SIT_HomePagePageObject.class);
		
	 
	 @Then("^user click on CTA in Shop Collection$")
     public void user_click_on_CTA_in_Shop_Collection() throws Throwable
     {
         //Thread.sleep(3000);
         homePagePo.clickOnLink(SIT_HomePagePageObject.ShopCollectionCTA);
         homePagePo.clickOnLink(SIT_HomePagePageObject.ShopCollectionL3);
         
         //Thread.sleep(3000);
         
     }
	 
	 
	 @Then("^user click on Product Card in Shop Collection$")
     public void user_click_on__Product_card_in_Shop_Collection() throws Throwable
     {
         //Thread.sleep(3000);
         homePagePo.clickOnLink(SIT_HomePagePageObject.ShopCollectionProductcard);
         //Thread.sleep(3000);
         
     }
	 
	/* @When("^user click on Best Sellers product$")
	 public void user_click_on_Best_Sellers_product() throws Throwable {
		 HomePagePo.clickOnLink(SIT_HomePagePageObject.BestSellerproduct);
	 }*/
     
   /*  
     @Then("^user is able to scroll till Featured categroy component$")
 	public void user_is_able_to_scroll_till_Featured_categroy_component() throws Throwable {
 		scrollPageToWebElement(HomePagePo.secFeaturedCategory);

 	}

 	@Then("^user is able to see number of category card displayed in a row$")
 	public void user_is_able_to_see_number_of_category_card_displayed_in_a_row() throws Throwable {

 		int tileCount = HomePagePo.getCategoryTileCount(HomePagePo.prdTileFeaturedCategory_Row);
 	    logger.debug("Featured Category Tile Count :: "+tileCount);
 	}

 	
 	@Then("^user clicks on one of the category card and navigates to category$")
 	public void user_clicks_on_one_of_the_category_card_and_navigates_to_category() throws Throwable {
 		String currentURL = getCurrentPageURL();
 		assertTrue(clickOnButton(HomePagePo.prdTileFeaturedCategory));
 		String changedURL = getCurrentPageURL();
 		assertNotSame(currentURL, changedURL);

 	}*/
     
     /*@Then("^Open browser$")
     public void Open_browser() throws Throwable 
     {
                     Thread.sleep(3000);
                     
                     
     }
*/
}
