Feature: Web Automation Sanity Test Cases Mimicing manual Scenarios 

@AutomationSanityR2 @CR-SK
Scenario: Cat Nav - View Cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then user navigate to Cart page 
	
	
@AutomationSanityR2 @CR-SK
Scenario: Cat Nav - Checkout from ATC Modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	Then user is navigated to checkout page 
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 
@ZYP_MYACCOUNT_K4011-10040 @CR-SK @AutomationSanityR2 
Scenario: Verify the user is able to sign in successfully with valid credentials 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "RawUser" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user should get logged in successfully 
	And a greeting message should be displayed 
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 
@ZYP_MYACCOUNT_K4011-10301 @CR-SK @AutomationSanityR2 
Scenario: Verify user can do the logout using Flyout from My Account header 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	When user sign out from the website 
	Then Sign in page should open 
	When user logs in as "RawUser" 
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And user sign out from the website 
	Then User is navigated to pdp page 
	
@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4249 
@ZYP_MYACCOUNT_K4249-10149 @CR-RK @AutomationSanityR2 
Scenario: Verify user is able to create an account with all valid data 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	And user enter first "FirstName" 
	And user enter last "LastName" 
	And user enter random email Address 
	And user enter password "Password1" 
	And user click optin checkbox 
	And clicks on Sign Up Button 
	And user should see the successfull message 
	And user should be able to view My Account in global header 
	
