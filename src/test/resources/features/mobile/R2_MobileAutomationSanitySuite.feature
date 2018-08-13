Feature: Mobile Automation Sanity Test Cases Mimicing manual Scenarios 

@R2_AutomationSanity @R2_AS1 @R2_MAST-01 @KER-3127 @ZYP_K3127-8168 @CR-AKK
Scenario: TC_1-Verify if user should be able to checkout if there are no errors 
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
    And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button  
	Then user is navigated to Add to cart Notification popup 
    
@R2_AutomationSanity @R2_AS1 @R2_MAST-02 @KER-3166 @ZYP_K3166-9604 @CR-DP
Scenario Outline: TC_2-Verify promotion got applied for order level when user applied %off promotion on order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
    And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And verify Order Summary in Cart 
	Then user verifiy Order Total
	And user view and Applied Promotions/Discounts"<PromoCode>" (promo code, Military ID, Promotions) 
	#Then apply /fire condition based promotions once the cart has verified that correct conditions have been met 
	#And customer must see the following at Order Summary in Cart(Promo Code and associated discount as -$XX.XX (must be total order discount) And Total price must be updated to reflect discount) 
	Examples:
     | PromoCode  |
     | CPO015CVLP |
	    
@R2_AutomationSanity @R2_AS1 @R2_MAST-03 @KER-3127 @ZYP_K3127-8166 @CR-RK
Scenario Outline: TC_3-Verify if user should be able to apply or remove a promotion code 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
    And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user view and Applied Promotions/Discounts"<PromoCode>" (promo code, Military ID, Promotions) 
	#And user must see the following details Promo Code and associated discount And Total price 
	#When user clicks on Remove promocode 
	#Then promocode should get removed and associated discount should get remove And Total price must be updated with reflect amount
    
    Examples:
     | PromoCode  |
     | CPO015CVLP |
    
@R2_AutomationSanity @R2_AS1 @R2_MAST-04 @KER-3127 @ZYP_K3127-8165 @CR-AKK
Scenario Outline: TC_4-Verify if user is able to view following elements in order summary of cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
    And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button  
	Then user is navigated to Add to cart Notification popup 
	And user click on view cart button 
	Then user view the items in order summary details (Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes) 
	And user view and Applied Promotions/Discounts"<PromoCode>" (promo code, Military ID, Promotions) 
	Then user verifiy Order Total 
	
	Examples:
     | PromoCode  |
     | CPO015CVLP |
	 
	
	
@R2_AutomationSanity @R2_AS1 @R2_MAST-05 @KER-2942 @ZYP_K2942-8044 @CR-DP
Scenario Outline: TC_5-Verify add quantity adjustment in the Cart Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
    And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup  
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user view the items in order summary details (Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes)
	When incrases the "<Quantity>" to X 
	And modified quantity should get updated 
	Then Order Summary should get recalculated 
	And user should be able to see the increased quantity and Price in Cart Order summary 
	
	Examples:
    | Quantity |
    | 5		   |
	
@R2_AutomationSanity @R2_AS1 @R2_MAST-06 @KER-2942 @ZYP_K2942-8047 @CR-DP
Scenario: TC_6-Verify Remove link in the Cart Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
    And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then click the Remove Quantity link 
	And verify item is removed from the cart 
	
	
	
@R2_AutomationSanity @R2_AS1 @R2_MAST-07 @KER-2939 @ZYP-K2939_9615 @CR-RK
Scenario: TC_7-To Verify Image for selected SKU is be displayed on product blade for  multi-variant product. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
    And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user click on the product image in cart page
	And User is navigated to pdp page
	
