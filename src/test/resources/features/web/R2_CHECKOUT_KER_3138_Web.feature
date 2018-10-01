Feature: Insert Payment Details (Credit/Debit Card) on checkout screen

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3138 @ZYP_CART_K3138-8205 @ZYP_CART_K3138-8210 @CR-AG 
Scenario: Verify if user enters the debit card, the system should accept and treat it as a credit card
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user validate all the required fields in the Payment section to be visible
    And user enters "DebitCardNumber" details and verify it is getting entered in Credit card section

    @R2_Web @R2_Regression @R2_All @P-Highest @1HR_R2 @C-Checkout @KER-3138 @ZYP_CART_K3138-8206 @CR-AG 
Scenario: Verify if user enters the debit card, the system should accept and treat it as a credit card
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user validate all the required fields in the Payment section to be visible
    And user enters "DebitCardNumber" details and verify it is getting entered in Credit card section
    Then user enters valid expiry date "ExpDate"
    And user enters valid cvv value "CVV"
    Then user clicks on the submit button

    @R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3138 @ZYP_CART_K3138-8207 @CR-AG 
Scenario: Verify if user enters the debit card, the system should accept and treat it as a credit card
Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user validate all the required fields in the Payment section to be visible
    And user enters "DebitCardNumber" details and verify it is getting entered in Credit card section
    Then user enters valid expiry date "ExpDate"
    And user enters valid cvv value "CVV"
    Then user clicks on the submit button

    @R2_Web @R2_Regression @R2_All @P-Highest @C-Checkout @KER-3138 @ZYP_CART_K3138-8208 @CR-AG 
Scenario: Verify if user enters the debit card, the system should accept and treat it as a credit card
Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user validate all the required fields in the Payment section to be visible
    And user enters "DebitCardNumber" details and verify it is getting entered in Credit card section
    Then user enters valid expiry date "ExpDate"
    And user enters valid cvv value "CVV"
    Then user clicks on the submit button


    @R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3138 @ZYP_CART_K3138-8209 @CR-AG 
Scenario: Verify if user enters the debit card, the system should accept and treat it as a credit card
Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user validate all the required fields in the Payment section to be visible
    And user verifies visa card entery in the card fields
    And user verifies master card entery in the card fields
    And user verifies Amex card entery in the card fields
    And user verifies discover card entery in the card fields

    
#     @R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3138 @ZYP_CART_K3138-8210 @CR-AG 
#Scenario: Verify if user enters the debit card, the system should accept and treat it as a credit card
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When User searches a product "productName" and navigates to PDP
#	And user click on Add to Cart Button 
#	And user click on checkout button
#	And user adds shipment address on checkout page for "guest" user
#	And user selects shipment method on check out page for "guest" user
#	Then user validate all the required fields in the Payment section to be visible
	

 @R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3138 @ZYP_CART_K3138-8211 @CR-AG 
Scenario: Verify if user enters the debit card, the system should accept and treat it as a credit card
Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user validate all the required fields in the Payment section to be visible
    Then user enter two digits in cvv and verifies the card image displayed in the credit card input section
    
    
     @R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3138 @ZYP_CART_K3138-8212 @CR-AG 
Scenario: Verify if user enters the debit card, the system should accept and treat it as a credit card
Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user validate all the required fields in the Payment section to be visible
    Then user hover on the toop tip icon of CVV and verify tool tip display
    
         @R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3138 @ZYP_CART_K3138-8218 @CR-AG 
Scenario: Verify if user enters the debit card, the system should accept and treat it as a credit card
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user validate all the required fields in the Payment section to be visible
    Then user verify entering special characters inside cvv input section
    

   
