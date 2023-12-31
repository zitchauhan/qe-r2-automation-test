Feature: PayPal on Checkout page 

@R2_Mobile @R2_Regression @R2_All @P1 @1HR_R2 @C-Checkout @KER-3338 
@ZYP_CHECKOUT_3338-11739 @CR-AKK 
Scenario: Verify user is able to checkout using PayPal with Order level Promotion applied 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When enter the "EnterQuantityGreaterThenOne" to X 
	Then user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	And user click on go to payment present in shipping method 
	Then user click on paypal radiobtn 
	#Then user switch to iframe to verify paypalcheckoutBtn 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify gift card related things are not displayed |
		|PayPalCheckOut_Btn| 
	Then Verify paypal button is clicked 
	Then user switch to window of paypal 
	Then user verify the element of paypal window 
	
@R2_Mobile @R2_Regression @R2_All @P1 @1HR_R2 @C-Checkout @KER-3338 
@ZYP_CHECKOUT_3338-11741 @CR-AKK 
Scenario: Verify user is able to checkout using PayPal with item-level Promotion applied 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When enter the "EnterQuantityGreaterThenOne" to X 
	Then user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	And user click on go to payment present in shipping method 
	Then user click on paypal radiobtn 
	#Then user switch to iframe to verify paypalcheckoutBtn 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify gift card related things are not displayed |
		|PayPalCheckOut_Btn| 
	Then Verify paypal button is clicked 
	Then user switch to window of paypal 
	Then user verify the element of paypal window 
	And enter the paypal login "PayPalEmail" "PayPalPassword" 
	Then Verify the message on the page 
		|# Following Message should show on the page|  
		|Paypal account|
		
@R2_Mobile @R2_Regression @R2_All @P1 @1HR_R2 @C-Checkout @KER-3338 
@ZYP_CHECKOUT_3338-11742 @CR-AKK 
Scenario: Verify user is able to checkout using PayPal with shipping-level Promotion applied 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When enter the "EnterQuantityGreaterThenOne" to X 
	Then user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	And user click on go to payment present in shipping method 
	Then user click on paypal radiobtn 
	#Then user switch to iframe to verify paypalcheckoutBtn 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify gift card related things are not displayed |
		|PayPalCheckOut_Btn| 
	Then Verify paypal button is clicked 
	Then user switch to window of paypal 
	Then user verify the element of paypal window 
	And enter the paypal login "PayPalEmail" "PayPalPassword" 
	Then Verify the message on the page 
		|# Following Message should show on the page|  
		|Paypal account|
		
@R2_Mobile @R2_Regression @R2_All @P2 @1HR_R2 @C-Checkout @KER-3338 
@ZYP_CHECKOUT_3338-8256 @CR-AKK 
Scenario: Verify authenticated user is able to proceed with Paypal as checkout for non-SOF items 
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on the burger menu
	And user creates an account 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user adds shipment address on checkout page for "newly registered" user
	And user selects shipment method on check out page for "newly registered" user
	Then user click on paypal radiobtn 
	Then user switch to iframe to verify paypalcheckoutBtn 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify gift card related things are not displayed |
		|PayPalCheckOut_Btn|	
	Then Verify paypal button is clicked
		
@R2_Mobile @R2_Regression @R2_All @P-Low @1HR_R2 @C-Checkout @KER-3338 
@ZYP_CHECKOUT_3338-8262 @CR-AKK 
Scenario: Verify the user is navigated to the PayPal page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user click on paypal radiobtn 
	Then user switch to iframe to verify paypalcheckoutBtn 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify gift card related things are not displayed |
		|PayPalCheckOut_Btn|	
	Then Verify paypal button is clicked 
		
	
@R2_Mobile @R2_Regression @R2_All @P-Low @1HR_R2 @C-Checkout @KER-3338 
@ZYP_CHECKOUT_3338-8261 @CR-AKK 
Scenario: Verify authenticated user is able to proceed with Paypal as checkout for non-SOF items 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu  
	And user creates an account 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user adds shipment address on checkout page for "newly registered" user
	And user selects shipment method on check out page for "newly registered" user
	Then user click on paypal radiobtn 
	Then user switch to iframe to verify paypalcheckoutBtn 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify gift card related things are not displayed |
		|PayPalCheckOut_Btn|	
	Then Verify paypal button is clicked 

	
@R2_Mobile @R2_Regression @R2_All @P-Low @1HR_R2 @C-Checkout @KER-3338 
@ZYP_CHECKOUT_3338-8259 @CR-AKK 
Scenario: Verify logged in user is able to select Paypal as Payment method on checkout for non-SOF items 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	Then user click on paypal radiobtn 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @1HR_R2 @C-Checkout @KER-3338 
@ZYP_CHECKOUT_3338-8258 @CR-AKK 
Scenario: Verify guest user is able to proceed with Paypal as checkout for non-SOF items 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	Then user click on paypal radiobtn 
	
	@R2_Mobile @R2_Regression @R2_All @P-Low @1HR_R2 @C-Checkout @KER-3338 
@ZYP_CHECKOUT_3338-10270 @CR-AKK 		
Scenario: Verify the authenticated user cannot pay the remaining or partial order amount using PayPal in combination with Gift Card
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button  
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	Then user click on paypal radiobtn 
	Then verify the gift card option is not displayed 
	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @1HR_R2 @C-Checkout @KER-3338 
@ZYP_CHECKOUT_3338-8257 @CR-AKK 
Scenario: Verify guest user cannot select Paypal as Payment method on checkout for SOF products 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on the burger menu
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	When User searches a product "SOFSKUNumber" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And user selects terms and conditions checkbox for SOF items 
	#	And user enter First name "FirstName" 
	#	And user enter Last name "LastName" 
	#	And user enter Phone number "PhoneNumber" 
	#	And user enter Address "Address" 
	#	And user enter Zipcode "zipcode" 
	And user selects shipment method on check out page for "Guest" user
	Then verify the paypal radio option is not displayed
	
@R2_Mobile @R2_Regression @R2_All @P-Low @1HR_R2 @C-Checkout @KER-3338 
@ZYP_CHECKOUT_3338-8260 @CR-AKK
Scenario: Verify guest user cannot select Paypal as Payment method on checkout for SOF products 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on the burger menu
	And user creates an account
	And user clicks on the burger menu
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	When User searches a product "SOFSKUNumber" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And user selects terms and conditions checkbox for SOF items 
	#	And user enter First name "FirstName" 
	#	And user enter Last name "LastName" 
	#	And user enter Phone number "PhoneNumber" 
	#	And user enter Address "Address" 
	#	And user enter Zipcode "zipcode" 
	And user selects shipment method on check out page for "Newly Registered" user
	Then verify the paypal radio option is not displayed 
	
	@R2_Mobile @R2_Regression @R2_All @P-Low @1HR_R2 @C-Checkout @KER-3338 
@ZYP_CHECKOUT_3338-8263 @CR-AKK
Scenario: Verify the user is navigated back to the Academy.com once PayPal payment process is done	
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user selects shipment method on check out page for "Guest" user  
	Then user click on paypal radiobtn 
	Then user switch to iframe to verify paypalcheckoutBtn 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify gift card related things are not displayed |
		|PayPalCheckOut_Btn| 
	Then Verify paypal button is clicked 
	Then user switch to window of paypal 
	And enter the paypal login "PayPalEmail" "PayPalPassword" 
	
	
	