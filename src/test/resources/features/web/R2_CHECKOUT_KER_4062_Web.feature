Feature: Guest registration Post Checkout from Order Confirmation Page

@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4062 @ZYP_CART_K4062-8103 @CR-SK 
Scenario: Verify if user gets proper validation message for empty password
	Given user launches the browser and navigates to "ASO_HOME" page
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "PayPal" details in payment method for "guest" user
	And user clicks on place order on checkout page
	And user clicks on create account on order confirmation page
	And user enters "FirstName" in first name field of sign up page
	And user clicks on sign up button of sign up page
	Then Verify the message on the page
	    |# Following error Message should show on the page	|
	    |Please enter the Password							|	
	

@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4062 @ZYP_CART_K4062-10300
@CR-SK 
Scenario:
Verify if user gets proper validation message for password less than 8 characters 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "PayPal" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	And user clicks on create account on order confirmation page 
	And user enters "FirstName" in first name field of sign up page 
	And  user enter "PasswordLessThan8Charactes" in create password field of sign up page
	And user clicks on sign up button of sign up page
	Then Verify the message on the page 
		|# Following error Message should show on the page	|
		|Password must be at least 8 characters long		|
		
			    
@R2_Web @R2_Regression @R2_All @P-High @1HR_R2 @C-Checkout @KER-4062 @ZYP_CART_K4062-8102 @CR-SK 
Scenario: Verify if user can create account from Order Confirmation Page
	Given user launches the browser and navigates to "ASO_HOME" page
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "PayPal" details in payment method for "guest" user
	And user clicks on place order on checkout page
	And user clicks on create account on order confirmation page
	And user enters "FirstName" in first name field of sign up page
	And user enter "LastName" in last name field of sign up page
	And user enters "random email" in email field of sign up page
	And user enter "Password" in create password field of sign up page
	And user clicks on sign up button of sign up page
	Then user should be able to sign up successfully
	And Verify the message on the page
	    |# Following Message should show on the page		|
	    |CONGRATULATIONS									|
	    |You have successfully registered with Academy.com	|
	    |LET'S SHOP											|
	    
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4062 @ZYP_CART_K4062-8105 @CR-SK 
Scenario: Verify the available customer details
	Given user launches the browser and navigates to "ASO_HOME" page
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "PayPal" details in payment method for "guest" user
	And user clicks on place order on checkout page
	Then user verifies the fields loaded Full name, email address, choose password, submit button and check box for email News letters	    


@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4062
@ZYP_CART_K4062-8107 @CR-SK 
Scenario: verify the account register with out Email News letter 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	And user add "PayPal" details in payment method for "guest" user 
	And user clicks on place order on checkout page 
	And user verifies the fields loaded Full name, email address, choose password, submit button and check box for email News letters 
	When user enter "Password" in password field of order confirmation page 
	And user unchecks email news letter checkbox on order confirmation page 
	And user clicks on submit button on order confirmation page 
	Then verify user is able to sign up successfully on order confirmation page 
	And Verify the message on the page 
		|# Following Error Message should show on the page|
		|account has been created|
		
		
