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
	When user click on the product image in cart page 
	Then User is navigated to pdp page 
	
	
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