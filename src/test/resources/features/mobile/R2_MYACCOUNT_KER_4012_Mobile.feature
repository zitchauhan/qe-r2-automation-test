Feature: E03-150-Order Cancellation Request Order Cancellation from My Account

@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4012 @ZYP_MYACCOUNT_K4012-10667 @CR-MS
Scenario: Verify the elements of order cancel confirmation modal
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on Orders link
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
	And user click on view Details
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Back_To_Order_Lnk_M|
    |Order_Cancel_lnk|
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
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4012 @ZYP_MYACCOUNT_K4012-10663 @CR-MS
Scenario: Verify that for Authenticated user "Cancel Order" CTA is displayed for orders in remorse period
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu 
	Then user should able to click on Signin button 
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
    |Order_Cancel_lnk|	
    
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4012 @ZYP_MYACCOUNT_K4012-10668 @CR-MS
Scenario: Verify that for Authenticated user "Cancel Order" CTA is displayed for orders in remorse period
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on Orders link
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
	And user click on view Details
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Cancel_lnk|
    When User Clicks on Cancel Order link
    And User clicks on No Button on confirmation modal
    Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Cancel_lnk|     
    
@R2_Mobile @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4012 @ZYP_MYACCOUNT_K4012-11149 @CR-MS
Scenario: Verify Cancel Order link for each order
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	And user click on MyAccount
	When user click on Orders link
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
	Then user click on view Details of List orders and verify the cancel order button 
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4012 @ZYP_MYACCOUNT_K4012-10672 @CR-MS
Scenario: Verify that Authenticated User is able to navigate back to order details page from cancellation confirmation page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on Orders link
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
	And user click on view Details
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Cancel_lnk|
    When User Clicks on Cancel Order link
    And User clicks on No Button on confirmation modal
    Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Cancel_lnk|
    When User clicks on Back to Order details Link on cancellation confirmation page
    Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|     	
	
	   