package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.GCPDPPage;
import com.aso.qe.test.pageobject.ios.PDPPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class GCPDPStepDef extends GlobalMobileHelper{
	
	PDPPage pdp = new PDPPage(driver);
	GCPDPPage gcpdp = new GCPDPPage(driver);
	//@Then("^User sees product image$")
	/*
	 * public void isProductImageDisplayed() throws Throwable { Thread.sleep(5000);
	 * assertTrue(pdp.isHeroImageDisplayed()); }
	 * 
	 * @And("^User sees Product title$") public void isProductTitleDisplayed()
	 * throws Throwable { assertTrue(pdp.isProductTitleDisplayed()); }
	 * 
	 * @And("^User sees Product Price$") public void isProductPriceDisplayed()
	 * throws Throwable { assertTrue(pdp.isProductPriceDisplayed()); }
	 * 
	 * @And("^User taps on add to cart button$") public void tapOnAddToCart() throws
	 * Throwable { pdp.tapOnAddToCart(); }
	 * 
	 * @And("^User taps on View Cart button$") public void tapOnViewCart() throws
	 * Throwable { pdp.tapOnViewCart(); }
	 * 
	 * 
	 * @Then("^User sees product \"([^\"]*)\" on PDP$") public void
	 * isProductAttributeDisplayed(String productAttributeName) throws Throwable {
	 * pdp.verifyProductAttribute(productAttributeName); }
	 * 
	 * 
	 * @Then("^User sees quantity stepper$") public void
	 * isQuantityStepperDisplayed() throws Throwable { swipeScreen(Direction.UP);
	 * assertTrue(pdp.isQuantityStepperDisplayed()); }
	 * 
	 * @When("^User taps on increment quantity stepper$") public void
	 * incrementQuantity() throws Throwable { pdp.tapOnIncrementQtyStepper(); }
	 * 
	 * @When("^User taps on decrement quantity stepper$") public void
	 * decrementQuantity() throws Throwable { pdp.tapOnDecrementQtyStepper(); }
	 * 
	 * @When("^User sets qty to \"(.*?)\"$") public void setQty(String qty) throws
	 * Throwable { pdp.setQty(qty); }
	 * 
	 * @Then("^Quantity is changed to \"(.*?)\"$") public void
	 * validateQuantity(String qty) { assertTrue(pdp.validateQty(qty)); }
	 * 
	 * @And("^User Sees the Variant of \"(.*?)\" Product$") public void
	 * isVarientDisplayed(String variantProduct) { assertTrue(
	 * pdp.isVarientDisplayed(variantProduct)); }
	 * 
	 * @Then("^User Change the variants of \"(.*?)\" to \"(.*?)\" , \"(.*?)\"$")
	 * public void changeVariant(String variantType, String variantSize, String
	 * variantColor) { pdp.changeVariant(variantType,variantSize,variantColor); }
	 * 
	 * @And("^verify the \"(.*?)\" of product$") public void isBadgeDisplayed(String
	 * args) throws Throwable {
	 * 
	 * assertTrue(pdp.isBadgeDisplayed(args)); }
	 * 
	 * @And("^user sees the size varient$") public void isSizeVarientDisplayed() {
	 * assertTrue(pdp.isSizeVarientDisplayed()); }
	 * 
	 * @And("^user sees the color variant$") public void isColorVariantDisplayed() {
	 * assertTrue(pdp.isColorVariantDisplayed()); }
	 * 
	 * @And("^user sees the size chart button$") public void
	 * isSizeChartbtnDisplayed() { assertTrue(pdp.isSizeChartBtnDisplayed()); }
	 * 
	 * @When("^user click on size chart button$") public void tapOnSizeChart() {
	 * pdp.tapOnSizeChart(); }
	 * 
	 * @Then("^user sees the size chart$") public void isSizeChartDisplayed() {
	 * assertTrue(pdp.isSizeChartDisplayed()); }
	 * 
	 * @When("^user click on cancel button$") public void tapOnCancel() {
	 * pdp.tapOnCancelBtn(); }
	 * 
	 * @Then("^user navigate to PDP Page$") public void isPdpPageDisplayed() {
	 * 
	 * }
	 * 
	 * @When("^user click on Large size$") public void tapOnLargeSize() {
	 * pdp.tapOnLargeSize(); }
	 * 
	 * @When("^user click on small size$") public void tapOnSmallSizeVarient() {
	 * pdp.tapOnSmallSize(); }
	 * 
	 * @Then("^size is changed to \"(.*?)\"$") public void ValidateSize(String size)
	 * { assertTrue(pdp.validateVarientSize(size)); }
	 * 
	 * @When("^user click on medium size$") public void tapOnMediumSizeVarient() {
	 * pdp.tapOnMediumSize(); }
	 * 
	 * @And("^user click on Home Delivery$") public void tapOnHomeDelivery() {
	 * pdp.tapOnHomeDelivery(); }
	 * 
	 * @Then("^Size is changed to \"(.*?)\"$") public void ValidateSize1(String
	 * size1) { assertTrue(pdp.validateVarientSize(size1)); }
	 * 
	 * @Then("^user sees the Variant on PDP$") public void isVariantDisplayed() {
	 * assertTrue(pdp.isColorVariantDisplayed()); }
	 * 
	 * @And("^user sees the value of variant$") public void
	 * isVariantValueDisplayed() { assertTrue(pdp.isVariantValueDisplayed()); }
	 * 
	 * @Then("^User sees the Pickup And Delivery Option$") public void
	 * isPickUpandDeliveryOptionDisplayed() {
	 * 
	 * }
	 * 
	 * @Then("^User click on the Color Variant$") public void tapOnColor() {
	 * pdp.tapOnColor(); }
	 * 
	 * @And("^Add to cart button is disabled$") public void isEnabledAddToCart() {
	 * pdp.isDisabledAddtoCart();
	 * 
	 * }
	 * 
	 * @Then("^user enabled the radio button$") public void tapOnRadioBtn() {
	 * pdp.tapOnRadioBtn(); }
	 * 
	 * @And("^User sees the label \"([^\"]*)\"$") public void
	 * isLabelDisplayed(String label) { assertTrue(pdp.isLabelDisplayed(label)); }
	 * 
	 * @And("^User sees the Sub label \"([^\"]*)\"$") public void
	 * isSubLabelDisplayed(String sublabel) {
	 * assertTrue(pdp.isSubLabelDisplayed(sublabel)); }
	 * 
	 * @And("^user Select the Store \"([^\"]*)\"$") public void changeStore(String
	 * storeName) { pdp.changeStore(storeName); }
	 * 
	 * @And("^User sees the \"([^\"]*)\"$") public void isMessageDisplayed(String
	 * expactedMsg) {
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Then("^User taps on change store link$") public void
	 * user_taps_on_change_store_link() throws Throwable {
	 * swipeScreen(Direction.UP,2); pdp.tapOnChangeStoreLink(); }
	 * 
	 * @Then("^I choose to verify \"([^\"]*)\" in PDP Page$") public void
	 * verify_PDP_Page(String args) throws Throwable {
	 * 
	 * assertTrue(pdp.isMessageDisplayed(args)); }
	 * 
	 * @Then("^I choose click on \"([^\"]*)\" in PDP page$") public void
	 * click_on_in_PDP_page(String arg1) throws Throwable {
	 * 
	 * assertTrue(pdp.isVariantValueDisplayed()); }
	 * 
	 * @Then("^I choose to verify user navigated to PDP on Web$") public void
	 * verify_user_navigated_to_PDP_on_Web() throws Throwable {
	 * 
	 * assertTrue(pdp.isNavigatedToPDPOnWeb()); }
	 * 
	 * @When("^User selects Home Delivery checkbox$") public void
	 * selectHomeDelivery() throws Throwable { pdp.tapOnHomeDelivery(); }
	 * 
	 * @When("^User taps on chage store button$") public void tapOnChangeStore()
	 * throws Throwable { pdp.tapOnChangeStore(); }
	 * 
	 * @Then("^User is shown find store screen$") public void
	 * isFindStoreScreenDisplayed() { assertTrue(pdp.isFindStoreScreenDisplayed());
	 * }
	 * 
	 * @When("^User enters \"(.*?)\" in store search field$") public void
	 * enterTextInStoreSearchField(String text) throws Throwable {
	 * pdp.enterTextInStoreSearchField(text); }
	 * 
	 * @Then("^User is shown no store available message$") public void
	 * noStoreAvailableMessageDisplayed() {
	 * assertTrue(pdp.noStoreAvailableMessageDisplayed()); }
	 * 
	 * @Then("^I choose to verify Error Message \"([^\"]*)\"$") public void
	 * i_choose_to_verify_Error_Message(String arg1) throws Throwable {
	 * assertTrue(pdp.isErrorMessageDisplayed(arg1));
	 * 
	 * }
	 * 
	 * @Then("^I choose to verify \"([^\"]*)\"$") public void
	 * i_choose_to_verify(String arg1) throws Throwable {
	 * assertTrue(pdp.VerifyOverlayAttribute(arg1));
	 * 
	 * 
	 * }
	 */
	
	@Then("^User sees gift card image$")
	public void isGiftCardProductImageDisplayed() throws Throwable {
		Thread.sleep(5000);
	    assertTrue(pdp.isHeroImageDisplayed());
	}
	
	@When("^User taps on Giftcard in bottom nav$")
	public void tapOnGiftCard() throws Throwable {
		pdp.tapOnChangeStore();
	}
	
	@Then("^User sees \"([^\"]*)\" on the gift card detail page$")
	public void isGiftCardStandardOrBulk(String message) throws Throwable {
		String actualCartTypeDesc=gcpdp.getGiftCardDescription();
		System.out.println("Product Description :::"+actualCartTypeDesc);
		 assertTrue(actualCartTypeDesc.contains(message));   
	}
	

@Then("^User sees quantity stepper default value as \"([^\"]*)\"$")
public void validateDefaultQtyValue(String quantity) throws Throwable {
	assertTrue(gcpdp.validateQty(quantity));
	
}

@When("^User click on the standard gift card$")
public void user_click_on_the_standard_gift_card() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
}


