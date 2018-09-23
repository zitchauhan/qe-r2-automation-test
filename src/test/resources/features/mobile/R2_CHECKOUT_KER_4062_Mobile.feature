Feature: Gift Card application 

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-4062 @ZYP_CART_K4062-8103 @CR-SK 
Scenario: Verify if user gets proper validation message for empty password
	Given user launches the browser and navigates to "ASO_HOME" page
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button
	And user adds shipment address on checkout page
	And user selects shipment method on check out page
	And user add "Gift Card" details in payment method
	And user clicks on place order on checkout page
	And user clicks on create account on order confirmation page
	And user enters "FirstName" in first name field of sign up page
	And user clicks on sign up  button
	Then Verify the message on the page
	    |# Following error Message should show on the page	|
	    |Please enter the Password							|	
	

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-4062 @ZYP_CART_K4062-10300
@CR-SK 
Scenario:
Verify if user gets proper validation message for password less than 8 characters 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	And user adds shipment address on checkout page 
	And user selects shipment method on check out page 
	And user add "Gift Card" details in payment method 
	And user clicks on place order on checkout page 
	And user clicks on create account on order confirmation page 
	And user enters "FirstName" in first name field of sign up page 
	And  user enter "PasswordLessThan8Charactes" in create password field of sign up page 
	And user clicks on sign up  button
	Then Verify the message on the page 
		|# Following error Message should show on the page	|
		|Password must be at least 8 characters long		|