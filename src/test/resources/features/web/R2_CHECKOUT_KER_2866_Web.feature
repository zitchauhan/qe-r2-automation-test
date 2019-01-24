Feature:  BOPIS Payment

@R2_Web @R2_Regression @R2_All @P-Low @CB-Checkout @KER-2866 @ZYP_CART_K2866-10480 @C-BOPIS
Scenario: Verify guest user is able to see the See In-Store Pickup Instructions section 
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user verify the selected store in cart page
	And user click on checkout button
	Then user click on change location button
	
	
@C-BOPIS @R2_Web @R2_All @P-Highest @CB-Cart @KER-2866 @ZYP_CART_K2866-10481
Scenario: Verify that user view Find a Store modal from Change Location in Checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    Then user click on change location button
    Then User is able to see Find a Store Modal
    
@C-BOPIS @R2_Web @R2_All @P-Highest @CB-Cart @KER-2866 @ZYP_CART_K2866-10482
Scenario: Verify the guest user is able to select the Credit Card payment method in order to place the order for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	And user fill the payment details for sof guest user
	And user able to see the button place order
	
@C-BOPIS @R2_Web @R2_All @P-Highest @CB-Cart @KER-2866 @ZYP_CART_K2866-10491
Scenario: Verify the guest user is able to select the PayPal payment method in order to place the order for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	When user clicks on Go to payment CTA
	Then user click on paypal radiobtn
	And user click on paypal checkout button
	Then user switch to iframe to verify paypalcheckoutBtn
	And enter the paypal login "PayPalEmail" "PayPalPassword" 
	And user able to see the button place order
	
@R2_Web @R2_Regression @R2_All @P-Low @CB-Checkout @KER-2866 @ZYP_CART_K2866-10501 @C-BOPIS
Scenario: Verify the guest user is able to select the Gift Card payment method in order to place the order for BOPIS 
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox 
	Then user click on Add to Cart Button 
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
	
	
@C-BOPIS @R2_Web @R2_All @P-Highest @CB-Checkout @KER-2866 @ZYP_CART_K2866-10507
Scenario: Verify the guest user is able to add new Credit Card as payment method in order to place the order for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	And user fill the payment details for sof guest user	
	
@R2_Web  @R2_All @P-Low @CB-Checkout @KER-2866 @ZYP_CART_K2866-10508 @C-BOPIS
Scenario: Verify the guest user is able to select the Gift Card payment method in order to place the order for BOPIS 
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product_SKU_Costly" in the searchbox 
	Then user click on Add to Cart Button 
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
	And user able to see the button place order	
	
@C-BOPIS @R2_Web @R2_All @P-Highest @CB-Checkout @KER-2866 @ZYP_CART_K2866-10534
Scenario: Verify the guest user is able to place the order for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	And user fill the payment details for sof guest user
	And user able to see the button place order
	And user is navigated to order confirmation page and captures order number 
	
	
	
	