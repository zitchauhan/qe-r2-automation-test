Feature: Verify Promotional Messaging in Cart 

    @R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2941 @ZYP_CART_K2941-8066 @CR-DPK
    Scenario: To verify Add Promo code in Cart Page         
	Given user launches the browser and navigates to "ASO_HOME" page 
	 Then User clicks on the burger menu
    Then User navigates to L3
    Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|
		|OrderSummary_Header|
		|Plus_AddPromoCode_btn|
	And user verify the promo code field
	Then Verify below Sub/Main Module of Cart Page	
		|EnterPromoCode_input|
		|Submit_PromoCode_btn|	
	
	
    @R2_Mobile @R2_Regression @R2_All @P-Lowest @C-Cart @KER-2941 @ZYP_CART_K2941-8067 @CR-DPK
    Scenario: To verify Hide Promo code in Cart Page         
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
    Then User navigates to L3
    Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|
		|OrderSummary_Header|
		|Plus_AddPromoCode_btn|
	And user verify the promo code field
	Then Verify below Sub/Main Module of Cart Page	
		|EnterPromoCode_input|
		|Submit_PromoCode_btn|
		|Minus_HidePromo_btn|
		
	
	
	
	
	

	
	
	  
	
	
	
	
	
	
	
	 