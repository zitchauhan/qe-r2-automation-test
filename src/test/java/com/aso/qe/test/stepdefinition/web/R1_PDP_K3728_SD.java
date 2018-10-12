package com.aso.qe.test.stepdefinition.web;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_PDP_K3728_SD extends CommonActionHelper{
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	
	@Then("^User navigates till PLP of multiple sku package$")
	public void user_navigates_till_PLP_of_multiple_sku_package() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
		pdpPageObj.navigateToMultipleSKU_Mobile();
		}
		else
		{
			pdpPageObj.navigateToMultipleSKU();
		}
	}

	@Then("^User click on the product image of sku package$")
	public void user_click_on_the_product_image_of_sku_package() throws Throwable {
		pdpPageObj.clickOnImgSkuItem();
	}
	
	@Then("^verfiy the product details and features$")
	public void verfiy_the_product_details_and_features() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(pdpPageObj.txtDetails);
			assertTrue(isDisplayed(pdpPageObj.txtDetails));
		}
		else
		{
			assertTrue(isDisplayed(pdpPageObj.txtProdcutDetails));
			scrollPageToWebElement(pdpPageObj.tabDetailsSpecs);
			assertTrue(isDisplayed(pdpPageObj.tabDetailsSpecs));
		}	
		
	}
	
	@Then("^verfiy add to cart functionality$")
	public void verfiy_add_to_cart_functionality() throws Throwable {
		Actions hover=new Actions(getDriver());
		hover.moveToElement(pdpPageObj.imgSubHelmetsCategory);
		assertTrue(clickOnButton(pdpPageObj.imgSubHelmetsCategory));
		pdpPageObj.checkBtnNext();
		assertTrue(clickOnButton(pdpPageObj.btnNextStep));
		pdpPageObj.checkBtnaddToCartMultipleSKUPackage();
		assertTrue(clickOnButton(pdpPageObj.btnAddToCart1));
	}
	
	
	@Then("^user navigate to No diff selection product PLP$")
	public void user_navigate_to_No_diff_selection_product_PLP() {
		pdpPageObj.navigateToNoDiffPLP();
	}
	
	@And("^user click on Inground basketball hoops$")
	public void user_click_on_Inground_basketball_hoops() {
		assertTrue(clickOnButton(pdpPageObj.btnIngroundHoops_M));
	}
	
	@And("^User click on the No diff selection product$")
	public void User_click_on_the_No_diff_selection_product() {
		assertTrue(clickOnButton(pdpPageObj.clickNoDiffProduct));
	}
	
	@And("^user add the item to cart$")
	public void user_add_the_item_to_cart() {
		assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
		waitForElement(pdpPageObj.secAddToCartPopup);
		assertTrue(isDisplayed(pdpPageObj.secAddToCartPopup));
	}
}

