Feature: E03-100 - My Account, Order Details 

@R2_Web @Regression @R2_All @P2 @C-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10510 @CR-GK 
Scenario: Verify that Authenticated User is able to view order list 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	#Updated by MJR on 15/7/19
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigates to orders in my account 
	Then Verify that list of orders are displayed in the right section of the page 
	And Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|OrderPage_TotalNumberOfOrder_txt           |
		|OrderPage_CustomerCare_lnk                 |
		|OrderPage_OrdersDropDownNewestSorted       |
		|OrderPage_Find_btn                         |
		|MyAccount_OrderPage_OrderPlacedOnDate_txt  |
		|MyAccount_OrderPage_OrderNumber_txt        |
		|MyAccount_OrderPage_OrderTotal_txt         |
	And Verify that 10 orders are displayed per page 
	And Oldest sorting option is available 
	
	
	
@R2_Web @Regression @R2_All @P2 @C-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10511 @CR-GK @1HR_R2 
Scenario: Verify that Order search field is displayed if Authenticated user does not have any orders 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	And user navigates to orders in my account 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|OrderPage_BillingZipCode_txt         |
		|MyAccount_OrderPage_OrderNumberInput |
		|OrderPage_Find_btn					  |
		
		
@R2_Web @C-Order @CC-MyAccount_Order @R2_All @P-High_Order  @KER-4237 
@ZYP_MYACCOUNT_K4237-10513 @CR-GK 
Scenario: Verify that Authenticated user is able to view shipping and Billing Details of an order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button
	And user click on checkout button in Cart page
	And user enters valid cvv value "ThreeDigitCVV"  
	Then user click on review order button 
	And user able to see the button place order 
	And user navigates from Order successful page to Orders in my account 
	And User clicks on View Details CTA for an order 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|MyAccount_OrderPage_OrderDetailsPage       |
		|MyAccount_OrderDetailsPage_OrderDate       |
		|MyAccount_OrderDetailsPage_OrderNumber     |
		|MyAccount_OrderDetailsPage_OrderStatus     |
		|Order_OrderTotal							|
		|MyAccount_OrderDetailsPage_ShippingAmount  |
		|MyAccount_OrderDetailsPage_TaxAmount       |
		|MyAccount_OrderDetailsPage_SubTotalAmount  |
		#|#MyAccount_OrderDetailsPage_PrintReceipt    |
		|MyAccount_OrderDetailsPage_ShippingAddress |
		|MyAccount_OrderDetailsPage_BillingInfo     |
		|MyAccount_OrderDetailsPage_EmailOrPhone    |
		|Order_Payment_txt							|
		
		
@R2_Web @C-Order @CC-MyAccount_Order @R2_All @P-High_Order   @KER-4237 
@ZYP_MYACCOUNT_K4237-10514 @CR-GK 
Scenario: Verify that Guest user is not able to view shipping and Billing Details of an order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
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
	And user fill the email address for shipment and click on review order btn 
	And user able to see the button place order 
	And user click on check order link and check for the order with zip code "zipcode" 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|MyAccount_OrderPage_OrderDetailsPage       |
		|MyAccount_OrderDetailsPage_ShippingAddress |
		|Order_OrderTotal							|
		
		
@R2_Web @C-Order @CC-MyAccount_Order @R2_All @P-High_Order   @KER-4237 
@ZYP_MYACCOUNT_K4237-10518 @Order @CR-GK 
Scenario: Verify that Authenticated user is able to Print Order receipt 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button
	And user click on checkout button in Cart page
	And user enters valid cvv value "ThreeDigitCVV" 
	Then user click on review order button 
	And user able to see the button place order 
	And user navigates from Order successful page to Orders in my account 
	And User clicks on View Details CTA for an order 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		#|#MyAccount_OrderDetailsPage_PrintReceipt    |
	#And user click on print receipt link 
	
	
