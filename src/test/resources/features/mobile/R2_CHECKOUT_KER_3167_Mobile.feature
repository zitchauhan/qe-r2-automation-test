Feature: To verify Remove Promo code in Order Summary 

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3167 @ZYP_CHECKOUT_K3167-8094 @CR-AKK 
Scenario: To verify Remove Promo code in Order Summary 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	When user navigate to Cart page and changes the quantity to "OrderLevelQuantity" 
	And user view and Applied Promotions/Discounts "Promocode" 
	Then Verify below Sub/Main Module of Cart Page
	|# Then discount is displayed in Order Summary|
	|Discount_Txt|
	|RemovePromocode_Btn|
	And User clicks on Remove Promo code link 
	Then Promo code is Removed
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3167 @ZYP_CHECKOUT_K3167-8093 @CR-AKK 
Scenario: To verify Promo code applied in Order Summary 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	When user navigate to Cart page and changes the quantity to "OrderLevelQuantity" 
	And user view and Applied Promotions/Discounts "Promocode" 
	Then Verify below Sub/Main Module of Cart Page
	|# Then user is displayed Promo code XXXXX applied |
	|Discount_Txt|
	
@R2_Mobile @R2_Regression @R2_All @P-High @1HR_R2 @C-Checkout @KER-3167 @ZYP_CHECKOUT_K3167-8095 @CR-AKK	
Scenario: To verify Promo code Removed in Order Summary
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page and changes the quantity to "OrderLevelQuantity" 
	When user view and Applied Promotions/Discounts "Promocode"
	And User clicks on Remove Promo code link 
	Then Promo code is Removed 
	And associated discount should get remove 
	Then total price must be updated with reflect amount 


	