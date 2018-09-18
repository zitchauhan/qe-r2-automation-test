Feature: B06-280 - BOPIS Authenticated Order Cancellation

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4327 @ZYP_MYACCOUNT_K4327-10912 @CR-MS
Scenario: Verify that for Authenticated user Cancel Order CTA is displayed for orders having BOPIS items
   Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on MyAccount
	And user click on Orders link
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
	When user click on view Details
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Cancel_lnk|
    
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4327 @ZYP_MYACCOUNT_K4327-10917 @CR-MS
Scenario: BOPIS-Verify that Authenticated User is able to navigate back to order details page from cancellation confirmation page
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on MyAccount
	And user click on Orders link
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
	And user click on view Details
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Back_To_Order_Lnk|
	When User clicks on Back to Order details Link on cancellation confirmation page
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
    
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4327 @ZYP_MYACCOUNT_K4327-10915 @CR-MS
Scenario: BOPIS-Verify that order is not cancelled if user clicks on No CTA on confirmation modal
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on MyAccount
	And user click on Orders link
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
	And user click on view Details
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Back_To_Order_Lnk|
    |Order_Cancel_lnk|
    When User Clicks on Cancel Order link
    And User clicks on No Button on confirmation modal
    Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Back_To_Order_Lnk|
    |Order_Cancel_lnk|
    
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4327 @ZYP_MYACCOUNT_K4327-10914 @CR-MS
Scenario: BOPIS-Verify the elements of order cancel confirmation modal
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on MyAccount
	And user click on Orders link
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
	And user click on view Details
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Back_To_Order_Lnk|
    |Order_Cancel_lnk|
    When User Clicks on Cancel Order link
    Then Verify the message on the page
	|#verify the message|
	| ARE YOU SURE YOU WANT TO CANCEL THIS ORDER?| 
	
	#Defect-KER-13721
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4327 @ZYP_MYACCOUNT_K4327-10916 @CR-MS
Scenario: BOPIS-Verify that order is gets cancelled if user clicks on Yes, Cancel my Order CTA on confirmation modal
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on MyAccount
	And user click on Orders link
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
	And user click on view Details
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Back_To_Order_Lnk|
    |Order_Cancel_lnk|
    When User Clicks on Cancel Order link
    Then Verify the message on the page
	|#verify the message|
	| ARE YOU SURE YOU WANT TO CANCEL THIS ORDER?|
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_Back_To_Order_Lnk|
		   
    
    
    
    
    
    
    
    
    
    
        	
    
	    