Feature: B07-250 - Gift Card - Authenticated User: Add New Gift Card at Checkout 

#	blocked
#@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6822 
#@ZYP_CHECKOUT_K6822-7949 @CR-GK 
#Scenario: Verify Add new Gift Card fields 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button 
#	And User navigates to L2 Mens clothing
#	And user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	And user clicks on one of the product category and navigates to LThree 
#	And User is navigated to pdp page 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user navigate to Cart page 
#	And user will click on Checkout button 
#	And user is navigated to order summary page 
#	When user selects "Add a New Gift Card" in Gift Card drop-down 
#	Then Gift Card Number field and PIN fields are displayed 
#	
#blocked	
#@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6822 
#@ZYP_CHECKOUT_K6822-7956 @CR-GK 
#Scenario: Verify Gift card balance is Stored in My account 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button 
#	And User navigates to L2 Mens clothing 
#	And user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	And user clicks on one of the product category and navigates to LThree 
#	And User is navigated to pdp page 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user navigate to Cart page 
#	And user will click on Checkout button 
#	And user is navigated to order summary page 
#	Then user click on GiftCard Plus icon in Checkout page 
#	And user enter Gift card Number "GiftcardNumber" 
#	And user enter Pin Number "PinNumber" 
#	And user click on Apply button 
#	Then applied gift card "GiftcardNumber" should be displayed 
#	And User navigates to Address book 
#	Then gift card balance is stored in My Account 

#@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6822 
#@ZYP_CHECKOUT_K6822-11172 @CR-GK 
#Scenario: 
#	To verify the display of error message when an un-authenticated user is trying to add a GC that starts with 117 series at checkout 
#	Given an un-authenticated user launches academy site in browser and navigated to payment drawer section on checkout page 
#	When enters a GC that starts with 117 
#	Then error message should display as, "The number you entered is an in-store merchandise credit. Please visit your local store to redeem". 


#@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6822 
#@ZYP_CHECKOUT_K6822-11179 @CR-GK 
#Scenario: 
#	To verify the display of error message when an un-authenticated user is trying to add a GC that starts with 507 series at checkout 
#	Given an un-authenticated user launches academy site in browser and navigated to payment drawer section on checkout page 
#	When enters a GC that starts with 507 
#	Then error message should display as, "The number you entered is an in-store merchandise credit. Please visit your local store to redeem". 
#	
#	
#	@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6822
#	@ZYP_CHECKOUT_K6822-7950 @CR-GK 
#	Scenario: Verify No Gift Card drop down for No saved Gift cards 
#		Given Authenticated user launches the browser And navigates to the Checkout Page And is under the payment drawer 
#		When there are no saved Gift cards 
#		Then no Gift Card drop down is displayed 


@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-7953 @CR-GK 
Scenario: Verify Gift card fields displayed - No Previous Gift Cards Saved 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	Then user click on GiftCard Plus icon in Checkout page 
	Then Gift Card Number field and PIN fields are displayed

@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-11177 @CR-GK 
Scenario: 
	verify the display of error message when an unauthenticated user is trying to add a GC that starts with 777 series at checkout 
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
	And user will click on Checkout button 
	And user is navigated to order summary page 
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page 
	Then user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "Series777GiftCard" 
	And user enter Pin Number "Series777GiftCardPin" 
	And user click on Apply button 
	Then applied gift card "Series777GiftCard" should be displayed 

#@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6822 
#@ZYP_CHECKOUT_K6822-7917 @CR-GK 
#Scenario: Verify Add new gift card during checkout user has Saved Gift Cards 
#	Given Authenticated user launches the browser And navigates to the Checkout Page And is under the payment drawer And has more than one saved gift card 
#	When user clicks on Gift Card drop-down 
#	Then Add a New Gift Card is shown 

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-7954 @CR-GK 
Scenario: Verify Valid gift card is applied for purchases 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	Then user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "GiftcardNumber" 
	And user enter Pin Number "PinNumber" 
	And user click on Apply button 
	Then applied gift card "GiftcardNumber" should be displayed 
	Then gift card balance is applied towards the purchase 
