package com.aso.qe.test.stepdefinition.web;



import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_K3613_SD extends CommonActionHelper {
	
	R2_Cart_PO r2CartPO=PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_R1_Fun_PO r2R1FunPO=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_Sanity_PO r2SanityPo=PageFactory.initElements(driver,R2_Sanity_PO.class);
	
	@When("^clicks on the Select Store link in the header$")
	public void clicks_on_the_Select_Store_link_in_the_header() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype))
				{
			assertTrue(clickOnButton(r2CartPO.lnkFindAStore_M));
				}else
				{
		assertTrue(clickOnButton(r2CartPO.lnkFindaStoreHomePage));
				}
	}

	@Then("^user should be able to see the Find a Store modal prompting up$")
	public void user_should_be_able_to_see_the_Find_a_Store_modal_prompting_up() throws Throwable {
		assertTrue(isDisplayed(r2CartPO.fieldStoreModal));		
	}
	
	@Then("^user enters ZIP \"(.*?)\" code manually in the search input bar$")
	public void user_enters_ZIP_code_manually_in_the_search_input_bar(String zipcode) throws Throwable {
		waitForElement(r2CartPO.textzipCode);
		setInputText(r2CartPO.textzipCode,  webPropHelper.getTestDataProperty(zipcode));
	}

	@Then("^Clicks submit button$")
	public void clicks_submit_button() throws Throwable {
		assertTrue(clickOnButton(r2CartPO.submitZipCode));		
	}

	@Then("^store results should get displayed on the basis of ZIPCode entered$")
	public void store_results_should_get_displayed_on_the_basis_of_ZIPCode_entered() throws Throwable {
		assertTrue(isDisplayed(r2CartPO.storeDetails));
		Thread.sleep(Constants.thread_medium);
		
	}

	@Then("^user clicks on one of the category and navigates to LOne SOF$")
	public void user_clicks_on_one_of_the_category_and_navigates_to_LOne_page_SOF() throws Throwable {
		   if("mobile".equalsIgnoreCase(testtype)){      
			  // waitForElement(r2SanityPo.AS_btnShopCategory_m);
				//assertTrue((clickOnButton(r2SanityPo.AS_btnShopCategory_m)));
				assertTrue(clickOnButton(r2R1FunPO.btnOutdoorCategory));
				Thread.sleep(Constants.thread_medium);
        }else {
        	waitForElement(r2SanityPo.AS_btnShopCategory);
    		assertTrue((clickOnButton(r2SanityPo.AS_btnShopCategory)));
    		assertTrue(clickOnButton(r2R1FunPO.btnOutdoorCategory));
    		Thread.sleep(Constants.thread_medium);
        }
				
	}
	@Then("^user clicks on one of the subcategory and navigates to LTwo SOF$")
	public void user_clicks_on_one_of_the_subcategory_and_navigates_to_LTwo_page_SOF() throws Throwable {
		   if("mobile".equalsIgnoreCase(testtype)){      
			   waitForElement(r2R1FunPO.secCategory_CLPMobile);
				assertTrue(clickOnButton(r2R1FunPO.secCategory_CLPMobile));
				assertTrue(clickOnButton(r2R1FunPO.productPLP_m));
				Thread.sleep(Constants.thread_medium);
        }else {
        	waitForElement(r2R1FunPO.secCategory_CLP);
    		assertTrue(clickOnButton(r2R1FunPO.secCategory_CLP));
    		assertTrue(clickOnButton(r2R1FunPO.productPLP));
    		Thread.sleep(Constants.thread_medium);
        }
		

	}
	@Then("^user clicks on one of the product category and navigates to LThree SOF$")
	public void user_clicks_on_one_of_the_product_category_and_navigates_to_LThree_page_SOF() throws Throwable {
		   if("mobile".equalsIgnoreCase(testtype)){      
			   waitForElement(r2R1FunPO.AS_productPLP1_m);
	    		assertTrue(clickOnButton(r2R1FunPO.AS_productPLP1_m));
	    		Thread.sleep(Constants.thread_medium);
        }else {
        	waitForElement(r2SanityPo.AS_productPLP1);
    		assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
    		Thread.sleep(Constants.thread_medium);
        }
		
	}
	
	@Then("^clicks on the Change Pickup Location link$")
	public void clicks_on_the_Change_Pickup_Location_link() throws Throwable {
		assertTrue(clickOnButton(r2R1FunPO.ChooseLocation_Lnk));   
	}

	@Then("^user should be able to see the Find a Store modal$")
	public void user_should_be_able_to_see_the_Find_a_Store_modal() throws Throwable {
		assertTrue(isDisplayed(r2CartPO.fieldStoreModal)); 
	}

}