@R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-3093 
@ZYP_CART_K3093-10418 @CR-SK @AutomationSanityR2 
Scenario: Verify that user is able to add a new gift card in My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	And user clicks on payment tab 
	And User has empty wallet with no Gift Card added 
	When user clicks on Add New Gift Card button 
	And user enter valid "Valid16DigitGiftCardNumber" in Gift Card Number text field 
	And user enter valid "Valid8DigitGiftCardPIN" in Gift Card PIN text field 
	And clicks on Add button to add gift card 
	Then user should be able to see "Valid16DigitGiftCardNumber" Gift card 
	And user should be able to see available balance 
	And there should be a Remove link with cross icon 
	
	
	
	#@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6822 
	#@ZYP_CHECKOUT_K6822-7954 @CR-GK @AutomationSanityR2
	#Scenario: Verify Valid gift card is applied for purchases 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user clicks on SignIn link from global header 
	#	And user enter the valid emailaddress "EmailAddress" 
	#	And user enter the valid password "Password" 
	#	And user click on signin button 
	#	And user clicks on one of the category and navigates to LOne 
	#	And user clicks on one of the subcategory and navigates to LTwo 
	#	And user is able to see the product category name in section title 
	#	And user clicks on one of the product category and navigates to LThree 
	#	And User is navigated to pdp page 
	#	And user click on Add to Cart Button 
	#	And user is navigated to Add to cart Notification popup
	#	And user will click on View Cart button 
	#	And user navigate to Cart page 
	#	And user will click on Checkout button 
	#	And user is navigated to order summary page 
	#	Then user click on GiftCard Plus icon in Checkout page 
	#	And user enter Gift card Number "GiftcardNumber" 
	#	And user enter Pin Number "PinNumber" 
	#	And user click on Apply button 
	#	Then applied gift card "GiftcardNumber" should be displayed 
	#	Then gift card balance is applied towards the purchase 
	#	
	#	
	#@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3166 
	#@ZYP_CART_K3166-9604 @CR-DPK @AutomationSanityR2
	#Scenario: 
	#	Verify promotion got applied for order level when user applied %off promotion on order -- Implicit promotion 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user clicks on one of the category and navigates to LOne 
	#	Then user clicks on one of the subcategory and navigates to LTwo 
	#	Then user clicks on one of the product category and navigates to LThree 
	#	Then User is navigated to pdp page 
	#	Then user click on Add to Cart Button 
	#	Then user is navigated to Add to cart Notification popup 
	#	And user will click on View Cart button 
	#	And user navigate to Cart page 
	#	When enter the "OrderLevelQuantity" to X 
	#	Then verify Promo code discount is applied 
	#	
	#	
	#@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-2872 @ZYP_CART_K2872-8710 
	#@CR-DPK @AutomationSanityR2
	#Scenario: 
	#	Verify that the user should be able to search the store details by entering ZIP code 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user clicks on Find a Store 
	#	Then user enter "zipCode" in Find a Store Model 
	#	And user click on submit button 
	#	Then user verify the results based on entering zipcode 
	#	
	#	
	#	
	#@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6824 
	#@ZYP_CHECKOUT_K6821-8629 @CR-DPK @AutomationSanityR2
	#Scenario: Verify Gift Card applied is reflected on Order summary 
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
	#	Then user click on checkout button in Cart page 
	#	When user enter First name "FirstName" 
	#	And user enter Last name "LastName" 
	#	And user enter Phone number "PhoneNumber" 
	#	And user enter Address "Address" 
	#	And user enter Zipcode "zipcode" 
	#	Then user click on Go To Shipping Method button in Checkout page 
	#	Then user click on GiftCard Plus icon in Checkout page 
	#	And user enter Gift card Number "GiftcardNumber" 
	#	And user enter Pin Number "PinNumber" 
	#	And user click on Apply button 
	#	Then verify Gift Card in order summary page 
	#	
	
	#	
	#	
	#@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-2942 @ZYP_CART_K2942-8044 
	#@CR-DPK @AutomationSanityR2
	#Scenario: TC_5-Verify add quantity adjustment in the Cart Page 
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
	#	Then user view the items in order summary details (Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes) 
	#	When enter the "EnterQuantityGreaterThenOne" to X 
	#	And modified quantity should get updated 
	#	Then Order Summary should get recalculated 
	#	And user should be able to see the increased quantity and Price in Cart Order summary 
	#	
	#	
	#@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-2939 @ZYP_CART_K2939-9615 
	#@CR-AKK @AutomationSanityR2
	#Scenario: 
	#	To Verify Image for selected SKU is be displayed on product blade for multi-variant product 
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
	#	And User is able to see the selected variant image as thumbnail 
	#	
	#	
	#@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-2942 @ZYP_CART_K2942-8047 
	#@CR-DPK @AutomationSanityR2
	#Scenario: Verify Remove link in the Cart Page 
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
	#	Then verify the Remove Quantity link 
	#	
	#	
	#@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-3127 @ZYP_CART_K3127-8168 
	#@CR-RK @AutomationSanityR2
	#Scenario: TC_1-Verify if user should be able to checkout if there are no errors 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user clicks on one of the category and navigates to LOne 
	#	Then user clicks on one of the subcategory and navigates to LTwo 
	#	And user is able to see the product category name in section title 
	#	Then user clicks on one of the product category and navigates to LThree 
	#	Then User is navigated to pdp page 
	#	Then user click on Add to Cart Button 
	#	Then user is navigated to Add to cart Notification popup 
	#	And user click on view cart button 
	#	And user click on checkout button in Cart page 
	#	
	#	
	#@R2_Web @R2_Regression @R2_All @P-Highest @C-Checkout @KER-2926 
	#@ZYP_CHECKOUT_K2926-8100 @CR-MS @AutomationSanityR2
	#Scenario: To Edit cart items from Order summary 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
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
	#	When user clicks on Edit My cart in Order Summary 
	#	Then user should navigates to the CartPage "CartTitle" 
	
	
	
	
	#	
	#	
	#@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-3127 @ZYP_CART_K3127-8166 
	#@CR-AKK @AutomationSanityR2 
	#Scenario: Verify if user should be able to apply or remove a promotion code 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
	#	Then User navigats to the item eligible for item level promo 
	#	Then User is navigated to pdp page 
	#	Then user click on Add to Cart Button 
	#	Then user is navigated to Add to cart Notification popup 
	#	And user will click on View Cart button 
	#	And user navigate to Cart page 
	#	When enter the "EnterQuantityGreaterThenOne" to X 
	#	And user view and Applied Promotions/Discounts "ItemLevelPromoCodeDiscount" 
	#	Then discount value applied against the individual line item 
	#	Then user is displayed Promo code XXXXX applied 
	#	And customer must see the associated discount as -$XX.XX (total order discount) at Order Summary in Cart 
	#	And total price must be updated to reflect discount 
	#	And User clicks on Remove Promo code link 
	#	Then Promo code is Removed 
	#	And associated discount should get remove 
	#	Then total price must be updated with reflect amount 
	#	
	#	
	#	
	#@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2926
	#@ZYP_CHECKOUT_K2926-8098 @CR-AKK @AutomationSanityR2
	#Scenario: To view the Order Summary details on the Check out 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
	#	And user clicks on one of the category and navigates to LOne 
	#	And user clicks on one of the subcategory and navigates to LTwo 
	#	And user is able to see the product category name in section title 
	#	And user clicks on one of the product category and navigates to LThree 
	#	And User is navigated to pdp page 
	#	And user click on Add to Cart Button 
	#	And user is navigated to Add to cart Notification popup 
	#	And user will click on View Cart button 
	#	And user navigate to Cart page 
	#	When user will click on Checkout button and navigates to Checkout page 
	#	Then verify the presence of the following in the Order Summary 
	
	#-----------------------------------------------------------------old sanity suit below
	#
	#@AutomationSanityR2 @R2_AS1 @R2_WAST-01 @KER-3127 @ZYP_K3127-8168 @CR-AKK
	#Scenario: TC_1-Verify if user should be able to checkout if there are no errors 
	#	Given user launches the browser and navigates to "ASO_HOME" page
	#	When user clicks on one of the category and navigates to LOne
	#    Then user clicks on one of the subcategory and navigates to LTwo
	#    And user is able to see the product category name in section title
	#    Then user clicks on one of the product category and navigates to LThree
	#	Then User is navigated to pdp page
	#	Then user click on Add to Cart Button 
	#	Then user is navigated to Add to cart Notification popup 
	#	
	#	
	#    
	
	#    
	#@AutomationSanityR2 @R2_AS1 @R2_WAST-03 @KER-3127 @ZYP_K3127-8166 @CR-RK 
	#Scenario: TC_3-Verify if user should be able to apply or remove a promotion code 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user clicks on one of the category and navigates to LOne
	#    Then user clicks on one of the subcategory and navigates to LTwo
	#    And user is able to see the product category name in section title
	#    Then user clicks on one of the product category and navigates to LThree
	#	Then User is navigated to pdp page
	#	Then user click on Add to Cart Button
	#	Then user is navigated to Add to cart Notification popup 
	#	And user will click on View Cart button 
	#	And user view and Applied Promotions/Discounts "Promocode1"
	#	#And user must see the following details Promo Code and associated discount And Total price 
	#	#When user clicks on Remove promocode 
	#	#Then promocode should get removed and associated discount should get remove And Total price must be updated with reflect amount 
	#	
	#	
	#	
	#@AutomationSanityR2 @R2_AS1 @WAST-04 @KER-3127 @ZYP_K3127-8165 @CR-AKK
	#Scenario: TC_4-Verify if user is able to view following elements in order summary of cart 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user clicks on one of the category and navigates to LOne
	#    Then user clicks on one of the subcategory and navigates to LTwo
	#    And user is able to see the product category name in section title
	#    Then user clicks on one of the product category and navigates to LThree
	#	Then User is navigated to pdp page
	#	Then user click on Add to Cart Button 
	#	Then user is navigated to Add to cart Notification popup 
	#	And user click on view cart button 
	#	Then user view the items in order summary details (Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes) 
	#	And user view and Applied Promotions/Discounts "Promocode1"
	#	Then user verifiy Order Total 
	#	
	#	
	#    
	#	
	#	@AutomationSanityR2 @R2_AS1 @WAST-05 @KER-2942 @ZYP_K2942-8044 @CR-DP
	#Scenario: TC_5-Verify add quantity adjustment in the Cart Page 
	#	Given user launches the browser and navigates to "ASO_HOME" page  
	#	When user clicks on one of the category and navigates to LOne
	#    Then user clicks on one of the subcategory and navigates to LTwo
	#    And user is able to see the product category name in section title
	#    Then user clicks on one of the product category and navigates to LThree
	#	Then User is navigated to pdp page
	#	Then user click on Add to Cart Button
	#	Then user is navigated to Add to cart Notification popup  
	#	And user will click on View Cart button 
	#	And user navigate to Cart page 
	#	Then user view the items in order summary details (Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes)
	#	When enter the "<Quantity>" to X
	#	And modified quantity should get updated 
	#	Then Order Summary should get recalculated 
	#	And user should be able to see the increased quantity and Price in Cart Order summary 
	#	
	#	
	# 
	#   
	#
	#@AutomationSanityR2 @R2_AS1 @WAST-06 @KER-2942 @ZYP_K2942-8047 @CR-DP
	#Scenario: TC_6-Verify Remove link in the Cart Page 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user clicks on one of the category and navigates to LOne
	#    Then user clicks on one of the subcategory and navigates to LTwo
	#    And user is able to see the product category name in section title
	#    Then user clicks on one of the product category and navigates to LThree
	#	Then User is navigated to pdp page
	#	Then user click on Add to Cart Button 
	#	Then user is navigated to Add to cart Notification popup 
	#	And user will click on View Cart button 
	#	And user navigate to Cart page 
	#	Then click the Remove Quantity link 
	#	And verify item is removed from the cart 
	#	
	#	
	#    
	#@AutomationSanityR2 @R2_AS1 @WAST-07 @KER-2939 @ZYP-K2939_9615  @CR-RK
	#Scenario: TC_7-To Verify Image for selected SKU is be displayed on product blade for  multi-variant product. 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user clicks on one of the category and navigates to LOne
	#    Then user clicks on one of the subcategory and navigates to LTwo
	#    And user is able to see the product category name in section title
	#    Then user clicks on one of the product category and navigates to LThree
	#	Then User is navigated to pdp page
	#	Then user click on Add to Cart Button 
	#	Then user is navigated to Add to cart Notification popup 
	#	And user will click on View Cart button 
	#	And user click on the product image in cart page
	#	And User is navigated to pdp page