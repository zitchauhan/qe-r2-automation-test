Feature: [Web]Payment restrictions

@R2_Web @R2_Regression @KER-4039 @ZYP_CART_K4039-10454 @CR-RKA 
Scenario: Verify that PayPal and More Options radio buttons are disabled when Gift Card is applied
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	When user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "GiftcardNumber"
	And user enter Pin Number "PinNumber" 
	And user click on Apply button
	Then applied gift card "GiftcardNumber" should be displayed
	
#@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-6962 @ZYP_CART_K6962-8899 @CR-SK 
#Scenario: Verify Once a gift card is applied, a Remove option should be displayed to the user. 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User navigates to L2 Mens clothing
#	And user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	And user clicks on one of the product category and navigates to LThree 
#	And User is navigated to pdp page 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user navigate to Cart page
#	And user click on checkout button in Cart page
#	And user enter First name "FirstName" 
#	And user enter Last name "LastName" 
#	And user enter Phone number "PhoneNumber" 
#	And user enter Address "Address" 
#	And user enter Zipcode "zipcode" 
#	And user click on Go To Shipping Method button in Checkout page
#	When user click on GiftCard Plus icon in Checkout page
#	And user enter Gift card Number "GiftcardNumber"
#	And user enter Pin Number "PinNumber" 
#	And user click on Apply button
#	And applied gift card "GiftcardNumber" should be displayed
#	Then Remove option is displayed to user