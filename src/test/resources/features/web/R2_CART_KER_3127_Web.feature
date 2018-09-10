Feature: Verify order summary on cart page 

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8169 @CR-AKK 
Scenario: To Verify if user is able to click on the Shipping policy link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When User verifies and click the shipping policy link
	And User is navigated to Shipping Charges page 
	Then Verify below Sub/Main Module of Cart Page  
	|# User is navigated to Shipping Charges page|
	|ShippingCharges_header| 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8170 @CR-AKK 
Scenario: To Verify if user is able to click on the Return policy link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When User verifies and click the Return policy link  
	And User is navigated to Return Policy page
	Then Verify below Sub/Main Module of Cart Page
	|# User is navigated to Return Policy page |
	|ReturnPolicy_txt|
	
	
@R2_Web @R2_Regression @R2_All @P-Lowest @C-Cart @KER-3127 @ZYP_CART_K3127-8171 @CR-AKK 
Scenario: verify if user is able to view the accepted Payments Icons 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	When user navigate to Cart page 
	And User verifies the accepted payment icons( paypal/VISA/Mastercard/America express/Discover) 
	Then Verify below Sub/Main Module of Cart Page
	|#User verifies the accepted payment icons|
		|Visa_img|
		|MasterCard_img|
		|Paypal_img|
		|ApplePay_img|
		|AmericanExpress_img|
		|Discover_img|
		
@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-3127 @ZYP_CART_K3127-8166 @CR-AKK 
Scenario: Verify if user should be able to apply or remove a promotion code 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	Then user clicks on one of the product category and navigates to LThree 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And user view and Applied Promotions/Discounts "ItemLevelPromoCodeDiscount"  
	Then Verify below Sub/Main Module of Cart Page
	|# verify the following element in checkout order summary page|
	|RemoveFromCart_Btn|
	And User clicks on Remove Promo code link
	Then Promo code is Removed 
	
@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-3127 @ZYP_CART_K3127-8165 @CR-AKK 
Scenario: Verify if user is  able to view following elements in order summary of cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user click on view cart button 
	Then Verify below Sub/Main Module of Cart Page
	    |Total_txt|
		|SubTotal_txt|
		|EstimatedShipping_txt|
		|EstimatedTaxes_txt|
	And user view and Applied Promotions/Discounts "OrderLevelPromocode" 
	Then user verifiy Order Total 
	
@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-3127 @ZYP_CART_K3127-8168 @CR-AKK 
Scenario: Verify if user should be able to checkout if there are no errors 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	Then user clicks on one of the subcategory and navigates to LTwo 
	Then user clicks on one of the product category and navigates to LThree 
	Then user click on Add to Cart Button 
	When user click on view cart button 
	Then Verify below Sub/Main Module of Cart Page
	|# Verify following elements in Cart page "Your Cart item details "| 
	|checkOutYourCart_Btn|
	And user click on checkout button in Cart page  
    
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8167 @CR-AKK 
Scenario: Verify if  user should be able to click on PayPal checkout if applicable 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user click on view cart button 
	And user click on checkout button in Cart page 
	When user enter First name "FirstName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	And user will click on Paypal radio button 
	Then Verify below Sub/Main Module of Checkout Page 
	|# verify PayPal Checkout is dispalyed|
	|PayPalCheckOut_Btn|