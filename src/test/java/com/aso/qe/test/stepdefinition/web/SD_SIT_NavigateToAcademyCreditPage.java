package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_AcademyCreditPageObject;

import cucumber.api.java.en.Then;

public class SD_SIT_NavigateToAcademyCreditPage extends CommonActionHelper{
	SIT_AcademyCreditPageObject Academypo = PageFactory.initElements(driver, SIT_AcademyCreditPageObject.class);
	
	
	@Then("^User clicks on AcademyCredit link and should be navigated to AcademyCreditPage$")
		public void User_clicks_on_AcademyCredit_link_and_should_be_navigated_to_AcademyCreditPage() throws Exception {
			
			Academypo.clickAcademycreditLink();
			Academypo.verifyTheAcademyCreditPage();
			
		}
	

}
