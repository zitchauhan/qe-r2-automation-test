Feature: To verify Remove Promo code in Order Summary 

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3167 
@ZYP_CHECKOUT_K3167-8094 @CR-AKK 
Scenario: To verify Remove Promo code in Order Summary 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page and changes the quantity to "quantity10" 
	And user view and Applied Promotions/Discounts "orderLevelDiscount" 
	And click on mini cart 
	Then discount is displayed in Order Summary 
	And User clicks on Remove Promo code link 
	Then  Promo code is Removed 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3167 
@ZYP_CHECKOUT_K3167-8093 @CR-AKK 
Scenario: To verify Promo code applied in Order Summary 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page and changes the quantity to "quantity10" 
	And user view and Applied Promotions/Discounts "orderLevelDiscount" 
	Then user is displayed Promo code XXXXX applied 
	
	