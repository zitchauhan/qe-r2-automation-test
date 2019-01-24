Feature: B06-225 - BOPIS Pick-Up Person 

@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-3469 @ZYP_CHECKOUT_K3469-10872
Scenario: Verify BOPIS Pick Up Person - Authenticated user -Alternate Person 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And user select me + alternate pickup person 
	Then Verify below Sub/Main Module of Checkout Page 
		|#Verify following elements in checkout page bopis pickup|
		|StorePickupAlternatesFirstName_input|
		|StorePickupAlternatesLastName_input|
		|StorePickupAlternatesEmail_input|
		|StorePickupAlternatesPhoneNumber_input|
	
		
@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-3469 @ZYP_CHECKOUT_K3469-10874 
Scenario: Verify BOPIS Pick Up Person - Un Authenticated user - Alternate Pick up 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then user select in store pickup option 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And user select me + alternate pickup person 
	Then Verify below Sub/Main Module of Checkout Page 
		|#Verify following elements in checkout page bopis pickup|
		|StorePickupAlternatesFirstName_input|
		|StorePickupAlternatesLastName_input|
		|StorePickupAlternatesEmail_input|
		|StorePickupAlternatesPhoneNumber_input|
		
@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Checkout @KER-3469 
@ZYP_CHECKOUT_K3469-10876 @CR-GK 
Scenario: Verify BOPIS Pick Up Person - Continue to Complete Payment 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And user click on In-Store Pick up edit button 
	When user click on confirm button 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify user can view the Payment drawer|
		|PaymentHeader_Txt|
		|PaymentMethodHeader_Txt|
		|CreditCard_radioBtn|
		|PayPal_radioBtn|
		|CreditCardNumber_Input|
		|ExpirationDate_Input|
		|Cvv_Input|
		|CvvToolTip|
