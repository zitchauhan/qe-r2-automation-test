package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;

import cucumber.api.java.en.Then;

public class R1_HP_K728_SD extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_HP_K728_SD.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);



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
			assertTrue(clickOnButton(globalElementHeader.imgAcademyLogoMobile)); 
			waitForPageLoad(driver);
			Thread.sleep(Constants.thread_medium);
//			for(WebElement ele : globalElementHeader.academyLogoList){
//				ele.click();
//			}
		}else {
			assertTrue(clickOnButton(globalElementHeader.imgAcademyLogo));
			waitForPageLoad(driver);
			Thread.sleep(Constants.thread_high);
		}
	}

	//SID 20-September
	@Then("^User should be navigated to Home_Page$")
	public void User_should_be_navigated_to_Home_Page() throws Throwable{
		String homePageCurrentURL="";
		if(homeURL.contains("?debug=aso")) {
			homePageCurrentURL=homeURL.replace("?debug=aso","");
			}
		else if(homeURL.contains("/kermit")) {
			 homePageCurrentURL=homeURL.replace("/kermit","/");
		}
		else if(homeURL.contains("/release1")) {
			 homePageCurrentURL=homeURL.replace("/release1","/");
		}
		else if(homeURL.contains("/release2")) {
			 homePageCurrentURL=homeURL.replace("/release2","/");
		}
		else {
			homePageCurrentURL=homeURL;
		}
		
		assertEquals(homePageCurrentURL, getCurrentPageURL());
	}

}
