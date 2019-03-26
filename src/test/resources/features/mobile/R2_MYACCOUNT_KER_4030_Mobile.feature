Feature: Quick Checkout 


@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_MYACCOUNT_K4030-11496 @CR-SK 
Scenario: 
	Verify authenticated user with no information saved in my account is able to navigate to shipping address drawer during quick checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user logs in as "RawUser" 
	And user navigate and deletes existing items in cart 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingInformation_Header_txt					|
		|checkout_ShippingAddress_FirstName_txt						|
		|checkout_ShippingAddress_LastName_txt						|
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_MYACCOUNT_K4030-11498 @CR-SK 
Scenario: 
	Verify authenticated user with address details saved in my account is able to navigate to Billing address drawer during express checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user logs in as "UserWithTaxableAddress" 
	And user navigate and deletes existing items in cart 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	When user click on checkout button 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout|
		|PaymentHeader_Txt						|
		|checkout_ShippingAddress_txt			|
		|checkout_ShippingMethod_ShippingDetails|
		
@R2_Mobile @R2_Regression @R2_All @P-High @1HR_R2 @C-MyAccount @KER-4030 
@ZYP_MYACCOUNT_K4030-11499 @CR-SK 
Scenario: 
	Verify authenticated user with address details and payment details saved in my account is able to navigate to order summary page during express checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user logs in as "UserWithSavedAddressAndPayment" 
	And user navigate and deletes existing items in cart 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout|
		|PaymentHeader_Txt						|
		|checkout_ShippingAddress_txt			|
		|checkout_ShippingMethod_ShippingDetails|
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_MYACCOUNT_K4030-11502 @CR-SK 
Scenario: 
	Verify the primary default shipping options should be utilized while quick checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user logs in as "UserWithSavedAddressAndPayment" 
	And user navigate and deletes existing items in cart 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	Then Verify the message on the page 
		|# Following shipping message should show on the page	|
		|Ground shipping										|
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_MYACCOUNT_K4030-11503 @CR-SK 
Scenario: 
	Verify the primary default shipping options should be utilized while quick checkout for WG products 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user logs in as "UserWithSavedAddressAndPayment" 
	And user navigate and deletes existing items in cart 
	And User searches a product "SKUForWhiteGlove" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	Then Verify the message on the page 
		|# Following shipping message should show on the page					|
		|We will deliver to your door with no appointment or signature required	|		
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_MYACCOUNT_K4030-12817 @CR-SK 
Scenario: 
	Verify during quick checkout error message will display for shipping address section for Items do not have prop 65 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user logs in as "UserWithDefaultCaliforniaAddress" 
	And user navigate and deletes existing items in cart 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	#	Then user is navigated to checkout page
	And Verify the message on the page 
		|# Following shipping message should show on the page														|
		|Due to restrictions imposed by Prop65 by the state of California, we cannot ship this item to California.	|
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_MYACCOUNT_K4030-KER-12809 @CR-SK 
Scenario: 
	Verify user can able to edit shipping method after landing on order summary during quick checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user logs in as "UserWithSavedAddressAndPayment" 
	And user navigate and deletes existing items in cart 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	And user click on edit button of shipping method 
	And user modifies shipping method 
	And user click on go to payment present in shipping method 
	Then Verify below Sub/Main Module of Checkout Page 
		|#Payment section should be displayed in checkout page	|
		|PaymentMethodHeader_Txt								|
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_MYACCOUNT_K4030-KER-12810 @CR-SK 
Scenario: 
	Verify user can able to edit Payment Methods after landing on order summary during quick checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user logs in as "UserWithSavedAddressAndPayment" 
	And user navigate and deletes existing items in cart 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	And user click on edit payment metnod 
	Then user is able to modify payment method 
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_MYACCOUNT_K4030-KER-12808 @CR-SK 
Scenario: 
	Verify user can able to edit shipping address after landing on order summary during quick checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user logs in as "UserWithSavedAddressAndPayment" 
	And user navigate and deletes existing items in cart 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	And user click on edit button of shipping address 
	Then user is able to modify shipping address 
