Feature: [Mobile] Populate Billing Address on Checkout page 



@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3132 
@ZYP_CHECKOUT_K3132-8114 @CR-RKA 
Scenario: 
	Verify Billing address on check out page - pre-populated billing address 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	Then user click on checkout from ATC pop up 
	Then user click on edit Payment link and click on billing information 
	Then user fill billing information after clicking on change billing information text 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify billing information|
		|AddressVerificationSystemModelPopUp|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3132 
@ZYP_CHECKOUT_K3132-8115 @CR-RKA 
Scenario: Verify Billing address on check out Page - Same as Shipping Address 

	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	Then user click on checkout from ATC pop up 
	Then user click on edit Payment link and click on billing information 
	Then user click on checkbox Same as shipping address 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify shipping address is displying|
		|SameAsShippingAddress_Txt|
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3132 
@ZYP_CHECKOUT_K3132-8116 @CR-RKA 
Scenario: Verify Billing address on check out Page - Same as Shipping Address 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	#      Then user compare Shipping Address is same as Billing Address 
	And user click on go to payment present in shipping method 
	Then Verify below Sub/Main Module of Checkout Page 
		|checkout_ShippingAddress_txt								|
		|SameAsShippingAddress_Txt|
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3132 
@ZYP_CHECKOUT_K3132-8117 @CR-RKA 
Scenario: Verify Billing address on check out Page - new address information 

	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	Then user click on checkout from ATC pop up 
	Then user click on edit Payment link and click on billing information 
	Then user fill billing information after clicking on change billing information text 
	#only validation is nedded after clicking confirm btn
	
	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3132 
@ZYP_CHECKOUT_K3132-8118 @CR-RKA 
Scenario: Verify Billing address on check out Page - new address information 

	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	And user click on go to payment present in shipping method 
	Then user fill the credit card detail in payment 
	Then user fill the email address and click on review order btn 
	Then user click on edit Payment link and click on billing information 
	Then user fill billing information after clicking on change billing information text 
	#only validation is nedded after clicking confirm btn
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3132 
@ZYP_CHECKOUT_K3132-10439 @CR-RKA 
Scenario: 
	Verify if 'Same as Shipping Address' checkbox is disabled for STS order 

	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	#	Then User should be able to click on Find Store
	#	Then user enter "zipCode" in Find a Store Model
	#	And user click on submit button
	#	Then user click on plus icon in Store Address drawer
	#	And user click on Make My store button	
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	And User clicks on the burger menu 
	Then user navigate to GunStorageAndSafty L_Three 
	Then user select the product from L_Three and navigate to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	Then user click on checkout from ATC pop up 
	And user does accepts the firearm specific compliance 
	And user clicks on Continue button 
	Then verify that user navigates to payment drawer 
	And Verify below Sub/Main Module of Checkout Page 
		|# Verify following section SPECIAL ORDER SHIP TO STORE in checkout page|
		|ShipToStoreforSOF_Txt|
		
@R2_Mobile @R2_Regression @R2_All @P-High @1HR_R2 @C-Checkout @KER-3132 
@ZYP_CHECKOUT_K3132-10440 @CR-RKA 
Scenario: 
	Verify if 'Same as Shipping Address' checkbox is disabled for STS order 

	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	#Then User should be able to click on Find Store
	#	Then user enter "zipCode" in Find a Store Model
	#	And user click on submit button
	#	Then user click on plus icon in Store Address drawer
	#	And user click on Make My store button	
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	Then User clicks on the burger menu 
	Then user navigate to GunStorageAndSafty L_Three 
	Then user select the product from L_Three and navigate to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	Then user click on checkout from ATC pop up 
	And user does accepts the firearm specific compliance 
	And user clicks on Continue button 
	Then verify that user navigates to payment drawer 
	And Verify below Sub/Main Module of Checkout Page 
		|#verify following element is display after click on checkout page|
		|BillingInformation_Txt|
		|FirstName_Input|
		|LastName_Input|
		|PhoneNumber_Input|
		#		|SendSMSTextUpdatesAboutMyOrder_checkbox|
		|Adderss_Input|
		|ZipCode_Input|
		|City_Input|
		|State_DD|
		|EmailAddressforOrderConfirmation_Input|
		|SignuptogetHotDeals_checkBox|
		|ReviewOrder_Btn|
	