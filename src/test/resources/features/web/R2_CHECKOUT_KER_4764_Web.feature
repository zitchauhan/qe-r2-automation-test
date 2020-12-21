Feature: BOPIS Alternate Pickup Person 

@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-4764 @ZYP_CHECKOUT_K4764-10820
Scenario: Verify customer must be able to select and Me + Alternate Pickup Person from Who Is Picking Up Dropdown during checkout
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
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
		
@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-4764 @ZYP_CHECKOUT_K4764-10821
Scenario: Verify after selecting Me + Alternate Pickup Person during checkout Alternate Pickup Person fields must display
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
#And user click on Add to Cart Button 
	And user click on ship it button 
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
		
@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-4764 @ZYP_CHECKOUT_K4764-10822
Scenario: Verify customer input and view completed Pick-Up Person Drawer with correct Alternate Pick-Up Person information
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And User searches a product "BOPIS_Regular_Product" and navigates to PDP 
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
	And user enter the Store Pickup Alternates FirstName "PickupFirstName"
	And user enter the Store Pickup Alternates LastName "PickupLastName"
	And user enter the Store Pickup Alternates Email "PickupEmail"
	And user enter the Store Pickup Alternates PhoneNumber "PickupPhoneNumnber"
	When user clicks on Go to payment CTA
	And user verify the alternate address details
	
@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-4764 @ZYP_CHECKOUT_K4764-10823
Scenario: Verify Mandatory fields for alternative pick up person details
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And User searches a product "BOPIS_Regular_Product" and navigates to PDP 
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
	And user enter the Store Pickup Alternates FirstName "PickupFirstName"
	And user enter the Store Pickup Alternates LastName "PickupLastName"
	And user enter the Store Pickup Alternates PhoneNumber "PickupPhoneNumnber"
	When user clicks on Go to payment CTA
	And user will see the required error Message
	
@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-4764 @ZYP_CHECKOUT_K4764-10831
Scenario: Verify No alternate pickup person may be entered for restricted products
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And User searches a product "BOPIS_SOF_Product" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And user should not be able to see me plus alternate	
	

@RegressionP3 @TC-OMNI-13510 @SR-1333
Scenario: Verify customer can place order for BOPIS with correct Alternate Pick-Up Person information in checkout
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	Then user click on pickup button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user will click on Checkout button and navigates to Checkout page
	And user is navigated to order summary page 
	And user select me + alternate pickup person 
	Then Verify below Sub/Main Module of Checkout Page 
		|#Verify following elements in checkout page bopis pickup|
		|StorePickupAlternatesFirstName_input|
		|StorePickupAlternatesLastName_input|
		|StorePickupAlternatesEmail_input|
		|StorePickupAlternatesPhoneNumber_input|
	And user enter the Store Pickup Alternates FirstName "PickupFirstName"
	And user enter the Store Pickup Alternates LastName "PickupLastName"
	And user enter the Store Pickup Alternates Email "PickupEmail"
	And user enter the Store Pickup Alternates PhoneNumber "PickupPhoneNumnber"
	When user clicks on Go to payment CTA present on store pickup
	And user verify the alternate address details
	And user click on academy creditcard radiobtn
	And user fills the academy credit card details in payment
	And user enters a corresponding billing address
	And user enters order confirmation email
	And user click on REVIEW ORDER button
	And user clicks on place order on checkout page	
	
		
@RegressionP2 @P2 @TC-OMNI-13511 @SR-1330
Scenario: Verify customer can place order for BOPIS with correct Alternate Pick-Up Person information in checkout
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user selects store with "BOPIS_Store2" and "BOPIS_Store_Selection" 
	And User searches a product "SOFSTSProduct" and navigates to PDP 
	And user click on ship it button 
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page
	And Validate Pick Up dropdown is disabled for SOF STS
	When user clicks on Go to payment CTA present on store pickup
	And user click on academy creditcard radiobtn
	And user fills the academy credit card details in payment
	And user enters a corresponding billing address
	And user enters order confirmation email
	And user click on REVIEW ORDER button
	And user clicks on place order on checkout page	
	
	
	
	
	
			
		
		
				
