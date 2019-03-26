Feature: Verify Itemized Subtotal in Cart 

	@R2_Mobile @R2_Regression @R2_All @P-High @1HR_R2 @R2 @C-Cart @KER-2940 @ZYP_CART_K2940-8052 @CR-AKK
	Scenario: To view price of each item in cart
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	And User navigates to L3 
    Then user clicks on the product card and navigates to PDP
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then User clicks on ASO Logo and should be navigated to Home Page
    And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	And user navigate to Cart page      
	Then verify price of each item in the cart
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|
	|FirstQuantityPrice_Txt|
	|SecondQuantityPrice_Txt|  
	And verify the price format each item is $XX.XX  
	
		
	@R2_Mobile @R2_Regression @R2_All @P-High @R2 @C-Cart @KER-2940 @ZYP_CART_K2940-8054 @CR-AKK
	Scenario: To verify the Sub-total for all items in cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddres" 
	And user enter the valid password "Password" 
	And user click on signin button 
    Then User clicks on ASO Logo and should be navigated to Home Page
    And User clicks on the burger menu
	And User navigates to L3 
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page     
	Then User clicks on ASO Logo and should be navigated to Home Page
	And User clicks on the burger menu
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|
	|FirstQuantityPrice_Txt|
	|SecondQuantityPrice_Txt|  
	Then verify that itemized subtotal for each item in cart is displayed  

	@R2_Mobile  @C-Order @CC-Cart_Order @R2_All @P-High @R2   @KER-2940 @ZYP_CART_K2940-8055 @CR-AKK
	Scenario: To verify if the Promo Code Discount is applied
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page  
	And verify Order Summary in Cart 
	Then user verifiy Order Total
	When enter the "EnterQuantityGreaterThenOne" to X
	And user view and Applied Promotions/Discounts "SanityItemLevelPromoCodeDiscount"
	And verify Promo code discount is applied 
	And verify that consolidated amount for all promotions (except shipping) is applied
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|
	|Total_txt|

	
	@R2_Mobile @C-Order @CC-Cart_Order @R2_All @P-High @R2  @KER-2940 @ZYP_CART_K2940-8056 @CR-AKK
	Scenario: To verify if the Military Discount is applied
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	And user navigate to Cart page
	When enter the "EnterQuantityGreaterThenOne" to X  
	And user view and Applied Promotions/Discounts "PromoCode"
	And verify Military code discount is applied correctly 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|
	|Total_txt|
	
	
	

	@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2940 @ZYP_CART_K2940-8061 @CR-AKK
	Scenario: To verify Shipping charges for in-Store Pickup
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmployeeEmailAddress" 
	And user enter the valid password "EmployeePassword" 
	And user click on signin button 
    Then User clicks on ASO Logo and should be navigated to Home Page
    And User clicks on the burger menu
	And User navigates to L3
    And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	And user will click on View Cart button 
	And user navigate to Cart page 
	And verify Shipping charges as FREE in cart page
	
	
	@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2940 @ZYP_CART_K2940-8062 @CR-AKK
	Scenario: To verify Estimated Taxes for all the items in the Order summary
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
     Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	#And user click on Add to Cart Button 
	And user click on ship it button  
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then User clicks on ASO Logo and should be navigated to Home Page
	And User clicks on the burger menu
	And User navigates to L3 
	 And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	And user will click on View Cart button 
	And user navigate to Cart page 
	And Verify estimated taxes on the cart page 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|
	|EstimatedTaxes_txt|
	And the Estimated Taxes are in $XX.XX format
	
	@R2_Mobile @R2_Regression @R2_All @1HR_R2 @P-High @C-Cart @KER-2940 @ZYP_CART_K2940-8063 @CR-AKK
	Scenario: To verify Total for all the items in the Order summary
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to L3 
     Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then User clicks on ASO Logo and should be navigated to Home Page
	And User clicks on the burger menu
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	And user will click on View Cart button 
	And user navigate to Cart page
	And Verify Total for all items on the cart page 
Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page"Order Summary"|
	|Total_txt|  
	And the Total is in $XX.XX format 

	@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2940 @ZYP_CART_K2940-8064 @CR-AKK
	Scenario: To verify updated estimated Tax when cart is edited
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	And User navigates to L3 
    And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page       
#	And user click on Checkout button
    And user click on checkout button in Cart page 
	And user cilck on expand icon in order summary checkout page 
	And user click on edit cart CTA to navigate to Cart page
	And the Estimated Taxes are in $XX.XX format   
	When enter the "Quantity" to X 
	Then verify that the updated estimated Tax is displayed 

	@R2_Mobile @C-Order @CC-Cart_Order @R2_All @P-High_Order  @KER-2940 @ZYP_CART_K2940-8065 @CR-AKK
	Scenario: To verify Mixed Promo's discounts applied
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
    And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	And user will click on View Cart button 
	And user navigate to Cart page
	When enter the "EnterQuantityGreaterThenOne" to X
	And user view and Applied Promotions/Discounts "PromoCode"
	And verify that Mixed promo discounts are applied for respective items


@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2940 @ZYP_CART_K2940-8054 @CR-AKK 
Scenario: To verify the Sub-total for all items in cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When user clicks on Cart icon 
	Then user navigate to Cart page 
	And verify the the Sub Total in Order Summary in Cart page 
	Then verify that itemized subtotal for each item in cart is displayed 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2940 @ZYP_CART_K2940-8058 @CR-AKK 
Scenario: To verify Estimated Shipping greater than zero 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When user clicks on Cart icon 
	Then user navigate to Cart page 
	And Verify estimated taxes on the cart page 
	And verify Shipping charges for the items in the cart page is greater than Zero 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2940 @ZYP_CART_K2940-8053 @CR-AKK 	
Scenario: To view the hierarchy of itemizations in Order Summary in Cart
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to L3 
    And user clicks on the product card and navigates to PDP 
#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	And user navigate to Cart page
	Then verify that the hierarchy of itemizations in Order Summary in Cart Page

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2940 @ZYP_CART_K2940-8059 @CR-AKK 
Scenario: To verify Estimated Shipping equal to zero
Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu
	And User navigates to L3 
    And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page
	When enter the "EnterQuantityGreaterThenOne" to X 
	When user views Estimated Shipping in the Item Subtotal
	Then verify Shipping charges for the items in the cart page is Zero and FREE is displayed
	
	
@R2_Mobile @R2_Regression @R2_All @1HR_R2 @P-High @C-Cart @KER-2940 @ZYP_CART_K2940-8057 @CR-AKK
	Scenario: To verify Shipping charges for in-Store Pickup
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmployeeEmailAddress" 
	And user enter the valid password "EmployeePassword" 
	And user click on signin button 
    Then User clicks on ASO Logo and should be navigated to Home Page
    And User clicks on the burger menu
	And User navigates to L3
    And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	And user navigate to Cart page 
	And verify Employee discount is appiled 	
	