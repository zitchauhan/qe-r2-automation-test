package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.GlobalMobileHelper.Direction;
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
	@And("^User Sees the Variant of \"(.*?)\" Product$")
	public void isVarientDisplayed(String variantProduct) {
		assertTrue( pdp.isVarientDisplayed(variantProduct));
	}
	@Then("^User Change the variants of \"(.*?)\" to \"(.*?)\" , \"(.*?)\" , \"(.*?)\"$")
	public void changeVariant(String variantType, String variantSize, String variantColor, String width) {
		pdp.changeVariant(variantType,variantSize,variantColor, width);
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

	
	
	@Then("^User taps on change store link$")
	public void user_taps_on_change_store_link() throws Throwable {
		swipeScreen(Direction.UP,2);
	   pdp.tapOnChangeStoreLink();
	}
    @And("^User selects delivery option as \"(.*?)\"$")
    public void userSelectsDeliveryOptionAs(String deliveryOption) {

		switch (deliveryOption.toLowerCase()) {
			case "store pickup":
				pdp.selectDeliveryOption("store");
				break;
			case "home delivery":
				pdp.selectDeliveryOption("home");
				break;
			default:
				throw new UnsupportedOperationException("No other delivery option is supported");
		}

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
	@And("^User sees the Store details$")
	public void isStoreDetailsDisplayed() {
		assertTrue( pdp.isStoreDetailsDisplayed());
	}
	@Then("^User taps on Continue shopping button$")
	public void user_taps_on_Continue_shopping_button() throws Throwable {
		pdp.tapOnContiniueShoppingBtn();
	}
	@And("^User Sees The PickUp & Delivery Option$")
	public void isPickUpDeliveryOptionDisplayed() {
		assertTrue( pdp.isPickUpDeliveryOptionsDisplayed());
		
	}
	@And("User Sees the Free Store PickUp Option")
	public void isFreeStorePickUpDisplayed() {
	assertTrue(pdp.isFreeStorePickUpDisplayed());
	}
	
	@And("User sees the Details & Specs")
	public void isDetailsAndSpecsDisplayed() {
		assertTrue(pdp.isDetailsDisplayedOfProduct());
	}
	
	
	@When("^User selects \"([^\"]*)\" delivery option$")
	public void isStoreDetailsDisplayed(String args) {
		 pdp.selectDeliveryOption(args);
	}
	@When("^User selects Store Pick up Delivery option$")
	public void selectStorePickU() throws Throwable {
		pdp.tapOnStorePickUp();
	}
	@When("^verify Store rado button selected$")
	public void StoreRadioButtonSelected() throws Throwable {
		pdp.verifyStoreRadioButtonSelected();
	}
	@Then("^User sees the Alert Pop Up$")
	public void user_sees_the_Alert_Pop_Up()  {
	   
	  assertTrue( pdp.isAlertPopUpDisplayed());
	    
	}

	@Then("^user click on Open Live Chat$")
	public void user_click_on_Open_Live_Chat()  {
	    
	  pdp.tapOnLiveChat();
	}

	@Then("^User sees the Open live chat URL$")
	public void user_sees_the_Open_live_chat_URL()  {
	   assertTrue(pdp.isNavigateToLiveChatUrl());
	}
	@When("^User click on continue shopping$")
	public void user_click_on_continue_shopping() throws Throwable {
	    pdp.tapOnContiniueShoppingBtn();
	}
	@Then("^user sees the Bulk gift card button$")
	public void user_sees_the_Bulk_gift_card_button() throws Throwable {
	   assertTrue(pdp.isBulkGiftCardBtnDisplayed());
	}




	

	//OMNO-26981
	@Then("^I choose to click on \"([^\"]*)\" in PDP page$")
	public void click_on_PDP_page(String arg1) throws Throwable {
	    pdp.tapOnPurchaseButton();
	}

	//OMNI-34006
	@Then("^User sees cart badge on top$")
	public void user_sees_cart_badge_on_top() {
		assertTrue(pdp.isCartBadgeDisplayed());
	}
	
	@Then("^User sees the correct item count on the cart badge as \"([^\"]*)\"$")
	public void user_sees_cart_badge_count_as(String arg1) {
		pdp.ItemsCountOnCartBadge(arg1);
	}

	@Then("^i Choose to validate that \"([^\"]*)\" Shown on PDP$")
	public void i_Choose_to_validate_that_Shown_on_PDP(String elementname) throws Throwable {
		assertTrue(PDPPage.VarifyElementPresenseOnPDPPage(elementname));
	}

	@Then("^i Choose to validate that \"([^\"]*)\" Shown on PDP under Store Section$")
	public void i_Choose_to_validate_that_Shown_on_PDP_under_Store_Section(String elementname) throws Throwable {
		assertTrue(PDPPage.VarifyElementPresenseOnPDPUnderStoreSEction(elementname));

	}

	@Then("^User sees Product title on header$")
	public void user_sees_Product_title_on_header() {
		assertTrue(pdp.isProductTitleOnHeaderDisplayed());
	}

	@Then("^User sees back button$")
	public void user_sees_back_button() {
		assertTrue(pdp.isBackButtonDisplayed());
	}

	@When("^User scrolls up to the top$")
	public void user_scrolls_up_to_the_top() {
		swipeScreen(Direction.DOWN,3);
	}

	@Then("^User sees header will not be displayed$")
	public void user_sees_header_will_not_be_displayed() {
		assertTrue(pdp.isProductTitleOnHeaderDisplayed());
	}

	@When("^User taps on cart badge$")
	public void user_taps_on_cart_badge() {
		pdp.tapOnCartBadge();
	}


	@Then("^user click on \"([^\"]*)\" on PDP$")
	public void user_click_on_on_PDP(String elementname) throws Throwable {
		PDPPage.clickonPDP(elementname);
	}

	//@Then("^i Choose to validate that \"([^\"]*)\" Shown on PDP$")
	//public void i_Choose_to_validate_that_Shown_on_PDP(String elementname) throws Throwable {
		//assertTrue(PDPPage.VarifyElementPresenseOnPDPPage(elementname));
	//}
	@Then("^user Scroll down and click on rating and review$")
	public void user_Scroll_down_and_click_on_rating_and_review() throws Throwable {
	   pdp.tapOnRatingAndReview();
	}
	@Then("^User sees the All rating and review on rating and review page$")
	public void user_sees_the_All_rating_and_review_on_rating_and_review_page() throws Throwable {
	    pdp.isRatingsAndReviewDisplayed();
	    
	}
	@Then("^User clicks on Write a review Button$")
	public void user_clicks_on_Write_a_review_Button() throws Throwable {
	    pdp.tapOnWriteReviewBtn();
	}
	@Then("^User sees the Review Page$")
	public void user_sees_the_Review_Page() throws Throwable {
	  assertTrue( pdp.isReviewPageDisplayed());
	}
	@Then("^User Enter the Rating (\\d+)$")
	public void user_Enter_the_Rating(int ratingValue) throws Throwable {
	    pdp.enterRatingValue(ratingValue);
	}
	@Then("^User Enter the \"([^\"]*)\"  Value \"([^\"]*)\" on Review Page$")
	public void user_Enter_the_Value_on_Review_Page(String editBoxType, String value) throws Throwable {
	    pdp.enteValuesOnReviewPage(editBoxType, value);
	}
	@Then("^user click on the checkbox \"([^\"]*)\"$")
	public void user_click_on_the_checkbox(String checkBoxType) throws Throwable {
	    pdp.clickOnCheckBox(checkBoxType);
	}
	@Then("^User click on Post Review button$")
	public void user_click_on_Post_Review_button() throws Throwable {
	   pdp.tapOnPostReviewBtn();
	}
	@Then("^user redirected to Ratings & Review details page$")
	public void user_redirected_to_Ratings_Review_details_page() throws Throwable {
	   assertTrue( pdp.isRatingAndReviewDetailsPageDisplayed());
	}
	@Then("^User sees the \"([^\"]*)\" on Review Details Page$")
	public void user_sees_the_on_Review_Details_Page(String fieldType) throws Throwable {
	    pdp.isFieldDisplayedOnReviewDetailsPage(fieldType);
	}
	@Then("^user sees the yes \"([^\"]*)\" No \"([^\"]*)\" And Report \"([^\"]*)\" at Helpfull review qn$")
	public void user_sees_the_yes_No_And_Report_at_Helpfull_review_qn(String yesStat, String noStat, String reportStat) throws Throwable {
	   pdp.isElementEnabled(yesStat, noStat, reportStat);
	}
	@Then("^user click on \"([^\"]*)\" on Helpfull Review qn$")
	public void user_click_on_on_Helpfull_Review_qn(String answer) throws Throwable {
	   pdp.tabOnHelpfullReviewQn(answer);
	}

	@Then("^user see \"([^\"]*)\" on getnotify page$")
	public void VarifyElementPresenseOngetnotifypage(String elementname) throws Throwable {
		assertTrue(PDPPage.VarifyElementPresenseOngetnotifypage(elementname));

	}
	
	@Then("^i choose to enter \"([^\"]*)\" on getnotify page$")
	public void Enteremailongetnotifypage(String elementname) throws Throwable {
		PDPPage.Enteremailongetnotifypage(elementname);
	@Then("^User validates the share icon on PDP page and taps on it$")
	public void user_validate_the_share_icon_onPDP_Page()throws Throwable {
		pdp.tapOnShareIconPDP();
	}
	
	@And("^User validates share tray is opened with product thumbnail and image$")
	public void user_validate_share_tray_product_thumbnail_image() {
		pdp.ValidateProductImgOnShareTray();
	}

	@Then("^i click on \"([^\"]*)\" on getnotify page$")
	public void clickongetnotifypage(String elementname) throws Throwable {
		PDPPage.clickongetnotifypage(elementname);
	}
}
