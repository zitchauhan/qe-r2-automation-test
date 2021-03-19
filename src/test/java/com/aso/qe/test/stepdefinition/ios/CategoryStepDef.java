package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;

import com.aso.qe.test.pageobject.ios.CategoryPage;
import com.aso.qe.test.pageobject.ios.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;


public class CategoryStepDef extends GlobalMobileHelper{
//	private CategoryPage categoryPage;
//	private HomePage homePage ;
	//initializeDriver();
	private    CategoryPage categoryPage = new CategoryPage(driver);
	private    HomePage	    homePage =     new HomePage(driver);
	
	@Given("^I choose to navigate \"(.*?)\" on page")
	public void navigateTocategory(String arg1) throws Throwable {
		//initializeDriver();
		//TODO Integrate the code that will add item and move to cart page
	//	categoryPage = new CategoryPage(driver);
//		homePage = new HomePage(driver);
		if(arg1.equalsIgnoreCase("L1Category")) {
		  	
			assertTrue(categoryPage.navigateL1_category());	
			
			
	    }else if(arg1.equalsIgnoreCase("L2Category")) {
	    	
	    	categoryPage.navigateL1_category();
	    	assertTrue(categoryPage.navigateL2_category());	
	    	
	     }
	    if(arg1.equalsIgnoreCase("L3Category")) {
		 
	    	categoryPage.navigateL1_category();
	    	categoryPage.navigateL2_category();
		  assertTrue(categoryPage.navigateL3_category());	
		}
		
		
	}

	@And("^I choose to navigate at \"(.*?)\" landing page")
	public void navigateTocategoryLandingPage(String arg1) throws Throwable {
	//	initializeDriver();
		//TODO Integrate the code that will add item and move to cart page
	//	categoryPage = new CategoryPage(driver);
	//	homePage = new HomePage(driver);
		if(arg1.equalsIgnoreCase("ShopBycategory")) {
			
			categoryPage.ShopBycategory();	
			
			
	    }if(arg1.equalsIgnoreCase("ShopByBrand")){
	    	categoryPage.ShopByBrand();
	    }
	    
	}
	
	@And("^I choose to verify \"(.*?)\" landing page")
	public void verifycategoryLandingPage(String arg1) throws Throwable {
		initializeDriver();
		//TODO Integrate the code that will add item and move to cart page
	//	categoryPage = new CategoryPage(driver);
	//	homePage = new HomePage(driver);
		if(arg1.equalsIgnoreCase("ShopBycategory")) {
			
			categoryPage.verifyShopBycategoryLandingPage();	
			
			
	    }if(arg1.equalsIgnoreCase("ShopByBrand")){
	    	categoryPage.ShopByBrand();
	    }
	    
	}
	 
	@And("^I choose to verify \"(.*?)\" landing page components")
	public void verifycategoryLandingPageComponents(String arg1) throws Throwable {
		initializeDriver();
		//TODO will these tow methods in one
	
		if(arg1.equalsIgnoreCase("ShopBycategory")) {
			
			categoryPage.verifyShopBycategoryLandingPageComponents();	
			
			
	    }if(arg1.equalsIgnoreCase("other")){
	    	categoryPage.verifyShopByBrandLandingPageComponents();
	    }
	    
	}
	@And("^verify the \"(.*?)\" of product in PLP page$")
	public void isBadgeDisplayed(String args) throws Throwable {
		
		assertTrue(categoryPage.isBadgeDisplayedInPLP(args));
	}

	@And("^verify the \"(.*?)\" of product in PLP page attributes$")
	public void verifyPLPAttribute(String args) throws Throwable {
		if(args.equalsIgnoreCase("colour_varient_prod")) {
			assertTrue(categoryPage.verifyColourVarientprod());
		}
		
	}	
	
	
	
}