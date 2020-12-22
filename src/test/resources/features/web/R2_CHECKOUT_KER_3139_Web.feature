Feature: Payment Validation 

@R2_Web @Regression @R2_All @P-Low @C-Checkout @KER-3139 @ZYP_CART_K3139-8214 
@CR-AG 
Scenario: Verify the invalid(invalid due to non-number input) Card number due to incorrect digit length in checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	Then user validate all the required fields in the Payment section to be visible 
	And user enters "WrongCreditCardNumber" details and verify it is getting entered in Credit card section 
	
@R2_Web @Regression @R2_All @P-Low @C-Checkout @KER-3139 @ZYP_CART_K3139-8215 
@CR-AG 
Scenario: Verify the invalid (due to incorrect digit length)Card number due to incorrect digit length in checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	Then user validate all the required fields in the Payment section to be visible 
	And user enters "InvalidCreditCard" details and verify it is getting entered in Credit card section 
	Then user clicks on the submit button 
	Then user able to see error msg for the unrecongnised credit card 
	
	
@R2_Web @Regression @R2_All @P-Low @C-Checkout @KER-3139 @ZYP_CART_K3139-8216 
@CR-AG 
Scenario: Verify Expiration date invalid due to past expiration date 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	
	
	
@R2_Web @Regression @R2_All @P-Low @C-Checkout @KER-3139 @ZYP_CART_K3139-8217 
@CR-AG 
Scenario: Verify Expiration date invalid due to non-existent date values 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	
	
@R2_Web @Regression @R2_All @P-Low @C-Checkout @KER-3139 @ZYP_CART_K3139-8219 
@CR-AG 
Scenario: Verify CVV invalid due to incorrect digit length 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	
@R2_Web @Regression @R2_All @P-Low @C-Checkout @KER-3139 @ZYP_CART_K3139-8220 
@CR-AG @1HR_R2 
Scenario: Verify if CVV invalid due to non-number input 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	
	@RegressionP2 
	Scenario: Validate user is able to place order successfully with STS + BOPIS + SOF item with CC + GC as payment method
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 	
	Then user enters "BOPIS_SOF_Product" in the searchbox
	Then user validates estimated date is visible on "PDP"
	Then user click on pickup button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user click on checkout button in Cart page 
	And user does accepts the firearm specific compliance
	And user clicks on Continue button
  And user click on academy creditcard radiobtn
  And user fills the academy credit card details in payment
  Then user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
  And user enters a corresponding billing address
  And user enters order confirmation email
  And user click on REVIEW ORDER button
  And user clicks on place order on checkout page
  Then verify user is able to successfully place the order
   
	
	
	
    