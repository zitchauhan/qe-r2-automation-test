package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.Context;
import com.aso.qe.test.pageobject.ios.PLPPage;

import cucumber.api.java.en.Then;

public class PLPStefDef extends GlobalMobileHelper{

	PLPPage plpPage = new PLPPage(driver);
	
	@Then("^User sees \"([^\"]*)\" PLP page$")
	public void user_sees_PLP_page(String categoryName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		plpPage.verifyPLPPageName(driver, categoryName);
	}
	
@Then("^User sees Shop By Category title on PLP$")
public void user_sees_Shop_By_Category_title_on_PLP() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    plpPage.verifyShopByCategorylabel();
}

@Then("^User verifies \"([^\"]*)\" are displaying on PLP$")
public void user_verifies_the_Shop_page_categories_are_displaying_on_PLP_page(String categoryLevel) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	if(categoryLevel.equalsIgnoreCase("L2 categories"))
    plpPage.verifyShopCategoryDisplayedonPLP(driver,Context.getL2CategoryList());
	else if(categoryLevel.equalsIgnoreCase("L3 categories"))
	    plpPage.verifyShopCategoryDisplayedonPLP(driver,Context.getL3CategoryList());
	else if (categoryLevel.equalsIgnoreCase("No categories"))
		plpPage.verifyShopCategoryNotDisplayedonPLP();
}

@Then("^User navigates to \"([^\"]*)\" category on PLP Page$")
public void user_navigates_to_each_category_on_PLP_Page(String categoryName) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   plpPage.navigateToPLPCategories(categoryName);
}

@Then("^I chose to verify \"([^\"]*)\" in PLP Page$")
public void i_chose_to_verify_in_PLP_Page(String args) throws Throwable {
	plpPage.verifyPLP_Banners(args);
    
}

@Then("^I Choose to click on \"([^\"]*)\" Link$")
public void i_Choose_to_click_on_Link(String args) throws Throwable {
   
	plpPage.click_ON_PLP_Link(args);
}

@Then("^I choose to verify navigated to \"([^\"]*)\"$")
public void i_choose_to_verify_navigated_to(String args) throws Throwable {
	
	assertTrue(plpPage.VerifyBannerInWeb(args));	
}


@Then("^I choose to click on \"([^\"]*)\"$")
public void i_choose_to_click_on(String arg1) throws Throwable {
    //TO 
    
}




}
