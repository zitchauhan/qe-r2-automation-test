Feature: Gift Card application 

@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order @KER-4038
@ZYP_CART_K4038-10028 @CR-SK 
Scenario:
Verify that user is not able to add another gift card once the applied GCs cover the entire transaction amount 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	When user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "Valid16DigitGiftCardNumber" 
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button 
	And applied gift card "Valid16DigitGiftCardNumber" should be displayed 	
	Then Verify the message not displayed on the page 
		|# Add new Gift Card CTA is suppressed and user is not able to add another gift card	|
		|Enter a Gift Card																		|
		|Hide Gift Card																			|
		
@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order @KER-4038
@ZYP_CART_K4038-10029 @CR-SK 
Scenario:
Verify that user is not able to add another gift if single Gift card covers the order Total 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	When user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "Valid16DigitGiftCardNumber" 
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button 
	And applied gift card "Valid16DigitGiftCardNumber" should be displayed 	
	Then Verify the message not displayed on the page 
		|# Add new Gift Card CTA is suppressed and user is not able to add another gift card	|
		|Enter a Gift Card																	|
		|Hide Gift Card																		|
		
		
@R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order @KER-4038
@ZYP_CART_K4038-10032 @CR-SK @1HR_R2
Scenario:
Verify that payment details(Credit card) is suppressed if single Gift card covers the order Total 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	When user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "Valid16DigitGiftCardNumber" 
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button 
	And applied gift card "Valid16DigitGiftCardNumber" should be displayed 	
	Then Verify the message not displayed on the page 
		|# verify that payment details(Credit card) is supressed |
		|Credit Card Number										|
		|Expiration Date											|	
		|CVV														|
		
@R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order @KER-4038
@ZYP_CART_K4038-10023 @CR-SK 
Scenario:
Verify that User is able to add multiple Gift Cards having 13 and 16 digit with 4 or 8 digit PIN on Payment page 
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
	Then applied gift card "LowBalanceGiftCard" should be displayed 
	And user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "Valid16DigitGiftCardNumber" 
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button 
	And applied gift card "Valid16DigitGiftCardNumber" should be displayed 
	
	
	

@R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order @KER-4038
@ZYP_CART_K4038-10024 @CR-SK 
Scenario:
Verify that User is able to view cumulative deduction from the gift cards in single line item in the order summary if Gift cards cover full transaction amount 
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
	Then applied gift card "LowBalanceGiftCard" should be displayed 
	And user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "Valid16DigitGiftCardNumber" 
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button 
	And applied gift card "Valid16DigitGiftCardNumber" should be displayed for second gift card
	Then user should be able to see cumulative deduction from the gift cards in single line item in the order summary
	
		

	      