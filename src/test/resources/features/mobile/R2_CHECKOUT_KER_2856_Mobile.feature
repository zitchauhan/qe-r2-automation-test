Feature: B06-175- Mixed Cart - Order Confirmation screen

@R2_Mobile @R2_Regression @R2_All @P-Highest  @C-Checkout @KER-2856 @ZYP_CHECKOUT_K2856-10865 @CR-RK
Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods Ship to Home and BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SOFSKUNumber" and navigates to PDP
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user click on continue shopping
	And User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button
	And user click on checkout button
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user click on edit button in ship to store
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	And user click on go to payment section 
	#And user fill the payment details 
	#And user clicks on place order on checkout page
	
	
	@R2_Mobile @R2_Regression @R2_All @P-Highest  @C-Checkout @KER-2856 @ZYP_CHECKOUT_K2856-10866 @CR-RK
Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods BOPIS and SOF
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SOFSKUNumber" and navigates to PDP
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user click on continue shopping
	And User searches a product "SKUForBopisProduct" and navigates to PDP
	And user click on Add to Cart Button
	And user click on checkout button
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user click on edit button in ship to store
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	And user click on go to payment section 
	#And user fill the payment details 
	#And user clicks on place order on checkout page
	
	
	@R2_Mobile @R2_Regression @R2_All @P-Highest  @C-Checkout @KER-2856 @ZYP_CHECKOUT_K2856-10867 @CR-RK
Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods SOF and Ship to Home
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SOFSKUNumber" and navigates to PDP
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user click on continue shopping
	And User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button
	And user click on checkout button
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user click on edit button in ship to store
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	And user click on go to payment section 
	#And user fill the payment details 
	#And user clicks on place order on checkout page