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
	@And("^User Sees the Variant of \"(.*?)\" Product$")
	public void isVarientDisplayed(String variantProduct) {
		assertTrue( pdp.isVarientDisplayed(variantProduct));
	}
	@Then("^User Change the variants of \"(.*?)\" to \"(.*?)\" , \"(.*?)\"$")
	public void changeVariant(String variantType, String variantSize, String variantColor) {
		pdp.changeVariant(variantType,variantSize,variantColor);
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
	@Then("^User sees the Pickup And Delivery Option$")
	public void isPickUpandDeliveryOptionDisplayed() {
		
	}
	@Then("^User click on the Color Variant$")
	public void tapOnColor() {
		pdp.tapOnColor();
	}
	@And("^Add to cart button is disabled$")
	public void isEnabledAddToCart() {
		pdp.isDisabledAddtoCart();
				
	}
	@Then("^user enabled the radio button$")
	public void tapOnRadioBtn() {
		pdp.tapOnRadioBtn();
	}
	@And("^User sees the label \"([^\"]*)\"$")
	public void isLabelDisplayed(String label) {
		assertTrue(pdp.isLabelDisplayed(label));
	}
	@And("^User sees the Sub label \"([^\"]*)\"$")
	public void isSubLabelDisplayed(String sublabel) {
		assertTrue(pdp.isSubLabelDisplayed(sublabel));
	}
	@And("^user Select the Store \"([^\"]*)\"$")
	public void changeStore(String storeName) {
		pdp.changeStore(storeName);
	}
	@And("^User sees the \"([^\"]*)\"$")
	public void isMessageDisplayed(String expactedMsg) {
		
	}

	
	

	
}
