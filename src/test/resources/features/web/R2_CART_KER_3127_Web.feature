Feature: Verify order summary on cart page 

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8169 @CR-AKK 
Scenario: To Verify if user is able to click on the Shipping policy link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And User verifies and click the shipping policy link 
	Then User is navigated to Shipping Charges page 

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8170 @CR-AKK 	
Scenario: To Verify if user is able to click on the Return policy link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And User verifies and click the Return policy link 
	Then User is navigated to Return Policy page