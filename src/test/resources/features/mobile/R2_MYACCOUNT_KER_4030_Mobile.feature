Feature: Quick Checkout 

####==============Status Fixed
@R2_Mobile @R2_Regression @R2_All @P-High @C-My_Account @KER-4030 
@ZYP_CART_K4030-11496 @CR-SK 
Scenario: Verify authenticated user with no information saved in my account is able to navigate to shipping address drawer during quick checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddressForZeroProductsInCart" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	Then Verify below Sub/Main Module of Checkout Page
		|# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingInformation_Header_txt					|
		|checkout_ShippingAddress_FirstName_txt						|
		|checkout_ShippingAddress_LastName_txt						|
		

#####==============Status - Failing : Known issue
@R2_Mobile @R2_Regression @R2_All @P-High @C-My_Account @KER-4030 
@ZYP_CART_K4030-11498 @CR-SK 
Scenario: Verify authenticated user with address details saved in my account is able to navigate to Billing address drawer during express checkout 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user logs in as "EmailAddress" 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	Then Verify below Sub/Main Module of Checkout Page
		|# Verify following elements in Checkout|
		|PaymentHeader_Txt						|
		|PaymentMethodHeader_Txt				|
		|checkout_ShippingAddress_txt			|
		|checkout_ShippingMethod_ShippingDetails|


		
		
