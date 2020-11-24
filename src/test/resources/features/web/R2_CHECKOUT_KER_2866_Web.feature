Feature:  BOPIS Payment

@R2_Web @Regression @R2_All @P-Low @CB-Checkout @KER-2866 @ZYP_CART_K2866-10480 @C-BOPIS  @TC-OMNI-13477
Scenario: Verify guest user is able to see the See In-Store Pickup Instructions section 
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	#When user click on Add to cart button 
	And user click on ship it button 
	And user click on view cart
	Then user select in store pickup option
	And user verify the selected store in cart page
	And user click on checkout button
	Then user click on change location button
	
	
@C-BOPIS @R2_Web @R2_All @CB-Cart @KER-2866 @ZYP_CART_K2866-10481
Scenario: Verify that user view Find a Store modal from Change Location in Checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Product" in the searchbox
	#When user click on Add to cart button 
	#And user click on ship it button 
	Then user click on pickup button 
	And user click on view cart
	#Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    Then user click on change location button
    Then User is able to see Find a Store Modal
    
@C-BOPIS @R2_Web @R2_All @P1 @CB-Cart @KER-2866 @ZYP_CART_K2866-10482 @RegressionP1 @AutomationSmoke  @TC-OMNI-13468 
Scenario: Verify the guest user is able to select the Credit Card payment method in order to place the order for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_SOF_Product" in the searchbox 
  Then user click on pickup button
	And user click on view cart
	And user will click on Checkout button and navigates to Checkout page
  And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	And user fill the payment details for sof guest user	
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Then Verify the message on the page 
		| # Message for successful order is displayed |
		| Order Number                                |			
	
	
@C-BOPIS @R2_Web @R2_All @P1 @CB-Cart @KER-2866 @ZYP_CART_K2866-10491
Scenario: Verify the guest user is able to select the PayPal payment method in order to place the order for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	And user click on ship it button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page  
	When user clicks on Go to payment CTA
	Then user click on paypal radiobtn
	And user click on paypal checkout button
	Then user switch to iframe and enter the paypal login "PayPalEmail" "PayPalPassword" 
	And user able to see the button place order
	
@R2_Web @Regression @R2_All @P-Low @CB-Checkout @KER-2866 @C-BOPIS @P1 @RegressionP1 @abc  @TC-OMNI-13483
Scenario: Verify the guest user is able to select the Gift Card payment method in order to place the order for BOPIS 
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox 
#When user click on Add to cart button 
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then user select in store pickup option
	And user click on checkout button in Cart page 
	When user clicks on Go to payment CTA
	And user expand gift card option
	And user enter Gift card Number "Valid16DigitGiftCardNumber" 
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "ShippingRestrictedZipCode" , "EmailAddress" 
	And user clicks on Review order button on checkout page
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Then Verify the message on the page 
		| # Message for successful order is displayed |
		| Order Number                                |			
	
	
	
@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2866 @ZYP_CART_K2866-10507
Scenario: Verify the guest user is able to add new Credit Card as payment method in order to place the order for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	#When user click on Add to cart button 
	#And user click on ship it button 
	Then user click on pickup button
	And user click on view cart
	#Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	And user fill the payment details for sof guest user	
	
@R2_Web  @R2_All @P-Low @CB-Checkout @KER-2866 @ZYP_CART_K2866-10508 @C-BOPIS @RegressionP2  @TC-OMNI-13483
Scenario: Verify the guest user is able to select the Gift Card payment method in order to place the order for BOPIS 
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product_SKU_Costly" in the searchbox
	Then user click on pickup button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then user select in store pickup option
	And user click on checkout button in Cart page 
	When user clicks on Go to payment CTA
	And user expand gift card option
	And user enter Gift card Number "GiftCardwithLessBalanceThenCart" 
	And user enter Pin Number "GiftCardwithLessBalanceThenCartPin" 
	And user click on Apply button 
	And user should be able to see applied gift card in order summary
	And user fill the payment details for sof guest user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Then Verify the message on the page 
		| # Message for successful order is displayed |
		| Order Number |

		
	
@C-BOPIS @R2_Web @R2_All @P1 @CB-Cart @KER-2866 @ZYP_CART_K2866-10509
Scenario: Verify the guest user is able to enter a different Billing address on Payment drawer for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	#And user click on Add to Cart Button 
    Then user click on pickup button 
	#And user click on ship it button 
	And user click on view cart
	#Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	And user fill the payment details for sof guest user
	And user able to see the button place order
	
