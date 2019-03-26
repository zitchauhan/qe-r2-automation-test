Feature: B06-200 - Add Item from PLP to Cart 

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4119
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
	Then verify ship it button is displayed 
	#Then Verify that Add to Cart CTA is displayed 
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4119
@ZYP_CHECKOUT_K4119-8643 @CR-AKK 
Scenario:
Verify that User is able to add item to cart after making selections on Diff Modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User Navigates L2 form Homepage Header 
	Then User click on Quick view button 
	#Then verify addcart button is displayed 
	#And Verify that Add to Cart CTA is displayed 
	Then verify ship it button is displayed
	Then user verify item added successfully 
	Then verify that View Cart and Checkout CTA is displayed 
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4119
@ZYP_CHECKOUT_K4119-8645 @CR-AKK  @1HR_R2
Scenario:
Verify that User is able to view the cart after adding item to cart from PLP 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User Navigates L2 form Homepage Header 
	Then User click on Quick view button 
	#Then verify addcart button is displayed 
	#And Verify that Add to Cart CTA is displayed 
	Then verify ship it button is displayed
	And user click on view cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart "|
		|YourCart_Header|	
		
		
		
	