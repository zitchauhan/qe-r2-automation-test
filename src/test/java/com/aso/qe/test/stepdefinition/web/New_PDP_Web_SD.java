package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class New_PDP_Web_SD extends CommonActionHelper
{
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);

	@Then("^abc$")
	public void abc() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
		
		}
		else
		{
			
		}

}
}


	

