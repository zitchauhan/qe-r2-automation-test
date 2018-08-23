Feature: Verify Item/Order Level Promotion Calculation

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3169 @ZYP_CHECKOUT_K3166-8096 @CR-DPK
Scenario: To verify open field to enter promotion code
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user view and Applied Promotions/Discounts "Promocode8096"
	Then user click on checkout button in Cart page
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3169 @ZYP_CHECKOUT_K3166-8097 @CR-DPK
Scenario: To verify open field to enter promotion code
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user view and Applied Promotions/Discounts "WrongPromocode"
	Then verify proper validation message and Promo code discount should not applied	
	
	
	
	
	
	
