Feature: B07-525- Display Final Tax and Total on Checkout 

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3129 @ZYP_CHECKOUT_K3129-8011 @CR-RK
Scenario: Verify if  for authenticated User tax line item on checkout page is same as that in cart page
	    Given user launches the browser and navigates to "ASO_HOME" page  
	    And user clicks on SignIn link from global header
		Then Verify below Sub/Main Module of My Account
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
		And user click on signin button
		And User navigates to L2 Mens clothing
	    And user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    And user clicks on one of the product category and navigates to LThree
		And User is navigated to pdp page
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		Then User should verify the tax on cart order Summary page
		And user will click on Checkout button and navigates to Checkout page
		And User should have same tax on Checkout Page Order Summary
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3129 @ZYP_CHECKOUT_K3129-9551 @CR-RK
Scenario: Verify if  User can  view tax line item in order summary section on checkout (Mixed Cart).
	    Given user launches the browser and navigates to "ASO_HOME" page  
	    And user clicks on SignIn link from global header
		Then Verify below Sub/Main Module of My Account
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
		And user click on signin button
		And User navigates to L2 Mens clothing
	    And user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    And user clicks on one of the product category and navigates to LThree
		And User is navigated to pdp page
		And user click on Add to Cart Button
		And user click on continue shopping
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


@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3129 @ZYP_CHECKOUT_K3129-9550 @CR-RK
Scenario: Verify if  User can  view tax line item in order summary section on checkout (BOPIS Cart).
	    Given user launches the browser and navigates to "ASO_HOME" page  
	    And user clicks on SignIn link from global header
		Then Verify below Sub/Main Module of My Account
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
		And user click on signin button
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
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3129 @ZYP_CHECKOUT_K3129-9561 @CR-RK	
	Scenario: Verify if  User can  view updated tax and order total in order summary section on checkout if user switches from store pickup to Shipping
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP
	And user click on Add to Cart Button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user navigate to Cart page
	And user selects Ship To Me radio button
	And user makes a note of tax calculation
	When user switches the shipping to Store Pick up
	Then cart page displays updated tax
	When user navigates to checkout page
	Then checkout page displays updated tax	
	
@R2_Web @R2_Regression @R2_All @P-Highest @1HR_R2 @C-Checkout @KER-3129 @ZYP_CHECKOUT_K3129-9562 @CR-RK	        
Scenario: To verify Tax recalculation when user switches from Shipping to store pickup 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user selects Ship To Me radio button
	And user makes a note of tax calculation
	When user switches the shipping to Store Pick up
	Then cart page displays updated tax
	When user navigates to checkout page
	Then checkout page displays updated tax
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3129 @ZYP_CART_K3129-8009 @CR-RK 
Scenario: Verify if authenticated User can  view tax line item in order summary section on checkout.
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
		Then Verify below Sub/Main Module of My Account
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
		And user click on signin button
	And User searches a product "SKUForATaxableProduct" and navigates to PDP
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	When user enters "FindStoreZipcode" in change zipcode field in cart page
	Then cart page displays updated tax
	And tax displayed on cart is greater than zero
	And user makes a note of tax and total amount
	When user navigates to checkout page
	Then tax and total amount displayed in checkout page is same as cart page	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3129 @ZYP_CART_K3129-8010 @CR-RK 	
	Scenario: Verify if  User can  view tax line item in order summary section on checkout.	
	Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Womens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	Then estimated tax Is populated separately under Order Summary
	And Total amount including Tax Is populated separately under Order Summary
	When user navigates to checkout page
	Then user verifies estimated tax and total on checkout page
	
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3129 @ZYP_CART_K3129-8013 @CR-RK 	
	Scenario: Verify if  User can  view updated tax and order total in order summary section on checkout if zip code is updated.
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header	
	    Then Verify below Sub/Main Module of My Account
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
		And user click on signin button
		And User navigates to L2 Womens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user is navigated to order summary page  
#	Then User verifies the default address is selected in dropdown in shipping address section 
#	And User navigates to Shipping Method section 
#	Then User verifies that an Edit CTA is displayed for Shipping Address 
#	And User clicks on edit CTA 
#	And user select the shipping address in the drop down
#	And user click on confirm button in shipping address
	Then user verifies estimated tax and total on checkout page
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3129 @ZYP_CART_K3129-8014 @CR-RK 	
	Scenario: Verify if  User can  view updated tax and order total in order summary section on checkout if items are updated. 	
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user makes a note of tax calculation
	When user increases products quantity 
	Then cart page displays updated tax
	When user navigates to checkout page
	Then checkout page displays updated tax
	
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3129 @ZYP_CART_K3129-8015 @CR-RK 	
	Scenario: Verify if  User can  view updated tax and order total in order summary section on checkout if zip code is updated.
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header	
	    Then user should able to click on Signin button
		Then Verify below Sub/Main Module of My Account
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
		And user click on signin button
		And User navigates to L2 Womens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user is navigated to order summary page  
#	Then User verifies the default address is selected in dropdown in shipping address section 
#	And User navigates to Shipping Method section 
#	Then User verifies that an Edit CTA is displayed for Shipping Address 
#	And User clicks on edit CTA 
#	And user select the shipping address in the drop down
#	And user click on confirm button in shipping address
	Then user verifies estimated tax and total on checkout page
	
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3129 @ZYP_CART_K3129-8016 @CR-RK 	
	Scenario: Verify if  the tax information flows in order details in MY Account
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header	
	    Then user should able to click on Signin button
		Then Verify below Sub/Main Module of My Account
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
		And user click on signin button
		And user navigates to orders in my account 
		Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|Order_View_Details_Btn|
		When user click on view Details
		Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|Order_Taxes_Price|
		|Order_OrderTotal|
	