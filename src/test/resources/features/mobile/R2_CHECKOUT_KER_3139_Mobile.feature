Feature: Payment Validation

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3139 @ZYP_CART_K3139-8214 @CR-AG 
Scenario: Verify the invalid(invalid due to non-number input) Card number due to incorrect digit length in checkout page
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user validate all the required fields in the Payment section to be visible
    And user enters "WrongCreditCardNumber" details and verify it is getting entered in Credit card section
    
    @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3139 @ZYP_CART_K3139-8215 @CR-AG 
Scenario: Verify the invalid (due to incorrect digit length)Card number due to incorrect digit length in checkout page
		Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user validate all the required fields in the Payment section to be visible
    And user enters "IncorrectDigitLengthCard" details and verify it is getting entered in Credit card section
    Then user clicks on the submit button
    Then user able to see error msg for the unrecongnised credit card
    
    
           @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3139 @ZYP_CART_K3139-8216 @CR-AG 
Scenario: Verify Expiration date invalid due to past expiration date
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user enters invalid expiration date and validated error msg
	
	
	    
           @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3139 @ZYP_CART_K3139-8217 @CR-AG 
Scenario: Verify Expiration date invalid due to non-existent date values
		Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user enter invalid non existent expiration date and verifies error msg
	
	
	           @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3139 @ZYP_CART_K3139-8219 @CR-AG 
Scenario: Verify CVV invalid due to incorrect digit length
	Given user launches the browser and navigates to "ASO_HOME" page 
		Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user enteres invalid CVV and validates the error msg
	
		           @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3139 @ZYP_CART_K3139-8220 @CR-AG @1HR_R2
Scenario: Verify if CVV invalid due to non-number input
	Given user launches the browser and navigates to "ASO_HOME" page 
		Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user verify entering special characters inside cvv input section
	
	
   
    