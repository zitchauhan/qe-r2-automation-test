package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;

import cucumber.api.java.en.Then;


public class SD_SIT_NavigateBackToHomePage extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(SD_SIT_NavigateBackToHomePage.class);
	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);



	@Then("^User is able to see the ASO_Logo$")
	public void User_is_able_to_see_the_ASO_logo()  {
		try{
			logger.debug("LOG URL:"+driver.getCurrentUrl());
			logger.debug("LOG Title:"+driver.getTitle());

			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(globalElementHeader.imgAcademyLogoMobile);
			}
			else{

				isDisplayed(globalElementHeader.imgAcademyLogo);
			}
		}catch (Exception e) {
			logger.error("Exce:: "+e.getMessage());
			e.printStackTrace();
		}
	}


	@Then("^User clicks on ASO Logo and should be navigated to Home Page$")
	public void User_clicks_on_ASO_Logo__and_should_be_navigated_to_Home_Page() throws Throwable{
		  globalElementHeader.clickASO_LOGOAndValidateHomePage();
	}

	@Then("^User clicks on ASO logo$")
	public void User_clicks_on_ASO_Logo() throws Throwable{
		if("mobile".equalsIgnoreCase(testtype)) {
			//assert(clickOnButton(  globalElementHeader.imgAcademyLogoMobile)); 
			for(WebElement ele : globalElementHeader.academyLogoList){
				ele.click();
			}
		}else {
			assertTrue(clickOnButton(globalElementHeader.imgAcademyLogo));
		}
	}

	@Then("^User should be navigated to Home_Page$")
	public void User_should_be_navigated_to_Home_Page() throws Throwable{
		assertEquals("https://uat6www.academy.com", getCurrentPageURL());
	}

}
