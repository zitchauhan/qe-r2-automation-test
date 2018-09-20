Feature: Verify Item/Order Level Promotion Calculation

@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-8086 @CR-DPK
Scenario: To verify Add Promotion Code
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
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-8087 @CR-DPK
Scenario: To verify open field to enter promotion code
Given user launches the browser and navigates to "ASO_HOME" page 
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
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-8088 @CR-DPK
Scenario: To verify open field to enter promotion code
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	And user view and Applied Promotions/Discounts "WrongPromocode"
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Please enter a valid promotion code.|
    
    
    
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3166 @ZYP_CART_K3166-8089 @CR-DPK
Scenario: To verify Submit Promotion code
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	And user view and Applied Promotions/Discounts "SanityOrderLevelQuantity"    
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|	
		|checkOut_OrderSummary_btn|	
		|Total_txt|
		|SubTotal_txt|
		|EstimatedTaxes_txt|
		|Discount_Txt|	    
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3166 @ZYP_CART_K3166-8091 @CR-DPK
Scenario: verify Item/order Promo code applied in Order Summary
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	And user view and Applied Promotions/Discounts "SanityItemLevelPromoCodeDiscount"    
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|	
		|checkOut_OrderSummary_btn|	
		|Total_txt|
		|SubTotal_txt|
		|EstimatedTaxes_txt|
		|Discount_Txt|	
		
	
		
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-9591 @CR-DPK 
Scenario: Verify promotion got applied to the product when user applied %off promotion on product level in cart--with promocode
Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Grills Outdoor cooking
	And user clicks on one of the subcategory of Grills Outdoor
	And user select the product
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user view and Applied Promotions/Discounts "SanityOrderLevelQuantity" 
	Then Verify below Sub/Main Module of Cart Page
	|# Then discount is displayed in Order Summary|
	|Discount_Txt|
	|RemovePromocode_Btn|	
	


 @R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3166 @ZYP_CART_K3166-9593 @CR-DPK 
Scenario: Verify promotion got applied to the Catagory when user applied %off promotion on Category level in cart--with promocode
Given user launches the browser and navigates to "ASO_HOME" page
	Then User navigates to LThree Mens Watches 
	And user click on Add to Cart Button 
	And user will click on View Cart button	
	When enter the "EnterQuantityGreaterThenOne" to X  
	And user view and Applied Promotions/Discounts "SanityOrderLevelQuantity" 
	Then Verify below Sub/Main Module of Cart Page
	|# Then discount is displayed in Order Summary|
	|Discount_Txt|
	|RemovePromocode_Btn|			
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-9595 @CR-DPK 
Scenario: Verify promotion got applied for order level when user applied %off promotion on order -- with promocode
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	When enter the "EnterQuantityGreaterThenOne" to X  
	And user view and Applied Promotions/Discounts "OrderLevelDiscount" 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|	
		|checkOut_OrderSummary_btn|	
		|Total_txt|
		|SubTotal_txt|
		|EstimatedTaxes_txt|	
		|Discount_Txt|	
	
	
		
 @R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-9596 @CR-DPK 
Scenario: Verify promotion got applied to the product when user applied $ Amount off promotion on product level in cart -- with Promocode
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Grills Outdoor cooking
	And user clicks on one of the subcategory of Grills Outdoor
	And user select the product
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When enter the "EnterQuantityGreaterThenOne" to X  
	And user view and Applied Promotions/Discounts "AmountLevelDiscount" 
	Then Verify below Sub/Main Module of Cart Page
	|# Then discount is displayed in Order Summary|
	|checkOut_OrderSummary_btn|	
		|Total_txt|
		|SubTotal_txt|
		|EstimatedTaxes_txt|	
		|Discount_Txt|	
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-9597 @CR-DPK 
Scenario: Verify promotion got applied to the Category when user applied $ amount off promotion on Category level in cart -- with promocode
Given user launches the browser and navigates to "ASO_HOME" page 
Then User navigates to LThree Mens Watches 
	And user click on Add to Cart Button 
	And user will click on View Cart button	
	When enter the "EnterQuantityGreaterThenOne" to X  
	And user view and Applied Promotions/Discounts "AmountLevelDiscount" 
	Then Verify below Sub/Main Module of Cart Page
	|# Then discount is displayed in Order Summary|
	|Discount_Txt|
	|RemovePromocode_Btn|
	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-9598 @CR-DPK 
Scenario: Verify promotion got applied for order level when user applied $ amount off promotion on order -- with promocode
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When enter the "EnterQuantityGreaterThenOne" to X  
	And user view and Applied Promotions/Discounts "AmountLevelDiscount" 
	Then Verify below Sub/Main Module of Cart Page
	|# Then discount is displayed in Order Summary|
	|Discount_Txt|
	|RemovePromocode_Btn|			
		
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-9602 @CR-DPK 
Scenario: Verify implicit %off promotion got applied to the product when user adds eligible product in cart-- Implicit promotion
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Grills Outdoor cooking
	And user clicks on one of the subcategory of Grills Outdoor
	And user select the product
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When enter the "EnterQuantityGreaterThenOne" to X 
	Then Verify below Sub/Main Module of Cart Page
	|# Then discount is displayed in Order Summary|
	|Discount_Txt|

	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3166 @ZYP_CART_K3166-9603 @CR-DPK 
Scenario: Verify promotion got applied to the Category when user applied %off promotion on Category level in cart -- Implicit promotion
Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to LThree Mens Watches 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When enter the "EnterQuantityGreaterThenOne" to X 
	Then Verify below Sub/Main Module of Cart Page
	|# Then discount is displayed in Order Summary|
	|Discount_Txt|
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-9604 @CR-DPK 
Scenario: Verify promotion got applied for order level when user applied %off promotion on order -- Implicit promotion
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	When enter the "OrderLevelQuantity" to X 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|	
		|checkOut_OrderSummary_btn|	
		|Total_txt|
		|SubTotal_txt|
		|EstimatedTaxes_txt|	
		|Discount_Txt|
		
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-9605 @CR-DPK 
Scenario: Verify promotion got applied to the product when user applied $ Amount off promotion on product level in cart -- Implicit promotion
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Grills Outdoor cooking
	And user clicks on one of the subcategory of Grills Outdoor
	And user select the product
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When enter the "OrderLevelQuantity" to X 
	Then Verify below Sub/Main Module of Cart Page
	|# Then discount is displayed in Order Summary|
	|checkOut_OrderSummary_btn|	
		|Total_txt|
		|SubTotal_txt|
		|EstimatedTaxes_txt|	
		|Discount_Txt|
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-9606 @CR-DPK 
Scenario: Verify promotion got applied to the Category when user applied $ amount off promotion on Category level in cart -- Implicit promotion
Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to LThree Mens Watches 
	And user click on Add to Cart Button 
	And user will click on View Cart button
	When enter the "OrderLevelQuantity" to X  
	Then Verify below Sub/Main Module of Cart Page
	|# Then discount is displayed in Order Summary|
	|checkOut_OrderSummary_btn|	
		|Total_txt|
		|SubTotal_txt|
		|EstimatedTaxes_txt|	
		|Discount_Txt|	
	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3166 @ZYP_CART_K3166-9607 @CR-DPK 
Scenario: Verify promotion got applied for order level when user creates $ amount off promo eligible order-- Implicit promotion
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When enter the "EnterQuantityGreaterThenOne" to X  
	Then Verify below Sub/Main Module of Cart Page
	|# Then discount is displayed in Order Summary|
	|Discount_Txt|			
			
	
	