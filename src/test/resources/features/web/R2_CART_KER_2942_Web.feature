Feature: Verify Quantity Adjustment in Cart
		
	@R2_Web @R2_Regression @R2_All @P-Highest  @C-Cart @KER-2942 @ZYP_CART_K2942-8044 @CR-DPK
	Scenario Outline: TC_5-Verify add quantity adjustment in the Cart Page 
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
	Then user view the items in order summary details (Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes)
	When incrases the "<Quantity>" to X 
	And modified quantity should get updated 
	Then Order Summary should get recalculated 
	And user should be able to see the increased quantity and Price in Cart Order summary 
	
	Examples:
    | Quantity |
    | 5		   |
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2942 @ZYP_CART_K2942-8045 @CR-DPK
	Scenario Outline: Verify cart gets recalculated on applying promotions and updated discounts displayed on Cart Order summary
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
	And verify Order Summary in Cart 
	Then user verifiy Order Total
	And user view and Applied Promotions/Discounts"<PromoCode>" (promo code, Military ID, Promotions) 
	And User should be able to see the updated Order Summary
	And updated promotions/discount as per the updated cart should be displayed
	Examples:
     | PromoCode  |
     | CPO015CVLP |
	
		
	@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-2942 @ZYP_CART_K2942-8047 @CR-DPK
	Scenario: Verify Remove link in the Cart Page
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
	Then click the Remove Quantity link 
	
	

	@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2942 @ZYP_CART_K2942-8049 @CR-DPK
	Scenario Outline: Verify Quantity Zero in the Cart Page 
	Given user launches the browser and navigates to "ASO_HOME" page  
	Then user should able to click on Signin button
    And user should be able to enter the signin detail
    Then User clicks on ASO Logo and should be navigated to Home Page
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup  
	And user will click on View Cart button 
	And user navigate to Cart page 
	When incrases the "<Quantity>" to X 
	And modified quantity should get updated  
	And  Item is removed from the cart 
	Then  Verify cart is empty 
	
	
	Examples:
    | Quantity |
    | 0		   |
	 
	
	

	
	
	
		
	
	
	 