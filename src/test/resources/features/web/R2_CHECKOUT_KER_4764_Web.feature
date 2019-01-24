Feature: BOPIS Alternate Pickup Person 

@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-4764 @ZYP_CHECKOUT_K4764-10820
Scenario: Verify customer must be able to select and Me + Alternate Pickup Person from Who Is Picking Up Dropdown during checkout
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
		
@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-4764 @ZYP_CHECKOUT_K4764-10821
Scenario: Verify after selecting "Me + Alternate Pickup Person" during checkout Alternate Pickup Person fields must display
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
		
		
		
		
				
