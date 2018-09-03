Feature: Verify Promotional Messaging in Cart 

    @R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2941 @ZYP_CART_K2941-8066 @CR-DPK
    Scenario: To verify Add Promo code in Cart Page         
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user verify the promo code field
	
	
	
    @R2_Web @R2_Regression @R2_All @P-Lowest @C-Cart @KER-2941 @ZYP_CART_K2941-8067 @CR-DPK
    Scenario: To verify Hide Promo code in Cart Page         
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user verify the promo code field
	And user click on Hide promo code field
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2941 @ZYP_CART_K2941-8068 @CR-DPK
    Scenario: To verify the limit of the Promo codes in cart Page         
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user view and Applied Promotions/Discounts "Promocode8068"
	And again try to apply Promocode "1Promocode8068"
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2941 @ZYP_CART_K2941-8069 @CR-DPK
	Scenario: To verify the Promo codes discounts in order summary
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And verify Order Summary in Cart 
	Then user verifiy Order Total
	And user view and Applied Promotions/Discounts "Promocode8069"
	And verify Promo code discount is applied 
	
	
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2941 @ZYP_CART_K2941-8070 @CR-DPK
    Scenario: To verify discounts to specific items displayed at the item level (Free Shipping, BOGO, Gift With Purchase)          
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user view and Applied Promotions/Discounts "PromoCode"
	Then verify the discounts to specific items are displayed at the item level (Free Shipping, BOGO, Gift With Purchase)
	
	
	

	
	
	  
	
	
	
	
	
	
	
	 