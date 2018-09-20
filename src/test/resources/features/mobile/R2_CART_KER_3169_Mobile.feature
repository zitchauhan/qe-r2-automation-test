Feature: Verify Item/Order Level Promotion Calculation

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-3169 @ZYP_CHECKOUT_K3169-8096 @CR-DPK
Scenario: To verify open field to enter promotion code
Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	 And User navigates to LThree
    Then user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|	
		|OrderSummary_Header|
		|Plus_AddPromoCode_btn|
	And user view and Applied Promotions/Discounts "SanityOrderLevelQuantity"
	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-3169 @ZYP_CHECKOUT_K3169-8097 @CR-DPK
Scenario: To verify open field to enter promotion code
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	 And User navigates to LThree
    Then user clicks on the product card and navigates to PDP 
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
	
	
	
	
	
	
