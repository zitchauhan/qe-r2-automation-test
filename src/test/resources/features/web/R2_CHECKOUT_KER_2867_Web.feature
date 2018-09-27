Feature: Verify B06-225 Display BOPIS Pickup Information Drawer in Checkout

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10899 @CR-DPK
Scenario: Verify that UnAuthenticated user is able to view the instore pickup drawer details
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	Then user click on In-Store Pick up edit button
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|MePickUp_Drpdwn|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|MePickUp_Drpdwn|
		|SeeInStorePickupInstructions_Dd|
		


@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10900 @CR-DPK
Scenario: Verify that UnAuthenticated user is able to change the Pickup location
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	Then user click on In-Store Pick up edit button
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|MePickUp_Drpdwn|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|MePickUp_Drpdwn|
		|SeeInStorePickupInstructions_Dd|
	Then Verify that the store details are displayed in Store pickup drawer	
	And user click on change Location link
	And user selects a new store from Find a Store modal "FindAsStoreZIPCode"
	Then Verify that the new selected store details are displayed in Store pickup drawer
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10901 @CR-DPK
Scenario: Verify that UnAuthenticated user is able to select and enter information for who is picking up an order
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	Then user click on In-Store Pick up edit button
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|MePickUp_Drpdwn|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|MePickUp_Drpdwn|
		|SeeInStorePickupInstructions_Dd|
	When user clicks on Who is picking up the order dropdown
	And user selects a new option from drop down
	And the selected value is displayed	
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10902 @CR-DPK
Scenario: Verify that UnAuthenticated user is able to view Pickup Instructions details
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	Then user click on In-Store Pick up edit button
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|MePickUp_Drpdwn|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|MePickUp_Drpdwn|
		|SeeInStorePickupInstructions_Dd|
	Then Verify that See In-Store Pickup Instructions expands
	And verify that see in-store pickup instructions are displayed	


@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10903 @CR-DPK
Scenario: Verify that UnAuthenticated user is able to select "Go To Payment" CTA and continue to payment drawer
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	Then user click on In-Store Pick up edit button
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|MePickUp_Drpdwn|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|MePickUp_Drpdwn|
		|SeeInStorePickupInstructions_Dd|
	When user clicks on Go to payment CTA
	Then Verify that user navigate to payment drawer	
		

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10904 @CR-DPK
Scenario: Verify that Authenticated user is able to view the instore pickup drawer details
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then User clicks on ASO Logo and should be navigated to Home Page 
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	Then user click on In-Store Pick up edit button
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|MePickUp_Drpdwn|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|MePickUp_Drpdwn|
		|SeeInStorePickupInstructions_Dd|
	
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10905 @CR-DPK
Scenario: Verify that Authenticated user is able to change the Pickup location
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then User clicks on ASO Logo and should be navigated to Home Page
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	Then user click on In-Store Pick up edit button
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|MePickUp_Drpdwn|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|MePickUp_Drpdwn|
		|SeeInStorePickupInstructions_Dd|
	Then Verify that the store details are displayed in Store pickup drawer	
	And user click on change Location link
	And user selects a new store from Find a Store modal "FindAsStoreZIPCode"
	Then Verify that the new selected store details are displayed in Store pickup drawer		
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10906 @CR-DPK
Scenario: Verify that Authenticated user is able to select and enter information for who is picking up an order
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then User clicks on ASO Logo and should be navigated to Home Page
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	Then user click on In-Store Pick up edit button
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|MePickUp_Drpdwn|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|MePickUp_Drpdwn|
		|SeeInStorePickupInstructions_Dd|
	When user clicks on Who is picking up the order dropdown
	And user selects a new option from drop down
	And the selected value is displayed		
		
        
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10907 @CR-DPK
Scenario: Verify that Authenticated user is able to view Pickup Instructions details
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then User clicks on ASO Logo and should be navigated to Home Page
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	Then user click on In-Store Pick up edit button
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|MePickUp_Drpdwn|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|MePickUp_Drpdwn|
		|SeeInStorePickupInstructions_Dd|
	Then Verify that See In-Store Pickup Instructions expands
	And verify that see in-store pickup instructions are displayed



@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2867 @ZYP_CHECKOUT_K2867-10908 @CR-DPK
Scenario: Verify that Authenticated user is able to select "Go To Payment" CTA and continue to payment drawer
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	Then user click on In-Store Pick up edit button
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|MePickUp_Drpdwn|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|MePickUp_Drpdwn|
		|SeeInStorePickupInstructions_Dd|
	When user clicks on Go to payment CTA
	Then Verify that user navigate to payment drawer	