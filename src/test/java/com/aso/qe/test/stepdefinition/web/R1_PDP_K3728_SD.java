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
	@Then("^User navigates till PLP of multiple sku$")
	public void user_navigates_till_PLP_of_multiple_sku() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
		pdpPageObj.navigateToMultipleSKUSoccer_Mobile();
		}
		else
		{
			pdpPageObj.navigateToMultipleSKUSoccer();
		}
	}

	@Then("^User click on the product image of sku package$")
	public void user_click_on_the_product_image_of_sku_package() throws Throwable {
		pdpPageObj.clickOnImgSkuItem();
	}

	@Then("^User click on the product image of sku$")
	public void user_click_on_the_product_image_of_sku() throws Throwable {
		pdpPageObj.clickOnImgSku();
	}
	

	@Then("^verfiy the product details and features$")
	public void verfiy_the_product_details_and_features() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(pdpPageObj.txtDetails_M);
			assertTrue(isDisplayed(pdpPageObj.txtDetails_M));
		}
		else
		{
			assertTrue(isDisplayed(pdpPageObj.txtProdcutDetails));
			scrollPageToWebElement(pdpPageObj.txtDetails);
			assertTrue(isDisplayed(pdpPageObj.txtDetails));
		}	
		
	}
	
	@Then("^Add to cart modal is displayed$")
	public void Add_to_cart_modal_is_displayed() throws InterruptedException {
		Thread.sleep(2000);
		waitForElement(pdpPageObj.btnAddToCartModal);
		assertTrue(isDisplayed(pdpPageObj.btnAddToCartModal));
	}
	
	@Then("^verfiy add to cart functionality$")
	public void verfiy_add_to_cart_functionality() throws Throwable {
		try {
			Actions hover=new Actions(getDriver());
			hover.moveToElement(pdpPageObj.imgSubHelmetsCategory);
			assertTrue(clickOnButton(pdpPageObj.imgSubHelmetsCategory));
			pdpPageObj.checkBtnNext();
			assertTrue(clickOnButton(pdpPageObj.btnNextStep));
			pdpPageObj.addToCartAvailability();
			//assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
			assertTrue(clickOnButton(pdpPageObj.shipItButton));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@Then("^verfiy add to cart functionality$")
//	public void verfiy_add_to_cart_functionality() throws Throwable {
//			Actions hover=new Actions(getDriver());
//			hover.moveToElement(pdpPageObj.imgSubHelmetsCategory);
//			assertTrue(clickOnButton(pdpPageObj.imgSubHelmetsCategory));
//			assertTrue(clickOnButton(pdpPageObj.btnNextStep));
//			assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
//	}
	
	@Then("^verfiy add to cart functionality of multiple sku$")
	public void verfiy_add_to_cart_functionality_of_multiple_sku() throws Throwable {
		Actions hover=new Actions(getDriver());
		hover.moveToElement(pdpPageObj.imgSubHelmetsCategory);
		assertTrue(clickOnButton(pdpPageObj.imgSubHelmetsCategory));
		pdpPageObj.checkBtnNext();
		assertTrue(clickOnButton(pdpPageObj.btnNextStep));
		hover.moveToElement(pdpPageObj.imgSubHelmetsCategory);
		assertTrue(clickOnButton(pdpPageObj.imgSubHelmetsCategory));
		pdpPageObj.checkBtnNext();
		assertTrue(clickOnButton(pdpPageObj.btnNextStep));
		pdpPageObj.addToCartAvailability();
		assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
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
		assertTrue(clickOnButton(pdpPageObj.shipItButton));
		waitForElement(pdpPageObj.secAddToCartPopup);
		assertTrue(isDisplayed(pdpPageObj.secAddToCartPopup));
	}
	@Then("^verfiy the product attribute of no diff$")
	public void verfiy_the_product_attribute_of_no_diff() {
		assertTrue(isDisplayed(pdpPageObj.shipItButton));
//		assertTrue(isDisplayed(pdpPageObj.imgSrcSKUAttribute));
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(pdpPageObj.txtDetails_M));
		}
		else
		{
			assertTrue(isDisplayed(pdpPageObj.tabDetailsSpecs));
		}	
	}
	
}

