Feature: Verify that business user can display the inline shipping messages and disclaimers in the shipping method section

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3148 @ZYP_CHECKOUT_K3148-8265 @CR-MS
Scenario: Verify that business user can display the inline shipping messages and disclaimers in the shipping method section
Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout from ATC pop up 
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	Then  Verify below Sub/Main Module of Checkout Page 
	|# Verify below in checkout page shipping method drawer|
	|checkout_ShippingMethod_ShippingMethodType_btn	|