package com.aso.qe.test.stepdefinition.ios;

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
}
