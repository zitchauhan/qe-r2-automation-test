Feature: B06-250- BOPIS Item Return 

 @R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-3172 @ZYP_CART_K3172-10074 @CR-RK
Scenario: Verify Customer must be able to select "Print Receipt" from Order Details and print a receipt for a BOPIS order
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	Then user should able to click on Signin button
	Then Verify below Sub/Main Module of My Account
	|# Verify following elements in Sign in/login page	|
	|SignInPage_SignUp_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And user click on MyAccount
	And user navigates to orders in my account 
	Then Verify below Sub/Main Module of My Account
	|#Verify following elements in order section|
	|OrderPage_OrdersHeader_label|
	|Order_View_Details_Btn|
	When user click on view Details
	Then Verify below Sub/Main Module of My Account 
	|#Verify following elements in order section|
	|Order_Taxes_Price|
	|Order_OrderTotal|	
	And user click on print receipt link
	
	