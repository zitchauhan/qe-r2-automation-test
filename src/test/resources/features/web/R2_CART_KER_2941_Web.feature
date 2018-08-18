Feature: Verify Promotional Messaging in Cart 

    @R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2941 @ZYP_CART_K2941-8070 @CR-DPK
    Scenario Outline: To verify discounts to specific items displayed at the item level (Free Shipping, BOGO, Gift With Purchase)          
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
	And user view and Applied Promotions/Discounts"<PromoCode>" (promo code, Military ID, Promotions)
	Then verify the discounts to specific items are displayed at the item level (Free Shipping, BOGO, Gift With Purchase)
	Examples:
     | PromoCode  |
     | CPO015CVLP |
	
	

	
	
	  
	
	
	
	
	
	
	
	 