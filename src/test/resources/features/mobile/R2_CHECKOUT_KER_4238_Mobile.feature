Feature: Employee Discount

@R2_Mobile @R2_Regression @R2_All @P-Highest @C-Checkout @KER-4238 @ZYP_CHECKOUT_K4238-10742 @CR-SG
Scenario: To verify that an existing ASO employee is able to see the employee discount on cart page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmployeeUserName" 
	And user enter the valid password "EmployeePass" 
	And user click on signin button 
	Then User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user verify the employee discount is visible at item level
	And user will click on Checkout button 
	And user verify the employee discount in order summery
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-4238 @ZYP_CHECKOUT_K4238-10743 @CR-SG
Scenario: To verify that an existing ASO employee is able to see the employee discount on cart page when only few of the items are applied with employee discount
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmployeeUserName" 
	And user enter the valid password "EmployeePass" 
	And user click on signin button 
	Then User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And then user close the add to cart popup
	Then user click on Deals tab
	And user select a product from deal tab
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user verify the employee discount is visible at item level when deal items are there
	And user will click on Checkout button 
	And user verify the employee discount in order summery

	
	
	
	
	

	