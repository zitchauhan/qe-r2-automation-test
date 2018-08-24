Feature: Verify order summary on cart page 

#@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8169 @CR-AKK 
#Scenario: To Verify if user is able to click on the Shipping policy link 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on one of the category and navigates to LOne 
#	Then user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	Then user clicks on one of the product category and navigates to LThree 
#	Then User is navigated to pdp page 
#	Then user click on Add to Cart Button 
#	Then user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user navigate to Cart page 
#	And User verifies and click the shipping policy link 
#	Then User is navigated to Shipping Charges page 
#
#@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8170 @CR-AKK 	
#Scenario: To Verify if user is able to click on the Return policy link 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on one of the category and navigates to LOne 
#	Then user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	Then user clicks on one of the product category and navigates to LThree 
#	Then User is navigated to pdp page 
#	Then user click on Add to Cart Button 
#	Then user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user navigate to Cart page 
#	And User verifies and click the Return policy link 
#	Then User is navigated to Return Policy page
#	
#	
#@R2_Web @R2_Regression @R2_All @P-Lowest @C-Cart @KER-3127 @ZYP_CART_K3127-8171  @CR-AKK 
#Scenario: verify if user is able to view the accepted Payments Icons 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on one of the category and navigates to LOne 
#	Then user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	Then user clicks on one of the product category and navigates to LThree 
#	Then User is navigated to pdp page 
#	Then user click on Add to Cart Button 
#	Then user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user navigate to Cart page 
#	And User verifies the accepted payment icons( paypal/VISA/Mastercard/America express/Discover) 
#	 
#@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-3127 @ZYP_CART_K3127-8166  @CR-AKK 
#Scenario: Verify if user should be able to apply or remove a promotion code 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on one of the category and navigates to LOne 
#	Then user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	Then user clicks on one of the product category and navigates to LThree 
#	Then User is navigated to pdp page  
#	Then user click on Add to Cart Button 
#	Then user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user navigate to Cart page and changes the quantity to "quantity10" 
#	And user view and Applied Promotions/Discounts "PromtionsORDiscounts"
#	Then discount value applied against the individual line item 
#	And customer must see the following at Order Summary in Cart (Promo Code and associated discount as -$XX.XX (must be total order discount)) 
#	And total price must be updated to reflect discount 
#	And User clicks on Remove Promo code link
#	Then Promo code is Removed
#	And associated discount should get remove 
#	And total price must be updated with reflect amount 
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8165 @CR-RK
Scenario: Verify if user is  able to view following elements in order summary of cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user click on view cart button 
	Then user view the items in order summary details (Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes) 
	And user view and Applied Promotions/Discounts "Promocode1"
	Then user verifiy Order Total 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8168 @CR-RK	
Scenario: TC_1-Verify if user should be able to checkout if there are no errors 
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup
	And user click on view cart button 
	And user click on checkout button in Cart page
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3127 @ZYP_CART_K3127-8167 @CR-RK		
Scenario: Verify if  user should be able to click on PayPal checkout if applicable
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup
	And user click on view cart button 
	And user click on checkout button in Cart page
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user will click on Paypal radio button
	
	
		