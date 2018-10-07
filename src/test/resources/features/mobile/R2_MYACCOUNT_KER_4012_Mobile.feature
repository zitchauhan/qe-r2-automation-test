Feature: E03-150-Order Cancellation Request Order Cancellation from My Account

@R2_Mobile  @R2_All @P-High  @C-Order @CC-MyAccount_Order   @KER-4012 @ZYP_MYACCOUNT_K4012-10668 @ZYP_MYACCOUNT_K4012-10672 @CR-MS
Scenario: Verify that order is not cancelled if user clicks on No CTA on confirmation modal
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu  
	When user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password"
	And user click on signin button 
	And User searches a product "SKUForBuyNow" and navigates to PDP
	Then user clicks on By Now button	
	And user is navigated to order confirmation page and captures order number
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on Orders link
	And user click on view Details with the GeneratedOrdernumber by No 
    Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Back_To_Order_Lnk|
    |Order_Cancel_lnk| 
    
@R2_Mobile  @R2_All @P-Low  @C-Order @CC-MyAccount_Order   @KER-4012 @ZYP_MYACCOUNT_K4012-10663 @ZYP_MYACCOUNT_K4012-10667 @ZYP_MYACCOUNT_K4012-11149 @CR-MS
Scenario: Verify that for Authenticated user "Cancel Order" CTA is displayed for orders
    Given user launches the browser and navigates to "ASO_HOME" page 
    Then User clicks on the burger menu 
	When user should able to click on Signin button 
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
    Then Verify the message on the page
	|#verify the message|
	| ARE YOU SURE YOU WANT TO CANCEL THIS ORDER?|
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
	|Order_Number_Txt|
	|Total_Items_Txt|
	|Cancel_Yes_Order_Btn|
    |Cancel_NO_Order_Btn|
    
@R2_Mobile  @R2_All @P-High  @C-Order @CC-MyAccount_Order   @KER-4012 @ZYP_MYACCOUNT_K4012-10668 @ZYP_MYACCOUNT_K4012-10669 @ZYP_MYACCOUNT_K4012-11150 @CR-MS
Scenario: Verify that order is gets cancelled if user clicks on Yes, Cancel my Order CTA on confirmation modal
     Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu  
	When user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password"
	And user click on signin button 
	And User searches a product "SKUForBuyNow" and navigates to PDP
	Then user clicks on By Now button	
	And user is navigated to order confirmation page and captures order number
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on Orders link
	And user click on view Details with the GeneratedOrdernumber by yes
	Then verify the cancellation Order message
	
@R2_Mobile  @R2_All @P-High  @C-Order @CC-MyAccount_Order   @KER-4012 @ZYP_MYACCOUNT_K4012-10668 @ZYP_MYACCOUNT_K4012-10669 @CR-MS
Scenario: Verify Cancel Order link is not displayed after order is cancelled
   Given user launches the browser and navigates to "ASO_HOME" page
   Then User clicks on the burger menu  
	When user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on Orders link
	And user click on view Details	
   Then verify the cancel order link is not displayed