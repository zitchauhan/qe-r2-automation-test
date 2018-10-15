Feature: Web Automation Sanity Test Cases Mimicing manual Scenarios 

@R2_Web @R2_WAST-01 @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10040
@CR-SK @AutomationSanityR2 
Scenario: TC_1- Verify Login Logout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "SanityEmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user should get logged in successfully 
	When user clicks on signout link in myaccount list 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
		
		
@R2_Web @R2_WAST-03 @P-Highest @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10149
@CR-SK 
@AutomationSanityR2 @C1-Message 
Scenario: TC_3- Verify User is able to create an account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	And user enter first "SanityFirstName" 
	And user enter last "SanityLastName" 
	And user enter random email Address 
	And user enter password "SanityPassword" 
	Then user should see password masked 
	When clicks on Sign Up Button 
	Then user should be able to sign up successfully 
	And Verify the message on the page 
		|# Following Message should show on the page|
		|CONGRATULATIONS                            |
		|You have successfully registered with Academy.com|
		|LET'S SHOP                                       |
		
@R2_Web @R2_WAST-04 @P-High @C-MyAccount @KER-3093 @ZYP_CART_K3093-10418 @CR-SK 
@AutomationSanityR2 
Scenario: TC_4- Verify User is able to Add Gift Card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	Then user click on My Account and navigate to payment 
	And User has empty wallet with no Gift Card added 
	When user clicks on Add New Gift Card button 
	And user enter valid "Valid16DigitGiftCardNumber" in Gift Card Number text field 
	And user enter valid "Valid8DigitGiftCardPIN" in Gift Card PIN text field 
	And clicks on Add button to add gift card 
	Then user should be able to see "Valid16DigitGiftCardNumber" Gift card 
	And user should be able to see available balance 
	And there should be a Remove link with cross icon 
	
	
@R2_Web @R2_WAST-05 @P-High @C-MyAccount @KER-2919 @ZYP_CART_K2919-10696 @CR-DPK
@AutomationSanityR2 
Scenario: TC_5-Verify Add Credit Card and added as a Default Card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "EmailAddress" 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user click on checkout button 
	And user clicks on edit payment cta 
	
	
	#===========unit testing pending as search is not working
@R2_Web @R2_WAST-06 @P-High @CR-SK @AutomationSanityR2 
Scenario: TC_6-Verify and Search an item and  navigate to  View Cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User should be able to see Search Box on Homepage 
	When User searches a product "productName" and navigates to PDP 
	And user verifies the entered SKU id 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	Then user navigate to Cart page 
	
	#===========unit testing pending as search is not working
@R2_Web @R2_WAST-07 @P-High @CR-SK @AutomationSanityR2 
Scenario: TC_7-Verify and Search - Checkout from ATC Modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User should be able to see Search Box on Homepage 
	When User searches a product "productName" and navigates to PDP 
	And user verifies the entered SKU id 
	And user click on Add to Cart Button 
	When user click on checkout button 
	Then user is navigated to checkout page 
	
	
@R2_Web @R2_WAST-08 @AutomationSanityR2 @CR-SK 
Scenario: TC_8-Verify Cat Nav - View Cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User Navigates L2 form Homepage Header 
	And User clicks on product in PLP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	Then user navigate to Cart page 
	
	
@R2_Web @R2_WAST-09 @AutomationSanityR2 @CR-SK 
Scenario: TC_9-Verify Cat Nav - Checkout from ATC Modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User Navigates L2 form Homepage Header 
	And User clicks on product in PLP 
	And user click on Add to Cart Button 
	When user click on checkout button 
	Then user is navigated to checkout page 
	
	
@R2_Web @R2_WAST-10 @P-High @C-Checkout @KER-3166 @ZYP_CART_K3166-9604 @CR-DPK 
@AutomationSanityR2 
Scenario: TC_10-Verify Apply Promotion 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user view and Applied Promotions/Discounts "SanityOrderLevelQuantity" 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page"Order Summary"|	
		|checkOut_OrderSummary_btn|	
		|Total_txt|
		|SubTotal_txt|
		|EstimatedTaxes_txt|
		|Discount_Txt|	 
		
@R2_Web @R2_WAST-11 @P-Highest @C-Cart @KER-3127 @ZYP_CART_K3127-8166 @CR-AKK 
@AutomationSanityR2 
Scenario: TC_11- Verify Apply Promotion / Remove Promotion 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And user view and Applied Promotions/Discounts "ItemLevelPromoCodeDiscount" 
	Then Verify below Sub/Main Module of Cart Page 
		|# verify the following element in checkout order summary page|
		|RemoveFromCart_Btn|
	And User clicks on Remove Promo code link 
	Then Promo code is Removed 
	
	
	
