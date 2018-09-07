Feature: [Web] B06-100- Merge Cart
#
#@R2_Web @R2_Regression  @KER-3143 @ZYP_Cart_K3143-10257 @CR-RKA
#Scenario: Verify if Unauthenticated customer will be able to add items to cart for BOPIS
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User navigates to L2 Mens clothing 
#	Then user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	Then user clicks on one of the product category and navigates to LThree 
#	Then User is navigated to pdp page 
#	Then user click on Add to Cart Button 
#	Then user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
#	Then user verify IN Store Pick Up-Free is enable 
#	Then Verify below Sub/Main Module of Cart Page
#	|#verify INStorePickup_FREE radio btn is enable# |
#	|InStorePickup_FREE_radioBtn |
#
#@R2_Web @R2_Regression  @KER-3143 @ZYP_Cart_K3143-10263 @CR-RKA
#Scenario: Verify if Un-Authenticated user must be able to sign into their account from MyAccount in header
#Given user launches the browser and navigates to "ASO_HOME" page
#	And user clicks on SignIn link from global header
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#    And user click on signin button
#    Then user click on My account link 
#    
#    Then Verify below Sub/Main Module of My Account
#	|#verify INStorePickup_FREE radio btn is enable# |
#	|myAccount_MyAccountList_Orders_lnk			 		|
#	
#	@R2_Web @R2_Regression  @KER-3143 @ZYP_Cart_K3143-12506 @CR-RKA
#	Scenario: Verify Unauthenticated user is able to Sign in from empty cart
#	Given user launches the browser and navigates to "ASO_HOME" page
#	And User clicks on the minicart icon and navigated to minicart
#	Then User click on sign in button on cart page 
#	Then user sign in on my cart page 
#	Then user will empty the cart if product is in cart
#	Then Verify below Sub/Main Module of Cart Page
#	|# Verify following elements in Cart page"When cart is empty"|
#	|YourCartIsEmpty_Txt| 
#	
#	@R2_Web @R2_Regression  @KER-3143 @ZYP_Cart_K3143-12547 @CR-RKA
#	Scenario: Verify the display and behavior of 'Continue Shopping' in Cart Title
#		Given user launches the browser and navigates to "ASO_HOME" page
#	And user clicks on one of the category and navigates to LOne 
#	And user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	And user clicks on one of the product category and navigates to LThree 
#	And User is navigated to pdp page 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user navigate to Cart page 
#	Then user click on continue shopping 
#	Then user verify title of the home page
#	Then Verify the message on the page
#	|#verify user is on Home Page#|
#	|SHOP NOW|
#	
#	@R2_Web @R2_Regression  @KER-3143 @ZYP_Cart_K3143-12548 @CR-RKA
#	Scenario: Verify the display and behavior of 'Checkout' in Cart Title
#		Given user launches the browser and navigates to "ASO_HOME" page
#	And user clicks on one of the category and navigates to LOne 
#	And user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	And user clicks on one of the product category and navigates to LThree 
#	And User is navigated to pdp page 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user navigate to Cart page 
#	And user will click on Checkout button and navigates to Checkout page
#	Then Verify below Sub/Main Module of Checkout Page
#	|# Verify the presence of  Checkout Page	|
#		|checkout_ShippingAddress_FirstName_txt						|
#		|checkout_ShippingAddress_LastName_txt						|
#		|checkout_ShippingAddress_PhoneNumber_txt					|
#		|checkout_ShippingAddress_Address_txt						|
#		|checkout_ShippingAddress_ZipCode_txt						|
#		|checkout_ShippingAddress_City_txt							|
#		|checkOut_ShippingAddress_GoToShippingMethod_btn			|
	
#	@R2_Web @R2_Regression  @KER-3143 @ZYP_Cart_K3143-12571 @CR-RKA
#	Scenario: Verify all the components available on the Order Summary of the Cart
#		Given user launches the browser and navigates to "ASO_HOME" page
#	And user clicks on one of the category and navigates to LOne 
#	And user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	And user clicks on one of the product category and navigates to LThree 
#	And User is navigated to pdp page 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button
#	Then Verify below Sub/Main Module of Cart Page
#	|# Verify following elements in Cart page"Order Summary"|
#		|OrderSummary_Header|
#		|Plus_AddPromoCode_btn|
#		|checkOut_OrderSummary_btn|	
#		|ZipCode_txt|
#		|EstimatedShippingPrice_Txt|
#	    |ShippingPolicy_link|
#		|ReturnPolicy_link|
		
	
#	@R2_Web @R2_Regression  @KER-3143 @ZYP_Cart_K3143-8155 @CR-RKA
#	Scenario: Verify if Unauthenticated customer will be able to add items to cart for shipping
#	Given user launches the browser and navigates to "ASO_HOME" page
#	And user clicks on one of the category and navigates to LOne 
#	And user clicks on one of the subcategory and navigates to LTwo 
#	And user is able to see the product category name in section title 
#	And user clicks on one of the product category and navigates to LThree 
#	And User is navigated to pdp page 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#   Then user verify sucessfully added item MSG 
#	Then Verify the message on the page
#	|#verify item added successfully MSG#|
#	 | Item Added Successfully|
#	
	@R2_Web @R2_Regression  @KER-3143 @ZYP_Cart_K3143-8156 @CR-RKA
	Scenario: Verify authenticated user has ability to sign in to the account from empty cart
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then Verify signout from my account
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user clicks on SignIn link from global header
	#incomplete
	
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then Verify below Sub/Main Module of Cart Page
	|# Verify following elements in Cart page "Your Cart "|
		|ContinueShopping_Link|
		|YourCart_Header|
		|Items_txt|
		|TotalYourCart_txt|
	