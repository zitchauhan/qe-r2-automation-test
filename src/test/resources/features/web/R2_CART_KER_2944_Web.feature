Feature: B03-300- Out of Stock

@R2_Web @R2_All @P1 @1HR_R2 @CB-Cart @KER-2944 @ZYP_CART_K2944-9813 @C-BOPIS 
Scenario: verify if User is prompted to remove the OOS item from cart to proceed to checkout (BOPIS)
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header
	And user logs in as "OutOfStockItemMail"
	And user clicks on mini cart Icon
	Then user verify the outofstock modal should appear
	#BOPIS_Out_Of_Stock item should already be in the cart for this scenario to work
	And user should be able to see out of stock error message "BOPIS_Out_Of_Stock"	  
	And user click on close button in outofstock modal
	And user click on checkout button
#	And user should be able to see out of stock error message on cart page "BOPIS_Out_Of_Stock" with add to wishlist and remove cart option	
	
