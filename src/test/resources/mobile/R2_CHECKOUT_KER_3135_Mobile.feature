Feature: B07-500- Change Billing Address 

@R2_Mobile @R2_Regression @R2_All @P2 @C-Checkout @KER-3135 @1HR_R2 
@ZYP_CHECKOUT_K3135-8108 @CR-GK 
Scenario: To verify change billing Address CTA 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	Then user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And user click on edit Payment link and click on billing information 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%%%%%   Billing Information Form %%%%%%%%%%|
		|BillingInformation_Txt|
		|SameAsShippingAddress_Txt|
		|SameAsShippingAddress_checkBox|
		|FirstName_Input|
		|LastName_Input|
		|PhoneNumber_Input|
		|Adderss_Input|
		|ZipCode_Input|
		|City_Input|
		|State_DD|
		|SignuptogetHotDeals_checkBox|
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "ShippingRestrictedZipCode" , "EmailAddress" 
	And user click on confirm billing address button 
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Checkout @KER-3135 
@ZYP_CHECKOUT_K3135-8109 @CR-GK 
Scenario: To verify all fields in Billing Address Form 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	Then user click on checkout button in Cart page 
	And user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And user click on edit Payment link and click on billing information 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%%%%%   Billing Information Form %%%%%%%%%%|
		|BillingInformation_Txt|
		|SameAsShippingAddress_Txt|
		|SameAsShippingAddress_checkBox|
		|FirstName_Input|
		|LastName_Input|
		|PhoneNumber_Input|
		|Adderss_Input|
		|ZipCode_Input|
		|City_Input|
		|State_DD|
		|SignuptogetHotDeals_checkBox|
		|SavePaymentInfoForLater_checkBox|
		|ReviewOrder_Btn|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3135 
@ZYP_CHECKOUT_K3135-8110 @CR-GK 
Scenario: To verify change billing Address CTA 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	Then user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And user click on edit Payment link and click on billing information 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "ShippingRestrictedZipCode" , "EmailAddress" 
	And user click on confirm billing address button 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%%%%%   Billing Information %%%%%%%%%%|
		|EditPayment_Link|
		|BillingInformation_Txt|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3135 
@ZYP_CHECKOUT_K3135-8111 @CR-GK 
Scenario: To verify user can add new billing address information 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	Then user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And user click on edit Payment link and click on billing information 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "AVSAddress" , "zipcode" , "EmailAddress" 
	And user click on confirm billing address button 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%%%%%   Billing Information %%%%%%%%%%|
		|AddressVerificationSystemModelPopUp|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3135 
@ZYP_CHECKOUT_K3135-8113 @CR-GK 
Scenario: To verify Extra fields in Billing Address Form 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	Then user click on checkout button in Cart page 
	And   user is navigated to order summary page 
	And   user click on edit Payment link and click on billing information 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "zipcode" , "EmailAddress" 
	And user click on Add Company Name, Apt Name, Number etc link 
	And user enters extra address information "PO_ADDRESS" 
	And user click on confirm billing address button 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%%%%%   Billing Information %%%%%%%%%%|
		|EditPayment_Link|
		|BillingInformation_Txt|
	