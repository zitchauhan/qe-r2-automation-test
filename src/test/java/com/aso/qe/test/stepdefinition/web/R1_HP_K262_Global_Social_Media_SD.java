package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;

import cucumber.api.java.en.Then;

public class R1_HP_K262_Global_Social_Media_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_728_Web_SD.class);
	 
	R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	//public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(driver, ShoppingCartViewPO.class);
	
	
	@Then("^User will verify the presence of Facebook icon$")
	public void user_will_verify_the_presence_of_Facebook_icon() throws Throwable {
		 globalElementHeader.verifypresenceoffacebookicon();
		
	     
	}
	@Then("^User will verify the presence of twitter icon$")
	public void user_will_verify_the_presence_of_twitter_icon() throws Throwable {
		 globalElementHeader.verifypresenceoftwittericon();
		
	     
	}
	@Then("^User will verify the presence of pinterest icon$")
	public void user_will_verify_the_presence_of_pinterest_icon() throws Throwable {
		 globalElementHeader.verifypresenceofpinteresticon();
		
	     
	}
	@Then("^User will verify the presence of youtube icon$")
	public void user_will_verify_the_presence_of_youtube_icon() throws Throwable {
		 globalElementHeader.verifypresenceofyoutubeicon();
		
	     
	}
	@Then("^User will verify the presence of instagram icon$")
	public void user_will_verify_the_presence_of_instagram_icon() throws Throwable {
		 globalElementHeader.verifypresenceofinstagramicon();
		
	     
	}
}
