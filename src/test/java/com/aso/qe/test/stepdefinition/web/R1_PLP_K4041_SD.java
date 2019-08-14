package com.aso.qe.test.stepdefinition.web;






import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;

import cucumber.api.java.en.Then;


public class R1_PLP_K4041_SD extends CommonActionHelper{
	
	
R1_GlobalElementHeader_Home_PO g_hp=PageFactory.initElements(getDriver(), R1_GlobalElementHeader_Home_PO.class);
	
	
	
	@Then("^User to navigate to bottom$")
	public void user_to_navigate_to_bottom() throws Throwable {
		Thread.sleep(Constants.thread_low);
		scrollPageToWebElement(g_hp.iconfacebook);	
		Thread.sleep(Constants.thread_low);
		
	}
	@Then("^verify Auto scroll$")
	public void verify_Auto_scroll() throws Throwable {
	   
	assertTrue(isDisplayed(g_hp.autoscroll));
		
		
	}

	
	
	@Then("^user click on Auto scroll button$")
	public void user_click_on_Auto_scroll_button() throws Throwable {
		Thread.sleep(Constants.thread_low);
		assertTrue(isClickable(g_hp.autoscroll));
		clickOnButton(g_hp.autoscroll);
	}

	
	
}
