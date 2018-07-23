package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.Then;

public class SD_SIT_SearchGrid extends CommonActionHelper{
	SearchProductPO searchProductPO = PageFactory.initElements(getDriver(), SearchProductPO.class);


	
	
	
	@Then("^user should verify the Grid view$")
	public void user_should_verify_the_Grid_view() throws Throwable {
	    
	}
}
