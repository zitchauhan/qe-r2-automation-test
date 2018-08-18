Feature: Display Estimated Tax and Total in Cart

@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2927 @ZYP_CART_K2927-8126 @CR-SK 
Scenario Outline: To verify Tax recalculation when items are edited 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user makes a note of tax calculation
	When incrases the "<Quantity>" to X 
	Then cart page displays updated tax 
	When user navigates to checkout page
	Then checkout page displays updated tax  
	
	Examples:
    | Quantity |
    | 5		   |
	
#@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2927 @ZYP_CART_K2927-8129 @CR-SK 
#Scenario: To verify Tax recalculation when switch between Shipping & Store Pick up
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And user clicks on one of the category and navigates to LOne 
#	And user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	And user clicks on one of the product category and navigates to LThree 
#	And User is navigated to pdp page 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user navigate to Cart page
#	And user makes a note of tax calculation
#	When user switches the shipping to Store Pick up
#	Then cart page displays updated tax
#	When user navigates to checkout page
#	Then checkout page displays updated tax
	
	

		