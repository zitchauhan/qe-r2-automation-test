Feature: Verify Promotional Messaging in Cart 

    @R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2941 @ZYP_CART_K2941-8066 @CR-DPK
    Scenario: To verify Add Promo code in Cart Page         
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When user clicks on Add Promo code link under Cart Order Summary
	Then Verify below Sub/Main Module of Cart Page
	|# Verify following elements in Cart page"Order Summary"|
		|OrderSummary_Header|
		|Minus_HidePromo_btn|
		|EnterPromoCode_input|
		|Submit_PromoCode_btn|
	
	
	
    @R2_Web @R2_Regression @R2_All @P-Lowest @C-Cart @KER-2941 @ZYP_CART_K2941-8067 @CR-DPK
    Scenario: To verify Hide Promo code in Cart Page         
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When user clicks on Add Promo code link under Cart Order Summary
	Then Verify below Sub/Main Module of Cart Page
	|# Verify following elements in Cart page"Order Summary"|
		|OrderSummary_Header|
		|Minus_HidePromo_btn|
		|EnterPromoCode_input|
		|Submit_PromoCode_btn|
	And user click on Hide promo code field
	
	
	@R2_Web @C-Order @CC-Cart_Order @R2_All @P-Low  @KER-2941 @ZYP_CART_K2941-8068 @CR-DPK
    Scenario: To verify the limit of the Promo codes in cart Page         
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	When enter the "EnterQuantityGreaterThenOne" to X 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|	
		|OrderSummary_Header|
		|Plus_AddPromoCode_btn|
	And user view and Applied Promotions/Discounts "SanityOrderLevelQuantity"
	And again try to apply Promocode "SanityOrderLevelQuantity"
	
	
	@R2_Web @C-Order @CC-Cart_Order @R2_All @P-Low   @KER-2941 @ZYP_CART_K2941-8069 @CR-DPK
	Scenario: To verify the Promo codes discounts in order summary
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And user view and Applied Promotions/Discounts "SanityOrderLevelQuantity"    
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|	
		|Total_txt|
		|SubTotal_txt|
		|EstimatedTaxes_txt|
		|Discount_Txt|	    
	
	
	
	@R2_Web  @R2_All @P-High @C-Order @CC-Cart_Order @KER-2941 @ZYP_CART_K2941-8070 @CR-DPK @1HR_R2
    Scenario: To verify discounts to specific items displayed at the item level (Free Shipping, BOGO, Gift With Purchase)          
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then user click on Add to Cart Button
	And user will click on View Cart button
	When enter the "EnterQuantityGreaterThenOne" to X  
	And user view and Applied Promotions/Discounts "SanityItemLevelPromoCodeDiscount"    
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|	
		|Total_txt|
		|SubTotal_txt|
		|EstimatedTaxes_txt|
		|Discount_Txt|
	
	
	

	
	
	  
	
	
	
	
	
	
	
	 