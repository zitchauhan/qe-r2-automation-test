Feature: B07-250 - Gift Card - Authenticated User: Add New Gift Card at Checkout 

@R2_Mobile @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-7953 @CR-GK 
Scenario: Verify Gift card fields displayed - No Previous Gift Cards Saved 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	And user selects add new gift card option from the dropdown 
	Then Gift Card Number field and PIN fields are displayed 
	
	
@R2_Mobile @C-Order @CC-Checkout_Order @R2_All @P-High_Order @KER-6822 
@ZYP_CHECKOUT_K6822-7954 @CR-GK @1HR_R2 
Scenario: Verify Valid gift card is applied for purchases 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on ASO Logo and should be navigated to Home Page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	And user selects add new gift card option from the dropdown 
	And user enter Gift card Number "Valid16DigitGiftCardNumber" 
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button 
	Then applied gift card "Valid16DigitGiftCardNumber" should be displayed
	And Verify below Sub/Main Module of Checkout Page 
		|# Following button and success message on checkout page|
		|GiftCardAppliedSuccessMsg|
		
		
@R2_Mobile @C-Order @CC-Checkout_Order @R2_All @P1 @1HR @KER-6822 
@ZYP_CHECKOUT_K6822-10193 @CR-GK 
Scenario: Verify the user can enter valid new Gift card with 13 or 16 digit in Checkout for payment  
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	#And verify user can begin checkout 
	And user is navigated to order summary page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	And user click on go to payment present in shipping method
#	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Series777GiftCard" 
	And user enter Pin Number "Series777GiftCardPin" 
	When user click on Apply button 
	Then Verify the message on the page 
		|# Following physical gift card retention message should show on the page	|
		|Please keep your physical gift card for future reference to assist with any returns or order cancelations.|
	And Verify below Sub/Main Module of Checkout Page 
		|# Following button and success message on checkout page|
		|GiftCardAppliedSuccessMsg|
		|btnToRemoveGiftCardOnCheckoutPage|
		
		
@R2_Mobile @C-Order @CC-Checkout_Order @R2_All @P-High_Order @KER-6822 
@ZYP_CHECKOUT_K6822-7917 @CR-GK 
Scenario: Verify Add new gift card during checkout user has Saved Gift Cards 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "productName" and navigates to PDP 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user click on checkout from ATC pop up 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	And user selects add new gift card option from the dropdown 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%%%%  Gift Card form in payment drawer%%%%%%%%%%|
		|GiftCardNumber_Input|
		|Pin_Input|
		|Apply_Btn|
		
		
@R2_Mobile @R2_Regression @R2_All @P-High_Order @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-7949 @CR-GK 
Scenario: Verify Add new Gift Card fields 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart
	Then User clicks on ASO Logo and should be navigated to Home Page 
	When User searches a product "productName" and navigates to PDP 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	And user selects add new gift card option from the dropdown 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%%%%  Gift Card form in payment drawer%%%%%%%%%%|
		|GiftCardNumber_Input|
		|Pin_Input|
		|Apply_Btn|
		
@R2_Mobile @R2_All @P-High_Order @C-Order @CC-Checkout_Order @KER-6822 
@ZYP_CHECKOUT_K6822-7956 @CR-GK 
Scenario: Verify Gift card balance is Stored in My account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on ASO Logo and should be navigated to Home Page 
	When User searches a product "productName" and navigates to PDP 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	And user selects add new gift card option from the dropdown 
	And user enter Gift card Number "Valid16DigitGiftCardNumber" 
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button 
	And user clicks on edit payment cta 
	Then applied gift card "Valid16DigitGiftCardNumber" should be displayed 
	And User navigates from checkout to payments in myaccount 
	Then user should be able to see "Valid16DigitGiftCardNumber" Gift card 