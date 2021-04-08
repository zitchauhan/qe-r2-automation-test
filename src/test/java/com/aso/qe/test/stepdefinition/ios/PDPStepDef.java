package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.PDPPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PDPStepDef extends GlobalMobileHelper{
	
	PDPPage pdp = new PDPPage(driver);
	@Then("^User sees product image$")
	public void isProductImageDisplayed() throws Throwable {
		Thread.sleep(5000);
	    assertTrue(pdp.isHeroImageDisplayed());
	}
	
	@And("^User sees Product title$")
	public void isProductTitleDisplayed() throws Throwable {
		assertTrue(pdp.isProductTitleDisplayed());
	}
	
	@And("^User sees Product Price$")
	public void isProductPriceDisplayed() throws Throwable {
		assertTrue(pdp.isProductPriceDisplayed());
	}
	
	@And("^User taps on add to cart button$")
	public void tapOnAddToCart() throws Throwable {
		pdp.tapOnAddToCart();
	}
	
	@And("^User taps on View Cart button$")
	public void tapOnViewCart() throws Throwable {
		pdp.tapOnViewCart();
	}
		
	
	@Then("^User sees product \"([^\"]*)\" on PDP$")
	public void isProductAttributeDisplayed(String productAttributeName) throws Throwable {
	pdp.verifyProductAttribute(productAttributeName);
	}


	@Then("^User sees quantity stepper$")
	public void isQuantityStepperDisplayed() throws Throwable {
		swipeScreen(Direction.UP);
		assertTrue(pdp.isQuantityStepperDisplayed());
	}
	
	@When("^User taps on increment quantity stepper$")
	public void incrementQuantity() throws Throwable {
		pdp.tapOnIncrementQtyStepper();
	}
	
	@When("^User taps on decrement quantity stepper$")
	public void decrementQuantity() throws Throwable {
		pdp.tapOnDecrementQtyStepper();
	}
	
	@When("^User sets qty to \"(.*?)\"$")
	public void setQty(String qty) throws Throwable {
		pdp.setQty(qty);
	}
	
	@Then("^Quantity is changed to \"(.*?)\"$")
	public void validateQuantity(String qty) {
		assertTrue(pdp.validateQty(qty));
	}
	@And("^verify the \"(.*?)\" of product$")
	public void isBadgeDisplayed(String args) throws Throwable {
		
		assertTrue(pdp.isBadgeDisplayed(args));
	}
	@And("^user sees the size varient$")
	public void isSizeVarientDisplayed() {
		assertTrue(pdp.isSizeVarientDisplayed());
	}

	@And("^user sees the color variant$")
	public void isColorVariantDisplayed() {
		assertTrue(pdp.isColorVariantDisplayed());
	}

	@And("^user sees the size chart button$")
	public void isSizeChartbtnDisplayed() {
		assertTrue(pdp.isSizeChartBtnDisplayed());
	}

	@When("^user click on size chart button$")
	public void tapOnSizeChart() {
		pdp.tapOnSizeChart();
	}

	@Then("^user sees the size chart$")
	public void isSizeChartDisplayed() {
		assertTrue(pdp.isSizeChartDisplayed());
	}

	@When("^user click on cancel button$")
	public void tapOnCancel() {
		pdp.tapOnCancelBtn();
	}

	@Then("^user navigate to PDP Page$")
	public void isPdpPageDisplayed() {
		
	}

	@When("^user click on Large size$")
	public void tapOnLargeSize() {
		pdp.tapOnLargeSize();
	}
	
	@When("^user click on small size$")
	public void tapOnSmallSizeVarient() {
		pdp.tapOnSmallSize();
	}

	@Then("^size is changed to \"(.*?)\"$")
	public void ValidateSize(String size) {
	     assertTrue(pdp.validateVarientSize(size));
	}

	@When("^user click on medium size$")
	public void tapOnMediumSizeVarient() {
		pdp.tapOnMediumSize();
	}

	@And("^user click on Home Delivery$")
	public void tapOnHomeDelivery() {
		pdp.tapOnHomeDelivery();
	}

	@Then("^Size is changed to \"(.*?)\"$")
	public void ValidateSize1(String size1) {
		assertTrue(pdp.validateVarientSize(size1));
	}

	@Then("^user sees the Variant on PDP$")
	public void isVariantDisplayed() {
		assertTrue(pdp.isColorVariantDisplayed());
	}
	
	@And("^user sees the value of variant$")
	public void isVariantValueDisplayed() {
		assertTrue(pdp.isVariantValueDisplayed());
	}
	
	@Then("^User taps on change store link$")
	public void user_taps_on_change_store_link() throws Throwable {
		swipeScreen(Direction.UP,2);
	   pdp.tapOnChangeStoreLink();
	}
	@Then("^I choose to verify \"([^\"]*)\" in PDP Page$")
	public void verify_PDP_Page(String args) throws Throwable {
	   
		assertTrue(pdp.isMessageDisplayed(args));
	}

	@Then("^I choose click on \"([^\"]*)\" in PDP page$")
	public void click_on_in_PDP_page(String arg1) throws Throwable {
	    
		assertTrue(pdp.isVariantValueDisplayed());
	}

	@Then("^I choose to verify user navigated to PDP on Web$")
	public void verify_user_navigated_to_PDP_on_Web() throws Throwable {
	   
		assertTrue(pdp.isNavigatedToPDPOnWeb());
	}
	
	@When("^User selects Home Delivery checkbox$")
	public void selectHomeDelivery() throws Throwable {
		pdp.tapOnHomeDelivery();
	}
	
	@When("^User taps on chage store button$")
	public void tapOnChangeStore() throws Throwable {
		pdp.tapOnChangeStore();
	}
	
	@Then("^User is shown find store screen$")
	public void isFindStoreScreenDisplayed() {
		assertTrue(pdp.isFindStoreScreenDisplayed());
	}
	
	@When("^User enters \"(.*?)\" in store search field$")
	public void enterTextInStoreSearchField(String text) throws Throwable {
		pdp.enterTextInStoreSearchField(text);
	}
	
	@Then("^User is shown no store available message$")
	public void noStoreAvailableMessageDisplayed() {
		assertTrue(pdp.noStoreAvailableMessageDisplayed());
	}
	
	@Then("^I choose to verify Error Message \"([^\"]*)\"$")
	public void i_choose_to_verify_Error_Message(String arg1) throws Throwable {
		assertTrue(pdp.isErrorMessageDisplayed(arg1));
	    
	}
	@Then("^I choose to verify \"([^\"]*)\"$")
	public void i_choose_to_verify(String arg1) throws Throwable {
		assertTrue(pdp.VerifyOverlayAttribute(arg1));
	   
	    
	}
	
}
