Feature: PLCC: Discounts_5% Off 

Background: Common Pre-requisite steps 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_FivePercentDiscount" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account

@C-PLCC @Regression @All @PLCC-100 @CR-VS @AutomationSanityR2
Scenario: Verify user is able to get 5% discount for any of the item in academy application
    When user enters "SKUIdOfProductLs15" in the search box plcc
	And user click on search icon 
	And user click on Add to Cart button
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	When user enter plcc card "ValidPLCCCard"
	And user click on REVIEW ORDER button
	And user expect element Order Summary to be present
	And user expect discount text to be present 
	Then user expect five percent discount 
	And user expect element free shipping should not be available 
	When user click on edit my cart link 
	Then user click on remove from cart 
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account
	
@C-PLCC @Regression @All @PLCC-100 @CR-VS @AutomationSanityR2
Scenario: Verify user is able to apply 5% discount along with free shipping offer
    When user enters "SKUIdOfProductGr15" in the search box plcc
	And user click on search icon 
	And user click on Add to Cart button
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	When user enter plcc card "ValidPLCCCard"
	And user click on REVIEW ORDER button
	And user expect element Order Summary to be present
	And user expect element free shipping should be available 
	And user expect discount text to be present 
 	Then user expect five percent discount 
	When user click on edit my cart link 
	Then user click on remove from cart 
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account	
	
@C-PLCC @Regression @All @PLCC-100 @CR-Manju @AutomationSanityR2	
Scenario: Verify user is unable to get 5% discount for Gift card details any of the item in academy application
    When user enters "SKUIdOfProductLs15" in the search box plcc
	And user click on search icon 
	And user click on Add to Cart button
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	And user click on gift card link
	When user enter Gift card "ValidGiftCard"
	And user enter CVV number for Gift card "GiftCardCVV"
	And user click on gift card Apply Button
	And user click on REVIEW ORDER button
	And user expect element Order Summary to be present
	And user expect element Discount not to be present
	And user expect element free shipping should not be available 
	When user click on edit my cart link 
	Then user click on remove from cart 
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account

@C-PLCC @Regression @All @PLCC-100 @CR-Manju @AutomationSanityR2
Scenario: Verify message when user applied gift card along with the discount
    When user enters "SKUIdOfProductLs15" in the search box plcc
	And user click on search icon 
	And user click on Add to Cart button
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	And user click on gift card link
	When user enter Gift card "ValidGiftCard"
	And user enter CVV number for Gift card "GiftCardCVV"
	And user click on gift card Apply Button
	And user expect element Gift card payment applied meesage to be present 
	When user click on edit my cart link 
	Then user click on remove from cart 
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account
	
#@C-PLCC @Regression @All @PLCC-101 @CR-VS 
#    Scenario: To verify Celarance Product price on PDP
#    Given user launches the browser and navigates to "ASO_HOME" page 
#    Then User navigates to L2 page plcc
#    Then Navigate to PLP and select one product with clearance for plcc
#    And User should able to see Strike Through Price with Actual price for plcc
#    When user click on My Account link
#	And user click on Payments link
#	Then delete all credit cards from My Account
	