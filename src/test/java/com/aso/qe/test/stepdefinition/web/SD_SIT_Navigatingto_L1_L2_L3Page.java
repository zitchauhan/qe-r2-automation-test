package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PLP_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SD_SIT_Navigatingto_L1_L2_L3Page extends CommonActionHelper{
	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	PLP_PO plp_PO = PageFactory.initElements(getDriver(), PLP_PO.class);
	
	/*
	
	@When("^user clicks on one of the category and navigates to LOne page$")
    public void user_clicks_on_one_of_the_category_and_navigates_to_LOne_page() throws Throwable {
           assertTrue((clickOnButton(globalElementHeader.btnShopCategory)));
           assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));
                     
    }

    @Then("^user clicks on one of the subcategory and navigates to LTwo page$")
    public void user_clicks_on_one_of_the_subcategory_and_navigates_to_LTwo_page() throws Throwable {
           assertTrue(clickOnButton(plp_PO.secCategory_CLP));
          // assertTrue(clickOnButton(plp_PO.secCategory_CLP));
           
    }

    
    @Then("^user clicks on one of the product category and navigates to LThree page$")
    public void user_clicks_on_one_of_the_product_category_and_navigates_to_LThree_page() throws Throwable {
           assertTrue(clickOnButton(plp_PO.productPLP1));
    }

    @And("^user is able to see the product category name in section title\\.$")
    public void user_is_able_to_see_the_product_category_name_in_section_title() throws Throwable {
           
           assertTrue(isDisplayed(plp_PO.txtSectionTitle));//Its authorable from AEM, Only validating the presence of section

    }
    
    @Then("^user clicks on the product card and navigates to PDP of the product$")
	public void user_clicks_on_the_product_card_and_navigates_to_PDP_of_the_product() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(2000);
			assertTrue(clickOnButton(plp_PO.productPLP1_Mobile));
		}else {
			assertTrue(clickOnButton(plp_PO.productPLP1));
		}


	}*/


}
