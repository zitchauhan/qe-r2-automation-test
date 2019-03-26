Feature: [Mobile] Verify Product Blade in Cart 

@R2_Mobile @R2_Regression @R2_All @P-Highest @1HR_R2 @C-Cart @KER-2939 @ZYP_CART_K2939_9615 @CR-AKK 
Scenario: To Verify Image for selected SKU is be displayed on product blade for  multi-variant product. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	When user navigate to Cart page 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page "Your Cart item details "|
	|CartProductName_Link   |
	Then User is able to see the selected variant image as thumbnail 

	@C-BOPIS @R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8071 @CR-AKK 
Scenario: To view details specific to an item in the cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user views the details specific to the item(Thumbnail image) 
	And user verify prodcut name and prodcut link 
	And user verify color and size 
	And user verify price of items for single quantity 
	Then Verify below Sub/Main Module of Cart Page
	|# verify Remove cart link |
	|RemoveFromCart_Btn|
	|AddToWishList_btn|
	When enter the "EnterQuantityGreaterThenOne" to X 
	And user verify Remove cart link 
	And user verify add to wishlist 
	And user verify Discount messaging and Promotional messaging 
	And user verify shipping information 
#	Then user verify BOPIS radio button 
	
	
@R2_Mobile @R2_Regression @R2_All @1HR_R2 @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8077 @CR-AKK 
Scenario:
To verify Shipping radio button - Authenticated user With store selected in My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	And user clicks change "AuthenticatedChangeZIPCode" code 
	Then Verify below Sub/Main Module of Cart Page
	|# user will verify if Shipping date information is displayed |
	|EstArrival_txt|
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8080 @CR-AKK 
Scenario: Desktop - To verify Quantity input field 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And modified quantity should get updated 
	Then Verify below Sub/Main Module of Cart Page
		|# Then Order Summary should get recalculated |
	    |Total_txt|
		|SubTotal_txt|
		|EstimatedShipping_txt|
		|EstimatedTaxes_txt|
	And user should be able to see the increased quantity and Price in Cart Order summary 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8073 @CR-AKK 
Scenario: To Verify Thumbnail Image 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button
	Then Verify below Sub/Main Module of Cart Page  
	|# Verify following elements in Cart page "Your Cart item details "|
	|CartProductName_Link   | 
	And user click on the product image in cart page 
	And User is navigated to pdp page 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8074 @CR-AKK 
Scenario: To verify Product name dynamic linking 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page "Your Cart item details "| 
	|CartProductName_Link   |
	When user click on the product name in cart page
	Then User is navigated to pdp page 
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8082 @CR-AKK 
Scenario: To verify Remove Link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button
	Then Verify below Sub/Main Module of Cart Page 
	|RemoveFromCart_Btn|
	When click the Remove Quantity link 
	Then verify item is removed from the cart 
	
@C-BOPIS @R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8078 @CR-AKK 
Scenario: To verify In-store Pick up radio button - with My Store info on My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "SKUForBopisProduct" in the search box
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button  
	#When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8075 @CR-AKK 
Scenario: To verify Shipping radio button - Unauthenticated user 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP  
	#And user click on Add to Cart Button 
	And user click on ship it button  
	And user will click on View Cart button 
	And Shipping radio button is selected by default 
	Then Verify below Sub/Main Module of Cart Page
	|# Verify following elements in Cart page "Your Cart item details "|
	|ShipToMe_radioBtn| 
	Then Shipping date information is displayed  
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8076 @CR-AKK 
Scenario: To verify Shipping radio button - Authenticated user With out store selected in My Account 
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
	And Shipping radio button is selected by default 
	Then Verify below Sub/Main Module of Cart Page
	|# Verify following elements in Cart page "Your Cart item details "|
	|ShipToMe_radioBtn|
	And Shipping date information is displayed 
	
