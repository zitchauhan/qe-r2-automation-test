Feature: B06-225- BOPIS Age Restriction Flag in Checkout 
	
@R2_Web @R2_Regression @R2_All @P-Low @CB-Cart @KER-3174 @ZYP_CART_K3174-10271 @C-BOPIS
Scenario: Verify guest user is able to see the See In-Store Pickup Instructions section 
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And User searches a product "SOFSKUNumber" and navigates to PDP
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user click on checkout button in Cart page 
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	
@R2_Web @R2_All @P-Low @KER-3174 @ZYP_CART_K3174-10273 @CB-Checkout @C-BOPIS
Scenario: Verify guest user is able to place the BOPIS order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And User searches a product "SOFSKUNumber" and navigates to PDP 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	And user click on go to payment section 
	And user fill the payment details for sof guest user
	And user able to see the button place order
	
@R2_Web @R2_Regression @R2_All @P-Low @CB-Checkout @KER-3174 @ZYP_CART_K3174-10274 @C-BOPIS
Scenario: Verify guest user is able to see the See In-Store Pickup Instructions section 
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	And User searches a product "SOFSKUNumber" and navigates to PDP
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user click on checkout button in Cart page 
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 	
	
@R2_Web @R2_Regression @R2_All @P-Low @CB-Checkout @KER-3174 @ZYP_CART_K3174-10275 @C-BOPIS
Scenario: Verify guest user is able to see the See In-Store Pickup Instructions section 
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	And User searches a product "SOFSKUNumber" and navigates to PDP
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user click on checkout button in Cart page 
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 	
	And user click on checkbox in special order ship to store section 
	And user click on go to payment section 
	And user fill the payment details for sof registered user
	And user able to see the button place order
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3174 @ZYP_CART_K3174-KER-10276 @CR-RK 
Scenario: Verify without checking acknowledgement, user is not able to place the order 
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "SOFemail" 
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
