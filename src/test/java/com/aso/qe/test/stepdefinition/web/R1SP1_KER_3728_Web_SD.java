package com.aso.qe.test.stepdefinition.web;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
import cucumber.api.java.en.Then;

public class R1SP1_KER_3728_Web_SD extends CommonActionHelper{
	PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	
	@Then("^User navigates till PDP of multiple sku package$")
	public void user_navigates_till_PDP_of_multiple_sku_package() throws Throwable {
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
			assertTrue(isDisplayed(pdpPageObj.txtDetails_M));
		}
		else
		{
			assertTrue(isDisplayed(pdpPageObj.txtProductTitle));
			scrollPageToWebElement(pdpPageObj.tabDetailsSpecs);
			assertTrue(isDisplayed(pdpPageObj.tabDetailsSpecs));
		}	
		
	}
	
	@Then("^verfiy add to cart functionality$")
	public void verfiy_add_to_cart_functionality() throws Throwable {
			Actions hover=new Actions(getDriver());
			hover.moveToElement(pdpPageObj.imgSubHelmetsCategory);
			assertTrue(clickOnButton(pdpPageObj.imgSubHelmetsCategory));
			assertTrue(clickOnButton(pdpPageObj.btnNextStep));
			assertTrue(clickOnButton(pdpPageObj.btnAddToCart1));
	}
}

