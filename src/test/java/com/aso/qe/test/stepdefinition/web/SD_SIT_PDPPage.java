package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SD_SIT_PDPPage extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(SD_SIT_PDPPage.class);
	PDP_PO pdp_po = PageFactory.initElements(getDriver(), PDP_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	//public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(driver, ShoppingCartViewPO.class);
	
	@And("^user should be able to see PDP mention in the current url$")
	public void user_should_be_able_to_see_PDP_mention_in_the_current_url() throws Throwable{

		String currentURL = getCurrentPageURL();
		if(currentURL.contains("pdp")) {
			logger.debug("User is successfully navigated to PDP page with URL :: " + currentURL  );
		}
		else {
			logger.debug("User is not able to navigate to PDP instead navigated to URL :: " + currentURL  );
		}
	}
	
	@Then("^User is navigated to pdp page$")
	public void User_is_navigated_to_pdp_page() throws Throwable {
		globalElementHeader.verifyThePDPPage();

	}
	
	@Then("^user should be able to see Image of the product$")
	public void user_should_be_able_to_see_Image_of_the_product() throws Throwable {
		//assert(isDisplayed(pdp_po.secSize2));//To have product in Stock
		if("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(2000);
			assertTrue(isDisplayed(pdp_po.imgProductMainMixedMedia_Mobile));
		}else {
		Thread.sleep(1000);
		assertTrue(isDisplayed(pdp_po.imgProductMainMixedMedia));
		}

	}
	
	@Then("^user should be able to see the name of the product in title$")
	public void user_should_be_able_to_see_the_name_of_the_product_in_title() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			String productTitle = getText(pdp_po.txtProductTitle);
			logger.debug("Product title :: " + productTitle  );
		}else {
		String productTitle = getText(pdp_po.txtProductTitle);
		logger.debug("Product title :: " + productTitle  );
		}
		

	}

	@Then("^user should see different attribute and size of the product$")
	public void user_should_see_different_attribute_and_size_of_the_product() throws Throwable {
		assertTrue(isDisplayed(pdp_po.secProductAttributeSizes));
	}

	@Then("^user should be able to see Add to cart button and quantity section$")
	public void user_should_be_able_to_see_Add_to_cart_button_and_quantity_section() throws Throwable {

		assertTrue(isDisplayed(pdp_po.btnAddToCart));
		assertTrue(isDisplayed(pdp_po.btnQuantityDec));
		assertTrue(isDisplayed(pdp_po.btnQuantityInc));
		assertTrue(isDisplayed(pdp_po.txtDesiredQtyValue_1));

	}
	
	@Then("^user should verify the Product is not for sold online$")
	public void user_should_verify_the_Product_is_not_for_sold_online() throws Throwable {
		assertTrue(isDisplayed(pdp_po.txtNotsoldonline));
	}

	

}
