Feature: [Mobile]Verify order summary on cart page 

@R2_Mobile @R2_Regression @R2_All @P-Highest @C-Cart @KER-3127 @ZYP_K3127-8168_M @CR-AKK 
Scenario: Verify if user should be able to checkout if there are no errors 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu
    And User navigates to LThree
   	And user clicks on the product card and navigates to PDP
	When user click on Add to Cart Button  
	Then user is navigated to Add to cart Notification popup 
	When user click on view cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify below Sub/Main Module of Cart Page "|
		|checkOutYourCart_Btn|
	And user click on checkout button in Cart page 
	
@R2_Mobile @R2_Regression @R2_All @P-Highest @C-Cart @KER-3127 @ZYP_K3127-8166_M @CR-AKK 
Scenario:
Verify if user should be able to apply or remove a promotion code 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And user view and Applied Promotions/Discounts "ItemLevelPromoCodeDiscount" 
	And discount value applied against the individual line item 
	And user is displayed Promo code XXXXX applied 
	And customer must see the associated discount as -$XX.XX (total order discount) at Order Summary in Cart 
	And total price must be updated to reflect discount 
	And User clicks on Remove Promo code link 
	And Promo code is Removed 
	And associated discount should get remove 
	Then total price must be updated with reflect amount 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8169_M @CR-AKK 
Scenario: To Verify if user is able to click on the Shipping policy link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When User verifies and click the shipping policy link
	And User is navigated to Shipping Charges page 
	Then Verify below Sub/Main Module of Cart Page  
	|# User is navigated to Shipping Charges page|
	|ShippingCharges_header|
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8170_M @CR-AKK 
Scenario: To Verify if user is able to click on the Return policy link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When User verifies and click the Return policy link  
	And User is navigated to Return Policy page
	Then Verify below Sub/Main Module of Cart Page
	|# User is navigated to Return Policy page |
	|ReturnPolicy_txt|
	
@R2_Mobile @R2_Regression @R2_All @P-Lowest @C-Cart @KER-3127 @ZYP_CART_K3127-8171_M @CR-AKK 
Scenario: verify if user is able to view the accepted Payments Icons 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
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
		
@R2_Mobile @R2_Regression @R2_All @P-Highest @C-Cart @KER-3127 @ZYP_CART_K3127-8165_M @CR-AKK 
Scenario: Verify if user is  able to view following elements in order summary of cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user click on view cart button 
	Then Verify below Sub/Main Module of Cart Page
	    |Total_txt|
		|SubTotal_txt|
		|EstimatedShipping_txt|
		|EstimatedTaxes_txt|
	And user view and Applied Promotions/Discounts "OrderLevelPromocode" 
	Then user verifiy Order Total 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8167_M @CR-AKK 
Scenario: Verify if  user should be able to click on PayPal checkout if applicable 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
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