@When("^User click on the bulk gift card$")
public void user_click_on_the_bulk_gift_card() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^USer see prouct title as \"([^\"]*)\"$")
public void user_see_prouct_title_as(String title) throws Throwable {
	assertTrue(gcpdp.isProductTitleDisplayed());
      assertEquals(gcpdp.getProductTitle(),title);
       
}

@Then("^User see details and description$")
public void isDetailSectionDisplay() throws Throwable {
   assertTrue(gcpdp.isdetailDisplayed());
}

@Then("^User see the Out of stock on PDP page$")
public void isOutOfStockDisplay() throws Throwable {
    assertTrue(gcpdp.isOutOfStockDisplayed());
}



@When("^User tap on Add to Cart button$")
public void user_tap_on_Add_to_Cart_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   MobileElement btnAddToCart= driver.findElement(Locators.PDPPage.buttonAddToCart);
   GlobalMobileHelper.tapOnElement(btnAddToCart);
}


@Then("^User see text \"([^\"]*)\" on ATC page$")
public void user_see_text_on_ATC_page(String msg) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 assertTrue(gcpdp.isAddedToCartDisplayed());
	 
	}

@Then("^User see shipping as label as e-deliery$")
public void user_see_shipping_as_label_as_e_deliery() throws Throwable {
    assertTrue(gcpdp.isShippingTypeDisplayed());
}

