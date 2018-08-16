package com.aso.qe.test.stepdefinition.web;


import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.HomePagePOM;
import com.aso.qe.test.pageobject.PLP_PO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_1401_Web_SD extends CommonActionHelper{

	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	PLP_PO plp_po= PageFactory.initElements(driver, PLP_PO.class);

	HomePagePOM hp_p=PageFactory.initElements(driver, HomePagePOM.class);
	@Then("^user navigate to men shoe L_TWO page$")
	public void user_navigate_to_men_shoe_L_TWO_page() throws Throwable {

		waitForPageLoad(driver);
		Thread.sleep(2000);
		assertTrue(clickOnButton(hp_p.btnShop));
		Actions hover = new Actions(getDriver());

		hover.moveToElement(hp_p.btnShoe).build().perform();

		assertTrue(clickOnButton(globalElementHeader.TxtMenShoeL2));

	}

	@Then("^user verify the title of L_TWO page as men shoe$")
	public void user_verify_the_title_of_L_TWO_page_as_men_shoe() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.btnMensClothingMobile));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader. btnNavigateToShirtMobile));
			Thread.sleep(2000);
		}else {
			assertTrue(isDisplayed(globalElementHeader.txtPageHeaderAsMenShoe));
			System.out.println(globalElementHeader.txtBreadCrumbMenShoe.getText());
			assertEquals(globalElementHeader.txtBreadCrumbMenShoe.getText(), "Men's Shoes");
		}
	}

	@Then("^user is able to see Bazaar voice section$")
	public void user_is_able_to_see_Bazaar_voice_section() throws Throwable {
		assertTrue(isDisplayed(plp_po.secBazaarVoiceSpotlight));

	}

	@Then("^user able to see all the neccesary attributes of bazaar voice container$")
	public void user_able_to_see_all_the_neccesary_attributes_of_bazaar_voice_container() throws Throwable {

		assertTrue(isDisplayed(plp_po.btnScrollRightBVCarousel));
		assertTrue(isDisplayed(plp_po.secBVFadedReviews));
	}



}
