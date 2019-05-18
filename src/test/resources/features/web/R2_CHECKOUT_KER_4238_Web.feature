Feature: Employee Discount 

@R2_Web @R2_Regression @R2_All @P1 @C-Checkout @KER-4238 
@ZYP_CHECKOUT_K4238-10742 @CR-SG 
Scenario: To verify that an existing ASO employee is able to see the employee discount on cart page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	And user enter the valid emailaddress "EmployeeEmailAddress" 
	And user enter the valid password "EmployeePassword" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#Then user click on Add to Cart Button
	And user click on ship it button 
	And user will click on View Cart button 
	#	And user verify the employee discount is visible at item level 
	And user will click on Checkout button 
	Then Verify below Sub/Main Module of Checkout Page 
		|# user verifies item summary of Shipping items|
		|DetailOrderSummary_txt|
		#	And user verify the employee discount in order summery 
		
		
@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-4238 
@ZYP_CHECKOUT_K4238-10743 @CR-SG @1HR_R2 
Scenario: To verify that an existing ASO employee is able to see the employee discount on cart page when only few of the items are applied with employee discount 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	And user enter the valid emailaddress "EmployeeEmailAddress" 
	And user enter the valid password "EmployeePassword" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#Then user click on Add to Cart Button
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And then user close the add to cart popup 
	Then user click on Deals tab 
	And user select a product from deal tab 
	Then User is navigated to pdp page 
	#Then user click on Add to Cart Button
	And user click on ship it button  
	And user will click on View Cart button 
	#	And user verify the employee discount is visible at item level when deal items are there 
	And user will click on Checkout button 
	Then Verify below Sub/Main Module of Checkout Page 
		|# user verifies item summary of Shipping items|
		|DetailOrderSummary_txt|
		#	And user verify the employee discount in order summery 
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4238 
@ZYP_CHECKOUT_K4238-8053 @CR-AKK 
Scenario: To verify that an existing ASO employee is able to see the employee discount on cart page when only few of the items are applied with employee discount 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	And user enter the valid emailaddress "EmployeeEmailAddress" 
	And user enter the valid password "EmployeePassword" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button
	And user click on ship it button 
	And user click on view cart button 
	#	When user clicks on Cart icon 
	#	Then user navigate to Cart page 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart "|
		|SubTotal_txt|
		|EstimatedShipping_txt|
		|EstimatedTaxes_txt|
		|Total_txt|
		
@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-4238 
@ZYP_CHECKOUT_K4238-10747 @CR-AKK 
Scenario: To verify that 'Free Shipping' is not applied through promotion for an ASO employee if received employee discount on cart page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	And user enter the valid emailaddress "EmployeeEmailAddress" 
	And user enter the valid password "EmployeePassword" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button
	And user click on ship it button 
	And user click on view cart button 
	#	When user clicks on Cart icon 
	#	Then user navigate to Cart page 
	#	Then system should not display the estimated shipping discount on cart page 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4238 
@ZYP_CHECKOUT_K4238-10745 @CR-AKK 
Scenario: To verify that an academy user who is not an ASO employee should not see the employee discount on cart page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When user clicks on Cart icon 
	And user navigate to Cart page 
	Then verify employee discount should not display 
	
	