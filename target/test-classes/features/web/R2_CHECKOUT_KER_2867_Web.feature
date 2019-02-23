Feature: Verify B06-225 Display BOPIS Pickup Information Drawer in Checkout

@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10899
Scenario: Verify that UnAuthenticated user is able to view the instore pickup drawer details
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	And user is navigated to order summary page 
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|clickOnDropDown|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|SeeInStorePickupInstructions_Dd|
		

@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10900
Scenario: Verify that UnAuthenticated user is able to change the Pickup location
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
	And User select another store "BOPIS_Store1" 
	And user verify the selected store is reflected
	
	
@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10901
Scenario: Verify that UnAuthenticated user is able to select and enter information for who is picking up an order
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	And user is navigated to order summary page 
	And user select me + alternate pickup person 
	Then Verify below Sub/Main Module of Checkout Page 
		|#Verify following elements in checkout page bopis pickup|
		|StorePickupAlternatesFirstName_input|
		|StorePickupAlternatesLastName_input|
		|StorePickupAlternatesEmail_input|
		|StorePickupAlternatesPhoneNumber_input|
	
	
@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10902
Scenario: Verify that UnAuthenticated user is able to view Pickup Instructions details
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|clickOnDropDown|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|clickOnDropDown|
		|SeeInStorePickupInstructions_Dd|
	Then Verify that See In-Store Pickup Instructions expands
	And verify that see in-store pickup instructions are displayed


@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10903
Scenario: Verify that UnAuthenticated user is able to select Go To Payment CTA and continue to payment drawer
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
	Then Verify that user navigate to payment drawer
		

@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10904
Scenario: Verify that Authenticated user is able to view the instore pickup drawer details
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	And user is navigated to order summary page 
	When user click on edit shipping pickup
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|clickOnDropDown|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|SeeInStorePickupInstructions_Dd|
	
@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10905
Scenario: Verify that Authenticated user is able to change the Pickup location
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    Then user click on change location button
    Then User is able to see Find a Store Modal
	And User select another store "BOPIS_Store1" 
	And user verify the selected store is reflected		
		
@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10906
Scenario: Verify that Authenticated user is able to select and enter information for who is picking up an order	
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	And user is navigated to order summary page 
	And user select me + alternate pickup person 
	Then Verify below Sub/Main Module of Checkout Page 
		|#Verify following elements in checkout page bopis pickup|
		|StorePickupAlternatesFirstName_input|
		|StorePickupAlternatesLastName_input|
		|StorePickupAlternatesEmail_input|
		|StorePickupAlternatesPhoneNumber_input|
        
@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10907
Scenario: Verify that Authenticated user is able to view Pickup Instructions details
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	Then user click on In-Store Pick up edit button
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|clickOnDropDown|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|clickOnDropDown|
		|SeeInStorePickupInstructions_Dd|
	Then Verify that See In-Store Pickup Instructions expands
	And verify that see in-store pickup instructions are displayed




@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10908
Scenario: Verify that Authenticated user is able to select Go To Payment CTA and continue to payment drawer
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	When user clicks on Go to payment CTA
	Then Verify that user navigate to payment drawer
