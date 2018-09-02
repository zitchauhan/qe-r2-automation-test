package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_PLP_K263_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_263_Web_SD.class);
	R1_PLP_PO plp_PO = PageFactory.initElements(getDriver(), R1_PLP_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader_HomePO = PageFactory.initElements(getDriver(), R1_GlobalElementHeader_Home_PO.class);

	@Then("^user clicks on one of the category and navigates to LOne page$")
	public void user_clicks_on_one_of_the_category_and_navigates_to_LOne_page() throws Throwable {
		Thread.sleep(2000);
		assertTrue((clickOnButton(globalElementHeader_HomePO.btnShopCategory)));
		assertTrue(clickOnButton(globalElementHeader_HomePO.btnClothingCategory));
		waitForPageLoad(driver);

	}

	@Then("^user clicks on one of the subcategory and navigates to LTwo page$")
	public void user_clicks_on_one_of_the_subcategory_and_navigates_to_LTwo_page() throws Throwable {
		Thread.sleep(6000);
		assertTrue(clickOnButton(plp_PO.secCategory_CLP));
		waitForPageLoad(driver);

	}


	@Then("^user clicks on one of the product category and navigates to LThree page$")
	public void user_clicks_on_one_of_the_product_category_and_navigates_to_LThree_page() throws Throwable {
		Thread.sleep(2000);
		assertTrue(clickOnButton(plp_PO.secCategory_CLP));//8Aug danush
		waitForPageLoad(driver);
	}

	@And("^user is able to see the product category name in section title\\.$")
	public void user_is_able_to_see_the_product_category_name_in_section_title() throws Throwable {

		assertTrue(isDisplayed(plp_PO.txtSectionTitle));//Its authorable from AEM, Only validating the presence of section

	}


}
