Feature: B07-250 - Gift Card - Authenticated User: Add New Gift Card at Checkout 

@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-6822 @1HR_R2 
@ZYP_CHECKOUT_K6822-7949 @CR-GK 
Scenario: Verify Add new Gift Card fields 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button 
	And user click on ship it button  
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	And user selects add new gift card option from the dropdown 
	Then Verify below Sub/Main Module of Checkout Page 
		| #%%%%%  Gift Card form in payment drawer%%%%%%%%%% |
		| GiftCardNumber_Input                               |
		| Pin_Input                                          |
		| Apply_Btn                                          |
		
@R2_Web @C-Order @CC-Checkout_Order @R2_All @P-High_Order @KER-6822 
@ZYP_CHECKOUT_K6822-7956 @CR-GK 
Scenario: Verify Gift card balance is Stored in My account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button 
	And user click on ship it button  
	And user is navigated to Add to cart Notification popup 
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
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-7953 @CR-GK 
Scenario: Verify Gift card fields displayed - No Previous Gift Cards Saved 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then user click on My Account and navigate to payment 
	And user deletes all the GiftCards in MyAccount Payment page 
	When User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button 
	And user click on ship it button   
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		| #%%%%%  Gift Card form in payment drawer%%%%%%%%%% |
		| GiftCardNumber_Input                               |
		| Pin_Input                                          |
		| Apply_Btn                                          |
		
@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-7917 @CR-GK 
Scenario: Verify Add new gift card during checkout user has Saved Gift Cards 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button 
	And user click on ship it button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	And user selects add new gift card option from the dropdown 
	Then Verify below Sub/Main Module of Checkout Page 
		| #%%%%%  Gift Card form in payment drawer%%%%%%%%%% |
		| GiftCardNumber_Input                               |
		| Pin_Input                                          |
		| Apply_Btn                                          |
		
@R2_Web @R2_All @P-High_Order @C-Order @CC-Checkout_Order @KER-6822 
@ZYP_CHECKOUT_K6822-7954 @CR-GK 
Scenario: Verify Valid gift card is applied for purchases 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigates to payments in my account 
	And user deletes all the GiftCards in MyAccount Payment page 
	When User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button 
	And user click on ship it button   
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	And user click on edit payment metnod 
	Then user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "Valid16DigitGiftCardNumber" 
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button 
	Then applied gift card "Valid16DigitGiftCardNumber" should be displayed 
	And Verify below Sub/Main Module of Checkout Page 
		| # Following button and success message on checkout page |
		| GiftCardAppliedSuccessMsg                               |
		
@R2_Web @R2_All @P1 @1HR @C-Order @CC-Checkout_Order @KER-6822 
@ZYP_CHECKOUT_K6822-10193 @CR-GK @C1-Message 
Scenario: Verify the user can enter valid new Gift card with 13 or 16 digit in Checkout for payment 
    	verify the display of error message when an unauthenticated user is trying to add a GC that starts with 777 series at checkout
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button 
	And user click on ship it button  
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user click on go to payment present in shipping method
	And user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "Series777GiftCard" 
	And user enter Pin Number "Series777GiftCardPin" 
	When user click on Apply button 
	Then Verify the message on the page 
		| # Following physical gift card retention message should show on the page                                  |
		| Please keep your physical gift card for future reference to assit with any returns or oder cancellations. |
	And Verify below Sub/Main Module of Checkout Page 
		| # Following button and success message on checkout page |
		| GiftCardAppliedSuccessMsg                               |
		| btnToRemoveGiftCardOnCheckoutPage                       |

#================================================Sanity===================================#
@R2_Web @R2_WAST-17 @P2 @C-Checkout @KER-6822 @ZYP_CHECKOUT_K6822-7954 @AutomationSmokeORIG
Scenario: TC_18-Verify Payment - Add Gift Card - Authenticated 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	Then user click on go to payment present in shipping method 
	Then user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "Valid16DigitGiftCardNumber" 
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button 
	Then applied gift card "Valid16DigitGiftCardNumber" should be displayed 
	Then gift card balance is applied towards the purchase 