Feature: Allow promo codes to not be case sensitive

@OMNI-3340 @R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-2731 @ZYP_Checkout_3340 @CR-SK
Scenario: Verify that authenticated user is able to navigate to "Payments" Page.
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productNameSTH" and navigates to PDP
	And User gets a product name for "productNameSTH"
	And user click on ship it button 
	And user will click on View Cart button 
    When user navigate to Cart page 
    #When user clicks on Add Promo code link under Cart Order Summary
    And user view and Applied Promotions/Discounts "Promocode" 
	And verify Promo code discount is applied 
	And User clicks on Remove Promo code link
	And user view and Applied Promotions/Discounts "PromocodeSmallCase" 
	And verify Promo code discount is applied 
	And User clicks on Remove Promo code link
	And user view and Applied Promotions/Discounts "PromocodeMixed" 
	And verify Promo code discount is applied 
	And User clicks on Remove Promo code link