@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-High_B @CB-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10519 @CR-GK 
Scenario: Verify that Authenticated user is able to view order details for BOPIS orders 
	Given   user launches the browser and navigates to "ASO_HOME" page 
	When   user clicks on SignIn link from global header 
	And   user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And   user enter the valid password "Password" 
	And   user click on signin button 
	And   user navigates to orders in my account 
	And   User clicks on View Details CTA for an order 
	Then  Verify below Sub/Main Module of My Account 
		|#Verify following elements in order details page|
		|MyAccount_OrderPage_OrderDetailsPage       |
		|MyAccount_OrderDetailsPage_OrderDate       |
		|MyAccount_OrderDetailsPage_OrderNumber     |
		|MyAccount_OrderDetailsPage_OrderStatus     |
		|Order_OrderTotal							|
		|MyAccount_OrderDetailsPage_TaxAmount       |
		|MyAccount_OrderDetailsPage_SubTotalAmount  |
		
@R2_Web @R2_All @P2 @CB-MyAccount @KER-4237 @ZYP_MYACCOUNT_K4237-10520 @C-BOPIS
Scenario: Verify that Authenticated user is able to view store details for BOPIS orders
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email"
	And user click on MyAccount  
	When user click on Orders link
	Then user click on view Details
	And user click on view store details button
		
@R2_Web @C-Order @CC-MyAccount_Order @R2_All @P-High_Order   @KER-4237 
@ZYP_MYACCOUNT_K4237-10526 @Order @CR-GK 
Scenario: Verify that UnAuthenticated user is able to print order receipt 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button
	And user click on checkout button in Cart page 
	Then user click on review order button 
	And user able to see the button place order 
	And user navigates from Order successful page to Orders in my account 
	And User clicks on View Details CTA for an order 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		#|#MyAccount_OrderDetailsPage_PrintReceipt    |
	#And user click on print receipt link 
	
@R2_Web @R2_All @P2 @CB-MyAccount @KER-4237 @ZYP_MYACCOUNT_K4237-10527 @C-BOPIS
Scenario: Verify that UnAuthenticated user is able to view order details for BOPIS orders
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user click on the check order button available in footer
	And user enter the orderid "BOPIS_OrderID" and billing zipcode "BOPIS_OrderID_Zipcode"
	And user click on check button
	Then Verify below Sub/Main Module of My Account 
	|#Verify that Order Detail Page is displayed|
	|MyAccount_OrderPage_OrderPlacedOnDate_txt  |
	|MyAccount_OrderDetailsPage_OrderDate       |
	|MyAccount_OrderPage_OrderNumber_txt        |
	|MyAccount_OrderDetailsPage_OrderStatus     |
	|MyAccount_OrderDetailsPage_SubTotalAmount  |
	|MyAccount_OrderDetailsPage_TaxAmount       |
	|MyAccount_OrderPage_OrderTotal_txt         |
	|Order_Bopis_In_Store_Pickup_txt|
	|MyAccount_OrderPage_OrderNumberInput       |
	|MyAccount_OrderPage_OrderDetailsPage       |	
	|Order_Bopis_Pickup_txt|
	|Order_Bopis_Store_Hours_txt|
	|Order_Bopis_Pickup_Information_Person_Details_Txt|
	|Order_Bopis_View_Store_Btn|
	#|#Order_Bopis_Print_Receipt_lnk|
	|Order_Bopis_InStore_Pickup_Msg|
	|Order_Bopis_Item_Img|
	|Order_Bopis_Item_Details|

@R2_Web @R2_All @P2 @CB-MyAccount @KER-4237 @ZYP_MYACCOUNT_K4237-10528 @C-BOPIS
Scenario: Verify that UnAuthenticated user is able to view store details for BOPIS orders
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user click on the check order button available in footer
	And user enter the orderid "BOPIS_OrderID" and billing zipcode "BOPIS_OrderID_Zipcode"
	And user click on check button
	And user click on view store details button
	

		
		
		
			
	
	
