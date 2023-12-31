Feature: E03-100 - My Account, Order Details 

@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10510 @CR-GK 
Scenario: Verify that Authenticated User is able to view order list 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And user navigates to orders in my account 
	Then Verify that list of orders are displayed in the right section of the page 
	And Verify below Sub/Main Module of My Account 
		| #Verify following elements in order section |
		| OrderPage_TotalNumberOfOrder_txt            |
		| OrderPage_OrdersDropDownNewestSorted        |
		| OrderPage_Find_btn                          |
	And Verify that 10 orders are displayed per page 
	And Oldest sorting option is available 
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10511 @CR-GK 
Scenario: Verify that Order search field is displayed if Authenticated user does not have any orders
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user logs in as "RawUser" 
	And User clicks on the burger menu 
	And user navigates to orders in my account 
	Then Verify below Sub/Main Module of My Account 
		| #Verify following elements in order section |
		| OrderPage_BillingZipCode_txt                |
		| MyAccount_OrderPage_OrderNumberInput        |
		| OrderPage_Find_btn                          |
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10513 @CR-GK 
Scenario: Verify that Authenticated user is able to view shipping and Billing Details of an order
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And user navigates to orders in my account 
	And User clicks on View Details CTA for an order 
	Then Verify below Sub/Main Module of My Account 
		| #Verify following elements in order section |
		| MyAccount_OrderPage_OrderDetailsPage        |
		| MyAccount_OrderDetailsPage_OrderDate        |
		| MyAccount_OrderDetailsPage_OrderNumber      |
		| MyAccount_OrderDetailsPage_OrderStatus      |
		| Order_OrderTotal                            |
		| MyAccount_OrderDetailsPage_ShippingAmount   |
		| MyAccount_OrderDetailsPage_TaxAmount        |
		| MyAccount_OrderDetailsPage_SubTotalAmount   |
		| #MyAccount_OrderDetailsPage_PrintReceipt     |
		| MyAccount_OrderDetailsPage_ShippingAddress  |
		| MyAccount_OrderDetailsPage_BillingInfo      |
		| MyAccount_OrderDetailsPage_EmailOrPhone     |
		
@R2_Mobile @C-Order @CC-MyAccount_Order @R2_All @P-High_Order @KER-4237 
@ZYP_MYACCOUNT_K4237-10514 @CR-GK @1HR_R2 
Scenario: Verify that Guest user is not able to view shipping and Billing Details of an order

	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "AVSAddress" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	And user selects the suggested address instead of entered address 
	And clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	And user fill the credit card detail in payment 
	And user fill the email address for shipment and click on review order btn 
	And user able to see the button place order 
	And user click on check order link and check for the order with zip code "zipcode" 
	Then Verify below Sub/Main Module of My Account 
		| #Verify following elements in order section |
		| MyAccount_OrderPage_OrderDetailsPage        |
		| MyAccount_OrderDetailsPage_ShippingAddress  |
		| Order_OrderTotal                            |
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10518 @CR-GK 
Scenario: Verify that Authenticated user is able to Print Order receipt 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And user navigates to orders in my account 
	And User clicks on View Details CTA for an order 
	Then Verify below Sub/Main Module of My Account 
		| #Verify following elements in order section |
		#| #MyAccount_OrderDetailsPage_PrintReceipt     |
	#And user click on print receipt link 
	
@C-BOPIS @R2_Mobile @R2_NonRegression @R2_All @P-High_B @CB-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10519 @CR-GK 
Scenario: Verify that Authenticated user is able to view order details for BOPIS orders

	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And user navigates to orders in my account 
	And User clicks on View Details CTA for an order 
	Then Verify below Sub/Main Module of My Account 
		| #Verify following elements in order details page |
		| MyAccount_OrderPage_OrderDetailsPage             |
		| MyAccount_OrderDetailsPage_OrderDate             |
		| MyAccount_OrderDetailsPage_OrderNumber           |
		| MyAccount_OrderDetailsPage_OrderStatus           |
		| Order_OrderTotal                                 |
		| MyAccount_OrderDetailsPage_TaxAmount             |
		| MyAccount_OrderDetailsPage_SubTotalAmount        |
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10526 @CR-GK 
Scenario: Verify that UnAuthenticated user is able to print order receipt 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on sign in link from burger menu 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And user navigates to orders in my account 
	And User clicks on View Details CTA for an order 
	Then Verify below Sub/Main Module of My Account 
		| #Verify following elements in order section |
		#| #MyAccount_OrderDetailsPage_PrintReceipt     |
	#And user click on print receipt link 
