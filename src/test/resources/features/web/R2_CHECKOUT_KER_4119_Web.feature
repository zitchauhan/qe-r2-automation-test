Feature: B06-200 - Add Item from PLP to Cart 

@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-4119
@ZYP_CHECKOUT_K4119-8642 @CR-AKK 
Scenario: Verify that User is able to open the Diff Selection modal from PLP 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User Navigates L2 form Homepage Header 
	Then User click on Quick view button 
	#Then verify addcart button is displayed
	#updated by MJR -16/7/19
	#Then verify ship it button is displayed 
	Then Verify that Add to Cart CTA is displayed 
		
@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-4119
@ZYP_CHECKOUT_K4119-8643 @CR-AKK 
Scenario: Verify that User is able to add item to cart after making selections on Diff Modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User Navigates L2 form Homepage Header 
	Then User click on Quick view button 
	#Then verify addcart button is displayed 
	#And Verify that Add to Cart CTA is displayed 
	#Then verify ship it button is displayed
	#updated by MJR on 16/7/19
	And user click on Add to Cart Button
	Then user verify item added successfully 
	Then verify that View Cart and Checkout CTA is displayed 
	
	
@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-4119
@ZYP_CHECKOUT_K4119-8645 @CR-AKK  @1HR_R2
Scenario: Verify that User is able to view the cart after adding item to cart from PLP 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User Navigates L2 form Homepage Header 
	Then User click on Quick view button 
	#Then verify addcart button is displayed 
	#And Verify that Add to Cart CTA is displayed 
	#Then verify ship it button is displayed
	#updated by MJR on 16/7/19
	And user click on Add to Cart Button
	And user click on view cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart "|
		|YourCart_Header|	
		
		
@RegressionP3 @TC-OMNI-13448
Scenario: Verify on click of Add to cart CTA in quick view, item should be added to cart and Add to cart modal should popup and user should be able to place order with Standard Delivery
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User Navigates L2 form Homepage Header 
	Then User click on Quick view button 
	Then Verify that Add to Cart CTA is displayed
	And User click on Add to Cart Button via Quick View modal
	And Click on View Cart Button in Quick View modal
	And user clicks on checkout button on cart page
	And user click on academy creditcard radiobtn 
	And user fills the academy credit card details in payment 
	And user enters a corresponding billing address
	And user click on REVIEW ORDER button
	And user clicks on place order on checkout page
    Then verify user is able to successfully place the order
	
	
	
	