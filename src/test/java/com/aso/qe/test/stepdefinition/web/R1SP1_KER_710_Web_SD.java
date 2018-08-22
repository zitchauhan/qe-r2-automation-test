package com.aso.qe.test.stepdefinition.web;



import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.TreeSet;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.HomePagePOM;



import cucumber.api.java.en.Then;

public class R1SP1_KER_710_Web_SD extends CommonActionHelper{
	
	public GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);

	
	public HomePagePOM hp_p=PageFactory.initElements(driver, HomePagePOM.class);
	
	
	
	@Then("^User navigates to L(\\d+) from home page for grid sorting$")
	public void user_navigates_to_L_from_home_page_for_grid_sorting(int arg1) throws Throwable {
		
		
		waitForPageLoad(driver);
		Thread.sleep(5000);
		if("mobile".equalsIgnoreCase(testtype)){
			Thread.sleep(2000);
			assertTrue(clickOnButton(hp_p.btnShoe_M));
			Thread.sleep(2000);
			assertTrue(clickOnButton(hp_p.btnBoysShoe));
			Thread.sleep(2000);
			assertTrue(clickOnButton(hp_p.btnBoysShoe_M));
			Thread.sleep(4000);
			
		}else{
			waitForElement(hp_p.btnShop);
			assertTrue(clickOnButton(hp_p.btnShop));
			Actions hover = new Actions(getDriver());
			Thread.sleep(2000);
			hover.moveToElement(hp_p.btnShoe).build().perform();
			Thread.sleep(2000);
			assertTrue(clickOnButton(hp_p.btnBoysShoe));
			Thread.sleep(2000);
			
		}
		
	
	   
	}

	@Then("^User should be able to see L(\\d+) Page for grid sorting$")
	public void user_should_be_able_to_see_L_Page_for_grid_sorting(int arg1) throws Throwable {
	   
		scrollPageToWebElement(hp_p.optionFirstClick);
		clickOnButton(hp_p.optionFirstClick);
		 Thread.sleep(3000);
	}
	
	@Then("^navigate to sort by and navigate to best selling$")
	public void navigate_to_sort_by_and_navigate_to_best_selling() throws Throwable {	
		
		if("mobile".equalsIgnoreCase(testtype)){
			selectByText(hp_p.selectbySortBy, "Price (Low-High)");			
			Thread.sleep(4000);
		}else{
			
			 scrollPageToWebElement(hp_p.sortByOption);
			   clickOnButton(hp_p.sortByOption);
			   Thread.sleep(3000);
			   clickOnButton(hp_p.selPriceLowToHigh);
			   Thread.sleep(3000);
		}
		
	}
	
	
	
	@Then("^select low to high$")
	public void select_low_to_high() throws Throwable {
		selectByText(hp_p.selectbySortBy, "Price (High-Low)");
		Thread.sleep(4000);
	}
	
	@Then("^navigate to sort by and navigate to best selling in high to low$")
	public void navigate_to_sort_by_and_navigate_to_best_selling_in_high_to_low() throws Throwable {
		scrollPageToWebElement(hp_p.sortByOption);
		   clickOnButton(hp_p.sortByOption);
		   Thread.sleep(3000);
		   clickOnButton(hp_p.selPriceHighToLow);
	}
	
	
	
	@Then("^compare the price is in Low to high mode$")
	public void compare_the_price_is_in_Low_to_high_mode() throws Throwable {
	   String first=getText(hp_p.firstProductPrice);
	   String Second=getText(hp_p.secondProductPrice);
	   String third=getText(hp_p.thirdProductPrice);
	   String forth=getText(hp_p.forthProductPrice);
	
	   Integer first_f=Integer.parseInt(first);
	   Integer second_s=Integer.parseInt(Second);
	   Integer third_t=Integer.parseInt(third);
	   Integer forth_f=Integer.parseInt(forth);
	   System.out.println(first_f+" "+second_s +" "+ third_t +"  " + forth_f);
	   if((first_f <=second_s ) &&(second_s <=third_t) && (third_t <= forth_f)) {
		   System.out.println("Pass");
	   }
	   else {
		   System.out.println("fail");
	   }
	  

	
	}
	
	@Then("^compare the price is in high to low mode$")
	public void compare_the_price_is_in_high_to_low_mode() throws Throwable {
	   
		String first=getText(hp_p.firstProductPrice);
		   String Second=getText(hp_p.secondProductPrice);
		   String third=getText(hp_p.thirdProductPrice);
		   String forth=getText(hp_p.forthProductPrice);
		
		   Integer first_f=Integer.parseInt(first);
		   Integer second_s=Integer.parseInt(Second);
		   Integer third_t=Integer.parseInt(third);
		   Integer forth_f=Integer.parseInt(forth);
		   System.out.println(first_f+" "+second_s +" "+ third_t +"  " + forth_f);
		   if((first_f >=second_s ) &&(second_s >=third_t) && (third_t >= forth_f)) {
			   System.out.println("Pass");
		   }
		   else {
			   System.out.println("fail");
		   }
		
	}
	@Then("^User should be able to sort by brand A to Z$")
	public void user_should_be_able_to_sort_by_brand_A_to_Z() throws Throwable {
		scrollPageToWebElement(hp_p.sortByOption);
		   clickOnButton(hp_p.sortByOption);
		   Thread.sleep(3000);
		   clickOnButton(hp_p.selAtoB);  
		   
		   Thread.sleep(3000);
	}
	
	@Then("^User compare the product baised on A to Z$")
	public void user_compare_the_product_baised_on_A_to_Z() throws Throwable {
	    String first=getText(hp_p.firstBrandName);
	    String second=getText(hp_p.secondBrandName);
	    String third=getText(hp_p.thirdBrandName);	    
	    String forth=getText(hp_p.forthBrandName);
	    
	    TreeSet<String> tree=new TreeSet<String>();
	    tree.add(first);
	    tree.add(second);
	    tree.add(third);
	    tree.add(forth);

	    System.out.println(tree);
	
    
	    
	}
	@Then("^User should be able to see L(\\d+) Page of shoe$")
	public void user_should_be_able_to_see_L_Page_of_shoe(int arg1) throws Throwable {

		if("mobile".equalsIgnoreCase(testtype)){	
			waitForPageLoad(driver);
			Thread.sleep(5000);
			waitForElement(hp_p.btnShop_M);
			assertTrue(clickOnButton(hp_p.btnShop_M));
			Thread.sleep(2000);
			assertTrue(clickOnButton(hp_p.btnMenShoe_M));
			Thread.sleep(2000);
			assertTrue(clickOnButton(hp_p.btnAtheletic_Sneker_M));
			
			
		}else {
			waitForPageLoad(driver);
			Thread.sleep(5000);
			waitForElement(hp_p.btnShop);
			assertTrue(clickOnButton(hp_p.btnShop));
			Actions hover = new Actions(getDriver());
			Thread.sleep(2000);
			hover.moveToElement(hp_p.btnShoe).build().perform();
			clickOnButton(hp_p.btnShoe);

		}
	}

	@Then("^User select the brand facet product from L(\\d+)$")
	public void user_select_the_brand_facet_product_from_L(int arg1) throws Throwable {
	

		if("mobile".equalsIgnoreCase(testtype)){	
			
			assertTrue(clickOnButton(hp_p.brandFacet_M )); 
			   assertTrue(clickOnButton(hp_p.brandFacetAddidas_M));
			   Thread.sleep(3000);
				
			
			
			
			
		}else {
			waitForElement(hp_p.brandFacet);
			 scrollPageToWebElement(hp_p.brandFacet);
			   assertTrue(clickOnButton(hp_p.brandFacet ));
			   waitForElement(hp_p.brandFacetAddidas);
			   assertTrue(clickOnButton(hp_p.brandFacetAddidas));
			   Thread.sleep(3000);
				
		}
	}
	
	@Then("^User Select the product from L(\\d+)$")
	public void user_Select_the_product_from_L(int arg1) throws Throwable {
	    waitForElement(hp_p.firstItemL2);
	    Thread.sleep(5000);
	    scrollPageToWebElement(hp_p.firstItemL2);
		assertTrue(clickOnButton(hp_p.firstItemL2));
	}
	@Then("^User veriy brand facet$")
	public void user_veriy_brand_facet() throws Throwable {
		assertTrue(isDisplayed(hp_p.verifyAddidasFromClearAll));
	   
	}
	@Then("^User navigates to L(\\d+) from home page for shoe catagory$")
	public void user_navigates_to_L_from_home_page_for_shoe_catagory(int arg1) throws Throwable {
		waitForPageLoad(driver);
		Thread.sleep(5000);
		waitForElement(hp_p.btnShop_M);
		assertTrue(clickOnButton(hp_p.btnShop_M));
		Thread.sleep(2000);
		assertTrue(clickOnButton(hp_p.btnMenShoe_M));
		Thread.sleep(2000);
		assertTrue(clickOnButton(hp_p.btnMenShoe_M));
		
	}
}