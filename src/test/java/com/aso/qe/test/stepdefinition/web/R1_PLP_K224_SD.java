package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PLP_PO;

import cucumber.api.java.en.Then;


public class R1_PLP_K224_SD extends CommonActionHelper{
	
 R1_PLP_PO pl_p=PageFactory.initElements(driver, R1_PLP_PO.class);
	
	@Then("^user verify image of product available$")
	public void user_verify_image_of_product_available() throws Throwable {
	  assertTrue(isDisplayed(pl_p.productImage));
	}

	@Then("^user verify colour option in image of product$")
	public void user_verify_colour_option_in_image_of_product() throws Throwable {
	   assertTrue(isDisplayed(pl_p.productColourAvailable));
	}

	@Then("^user verify product price$")
	public void user_verify_product_price() throws Throwable {
	   assertTrue(isDisplayed(pl_p.productPrice));
	}

	@Then("^user verify product name$")
	public void user_verify_product_name() throws Throwable {
	   assertTrue(isDisplayed(pl_p.productName));
	}

	@Then("^user verify product rating$")
	public void user_verify_product_rating() throws Throwable {
	
		 if("mobile".equalsIgnoreCase(testtype)){
			 
			 assertTrue(isDisplayed(pl_p.productRating_M));
		 }
		 else {
		
		assertTrue(isDisplayed(pl_p.productRating)); 
	}}


@Then("^user to click on product image and navigate to PDP$")
public void user_to_click_on_product_image_and_navigate_to_PDP() throws Throwable {
    assertTrue(isClickable(pl_p.productImage));
}


@Then("^user to click on product name and navigate to PDP$")
public void user_to_click_on_product_name_and_navigate_to_PDP() throws Throwable {
   assertTrue(isClickable(pl_p.productName));
}


@Then("^user to navigate to verify Ad feature$")
public void user_to_navigate_to_verify_Ad_feature() throws Throwable {
  
	 if("mobile".equalsIgnoreCase(testtype)){	
		 clickOnButton(pl_p.filter_M);
		 scrollPageToWebElement(pl_p.adFeaturePlus_M);
		 clickOnButton(pl_p.adFeaturePlus_M);
		 if(isDisplayed(pl_p.hotDealOption_M)) {
			 assertTrue(isDisplayed(pl_p.hotDealOption_M));
		 }
		 if(isDisplayed(pl_p.clearanceOption_M)) {
			 assertTrue(isDisplayed(pl_p.clearanceOption_M));
		 }
	 }
	 else {	
	scrollPageToWebElement(pl_p.adFeaturePlus);
  assertTrue(clickOnButton(pl_p.adFeaturePlus));
  if(isDisplayed(pl_p.hotDealOption)) {
  assertTrue(isDisplayed(pl_p.hotDealOption));}
  if(isDisplayed(pl_p.clearanceOption)) {
  assertTrue(isDisplayed(pl_p.clearanceOption));}
}}

	
@Then("^user to navigate to giftcart$")
public void user_to_navigate_to_giftcart() throws Throwable {

   if("mobile".equalsIgnoreCase(testtype)){	
		
	   scrollPageToWebElement(pl_p.footer_M);
	   clickOnButton(pl_p.servicesPlus_M);
	  
	   assertTrue(clickOnButton(pl_p.giftCardLink));
	 
	   assertTrue(clickOnButton(pl_p.shopGiftCardBtm_M));
	  

	   
	}else {
		  scrollPageToWebElement(pl_p.giftCardLink);
		   assertTrue(clickOnButton(pl_p.giftCardLink));
		   scrollPageToWebElement(pl_p.shopGiftCardBtm);
		   assertTrue(clickOnButton(pl_p.shopGiftCardBtm));
		   assertTrue(isDisplayed(pl_p.giftCardShopBreadCrum));

	}

  
  
}	
	
	
	

	
@Then("^User verify displaying review for product where rating is available$")
public void user_verify_displaying_review_for_product_where_rating_is_available() throws Throwable {
    assertTrue(isDisplayed(pl_p.productRating));
}

@Then("^User verify displaying NO review for product where NO rating is available$")
public void user_verify_displaying_NO_review_for_product_where_NO_rating_is_available() throws Throwable {
  
	
	pl_p.segregateTheProductHaving_Rating_and_NoRating();
	
	
	
}


	

}
