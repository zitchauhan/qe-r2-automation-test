Feature: E03-100 - My Account, Order Details 

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10510 @CR-GK 
Scenario: Verify that Authenticated User is able to view order list 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
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
	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10511 @CR-GK 
Scenario: 
	Verify that Order search field is displayed if Authenticated user does not have any orders 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	And user navigates to orders in my account 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|OrderPage_ShippingZipCode_txt        |
		|MyAccount_OrderPage_OrderNumberInput |
		|OrderPage_Find_btn					  |
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10513 @CR-GK 
Scenario: 
	Verify that Authenticated user is able to view shipping and Billing Details of an order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigates to orders in my account 
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
		|MyAccount_OrderDetailsPage_PrintReceipt    |
		|MyAccount_OrderDetailsPage_ShippingAddress |
		|MyAccount_OrderDetailsPage_BillingInfo     |
		|MyAccount_OrderDetailsPage_EmailOrPhone    |
		|Order_Payment_txt							|
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4237 
@ZYP_MYACCOUNT_K4237-10514 @CR-GK 
Scenario: 
	Verify that Guest user is not able to view shipping and Billing Details of an order 
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
	And user fill the email address for shipment and click on review order btn 
	And user able to see the button place order 
	And user click on check order link and check for the order with zip code "zipcode" 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|MyAccount_OrderPage_OrderDetailsPage       |
		|MyAccount_OrderDetailsPage_ShippingAddress |
		|Order_OrderTotal							|
		