@R2_Web @R2_WAST-12 @P-Highest @C-Cart @KER-2942 @ZYP_CART_K2942-8044 @CR-AKK 
@AutomationSanityR2 
Scenario: TC_12-Verify Update Quantity 

	Given  user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	Then  user click on Add to Cart Button 
	And  user will click on View Cart button 
	And  user navigate to Cart page 
	Then  user view the items in order summary details (Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes) 
	When  enter the "EnterQuantityGreaterThenOne" to X 
	And  modified quantity should get updated 
	Then  Order Summary should get recalculated 
	Then  Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page"Order Summary"|
		|SubTotal_txt|
	And  user should be able to see the increased quantity and Price in Cart Order summary 
	
@R2_Web @R2_WAST-13 @P-Highest @C-Cart @KER-2939 @ZYP_CART_K2939-9615 @CR-AKK 
@AutomationSanityR2 
Scenario:
TC_13-To Verify Image for selected SKU is be displayed on product blade for multi-variant product 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	When user navigate to Cart page 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "|
		|CartProductName_Link   |
	And User is able to see the selected variant image as thumbnail 
	
	
	
@R2_Web @R2_WAST-14 @P-Highest @C-Cart @KER-2942 @ZYP_CART_K2942-8047 @CR-AKK 
@AutomationSanityR2 
Scenario: TC_14-Verify Remove Item from Cart 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	Then  user click on Add to Cart Button 
	And  user will click on View Cart button 
	And  user navigate to Cart page 
	And  verify the Remove Quantity link 
	Then  Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "|
		|RemoveFromCart_Btn|
		
@R2_Web @R2_WAST-15 @P-Highest @C-Cart @KER-3127 @ZYP_CART_K3127-8168 @CR-AKK 
@AutomationSanityR2 
Scenario: TC_15-Verify User Able to Checkout, if no errors in cart 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	Then  user click on Add to Cart Button 
	When  user click on view cart button 
	Then  Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "| 
		|checkOutYourCart_Btn|
	And  user click on checkout button in Cart page 
	
@R2_Web @R2_WAST-16 @P-Highest @C-Checkout @KER-2934 @ZYP_CHECKOUT_K2934-8177
@CR-DPK @AutomationSanityR2 
Scenario: TC_16-Verify Add Shipping Address 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	Then user navigate to Cart page 
	Then user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	
	
@R2_Web @R2_WAST-17 @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6821-8629 
@CR-DPK 
@AutomationSanityR2 
Scenario: TC_17-Verify Payment - Add Gift Card - Unathenticated 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button 
	And user fill the PO box in shipping address 
	And user click on Go To Shipping Method button in Checkout page 
	Then user click on go to payment present in shipping method 
	Then user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "Valid16DigitGiftCardNumber" 
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button 
	Then verify Gift Card in order summary page 
	
@R2_Web @R2_WAST-18 @P-High @C-Checkout @KER-6822 @ZYP_CHECKOUT_K6822-7954
@CR-GK 
@AutomationSanityR2 
Scenario: TC_18-Verify Payment - Add Gift Card - Authenticated 

	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User searches a product "productName" and navigates to PDP 
	Then user click on Add to Cart Button 
	And user click on checkout button 
	Then user click on go to payment present in shipping method 
	Then user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "Valid16DigitGiftCardNumber" 
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button 
	Then applied gift card "Valid16DigitGiftCardNumber" should be displayed 
	Then gift card balance is applied towards the purchase 
	
	
@R2_Web @R2_MAST-19 @P-High @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8147 
@CR-RK 
@AutomationSanityR2 
Scenario: TC_19-Verify Sign In During Checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
	When user click on SignIn link 
	And user enter the valid emailaddress "SanityEmailAddress" from checkout page 
	And user enter the valid password "Password" from checkout page 
	And user click on signin button 
	
	
@R2_Web @R2_WAST-20 @P-Highest @C-Checkout @KER-2926 @ZYP_CHECKOUT_K2926-8100 
@CR-AKK @C1-Message @C1-Message 
@AutomationSanityR2 
Scenario: TC_20- Verify Edit cart items from Order summary 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	And  user click on Add to Cart Button 
	And  user will click on View Cart button 
	And  user navigate to Cart page 
	And  user will click on Checkout button and navigates to Checkout page 
	When  user clicks on Edit My cart in Order Summary 
	Then  user should navigates to the CartPage "CartTitle" 
	Then  Verify the message on the page 
		|# Following Message should show on the page|
		|CartPage|
		
