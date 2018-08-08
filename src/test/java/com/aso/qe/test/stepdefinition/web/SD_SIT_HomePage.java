package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_HomePagePageObject;

import cucumber.api.java.en.Then;

public class SD_SIT_HomePage extends CommonActionHelper {

	//private static final Logger logger = Logger.getLogger(SD_SIT_HomePage.class);

	public SIT_HomePagePageObject HomePagePo= PageFactory.initElements(driver, SIT_HomePagePageObject.class);


	@Then("^user click on CTA in Shop Collection$")
	public void user_click_on_CTA_in_Shop_Collection() throws Throwable
	{
		//Thread.sleep(3000);
		HomePagePo.clickOnLink(SIT_HomePagePageObject.ShopCollectionCTA);
		HomePagePo.clickOnLink(SIT_HomePagePageObject.ShopCollectionL3);

		//Thread.sleep(3000);

	}


	@Then("^user click on Product Card in Shop Collection$")
	public void user_click_on__Product_card_in_Shop_Collection() throws Throwable
	{
		//Thread.sleep(3000);
		HomePagePo.clickOnLink(SIT_HomePagePageObject.ShopCollectionProductcard);
		//Thread.sleep(3000);

	}


}