@R2_Mobile @R2_Regression @R2_All @P-Lowest @C-Cart @KER-2939 @ZYP_CART_K2939-8085 @CR-AKK 
Scenario: To verify Est.Arrival Tool Tip 
	Given user launches the browser and navigates to "ASO_HOME" page 
    And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	Then Shipping radio button is selected by default 
	Then Verify below Sub/Main Module of Cart Page 
	|# user verify the Est.Arrival Tool Tip is present|
	|toolTip_icon|
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8081 @CR-AKK 
Scenario: To verify Quantity input field 
	Given user launches the browser and navigates to "ASO_HOME" page 
	 And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button  
	When user selects the Quantity field 
	And verfiy quantiy field is activated 
	Then Verify below Sub/Main Module of Cart Page 
	|# Verify following elements in Cart page "Your Cart item details "|
	|Quantity_txt|
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8072 @CR-AKK 	 
Scenario: To "Move to Wish list" from Cart 
Given user launches the browser and navigates to "ASO_HOME" page
   And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	 And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP  
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button
    When user clicks on Move to Wish list
	And user enter the Wishlist name 
	Then Verify below Sub/Main Module of Cart Page 
	|#Item is moved from cart to the wish list |
	|AddToWishList_btn|
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8079 @C-BOPIS @CR-AKK 	 
	Scenario: To verify In-store Pick up radio button - without My Store info on My Account
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu  
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP  
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden 
	Then Verify below Sub/Main Module of Cart Page
	|# Verify following elements in Cart page "Your Cart item details "|
   |InStorePickup_FREE_radioBtn |
	And verify user can begin checkout 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-12508 @CR-AKK 	
Scenario: Verify Product name dynamic display to product link
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP  
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user views the details specific to the item(Thumbnail image)  
	Then Verify below Sub/Main Module of Cart Page
	|#user verify prodcut name and prodcut link |
	|CartProductName_Link |
	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8084 @CR-AKK 
Scenario: To verify SOF pick up message	
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "SOFemail" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User searches a product "SOFSKUNumber" and navigates to PDP
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then Verify below Sub/Main Module of Cart Page
    |#user verify ShipToStore |
#	|ShipToStore_radioBtn|
	

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8083 @CR-AKK	 
Scenario: To verify Disclaimer message
Given user launches the browser and navigates to "ASO_HOME" page
    And User clicks on the burger menu
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "SOFemail" 
	And user enter the valid password "Password" 
	And user click on signin button  
	When user enters "SOFSKUNumber" in the search box
    Then user views a Disclaimer message
    When clicks on Read More Link
    
    @R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-12572 @CR-AKK 
Scenario: Verify the Product blade where In-store pick is not available
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP  
#And user click on Add to Cart Button 
	And user click on ship it button
	When user will click on View Cart button 
	And user navigate to Cart page 
	Then in Product blade, radio button against In-store Pick-up should be suppressed
	And Ship to Me radio button should be selected by default

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-12573 @CR-AKK 	
Scenario: Verify the Product blade where shipping is not available
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to L3  
	And user clicks on the product card and navigates to PDP  
	#And user click on Add to Cart Button 
	And user click on ship it button 
	When user will click on View Cart button 
	And user navigate to Cart page 
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
	Then in Product blade, radio button against Ship to Me should be suppressed
	And In-store pickup radio button should be selected by default
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-12502 @CR-AKK	
Scenario: To Verify that Move to Wishlist Link is not displayed for Gift Card(s) and Bundle Item(s). 
	Given user launches the browser and navigates to "ASO_HOME" page   
	Then User searches a product "SKUForBundleProducts" and navigates to PDP
	Then Verify the nextstep functionality  
    Then Verify that Move to Wishlist Link is not displayed for Gift Card(s) and Bundle Item(s)
    
    
    @C-BOPIS @R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-12746 @C-BOPIS @CR-AKK 
Scenario: To verify Ship to store radio button - Authenticated user With store selected in My Account
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When user enters "SKUForBopisProduct" in the search box
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then Verify below Sub/Main Module of Cart Page
    |#user verify ShipToStore |
	|ShipToStore_radioBtn|