@Then("^User see product name on ATC page$")
public void user_see_product_name_on_Added_to_cart_screen() throws Throwable {
	 assertTrue(gcpdp.isGCproductNameDisplayed());
	   
}

@Then("^User see product sku on ATC page$")
public void user_see_product_sku_on_Added_to_cart_screen() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 assertTrue(gcpdp.isGCproductSkuDisplayed());
	   
}

@Then("^User see product qty on ATC page$")
public void user_see_product_qty_on_Added_to_cart_screen() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 assertTrue(gcpdp.isGCproductQtyDisplayed());
	   
}

@Then("^User see product price on ATC page$")
public void user_see_product_price_on_Added_to_cart_screen() throws Throwable {
	 assertTrue(gcpdp.isGCproductPriceDisplayed());
	   
}

@Then("^User see View cart on ATC page$")
public void user_see_View_cart_on_Added_to_cart_screen() throws Throwable {
   assertTrue(gcpdp.isGCViewCartDisplayed());
   
}

@Then("^User see Continue Shopping on ATC page$")
public void user_see_Continue_Shopping_on_Added_to_cart_screen() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(gcpdp.isGCContinueShoppingDisplayed());
   
}

@Then("^User sees card amount section$")
public void isCardAmountComponentDisplay() throws Throwable {
	assertTrue(gcpdp.isCardAmountComponentDisplay());
	assertTrue(gcpdp.isCardAmountLabelDisplay());
   
}

