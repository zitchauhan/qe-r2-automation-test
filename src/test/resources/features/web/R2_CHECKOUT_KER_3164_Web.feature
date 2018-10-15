Feature: B04-300- Authenticated Checkout Flow 

@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3164 
@ZYP_CHECKOUT_K3164-8027 @CR-GK 
Scenario: 
	Verify that authenticated user is able to select address in dropdown in shipping address section 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout from ATC pop up 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingAddress_Edit_lnk		|
		|checkout_ShippingAddress_txt			|
	And User clicks on edit CTA 
	And user select new address from the shipping address drop down 
	And user click on confirm button 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingAddress_Edit_lnk		|
		|checkout_ShippingAddress_txt			|
		
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3164 
@ZYP_CHECKOUT_K3164-8028 @CR-GK 
Scenario: Verify that authenticated user is able view/select shipping method 
	Verify that authenticated user is able to select address in dropdown in shipping address section 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout from ATC pop up 
	And user clicks on edit shipping method cta 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout > Shipping Method	|
		|checkout_ShippingMethod_ShippingMethodHeader_txt			|
		|checkout_ShippingMethod_ShippingMethodType_btn				|
	And User Clicks on shipping method dropwdown box and selects another shipping method 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout > Shipping Method	|
		|checkout_ShippingMethod_ShippingMethodHeader_txt			|
		|checkout_ShippingMethod_ShippingMethodType_btn				|
		|checkout_ShippingMethod_GoToPayment_btn					|
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3164 
@ZYP_CHECKOUT_K3164-8029 @CR-GK @1HR_R2
Scenario: 
	Verify if User is able to select a Payment method on One Page Checkout Screen 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And  user clicks on SignIn link from global header 
	And user logs in as "EmailAddress"
	And  User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user click on checkout button 
	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	And User Clicks on credit card dropwdown and selects another card 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout > Payment Drawer|
		|ChooseCreditcard_Dd|
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3164 
@ZYP_CHECKOUT_K3164-8030 @CR-GK 
Scenario: Verify if User is able to enter billing information 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And  user clicks on SignIn link from global header 
	And  user enter the valid emailaddress "EmailAddress" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	And user navigate and deletes existing items in cart 
	And  User searches a product "productName" and navigates to PDP 
	And  user click on Add to Cart Button 
	And  user is navigated to Add to cart Notification popup 
	And  user click on checkout from ATC pop up 
	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	And user clicks on change billing info cta 
	And user click on checkbox Same as shipping address 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements billing address form|
		|SameAsShippingAddress_checkBox|
		|FirstName_Input|
		|LastName_Input|
		|PhoneNumber_Input|
		|Adderss_Input|
		|ZipCode_Input|
		|City_Input|
		|State_DD|
		|SignuptogetHotDeals_checkBox|
		|ReviewOrder_Btn|
	And user click on checkbox Same as shipping address 
	And user uncheck the checkbox for Billing address different from shipping address 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements billing address form|
		|SameAsShippingAddress_checkBox|
		|FirstName_Input|
		|LastName_Input|
		|PhoneNumber_Input|
		|Adderss_Input|
		|ZipCode_Input|
		|City_Input|
		|State_DD|
		|SignuptogetHotDeals_checkBox|
		|ReviewOrder_Btn|
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "ShippingRestrictedZipCode" , "EmailAddress" 
	And user click on confirm billing address button
	
	
@R2_Web @C-Order @CC-Checkout_Order @R2_All @P-Highest   @KER-3164 
@ZYP_CHECKOUT_K3164-8031 @CR-GK 
Scenario: 
	Verify if the user is able to reviw and place order from One Page Checkout Screen
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user creates an account 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "newly registered" user 
	And user selects shipment method on check out page for "newly registered" user 
	And user add "Credit Card" details in payment method for "newly registered" user 
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
		
		
@R2_Web @C-Order @CC-Checkout_Order @R2_All @P-Medium   @KER-3164 
@ZYP_CHECKOUT_K3164-13296 @CR-GK @C1-Message
Scenario: 
	Verify that user should be displayed with the validation error message if they try to enter invalid email id for order confirmation field in checkout page
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	And user fill the credit card detail in payment 
	And user enter the email id for order confirmation "InvalidEmailAddress" 
	And user click on confirm billing address button 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Enter a valid email address,Note that + is not allowed in email address field.|
		
		
		
@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-3164 
@ZYP_CHECKOUT_K3164-13295 @CR-GK @C1-Message
Scenario: 
	Verify that user should be displayed with the error message if they try to save billing info without entering the email id for order confirmation field in checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And  user is navigated to Add to cart Notification popup 
	And  user click on checkout from ATC pop up 
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	And user fill the credit card detail in payment 
	And user click on confirm billing address button 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter email address|
		
		
@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-3164 
@ZYP_CHECKOUT_K3164-13293 @CR-GK @C1-Message
Scenario: 
	Verify the validation error message for the email id for order confirmation field in the shipping address drawer in checkout page if we edit without passing the email id 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And  user is navigated to Add to cart Notification popup 
	And  user click on checkout from ATC pop up 
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	And user fill the credit card detail in payment 
	And user click on confirm billing address button 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter email address|
		
		
		
@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-3164 
@ZYP_CHECKOUT_K3164-13290 @CR-GK 
Scenario: 
	Verify the validation error message for the email id for order confirmation field in the shipping address drawer in checkout page if we edit without passing the email id 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And  user is navigated to Add to cart Notification popup 
	And  user click on checkout from ATC pop up 
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	And user fill the credit card detail in payment 
	And user enter the email id for order confirmation "EmailAddress" 
	And user click on confirm billing address button 
	Then user should be able to see the email "EmailAddress" in payment drawer 
	