Feature: [Mobile] Verify Product Blade in Cart 

@R2_Mobile @R2_Regression @R2_All @P-Highest @C-Cart @KER-2939 @ZYP-K2939_9615_M @CR-AKK 
Scenario: To Verify Image for selected SKU is be displayed on product blade for  multi-variant product. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	When user navigate to Cart page 
	Then User is able to see the selected variant image as thumbnail 

	@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8071_M @CR-AKK 
Scenario: To view details specific to an item in the cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
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
	|ShipToMe_radioBtn|
	|InStorePickup_FREE_radioBtn |
	When enter the "EnterQuantityGreaterThenOne" to X	 
	And user verify Discount messaging and Promotional messaging 
	And user verfiy disclamier message 
	And user verify SOF pickup information 

	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8077_M @CR-AKK 
Scenario:
To verify Shipping radio button - Authenticated user With store selected in My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	When Shipping radio button is selected by default 
	And in-stores radio button is deselected 
	And in-stores information is hided 
	And user clicks change "AuthenticatedChangeZIPCode" code 
	Then Verify below Sub/Main Module of Cart Page
	|# user will verify if Shipping date information is displayed |
	|EstArrival_txt|
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8080_M @CR-AKK 
Scenario: Desktop - To verify Quantity input field 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button
	Then user is navigated to Add to cart Notification popup 
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
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8073_M @CR-AKK 
Scenario: To Verify Thumbnail Image 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then Verify below Sub/Main Module of Cart Page  
	|CartProductName_Link   | 
	And user click on the product image in cart page 
	And User is navigated to pdp page 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8074_M @CR-AKK 
Scenario: To verify Product name dynamic linking 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page  
	|CartProductName_Link   |
	When user click on the product name in cart page
	Then User is navigated to pdp page 
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8082_M @CR-AKK 
Scenario: To verify Remove Link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then Verify below Sub/Main Module of Cart Page 
	|RemoveFromCart_Btn|
	When click the Remove Quantity link 
	Then verify item is removed from the cart 
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8078_M @CR-AKK 
Scenario: To verify In-store Pick up radio button - with My Store info on My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP  
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then Verify below Sub/Main Module of Cart Page
   |InStorePickup_FREE_radioBtn |
	And user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8075_M @CR-AKK 
Scenario: To verify Shipping radio button - Unauthenticated user 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP  
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And Shipping radio button is selected by default 
	Then Verify below Sub/Main Module of Cart Page
	|ShipToMe_radioBtn|
	And in-stores radio button is deselected 
	And in-stores information is hided 
	Then Shipping date information is displayed 
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8076_M @CR-AKK 
Scenario: To verify Shipping radio button - Authenticated user With out store selected in My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
    And User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP  
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And Shipping radio button is selected by default 
	Then Verify below Sub/Main Module of Cart Page
	|ShipToMe_radioBtn|
	And in-stores radio button is deselected 
	Then in-stores information is hided 
	And Shipping date information is displayed 
	
@R2_Mobile @R2_Regression @R2_All @P-Lowest @C-Cart @KER-2939 @ZYP_CART_K2939-8085_M @CR-AKK 
Scenario: To verify Est.Arrival Tool Tip 
	Given user launches the browser and navigates to "ASO_HOME" page 
    And User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then Shipping radio button is selected by default 
	Then Verify below Sub/Main Module of Cart Page 
	|# user verify the Est.Arrival Tool Tip is present|
	|toolTip_icon|
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8081_M @CR-AKK 
Scenario: To verify Quantity input field 
	Given user launches the browser and navigates to "ASO_HOME" page 
	 And User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button  
	When user selects the Quantity field 
	And verfiy quantiy field is activated 
	Then Verify below Sub/Main Module of Cart Page 
	|Quantity_txt|
	