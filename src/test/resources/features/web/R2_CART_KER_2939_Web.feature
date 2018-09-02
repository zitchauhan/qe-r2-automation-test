Feature: Verify Product Blade in Cart 

@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-2939 @ZYP_CART_K2939-9615 @CR-AKK 
Scenario: To Verify Image for selected SKU is be displayed on product blade for multi-variant product 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And User is able to see the selected variant image as thumbnail 
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8071 @CR-AKK 
Scenario: To view details specific to an item in the cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user views the details specific to the item(Thumbnail image) 
	And user verify prodcut name and prodcut link 
	And user verify color and size 
	Then user verify price of items for single quantity 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And user verify Remove cart link 
	And user verify add to wishlist 
	And user verify Discount messaging and Promotional messaging 
	And user verfiy disclamier message 
	And user verify SOF pickup information 
	And user verify shipping information 
	Then user verify BOPIS radio button 
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8077 @CR-AKK 
Scenario:
To verify Shipping radio button - Authenticated user With store selected in My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then Shipping radio button is selected by default 
	Then in-stores radio button is deselected 
	And in-stores information is hided 
	Then user clicks change "AuthenticatedChangeZIPCode" code 
	And user will verify if Shipping date information is displayed 
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8080 @CR-AKK 
Scenario: Desktop - To verify Quantity input field 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And modified quantity should get updated 
	Then Order Summary should get recalculated 
	And user should be able to see the increased quantity and Price in Cart Order summary 
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8073 @CR-AKK 
Scenario: To Verify Thumbnail Image 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user click on the product image in cart page 
	And User is navigated to pdp page 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8074 @CR-AKK 
Scenario: To verify Product name dynamic linking 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user click on the product name in cart page 
	And User is navigated to pdp page 
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8082 @CR-AKK 
Scenario: To verify Remove Link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then click the Remove Quantity link 
	And verify item is removed from the cart 
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8078 @CR-AKK 
Scenario: To verify In-store Pick up radio button - with My Store info on My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden  
	Then verify user can begin checkout 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8075 @CR-AKK 
Scenario: To verify Shipping radio button - Unauthenticated user 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then Shipping radio button is selected by default 
	Then in-stores radio button is deselected 
	And in-stores information is hided 
	And Shipping date information is displayed 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8076 @CR-AKK 
Scenario: To verify Shipping radio button - Authenticated user With out store selected in My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then Shipping radio button is selected by default 
	Then in-stores radio button is deselected 
	And in-stores information is hided 
	And Shipping date information is displayed 
	
@R2_Web @R2_Regression @R2_All @P-Lowest @C-Cart @KER-2939 @ZYP_CART_K2939-8085 @CR-AKK 
Scenario: To verify Est.Arrival Tool Tip 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then Shipping radio button is selected by default 
	And user verify the Est.Arrival Tool Tip is present 
 

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8081 @CR-AKK 
Scenario: To verify Quantity input field 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button  
	When user selects the Quantity field 
	Then verfiy quantiy field is activated 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8072 @CR-AKK 	 
Scenario: To "Move to Wish list" from Cart 
Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree  
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	When user clicks on Move to Wish list link "NewWishLink" OR exisiting wishlink
	Then item is moved from cart to the wish list
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2939 @ZYP_CART_K2939-8079 @CR-AKK 	 
	Scenario: To verify In-store Pick up radio button - without My Store info on My Account
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user clicks on one of the category and navigates to LOne 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree  
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user will verify Shipping radio button is deselected 
	And user will verify if in-stores information is hidden 
	And verify user can begin checkout 
	Then verify error message is displayed
	 
	
	