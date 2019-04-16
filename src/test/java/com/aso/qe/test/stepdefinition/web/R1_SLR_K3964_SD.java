package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_SLR_K3964_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_728_Web_SD.class);

	R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	//public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(driver, ShoppingCartViewPO.class);
	public R1_SearchProduct_PO searchProductPO =  PageFactory.initElements(driver, R1_SearchProduct_PO.class);

	@Then("^User should be able to see Search Box on Homepage$")
	public void User_should_be_able_to_see_Search_Box_on_Homepage() throws Throwable {
		globalElementHeader.validatingTxtSearchBox();
	

	}
	@Then("^User should be able to see Search Lens$")
	public void User_should_be_able_to_see_Search_Lens() throws Throwable {
		globalElementHeader.validitingClickingOnSearchLens();

	}
	
	@Then("^User enter the search data$")
	public void User_enter_the_search_data() throws Throwable {
		globalElementHeader.entertheSearchData();

	}
	
	@Then("^User enter the data$")
	public void User_enter_the_data() throws Throwable {
		globalElementHeader.entertheData();

	}
	@Then("^User enter the search data which has pagination$")
	public void User_enter_the_search_data_which_has_pagination() throws Throwable {
		globalElementHeader.entertheSearchDataForPagination();
		

	}
	@Then("^User enter the null data$")
	public void User_enter_the_null_data() throws Throwable {
		globalElementHeader.entertheNullData();

	}
	@Then("^User enter the color$")
	public void User_enter_the_color() throws Throwable {
		globalElementHeader.entertheColor();

	}
	@And("^User click on search icon$")
	public void User_click_on_search_icon() throws Throwable 
	{
		if("mobile".equalsIgnoreCase(testtype)) 
		{
		//globalElementHeader.clickOnButton();
		waitForPageLoad(driver);
		Thread.sleep(Constants.thread_low); 
		clickOnButton(globalElementHeader.magnify_M);
		}
		else
		{
		       waitForPageLoad(driver);
		       Thread.sleep(Constants.thread_low); 
		              clickOnButton(globalElementHeader.btnSearch_Desktop);  

		}
	}
	@Then("^User is navigated to pdp page$")
	public void User_is_navigated_to_pdp_page() throws Throwable {
		globalElementHeader.verifyThePDPPage();

	}
	@Then("^User is navigated to clp page$")
	public void User_is_navigated_to_clp_page() throws Throwable {
		globalElementHeader.verifyTheCLPPage();

	}

	@Then("^User is navigated to null page$")
	public void User_is_navigated_to_null_page() throws Throwable {
		globalElementHeader.verifyTheNullPage();

	}
	
	
	@Then("^User verify the product name$")
	public void User_verify_the_product_name() throws Throwable{
		searchProductPO.verifyProductName();
	}

	
}
