Feature: B06-225- BOPIS Age Restriction Flag in Checkout

	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3174 @ZYP_CART_K3174-KER-10274 @CR-RK	
	Scenario: Verify authenticate user is able to see the See In-Store Pickup Instructions section
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
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page 
	And user click on edit button in ship to store
	#Then user click on Go To Shipping Method button in Checkout page
	Then Verify the message on the page
	|SPECIAL ORDER SHIP TO STORE|
 	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers
	
# 	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3174 @ZYP_CART_K3174-KER-10271 @CR-RK	
#	Scenario: Verify guest user is able to see the See In-Store Pickup Instructions section
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on one of the category and navigates to LOne SOF
#    Then user clicks on one of the subcategory and navigates to LTwo SOF
#    Then user clicks on one of the product category and navigates to LThree SOF
#	Then User is navigated to pdp page
#	Then user click on Add to Cart Button 
#	Then user is navigated to Add to cart Notification popup
#	And user will click on View Cart button 
#	And user navigate to Cart page
#	And user click on checkout button in Cart page 
#	 When user enter First name "FirstName" 
#	And user enter Last name "LastName" 
#	And user enter Phone number "PhoneNumber" 
#	And user enter Address "Address" 
#	And user enter Zipcode "Zipcode" 
#	And user enter Phone number "PhoneNumber" 
#	Then user click on Go To Shipping Method button in Checkout page
#	Then Verify the message on the page
#	|SPECIAL ORDER SHIP TO STORE|
# 	|See In-Store Pickup Instructions|
# 	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers
 	
 #	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3174 @ZYP_CART_K3174-KER-10273 @CR-RK	
#	Scenario: Verify guest user is able to place the BOPIS order
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And user clicks on SignIn link from global header
#	Then Verify below Sub/Main Module of My Account
#	|# Verify following elements in Sign in/login page	|
#	|SignInPage_EmailAddress_txt			   			| 
#	|SignInPage_Password_txt				   			|
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	When user clicks on one of the category and navigates to LOne SOF
#    Then user clicks on one of the subcategory and navigates to LTwo SOF
#    Then user clicks on one of the product category and navigates to LThree SOF
#	Then User is navigated to pdp page
#	Then user click on Add to Cart Button 
#	Then user is navigated to Add to cart Notification popup
#	And user will click on View Cart button 
#	And user navigate to Cart page
#	And user click on checkout button in Cart page 
#	 When user enter First name "FirstName" 
#	And user enter Last name "LastName" 
#	And user enter Phone number "PhoneNumber" 
#	And user enter Address "Address" 
#	And user enter Zipcode "Zipcode" 
#	And user enter Phone number "PhoneNumber" 
#	Then user click on Go To Shipping Method button in Checkout page
#	Then Verify the message on the page
#	|SPECIAL ORDER SHIP TO STORE|
# 	|See In-Store Pickup Instructions|
# 	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers
# 	And user click on checkbox in special order ship to store section
#	And user click on go to payment section