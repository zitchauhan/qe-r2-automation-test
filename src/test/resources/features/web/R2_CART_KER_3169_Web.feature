Feature: Verify Item/Order Level Promotion Calculation

@R2_Web   @R2_All @P-Low @C-Order @CC-Cart_Order @KER-3169 @ZYP_CHECKOUT_K3166-8096 @CR-DPK @1HR_R2
Scenario: To verify open field to enter promotion code
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then User clicks on ASO Logo and should be navigated to Home Page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|	
		|OrderSummary_Header|
		|Plus_AddPromoCode_btn|
	And user view and Applied Promotions/Discounts "SanityOrderLevelQuantity"
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3169 @ZYP_CHECKOUT_K3166-8097 @CR-DPK
Scenario: To verify open field to enter promotion code
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then User clicks on ASO Logo and should be navigated to Home Page
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then user click on Add to Cart Button
	And user will click on View Cart button
	When user clicks on Add Promo code link under Cart Order Summary
	Then Verify below Sub/Main Module of Cart Page
	|# Verify following elements in Cart page"Order Summary"|
		|OrderSummary_Header|
		|Minus_HidePromo_btn|
		|EnterPromoCode_input|
		|Submit_PromoCode_btn|
	And user click on Hide promo code field
	
	
	
	
	
	