@C-BOPIS @R2_Web @R2_All @P1 @CB-Checkout @KER-2866 @ZYP_CART_K2866-10534
Scenario: Verify the guest user is able to place the order for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	#And user click on Add to Cart Button 
	#And user click on ship it button 
	Then user click on pickup button
	And user click on view cart
	#Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	And user fill the payment details for sof guest user
	And user able to see the button place order
	And user is navigated to order confirmation page and captures order number 
	
	
@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2866 @ZYP_CART_K2866-10538 
Scenario: Verify if User is able to select a Payment method on One Page Checkout Screen for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	#And user click on Add to Cart Button 
	#And user click on ship it button 
	Then user click on pickup button
	And user click on view cart
	#Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	And user should be able to see card last four digit
	And user select another credit card from the drop down

@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2866 @ZYP_CART_K2866-10540 
Scenario: Verify if User is able to enter billing information for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	#And user click on Add to Cart Button 
	#And user click on ship it button 
	Then user click on pickup button
	And user click on view cart
	#Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	#And user fill the payment details for sof registered user
	And user clicks on edit payment cta
	Then Verify below Sub/Main Module of Checkout Page 
	|#Verify the billing information is already displayed|
	|ChangeBillingInformation_Txt|
	
@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2866 @ZYP_CART_K2866-10541 
Scenario: Verify if User is able to enter new billing information in Payment for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	#And user click on Add to Cart Button 
	#And user click on ship it button 
	Then user click on pickup button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	And user clicks on edit payment cta
	Then Verify below Sub/Main Module of Checkout Page 
	|#Verify the billing information is already displayed|
	|ChangeBillingInformation_Txt|
	And user clicks on change billing info cta 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "ShippingRestrictedZipCode" , "EmailAddress" 
	And user fill the payment details for sof registered user
	Then user click on review order button
	
@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2866 @ZYP_CART_K2866-10542 
Scenario: Verify if the user is able to review and place order from One Page Checkout Screen for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	#And user click on Add to Cart Button 
	#And user click on ship it button 
	Then user click on pickup button  
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	And user clicks on edit payment cta
	Then Verify below Sub/Main Module of Checkout Page 
	|#Verify the billing information is already displayed|
	|ChangeBillingInformation_Txt|
	And user clicks on change billing info cta 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "zipCode" , "EmailAddress" 
	And user fill the payment details for sof registered user
	#Then user should click on continue to review button 
	And user able to see the button place order
	And user is navigated to order confirmation page and captures order number 
	
	
@Web @Regression @P1 @CR-MT @RegressionP1 @abc @TC-OMNI-13481
Scenario: Verfiy bopis place order for guest user with ACC as tender 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	#And user click on Add to Cart Button 
	Then user click on pickup button
	And user click on view cart
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	When user clicks on Go to payment CTA
	And user click on academy creditcard radiobtn 
	And user fills the academy credit card details in payment 
	And user enters a corresponding billing address
	And user enters order confirmation email
	And user click on REVIEW ORDER button
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Then Verify the message on the page 
		| # Message for successful order is displayed |
		| Order Number                                |			
	
	

	
@Web @Regression @P1 @CR-MT @RegressionP1 @abc @TC-OMNI-13480
Scenario Outline: Verfiy bopis place order for guest user with CC as tender 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	Then user click on pickup button
	And user click on view cart
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	When user clicks on Go to payment CTA
	And user add "<Payment Type>" details in payment method for "guest" user
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "ShippingRestrictedZipCode" 
	And user click on REVIEW ORDER button
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Examples: 
		|Payment Type	|
		|Credit Card - Master	| 	
	
@RegressionP2 @WhiteGlove @AutomationSmoke @TC-OMNI-13463
Scenario Outline: Verify the guest user is able to place White Glove order using Credit Card
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SKUForWhiteGlovenew" and navigates to PDP
	When user click on ship it button 
	And user click on view cart
	Then user navigates to Cart Page
	And user validate the WG bulk message is visible on cart page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "guest" user
	Then user click on go to payment present in shipping method
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Examples: 
		|Card Type	|
		|Visa      	|

	
	

	
