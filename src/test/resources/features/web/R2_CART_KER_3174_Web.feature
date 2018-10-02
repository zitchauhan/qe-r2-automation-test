Feature: B06-225- BOPIS Age Restriction Flag in Checkout 

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3174
@ZYP_CART_K3174-KER-10274 @CR-RK 
Scenario:
Verify authenticate user is able to see the See In-Store Pickup Instructions section 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart 
	And User searches a product "SOFSKUNumber" and navigates to PDP 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3174
@ZYP_CART_K3174-KER-10271 @CR-RK 
Scenario:
Verify guest user is able to see the See In-Store Pickup Instructions section 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SOFSKUNumber" and navigates to PDP 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "Zipcode" 
	And user enter Phone number "PhoneNumber" 
	Then user click on Go To Shipping Method button in Checkout page 
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3174
@ZYP_CART_K3174-KER-10273 @CR-RK 
Scenario: Verify guest user is able to place the BOPIS order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SOFSKUNumber" and navigates to PDP 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "Zipcode" 
	And user enter Phone number "PhoneNumber" 
	Then user click on Go To Shipping Method button in Checkout page 
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	And user click on go to payment section 
	And user fill the payment details 
	And user able to see the button place order
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3174
@ZYP_CART_K3174-KER-10275 @CR-RK 
Scenario: Verify authenticate user is able to place the BOPIS order 
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart
	And User searches a product "SOFSKUNumber" and navigates to PDP 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	And user click on go to payment section 
	And user fill the payment details 
	And user able to see the button place order
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3174 @ZYP_CART_K3174-KER-10276 @CR-RK 
Scenario: Verify without checking acknowledgement, user is not able to place the order 
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart
	And User searches a product "SOFSKUNumber" and navigates to PDP 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on go to payment section 