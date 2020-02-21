Feature: To verify Remove Promo code in Order Summary 

@R2_Web   @R2_All @P-Low @C-Order @CC-Cart_Order @KER-3167 @ZYP_CHECKOUT_K3167-8094 @CR-AKK @P1 @P1Temp 
@Promocode
Scenario: To verify Remove Promo code in Order Summary 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	#And User is navigated to pdp page 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	When user navigate to Cart page and changes the quantity to "OrderLevelQuantity" 
	And user view and Applied Promotions/Discounts "Promocode" 
	Then Verify below Sub/Main Module of Cart Page
	|# Then discount is displayed in Order Summary|
	|RemovePromocode_Btn|
	And User clicks on Remove Promo code link 
	Then Promo code is Removed
	
@R2_Web   @R2_All @P-Low @C-Order @CC-Cart_Order @KER-3167 @ZYP_CHECKOUT_K3167-8093 @CR-AKK 
Scenario: To verify Promo code applied in Order Summary 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	When user navigate to Cart page and changes the quantity to "OrderLevelQuantity" 
	And user view and Applied Promotions/Discounts "Promocode" 
	Then Verify below Sub/Main Module of Cart Page
	|# Then user is displayed Promo code XXXXX applied |
	|Discount_Txt|
	
@R2_Web   @R2_All @P-High_Order @1HR_R2 @C-Order @CC-Cart_Order @KER-3167 @ZYP_CHECKOUT_K3167-8095 @CR-AKK	
Scenario: To verify Promo code Removed in Order Summary
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page and changes the quantity to "OrderLevelQuantity" 
	When user view and Applied Promotions/Discounts "Promocode"
	And User clicks on Remove Promo code link 
	Then Promo code is Removed 
	And associated discount should get remove 
	Then total price must be updated with reflect amount 


	