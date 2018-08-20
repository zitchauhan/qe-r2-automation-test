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
	When enter the "<Quantity>" to X  
    And user verify Remove cart link 
	And user verify add to wishlist
	And user verify Discount messaging and Promotional messaging
	And user verfiy disclamier message
	And user verify SOF pickup information
	And user verify shipping information
	Then user verify BOPIS radio button
		
	
	 @R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8077 @CR-RK 
	Scenario: To verify Shipping radio button - Authenticated user With store selected in My Account
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	When user will verify Shipping radio button is selected by default
	Then user will verify if in-stores radio button is deselected 
	And user will verify if in-stores information is hidden
	Then user clicks change "<ZIP>" code    
	And user will verify if Shipping date information is displayed


	 @R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8080 @CR-RK 
	Scenario:  Desktop - To verify Quantity input field 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	When enter the "<Quantity>" to X  
	And modified quantity should get updated 
	Then Order Summary should get recalculated 
	And user should be able to see the increased quantity and Price in Cart Order summary 
	
	
    @R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8073 @CR-RK 
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
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8074 @CR-RK 
	Scenario:  To verify Product name dynamic linking
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
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8082 @CR-RK 
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


@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2939 @ZYP_CART_K2939-8078 @CR-RK 
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
	When user will verify in-store pick up radio button is selected
	Then user will verify Shipping radio button is deselected
	And user will verify if in-stores information is hidden
	Then verify user can begin checkout

	  