@Then("^User see default card amount value$")
public void verifyDefaultCardAmountValue() throws Throwable {
	assertTrue(gcpdp.isDefaultCardAmountDisplay());
	System.out.println("Default card amount :"+gcpdp.getDefaultCardAmount());
    
}

@When("^User tap on the card amount option as \"([^\"]*)\"$")
public void tapCardAmountOptionWithAmount(String amount) throws Throwable {
	MobileElement cardAmountOption = driver.findElement(Locators.PDPPage.btncardOptionAsAmount);
	GlobalMobileHelper.tapOnElement(cardAmountOption);
    
}

@Then("^User see updated card amount as \"([^\"]*)\"$")
public void verifyCardAmountUpdate(String expectedCardAmount) throws Throwable {
	String actualCardAmount = gcpdp.getDefaultCardAmount();
	assertEquals(actualCardAmount, expectedCardAmount);
    
}

@Then("^User see the instruction message$")
public void isInstructionMessageDisplay() throws Throwable {
	assertTrue(gcpdp.isInstructionMessageDisplay());
  
}

@Then("^User see the Enter Amount field$")
public void isEnterAmountDisplay() throws Throwable {
	assertTrue(gcpdp.isEnterAmountFieldDisplay());
	  
    
}

@Then("^User see default amount value as preselected card amount$")
public void verify_Default_CardAmount_EnterAmount() throws Throwable {
	String expectedDefaultCardAmount = gcpdp.getDefaultCardAmount();	
	String actualDefaultCardAmount=gcpdp.getEnterAmountDefaultValue();
	assertEquals(expectedDefaultCardAmount,actualDefaultCardAmount);
   
}


@Then("^User Enter an amount as \"([^\"]*)\"$")
public void user_Enter_an_amount_as(String Amount) throws Throwable {
	gcpdp.enterQty(Amount);
	
}

@Then("^User see an error message as \"([^\"]*)\"$")
public void user_see_an_error_message_as(String expectedErrorMessage) throws Throwable {
	assertTrue(gcpdp.isGiftCardErrorMessageDisplay());
	assertEquals(gcpdp.getGiftCardErrorMessage(),expectedErrorMessage);
	
	
    
}

@Then("^User see shipping as label as \"([^\"]*)\"$")
public void user_see_shipping_as_label_as(String expectedShippingType) throws Throwable {
	assertEquals(gcpdp.getShippingType(), expectedShippingType);
    
}












   




	
	
	 
	
	
	
	
}
