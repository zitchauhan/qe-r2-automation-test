Feature: E03-150 - Order Cancellation Cancel Order Confirmation (Guest & Authenticated Customers)

  @R2_Mobile  @R2_All @P1 @1HR_R2 @C-Order @CC-MyAccount_Order   @KER-4021 @ZYP_MYACCOUNT_K4021-10637 @CR-RK
  Scenario: Verify that Guest User is able to view Cancellation Confirmation page
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
    And user click on go to payment present in shipping method
    And user fill the credit card detail in payment
    And user fill the email address for shipment and click on review order btn
    And user able to see the button place order
    Then user able to see order number
    And User navigates to Check Oder status Page
    Then System Generate ordernumber "GeneratedOrdernumber" and "zipcode"
	And User clicks on Check button
	#And user click on view Details
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |MyAccount_OrderPage_OrderDetailsPage|
    |Order_Cancel_lnk|	
    |MyAccount_OrderDetailsPage_OrderDate|
    |MyAccount_OrderDetailsPage_OrderNumber|
    When User Clicks on Cancel Order link
    Then Verify the message on the page
	|#verify the message|
	| ARE YOU SURE YOU WANT TO CANCEL THIS ORDER?|
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
	|Order_Number_Txt|
	|Total_Items_Txt|
	|Cancel_Yes_Order_Btn|
    |Cancel_NO_Order_Btn|
    And user click on yes cancle my order button
    And Verify that the order cancellation confirmation page is displayed
    And user should be able to see cancellation message
    And Refund details should be displayed
   	Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_Back_To_Order_Lnk                                |
      
      
      @R2_Mobile  @R2_All @P2 @1HR_R2 @C-Order @CC-MyAccount_Order   @KER-4021 @ZYP_MYACCOUNT_K4021-10639 @CR-RK
  Scenario: Verify that Authenticated User is able to view Cancellation Confirmation page
  Given user launches the browser and navigates to "ASO_HOME" page 
   	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on Orders link	
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
	When user click on view Details
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |MyAccount_OrderPage_OrderDetailsPage|
    |Order_Cancel_lnk|	
    |MyAccount_OrderDetailsPage_OrderDate|
    |MyAccount_OrderDetailsPage_OrderNumber|
    When User Clicks on Cancel Order link
    Then Verify the message on the page
	|#verify the message|
	| ARE YOU SURE YOU WANT TO CANCEL THIS ORDER?|
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
	|Order_Number_Txt|
	|Total_Items_Txt|
	|Cancel_Yes_Order_Btn|
    |Cancel_NO_Order_Btn|
    And user click on yes cancle my order button
    And Verify that the order cancellation confirmation page is displayed
    And user should be able to see cancellation message
    And Refund details should be displayed
   	Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_Back_To_Order_Lnk                                |