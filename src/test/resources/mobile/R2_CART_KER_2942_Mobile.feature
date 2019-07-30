Feature: [Mobile] Verify Quantity Adjustment in Cart 

@R2_Mobile @R2_Regression @R2_All @P1 @1HR_R2 @C-Cart @KER-2942 @ZYP_CART_K2942-8044 @CR-AKK
Scenario: Verify add quantity adjustment in the Cart Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user view the items in order summary details (Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes) 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And modified quantity should get updated 
	Then Order Summary should get recalculated 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page"Order Summary"|
		|SubTotal_txt|
	And user should be able to see the increased quantity and Price in Cart Order summary  
	
@R2_Mobile   @R2_All @P-High_Order @C-Order @CC-Cart_Order @KER-2942 @ZYP_CART_K2942-8045 @CR-AKK 
Scenario: Verify cart gets recalculated on applying promotions and updated discounts displayed on Cart Order summary 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
#And user click on Add to Cart Button 
	And user click on ship it button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And verify Order Summary in Cart 
	Then user verifiy Order Total 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And user view and Applied Promotions/Discounts "OrderLevelDiscount" 
	And User should be able to see the updated Order Summary 
	And updated promotions/discount as per the updated cart should be displayed 
	Then Verify below Sub/Main Module of Cart Page
	|# Then user is displayed Promo code XXXXX applied |
	|Promocode_Txt|
	
	@R2_Mobile @R2_Regression @R2_All @P1 @1HR_R2 @C-Cart @KER-2942 @ZYP_CART_K2942-8047 @CR-AKK 
Scenario: Verify Remove link in the Cart Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And verify the Remove Quantity link 
	Then Verify below Sub/Main Module of Cart Page
	|#verify the Remove Quantity link |
	|RemoveFromCart_Btn|
	
	@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2942 @ZYP_CART_K2942-8049 @CR-AKK 
Scenario: Verify Quantity Zero in the Cart Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "ZeroQuantity" to X 
#	Then modified quantity should get updated 
	And  Verify cart is empty 
	Then Verify below Sub/Main Module of Cart Page
	|# Verify cart is empty|
	|YourCartIsEmpty_Txt|
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2942 @ZYP_CART_K2942-9357 @CR-AKK 
Scenario: Verify system does inventory check for product item added more than available 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "MoreThanThresholdQuantity" to X 
	Then user should not be allowed to enter more than available stock "AvliableStockQuantity" 
	#	And User should be notified that Less quantity to be added or stock not enough  
	And Order Summary should get recalculated 
	Then user should be able to see the increased quantity and Price in Cart Order summary 
	
	@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2942 @ZYP_CART_K2942-8051_M @CR-AKK 
Scenario: Verify Alphanumeric Quantity in the Cart Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "AlphanumericQuantity" to X 
	Then user should not be allowed to enter any non-numeric value in the input 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2942 @ZYP_CART_K2942-8046 @CR-AKK 
Scenario: Verify Reduce quantity adjustment in the Cart Page
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "EnterQuantityGreaterThenOne" to X 
	Then Order Summary should get recalculated
	When enter the "EnterQuantityLessThenTwo" to X 
	Then Order Summary should get recalculated
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2942 @ZYP_CART_K2942-8048 @CR-AKK 
Scenario:  Verify Remove quantity message in the Cart Page
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button   
	And user will click on View Cart button 
	And user navigate to Cart page  
	When click the Remove from cart link
	Then Verify the message on the page
    |# verify the remove quantity message|
    |Undo|
    
  @R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2942 @ZYP_CART_K2942-6845 @CR-AKK 	
Scenario: To verify the field type accepted for Quantity in the Cart - Numeric
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button   
	And user will click on View Cart button 
	And user navigate to Cart page  
	When enter the "EnterQuantityGreaterThenOne" to X 	
	Then verify the Quantity is numeric value
	
	
	@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2942 @ZYP_CART_K2942-6849 @CR-AKK 	
Scenario: To verify the field type accepted for Quantity in the Cart - Numeric
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button   
	And user will click on View Cart button 
	And user navigate to Cart page   
	When enter the "EnterQuantityAlphaNumeric" to X 	 
	Then verify the Quantity is not allow alphanumeric
	
	@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2942 @ZYP_CART_K2942-6861 @CR-AKK 
Scenario: To verify Reduce Quantity Adjustment - Via Open Field
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "EnterQuantityGreaterThenOne" to X 
	Then Order Summary should get recalculated
	When enter the "EnterQuantityLessThenTwo" to X 	
	Then verify the Quantity is numeric value
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2942 @ZYP_CART_K2942-6864 @CR-AKK 
Scenario:  To verify Remove link
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then Verify below Sub/Main Module of Cart Page
	|# verify the following element in checkout order summary page|
	|RemoveFromCart_Btn| 



@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2942 @ZYP_CART_K2942-6866 @CR-AKK 
Scenario:  To verify Remove link
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	And user will click on View Cart button 
	And user navigate to Cart page 
	When click the Remove from cart link 
	Then Verify the message on the page
    |# verify the remove quantity message|
    |Undo|
    
   @R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2942 @ZYP_CART_K2942-6867 @CR-AKK 
Scenario: Verify Quantity Zero in the Cart Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	And user will click on View Cart button 
	And user navigate to Cart page  
	When enter the "ZeroQuantity" to X 
	Then Verify the message on the page
    |# verify the item is removed|
    |Undo|

	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2942 @ZYP_CART_K2942-6914_M @CR-AKK
Scenario: To verify Inventory Check on Quantity update
Given user launches the browser and navigates to "ASO_HOME" page  
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button   
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "EnterQuantityGreaterThenOne" to X 
	Then verify the Quantity is updated
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2942 @ZYP_CART_K2942-12549 @CR-AKK	
Scenario: Verify the user gets the error message if Product has limited stock available
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "MoreThanThresholdQuantity" to X 
#	And user should not be allowed to enter more than available stock "AvliableeStockQuantity" 
#	Then user verfiy the an error message 
	Then Verify below Sub/Main Module of Cart Page
    |# Following Error Message should show on the page|
    |ErrorMsgLimitedStack|
	