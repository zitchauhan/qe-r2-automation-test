package com.aso.qe.test.stepdefinition.web;






import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;

import cucumber.api.java.en.Then;


public class R1_PLP_K4041_SD extends CommonActionHelper{
	
	
GlobalElementHeader_HomePO g_hp=PageFactory.initElements(getDriver(), GlobalElementHeader_HomePO.class);
	
	
	
	@Then("^User to navigate to bottom$")
	public void user_to_navigate_to_bottom() throws Throwable {
		Thread.sleep(3000);
		scrollPageToWebElement(g_hp.iconfacebook);	
		Thread.sleep(1000);
		
	}
	@Then("^verify Auto scroll$")
	public void verify_Auto_scroll() throws Throwable {
	   
	assertTrue(isDisplayed(g_hp.autoscroll));
		
		
	}

	
	
	@Then("^user click on Auto scroll button$")
	public void user_click_on_Auto_scroll_button() throws Throwable {
	   assertTrue(isClickable(g_hp.autoscroll));
	   clickOnButton(g_hp.autoscroll);
	}

	
	
}
