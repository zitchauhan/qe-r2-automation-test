Feature: Verify OPIS Order Line Status

#@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-2858 @ZYP_MYACCOUNT_K2858-9731 @CR-SK 
#Scenario: Verify all items in the Order - Authenticated user
#	Given user launches the browser and navigates to "ASO_HOME" page
#	And user logs in as "UserWithZeroProductsInCart"
#    When user enters "SKUForBopisProduct" in the search box
#    When user click on Add to cart button
#    And user will click on View Cart button 
#	And user navigate to Cart page
#	And user selects the ship to Store Pick up radio button
#    
#
#	And user click on checkout button in Cart page
#	And user enter First name "FirstName" 
#	And user enter Last name "LastName" 
#	And user enter Phone number "PhoneNumber" 
#	And user enter Address "Address" 
#	And user enter Zipcode "zipcode" 
#	And user click on Go To Shipping Method button in Checkout page
#	When user click on GiftCard Plus icon in Checkout page
#	And user enter Gift card Number "Valid16DigitGiftCardNumber"
#	And user enter Pin Number "Valid8DigitGiftCardPIN" 
#	And user click on Apply button
#	Then applied gift card "Valid16DigitGiftCardNumber" should be displayed


	Scenario: To verify all items in the Order - Authenticated user 
Given authenticated launches the browser and  places order with BOPIS items 
When user navigates to the Order Details and selected their order via My Account
Then user must be able to view all items in their order
	
