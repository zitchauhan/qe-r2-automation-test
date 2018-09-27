Feature: Verify Gift Card - Payment Processing


@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6962 @ZYP_CART_K6962-8890 @CR-SK 
Scenario: Verify applied gift cards should be displayed to the users
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	When user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
	Then applied gift card "Valid16DigitGiftCardNumber" should be displayed


@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-6962 @ZYP_CART_K6962-8899 @CR-SK 
Scenario: Verify Once a gift card is applied, a Remove option should be displayed to the user
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user
	When user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
	And applied gift card "Valid16DigitGiftCardNumber" should be displayed
	Then Remove option is displayed to user


@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6962 @ZYP_CART_K6962-8900 @CR-SK 
Scenario: Verify  click on remove gift card, the respective gift card should no longer be applied to the transaction.
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user
	And user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
	When user click on remove gift card on checkout page
	Then gift card should no longer be applied to the transaction	
	

@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6962 @ZYP_CART_K6962-12324 @CR-SK 
Scenario: Verify for full payment using Gift Card, Billing address is still required
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user
	When user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
	And user unchecks same as shipping address checkbox on checkout page
	And user clicks on Review order button on checkout page
	Then Verify the message on the page 
		|# user should get error on blank Billing address fields	|
		|Please enter a phone number								|
		|Please enter a valid street address						|
		|Please enter a zip code									|


@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6962 @ZYP_CART_K6962-8897 @CR-SK 
Scenario: Verify If a gift card covers the full transaction, the amount applied and the remaining gift card balance should be displayed and also applied amount should displayed in order summary subtotals to the Sign in user
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user
	When user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
	Then applied gift card "Valid16DigitGiftCardNumber" should be displayed
	And Remaining gift card balance should be displayed
	And Applied amount should be displayed in order summary
			
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6962 @ZYP_CART_K6962-8902 @CR-SK 
Scenario: Verify user is prompted with message to retain the physical gift card
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user
	When user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
	Then applied gift card "Valid16DigitGiftCardNumber" should be displayed
	And Verify the message on the page 
	|# user should see below message on the page																|
	|Please keep your physical gift card for future reference to assit with any returns or oder cancellations.	|
	

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6962 @ZYP_CART_K6962-8883 @CR-SK 
Scenario: Verify Guest Users should be able to enter an unlimited number of gift cards on any transaction
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SKUForMultiSKUProduct" and navigates to PDP 
    And user click on Add to Cart Button for "MultiSKUProduct"
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user
	When user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "LowBalanceGiftCard"
	And user enter Pin Number "LowBalanceGiftCardPin" 
	And user click on Apply button
	And user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN"
	And user click on Apply button
	Then applied gift card "Valid16DigitGiftCardNumber" should be displayed for second gift card
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6962 @ZYP_CART_K6962-8884 @CR-SK 
Scenario: Verify Sign in Users should be able to enter an unlimited number of gift cards on any transaction
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user creates an account
	And User searches a product "SKUForMultiSKUProduct" and navigates to PDP 
	And user click on Add to Cart Button for "MultiSKUProduct" 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	And user adds shipment address on checkout page for "newly registered" user
	And user selects shipment method on check out page for "newly registered" user
	When user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "LowBalanceGiftCard"
	And user enter Pin Number "LowBalanceGiftCardPin" 
	And user click on Apply button
	And user click on GiftCard Plus icon in Checkout page
	And user selects "Add a New Gift Card" from choose gift card dropdown
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN"
	And user click on Apply button
	Then applied gift card "Valid16DigitGiftCardNumber" should be displayed for second gift card
	