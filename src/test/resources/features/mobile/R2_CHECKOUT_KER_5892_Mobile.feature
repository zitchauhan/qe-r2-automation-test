Feature: [Mobile] B07-200 Checkout| Signed In User| Pay using saved Credit Card 

@R2_Mobile @R2_Regression @R2_All @P-Higest @1HR_R2 @C-Checkout @KER-5892 
@ZYP_CHECKOUT_K5892-8201 @CR-RKA 
Scenario: 
	Verify user is able to see the list of saved credit cards on Checkout while Payment 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	#	Then User clicks on the burger menu
	#   And User navigates to L3
	#	And user clicks on the product card and navigates to PDP 
	And  User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	Then user click on edit payment metnod 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify  credit card is selected  | 
		|ChooseCreditcard_Dd|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-5892 
@ZYP_CHECKOUT_K5892-8203 @CR-RKA 
Scenario: 
	Verify user selected credit card is visually indicated in the drop-down 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	#    Then User clicks on the burger menu
	#	 And User navigates to L3
	#	And user clicks on the product card and navigates to PDP 
	And  User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	Then user click on edit payment metnod 
	Then user click on credit card dropdown 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify  credit card DD is highlighting after clicking on choose creditcard DD  | 
		|ChooseCreditcard_Dd|
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-5892 
@ZYP_CHECKOUT_K5892-10814 @CR-RKA 
Scenario: 
	Verify the user is able to add a new credit card while payment that is displayed in active order only 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	And user click on credit card dropdown and selects and new credit card 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify credit card number ,expirydate and cvv input box is displayed|
		|CreditCardNumber_Input|
		|ExpirationDate_Input|
		|Cvv_Input|
		
		
		
@R2_Mobile @C-Order @CC-Checkout_Order @R2_All @P-High_Order @KER-5892 
@ZYP_CHECKOUT_K5892-10816 @CR-RKA 
Scenario: 
	Verify the user is able to add a new credit card while payment that is displayed in active order only 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And  user clicks on SignIn link from global header 
	And  user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	And  User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	And user click on confirm billing address button 
	And user able to see the button place order 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%  verify order below attributes on order confirmation page %%|
		|OrderConfirmationPage_OrderNumber|
		
@R2_Mobile @R2_Regression @R2_All @P-Highest @1HR @C-Checkout @KER-5892 
@ZYP_CHECKOUT_K5892-13288 @CR-RKA 
Scenario: 
	Verify expired credit card behavior in checkout page - Payment section (Single Credit Card) 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And  user clicks on SignIn link from global header 
	And  user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user clicks on add new credit card cta 
	Then user fill expired credit card detail 
	Then user enter First Name field "UpdateFirstName" 
	And user enter Last Name field "UpdateLastName" 
	And user enter Address field "UpdateAddress" 
	And user enter ZipCode field "UpdateZipcode" 
	And user enter PhoneNumber field "UpdatePhoneNumber" 
	Then click on Add button on credit card page 
	Then User clicks on ASO logo 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	And User Clicks on credit card dropwdown and selects another card 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout > Payment Drawer|
		|ChooseCreditcard_Dd|
		#		
		#		
		#		