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
	
	@Then("^user should be able to see the search term in the product title for Bundle Product$")
	public void user_should_be_able_to_see_the_search_term_in_the_product_title_Bundle() throws Throwable {
		assertEquals(webPropHelper.getTestDataProperty("SKUForBundleProductTitle"), getText(r1pdppo.txtProductTitleBundle));
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
		

    
    
}
