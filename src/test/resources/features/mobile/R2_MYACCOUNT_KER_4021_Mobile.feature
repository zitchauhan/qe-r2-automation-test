Feature: E03-150 - Order Cancellation Cancel Order Confirmation (Guest & Authenticated Customers)

  @R2_Mobile @R2_Regression @R2_All @P-Highest @1HR_R2 @C-MyAccount @KER-4021 @ZYP_MYACCOUNT_K4021-10637 @CR-RK
  Scenario: Verify that Guest User is able to view Cancellation Confirmation page
  Given user launches the browser and navigates to "ASO_HOME" page 
  	And User navigates to Check Oder status Page
	When user enter "OrderNumber" and "BillindZipCode"
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
      
      
      @R2_Mobile @R2_Regression @R2_All @P-High @1HR_R2 @C-MyAccount @KER-4021 @ZYP_MYACCOUNT_K4021-10639 @CR-RK
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