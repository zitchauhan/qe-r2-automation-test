Feature: Quick Checkout 


@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_CART_K4030-11496 @CR-SK 
Scenario: Verify authenticated user with no information saved in my account is able to navigate to shipping address drawer during quick checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And user clicks on sign in link from burger menu
	And user logs in as "RawUser"
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	Then Verify below Sub/Main Module of Checkout Page
		|# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingInformation_Header_txt					|
		|checkout_ShippingAddress_FirstName_txt						|
		|checkout_ShippingAddress_LastName_txt						|
		

@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_CART_K4030-11498 @CR-SK 
Scenario: Verify authenticated user with address details saved in my account is able to navigate to Billing address drawer during express checkout 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu
	And user logs in as "UserWithTaxableAddress"
	And User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	Then Verify below Sub/Main Module of Checkout Page
		|# Verify following elements in Checkout|
		|PaymentHeader_Txt						|
		|PaymentMethodHeader_Txt				|
		|checkout_ShippingAddress_txt			|
		|checkout_ShippingMethod_ShippingDetails|

@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_CART_K4030-11499 @CR-SK 
Scenario: Verify authenticated user with address details and payment details saved in my account is able to navigate to order summary page during express checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu
	And user logs in as "UserWithSavedAddressAndPayment" 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	Then Verify below Sub/Main Module of Checkout Page
		|# Verify following elements in Checkout|
		|PaymentHeader_Txt						|
		|PaymentMethodHeader_Txt				|
		|checkout_ShippingAddress_txt			|
		|checkout_ShippingMethod_ShippingDetails|
		|ChooseCreditcard_Dd					|

@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_CART_K4030-11502 @CR-SK 
Scenario: Verify the primary default shipping options should be utilized while quick checkout	 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu
	And user logs in as "UserWithSavedAddressAndPayment"
	And user navigate and deletes existing items in cart
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	Then Verify the message on the page
    |# Following shipping message should show on the page	|
    |Ground shipping										|

@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_CART_K4030-11503 @CR-SK 
Scenario: Verify the primary default shipping options should be utilized while quick checkout for WG products
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu
	And user logs in as "UserWithSavedAddressAndPayment"
	And user navigate and deletes existing items in cart
	And User searches a product "SKUForWhiteGlove" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	Then Verify the message on the page
    |# Following shipping message should show on the page					|
    |We will deliver to your door with no appointment or signature required	|		
		
