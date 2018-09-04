Feature: [Mobile]Verify order summary on cart page 

@R2_Mobile @R2_Regression @R2_All @P-Highest @C-Cart @KER-3127 @ZYP_K3127-8168_M @CR-AKK 
Scenario: Verify if user should be able to checkout if there are no errors 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu
    And User navigates to LThree
   	And user clicks on the product card and navigates to PDP
	When user click on Add to Cart Button  
	Then user is navigated to Add to cart Notification popup 
	
@R2_Mobile @R2_Regression @R2_All @P-Highest @C-Cart @KER-3127 @ZYP_K3127-8166_M @CR-AKK 
Scenario:
Verify if user should be able to apply or remove a promotion code 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And user view and Applied Promotions/Discounts "ItemLevelPromoCodeDiscount" 
	And discount value applied against the individual line item 
	And user is displayed Promo code XXXXX applied 
	And customer must see the associated discount as -$XX.XX (total order discount) at Order Summary in Cart 
	And total price must be updated to reflect discount 
	And User clicks on Remove Promo code link 
	And Promo code is Removed 
	And associated discount should get remove 
	Then total price must be updated with reflect amount 