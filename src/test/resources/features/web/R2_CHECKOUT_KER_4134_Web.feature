Feature: B06-225 - BOPIS: SMS Capture


@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10888
Scenario: To verify all items in the Order - Un-Authenticated user
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "BOPIS_Store_Selection" 
	When User searches a product "SKUForBopisProduct" and navigates to PDP 
	When user click on Add to cart button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user select in store pickup option
	When user will click on Checkout button and navigates to Checkout page 
	And user clicks on Go to payment CTA
	And user add "credit card" details in payment method for "guest" user
	
@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10884 @CR-MS	@C1-Message_B
Scenario: Verify Phone number associated with BOPIS
    Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	Then user click on Add to Cart Button
	And user will click on View Cart button
	And user navigate to Cart page
	Then user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
	Then Verify below Sub/Main Module of Cart Page
	|#Verify below element in cart page|
    |InStorePickup_FREE_radioBtn |
	When user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then Verify the message on the page
	|#Then given below fields should display for the details of Alternative pickup person|
		|Alternate's First Name|
		|Alternate's Last Name |
		|Alternate's Email Address|
		|Alternate's Phone Number |
    Then user can enter the alternative person phone number "PhoneNumber"
    
	

@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10886
Scenario: Verify Phone number associated with BOPIS - Saved Billing address
Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Cart_BopisEmail"  
	And User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user is navigated to order summary page
	And user verify the phone number on payment method

@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10885 @CR-MS	@C1-Message_B
Scenario: Verify Phone number associated with BOPIS - Alternative Person
    Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	Then user click on Add to Cart Button
	And user will click on View Cart button
	And user navigate to Cart page
	Then user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
	Then Verify below Sub/Main Module of Cart Page
	|#Verify below element in cart page|
    |InStorePickup_FREE_radioBtn |
	When user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then Verify the message on the page
	|#Then given below fields should display for the details of Alternative pickup person|
		|Alternate's First Name|
		|Alternate's Last Name |
		|Alternate's Email Address|
		|Alternate's Phone Number |
    Then user can enter the alternative person phone number "PhoneNumber"

@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10891
Scenario: Verify Phone number field validation
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
	When user clicks on Go to payment CTA
	And user will see the required error Message
		
@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10892
Scenario: Verify SMS check box display with Primary and Alternative Person
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "BOPIS_Store_Selection" 
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
	And user enter the Store Pickup Alternates FirstName "PickupFirstName"
	And user enter the Store Pickup Alternates LastName "PickupLastName"
	And user enter the Store Pickup Alternates Email "PickupEmail"
	Then user can enter the alternative person invalid phone number "InvalidPhoneNumber"
	And checks for form errors
	

@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10893 @CR-MS @C1-MessageB
Scenario: Verify Phone number field validation
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	Then user click on Add to Cart Button
	And user will click on View Cart button
	And user navigate to Cart page
	Then user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
	Then Verify below Sub/Main Module of Cart Page
	|#Verify below element in cart page|
    |InStorePickup_FREE_radioBtn |
	And  user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then user can enter the alternative person invalid phone number "InvalidPhoneNumber"
#	And checks for form errors
	Then Verify the message on the page
	|#Then given below fields should display for the details of Alternative pickup person|
		|Alternate's First Name|
		|Alternate's Last Name |
		|Alternate's Email Address|
		|Alternate's Phone Number |
		

@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10889
Scenario: Verify Phone number associated with BOPIS - Alternative pick up Person
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "BOPIS_Store_Selection" 
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
	And user enter the Store Pickup Alternates FirstName "PickupFirstName"
	And user enter the Store Pickup Alternates LastName "PickupLastName"
	And user enter the Store Pickup Alternates Email "PickupEmail"
	And user enter the Store Pickup Alternates PhoneNumber "PickupPhoneNumnber" 

	
@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-Low @CB-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10890 @CR-MS @C1-MessageB
Scenario: Verify SMS check box display with Primary and Alternative Person
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "BOPIS_Store_Selection" 
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
	And user enter the Store Pickup Alternates FirstName "PickupFirstName"
	And user enter the Store Pickup Alternates LastName "PickupLastName"
	And user enter the Store Pickup Alternates Email "PickupEmail"
	And user enter the Store Pickup Alternates PhoneNumber "PickupPhoneNumnber" 
	Then Verify the message on the page
    |#Then given below fields should display for the details of Alternative pickup person|
    |SendSMSTextUpdatesAboutMyOrder_checkbox|
    

@C-BOPIS @R2_Web @R2_All @CB-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10887
Scenario: Verify Phone number associated with BOPIS - Change Billing address
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Cart_BopisEmail"  
	And User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	Then user click on Add to Cart Button
	And user will click on View Cart button
	And user navigate to Cart page
	Then user select in store pickup option 
	And user click on checkout button in Cart page 
	    Then user enter Phone number "PhoneNumber" in Billing address
	
	
	
