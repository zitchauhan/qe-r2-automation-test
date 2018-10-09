Feature: B11-800 Improved Bundles Experience Display Bundled & Kit Items in Cart 

@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K4231-9342 
@CR-GK 
Scenario: 
	Verify that if a user adds same bundle to cart with different color/ size variation of products, the same should be added as separate product blade in the cart.
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user navigate and deletes existing items in cart 
	When User searches a product "SKUForBundleProducts" and navigates to PDP 
	And user click on Add to Cart Button for "Bundle Product" 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "|
		|Image_ITemInCart| 
		|CartProductName_Link |
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K4231-9343 
@CR-GK 
Scenario: Verify user can see the Individual SKU's within Bundle in cart page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user navigate and deletes existing items in cart 
	When User searches a product "SKUForBundleProducts" and navigates to PDP 
	And user click on Add to Cart Button for "Bundle Product" 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "|
		|Color_txt|
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K4231-9344 
@CR-GK 
Scenario: 
	Verify user can see the Thumbnail image, Product title, Product attributes for the products included within the Bundle/ Kit in cart page.
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user navigate and deletes existing items in cart 
	When User searches a product "SKUForBundleProducts" and navigates to PDP 
	And user click on Add to Cart Button for "Bundle Product" 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "|
		|Image_ITemInCart| 
		|CartProductName_Link |
		|Color_txt|
		|Size_txt|
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K4231-9345 
@CR-GK 
Scenario: 
	Verify user can see the Included text for the bundle/KIT products in cart page. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user navigate and deletes existing items in cart 
	When User searches a product "SKUForBundleProducts" and navigates to PDP 
	And user click on Add to Cart Button for "Bundle Product" 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "|
		|Image_ITemInCart| 
		|CartProductName_Link |
		|Cart_IncludedTxt|
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K4231-9346 
@CR-GK 
Scenario: 
	Verify user unable to delete the product that is part of the bundle/ kit 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user navigate and deletes existing items in cart 
	When User searches a product "SKUForBundleProducts" and navigates to PDP 
	And user click on Add to Cart Button for "Bundle Product" 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "|
		|CartProductName_Link |
		|RemoveFromCart_Btn|
		|Cart_IncludedTxt|
		|Quantity_input_txt|
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K4231-9353 
@CR-GK 
Scenario: 
	Verify ASO application displays consistent visual treatment for bundle/Kit in Cart,Checkout & Post Transaction
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user navigate and deletes existing items in cart 
	When User searches a product "SKUForBundleProducts" and navigates to PDP 
	And user click on Add to Cart Button for "Bundle Product" 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "|
		|Image_ITemInCart| 
		|CartProductName_Link |
		|RemoveFromCart_Btn|
		|Cart_IncludedTxt|
		|Quantity_input_txt|
		|Color_txt|
		|Size_txt|
	And user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "AVSAddress" 
	And user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And Verify below Sub/Main Module of Checkout Page 
		|#Verify following elements in checkout page|
		|checkout_ShippingMethod_Items_txt			|
		|checkout_ShippingMethod_ItemImage_img		|
		|checkout_ShippingMethod_GoToPayment_btn	|
		|Item_Txt                                   |
		|ShippingItemAvailable_Txt                  |
		|ImageShippingItemAvailable                 |
		|NameShippingItemAvailable_Txt              |
		|Color_Txt                                  |
		|ColorInput_Txt                             |
		|Size_Txt                                   |
		|SizeInput_Txt                              |
		|Quantity_Txt                               |
		|QuantityInput_Txt                          |
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K4231-9354 
@CR-GK 
Scenario: Verify the Visual treatment to be specific to PDP type 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user navigate and deletes existing items in cart 
	When User searches a product "SKUForBundleProducts" and navigates to PDP 
	And user click on Add to Cart Button for "Bundle Product" 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "|
		|Image_ITemInCart| 
		|CartProductName_Link |
		|RemoveFromCart_Btn|
		|Cart_IncludedTxt|
		|Quantity_input_txt|
		|Color_txt|
		|Size_txt|
		