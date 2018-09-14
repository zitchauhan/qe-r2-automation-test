Feature: B07-525- Display Final Tax and Total on Checkout 

@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3129 @ZYP_CHECKOUT_K3129-8011 @CR-RK
Scenario: Verify if  for authenticated User tax line item on checkout page is same as that in cart page
	    Given user launches the browser and navigates to "ASO_HOME" page 
	    And User clicks on the burger menu  
	    And user clicks on SignIn link from global header
		Then Verify below Sub/Main Module of My Account
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
		And user click on signin button
		And User clicks on the burger menu 
		And User navigates to LThree 
		And user clicks on the product card and navigates to PDP 
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		Then User should verify the tax on cart order Summary page
		And user will click on Checkout button and navigates to Checkout page
		And User should have same tax on Checkout Page Order Summary
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3129 @ZYP_CHECKOUT_K3129-9551 @CR-RK
Scenario: Verify if  User can  view tax line item in order summary section on checkout (Mixed Cart).
	    Given user launches the browser and navigates to "ASO_HOME" page  
	    And User clicks on the burger menu  
	    And user clicks on SignIn link from global header
		Then Verify below Sub/Main Module of My Account
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
		And user click on signin button
		And User clicks on the burger menu 
		And User navigates to LThree 
		And user clicks on the product card and navigates to PDP
		And user click on Add to Cart Button
		And user click on continue shopping
		And User clicks on the burger menu
		When user clicks on one of the category and navigates to LOne SOF
    	Then user clicks on one of the subcategory and navigates to LTwo SOF
    	Then user clicks on one of the product category and navigates to LThree SOF
		Then User is navigated to pdp page
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		Then User should verify the tax on cart order Summary page
		And user will click on Checkout button and navigates to Checkout page
		And User should have same tax on Checkout Page Order Summary		
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3129 @ZYP_CHECKOUT_K3129-9550 @CR-RK
Scenario: Verify if  User can  view tax line item in order summary section on checkout (BOPIS Cart).
	    Given user launches the browser and navigates to "ASO_HOME" page  
	    And User clicks on the burger menu  
	    And user clicks on SignIn link from global header
		Then Verify below Sub/Main Module of My Account
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
		And user click on signin button
		 And User clicks on the burger menu
		When user clicks on one of the category and navigates to LOne SOF
    	Then user clicks on one of the subcategory and navigates to LTwo SOF
    	Then user clicks on one of the product category and navigates to LThree SOF
		Then User is navigated to pdp page
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		Then User should verify the tax on cart order Summary page
		And user will click on Checkout button and navigates to Checkout page
		And User should have same tax on Checkout Page Order Summary			
        

		