@R2_Web @R2_WAST-21 @P-Low @C-Checkout @KER-2926 @ZYP_CHECKOUT_K2926-8098 
@CR-AKK 
@AutomationSanityR2 
Scenario: TC_21-Verify Order Summary 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	And  user click on Add to Cart Button 
	And  user will click on View Cart button 
	And  user navigate to Cart page 
	When  user will click on Checkout button and navigates to Checkout page 
	Then  Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout page "Order Summary"|
		|Subtotal_txt|
		|Estimatedshippint_txt|
		|EstimatedTax_Txt|  
		
		
		
@R2_Web @R2_WAST-22 @P-Highest @C-Cart @KER-2872 @ZYP_CART_K2872-8710 @CR-DPK 
@AutomationSanityR2 
Scenario: TC_22-Verify Find a store 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user verify the results based on entering zipcode 
	
	#	@R2_Web @R2_All @R2_Order @CR-SK @AutomationSanityR2
	#Scenario Outline: TC_23- Verify if authenticated user is able to place an order for single SKU product 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user creates an account
	#	And User searches a product "productName" and navigates to PDP 
	#	And user click on Add to Cart Button 
	#	And user is navigated to Add to cart Notification popup 
	#	When user click on checkout button 
	#	And user adds shipment address on checkout page for "newly registered" user
	#	And user selects shipment method on check out page for "newly registered" user
	#	And user add "<Payment Type>" details in payment method for "newly registered" user
	#	And user clicks on place order on checkout page 
	#	Then verify user is able to successfully place the order 
	#	Then Verify the message on the page 
	#		|# Message for successful order is displayed		|
	#		|THANKS FOR SUBMITTING YOUR ORDER					|
	#	Examples: 
	#		|Payment Type	|
	#		|PayPal			|
	#	
	#	@R2_Web @R2_All @R2_Order  @AutomationSanityR2
	#@CR-SK 
	#Scenario Outline:  TC_24-Verify if unauthenticated user is able to place an order for single SKU product 
	#	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When User searches a product "productName" and navigates to PDP 
	#	And user click on Add to Cart Button 
	#	And user is navigated to Add to cart Notification popup 
	#	And user click on checkout button 
	#	And user adds shipment address on checkout page for "guest" user
	#	And user selects shipment method on check out page for "guest" user
	#	And user add "<Payment Type>" details in payment method for "guest" user
	#	And user clicks on place order on checkout page 
	#	Then verify user is able to successfully place the order 
	#	And Verify the message on the page 
	#		|# Message for successful order is displayed		|
	#		|THANKS FOR SUBMITTING YOUR ORDER					|
	#	Examples: 
	#		|Payment Type	|
	#		|PayPal			|
	#		
	
@R2_WAST-23 @BrokenLink @Broken @TC_BL_06 
Scenario: TC_25- Verify all broken URL's on Cart page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	Then verfy all link url's status code is 200 
	
@R2_WAST-24 @BrokenLink @Broken @TC_BL_07 
Scenario: TC_26- Verify all broken URL's on Checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	Then user click on Add to Cart Button 
	And user click on view cart button 
	When user click on checkout button in Cart page 
	Then user is navigated to checkout page 
	Then verfy all link url's status code is 200 
	
@R2_WAST-25 @BrokenLink @Broken @TC_BL_08 
Scenario: TC_27- Verify all broken URL's on MyAccount page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	Then verfy all link url's status code is 200 
	
@R2_WAST-26 @BrokenLink @Broken @TC_BIM_06 
Scenario: TC_28- Verify all broken Images on Cart page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	Then verfy all Image link urls status code is 200 
	
@R2_WAST-27 @BrokenLink @Broken @TC_BIM_07 
Scenario: TC_29- Verify all broken Images on Checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	Then user click on Add to Cart Button 
	And user click on view cart button 
	When user click on checkout button in Cart page 
	Then user is navigated to checkout page 
	Then verfy all Image link urls status code is 200 
	
@R2_WAST-28 @BrokenLink @Broken @TC_BIM_08 
Scenario: TC_30- Verify all broken Images on MyAccount page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	Then verfy all Image link urls status code is 200 