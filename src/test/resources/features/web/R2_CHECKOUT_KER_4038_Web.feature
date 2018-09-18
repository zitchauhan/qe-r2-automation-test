Feature: Gift Card application 

@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4038 @ZYP_CART_K4038-10028 @CR-SK 
Scenario: Verify that user is not able to add another gift card once the applied GCs cover the entire transaction amount
	Given user launches the browser and navigates to "ASO_HOME" page
	And user enters "SKUForBopisProduct" in the search box
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
	Then Verify the message not displayed on the page
	    |# Add new Gift Card CTA is suppressed and user is not able to add another gift card	|
	    |Enter a Gift Card																		|
	    |Hide Gift Card																			|
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4038 @ZYP_CART_K4038-10029 @CR-SK 
Scenario: Verify that user is not able to add another gift if single Gift card covers the order Total
	Given user launches the browser and navigates to "ASO_HOME" page
	And user enters "SKUForBopisProduct" in the search box
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
	Then Verify the message not displayed on the page
	   |# Add new Gift Card CTA is suppressed and user is not able to add another gift card	|
	   |Enter a Gift Card																	|
	   |Hide Gift Card																		|
	    
	   
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4038 @ZYP_CART_K4038-10032 @CR-SK 
Scenario: Verify that payment details(Credit card) is suppressed if single Gift card covers the order Total
	Given user launches the browser and navigates to "ASO_HOME" page
	And user enters "SKUForBopisProduct" in the search box
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
	Then Verify the message not displayed on the page
	   |# verify that payment details(Credit card) is supressed |
	   |Credit Card Number										|
	   |Expiration Date											|	
	   |CVV														|
	   
	   
	   
	   
	   
	   
	      