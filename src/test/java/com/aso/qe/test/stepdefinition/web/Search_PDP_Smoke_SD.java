package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_PDP_Smoke_SD extends CommonActionHelper {

	R1_PDP_PO r1pdppo = PageFactory.initElements(driver, R1_PDP_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	private static final Logger logger = Logger.getLogger(Search_PDP_Smoke_SD.class);
	String searchKey = "";
	
	@Then("^user should see details and specs$")
	public void user_should_see_details_and_specs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(r1pdppo.DetailsandSpecsDisplayed());
	}
	
	
	@Then("^user should see details and specs for Bundle Product$")
	public void user_should_see_details_and_specs_for_Bundle_Product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(r1pdppo.DetailsandSpecsDisplayedBundleProduct());
	}
	
	
	@Then("^user should be able to see the search term in the product title for Bundle Product$")
	public void user_should_be_able_to_see_the_search_term_in_the_product_title_Bundle() throws Throwable {
		assertEquals(webPropHelper.getTestDataProperty("SKUForBundleProductTitle"), getText(r1pdppo.txtProductTitleBundle));
		logger.debug("User entered search key :: " + searchKey + "and the search title is :: "
				+ getText(r1pdppo.txtProductTitle));
	}
	
	@Then("^user should be able to see the search term in the SOF Item title$")
	public void user_should_be_able_to_see_the_search_term_in_the_product_title_SOF() throws Throwable {
		assertEquals(webPropHelper.getTestDataProperty("SKUForSOFProductTitle"), getText(r1pdppo.txtProductTitleSOF));
		logger.debug("User entered search key :: " + searchKey + "and the search title is :: "
				+ getText(r1pdppo.txtProductTitle));
	}
	
	@Then("^user should be able to see the search term in the Clearence Item title$")
	public void user_should_be_able_to_see_the_search_term_in_the_product_title_Clearence() throws Throwable {
		assertEquals(webPropHelper.getTestDataProperty("SKUForClearenceProductTitle"), getText(r1pdppo.txtProductTitleSOF));
		logger.debug("User entered search key :: " + searchKey + "and the search title is :: "
				+ getText(r1pdppo.txtProductTitle));
	}
	
	@Then("^user should be able to see the search term in the Hot Deal Item title$")
	public void user_should_be_able_to_see_the_search_term_in_the_Hot_deal_Item_Title() throws Throwable {
		assertEquals(webPropHelper.getTestDataProperty("SKUForHotDealProductTitle"), getText(r1pdppo.txtProductTitleSOF));
		logger.debug("User entered search key :: " + searchKey + "and the search title is :: "
				+ getText(r1pdppo.txtProductTitle));
	}
	
	@Then("^user should see different attribute and size of the Bundle Product$")
	public void user_should_see_different_attribute_and_size_of_the_Bundle_product() throws Throwable {
		assertTrue(isDisplayed(r1pdppo.secProductAttributeSizesBundle));
	}
	
	@Then("^user should be able to see the search term in the product title for Baits Product$")
	public void user_should_be_able_to_see_the_search_term_in_the_product_title_Baits() throws Throwable {
		assertEquals(webPropHelper.getTestDataProperty("BaitsProductTitle"), getText(r1pdppo.txtProductTitlenew));
		logger.debug("User entered search key :: " + searchKey + "and the search title is :: "
				+ getText(r1pdppo.txtProductTitlenew));
	}
	
	@Then("^user should be able to see the search term in the DSV product title$")
	public void user_should_be_able_to_see_the_search_term_in_the_DSV_product_title() throws Throwable {
		assertEquals(webPropHelper.getTestDataProperty("DSVProductTitle"), getText(r1pdppo.txtProductTitlenew));
		logger.debug("User entered search key :: " + searchKey + "and the search title is :: "
				+ getText(r1pdppo.txtProductTitlenew));
	}
	
	@Then("^user should be able to see the search term in the GiftCard title$")
	public void user_should_be_able_to_see_the_search_term_in_the_product_title() throws Throwable {
		assertEquals(webPropHelper.getTestDataProperty("GiftCardTitle"), getText(r1pdppo.txtProductTitleGift));
		logger.debug("User entered search key :: " + searchKey + "and the search title is :: "
				+ getText(r1pdppo.txtProductTitleGift));
	}
	
	@Then("^user should be able to see the search term in the White Glove product title$")
	public void user_should_be_able_to_see_the_search_term_in_the_White_Glove_product_title() throws Throwable {
		assertEquals(webPropHelper.getTestDataProperty("WhiteGloveTitle"), getText(r1pdppo.txtProductTitlenew));
		logger.debug("User entered search key :: " + searchKey + "and the search title is :: "
				+ getText(r1pdppo.txtProductTitlenew));
	}
	

    @Then("^user should be able to see the breadcrumb on thr pdp page$")
    public void user_should_be_able_to_see_the_breadcrumb_on_thr_pdp_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    	assertTrue(r1pdppo.BreadCrumbDisplayed());
    }
    
    @Then("^user should be able to see the HomeDelivery Option$")
    public void user_should_be_able_to_see_the_HomeDelivery_Option() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertTrue(r1pdppo.HomeDeliveryOptionDisplayed());
    }
	
    @Then("^user should be able to see the Store Option$")
    public void user_should_be_able_to_see_the_Store_Option() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertTrue(r1pdppo.StoreOptionDisplayed());
    }
    
    @Then("^user should see the Question and Answer section$")
    public void user_should_see_the_Question_and_Answer_section() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertTrue(r1pdppo.QuesAnsDisplayed());
    }
    
    @Then("^user should be able to see the SKU Id$")
    public void user_should_be_able_to_see_the_SKU_Id() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertEquals(webPropHelper.getTestDataProperty("ammoSKU"), getText(r1pdppo.SKUid));
		logger.debug("User entered SKU :: " + searchKey + "and the SKU ID displayed is :: "
				+ getText(r1pdppo.SKUid));
    }

    @Then("^user should be able to see the item value$")
    public void user_should_be_able_to_see_the_item_value() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertTrue(r1pdppo.ItemValueDisplayed());
    }
    
    @Then("^user should be able to see Color$")
    public void user_should_be_able_to_see_Color() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertTrue(r1pdppo.ColorDisplayed());
    }

    @Then("^user should be able to see the rating$")
    public void user_should_be_able_to_see_the_rating() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertTrue(r1pdppo.RatingDisplayed());
    }

    @Then("^user should be able to see the reviews$")
    public void user_should_be_able_to_see_the_reviews() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertTrue(r1pdppo.ReviewDisplayed());
    }
    
   
    @And("^user verify the ammo legal disclaimer on PDP$")
	public void user_verify_the_ammo_disclaimer_on_PDP() {
		assertTrue(r1pdppo.AmmoDisclaimerdisplayed());
	}
		

    @Then("^Verify the Brand name in Breadcrumb$")
    public void Verify_the_Brand_name_in_Breadcrumb() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertTrue(isDisplayed(r1pdppo.NikeBrandBreadCrumb));
    
    }
    
    @Then("^Verify the category name in Breadcrumb$")
    public void Verify_the_category_name_in_Breadcrumb() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertTrue(isDisplayed(r1pdppo.SportsBreadCrumb));
    
    }
    
    @Then("^Verify the Hot Deal in Breadcrumb$")
    public void Verify_the_Hot_Deal_in_Breadcrumb() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertTrue(isDisplayed(r1pdppo.HotdealsBreadCrumb));
    
    }
    
    @Then("^Verify the clothing in Breadcrumb$")
    public void Verify_the_clothing_in_Breadcrumb() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertTrue(isDisplayed(r1pdppo.clothingBreadCrumb));
    
    }
    
    
    @Then("^Verify that the PLP page of baits is displayed$")
    public void verify_that_the_PLP_page_of_baits_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    	assertTrue(isDisplayed(r1pdppo.BaitsLuresBreadCrumb));
    }
    
    @Then("^Verify that the PLP page of the Soft Baits is displayed$")
    public void verify_that_the_PLP_page_of_soft_baits_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    	assertTrue(isDisplayed(r1pdppo.SoftBaitsBreadCrumb));
    }

    @When("^user navigates to PLP page of Hot Deals$")
    public void user_navigates_to_PLP_page_of_Hot_Deals() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    	r1pdppo.navigateToHotdeals();
    	
    }
    
    @When("^user navigates to PLP page of clothing$")
    public void user_navigates_to_PLP_page_of_clothing() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    	r1pdppo.navigateToClothing();
    	
    }
    
    @And("^user should be able to see Hot Deals mention in the current url$")
	public void user_should_be_able_to_see_HotDeals_mention_in_the_current_url() throws Throwable {

		String currentURL = getCurrentPageURL();
		if (currentURL.contains("hot-deals")) {
			logger.debug("User is successfully navigated to HotDeals PLP page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to HotDeals PLP instead navigated to URL :: " + currentURL);
		}
	}

    @Then("^Verify that selected PLP of Brand should be displayed$")
    public void verify_that_selected_PLP_of_Brand_should_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    	assertTrue(isDisplayed(r1pdppo.CrocsBreadCrumb));
    	assertTrue(isDisplayed(r1pdppo.BrandsBreadCrumb));
    }

    @Then("^Verify that the title for baits is displayed$")
    public void verify_that_the_title_for_baits_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    	waitForElement(r1pdppo.BaitsTitle);
    	assertTrue(isDisplayed(r1pdppo.BaitsTitle));
    
    }
    
    @Then("^Verify that the title for soft baits is displayed$")
    public void verify_that_the_title_for_soft_baits_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    	waitForElement(r1pdppo.SoftBaitsTitle);
    	assertTrue(isDisplayed(r1pdppo.SoftBaitsTitle));
    }
    
}
