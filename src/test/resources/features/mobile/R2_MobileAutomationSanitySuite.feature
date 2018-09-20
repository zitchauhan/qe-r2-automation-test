Feature: Mobile Automation Sanity Test Cases Mimicing manual Scenarios 

@R2_Mobile @R2_WAST-01 @P-High @C-MyAccount @KER-4011 
@ZYP_MYACCOUNT_K4011-10040 @CR-SK @AutomationSanityR2 
Scenario: TC_1- Verify Login Logout  
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "SanityEmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user should get logged in successfully 
	When user clicks on signout link in myaccount list 
	And user clicks on the burger menu 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
		
		#@R2_Mobile @R2_MAST-02 @P-High @C-MyAccount @KER-4011
		#@ZYP_MYACCOUNT_K4011-10301_M @CR-SK @AutomationSanityR2 
		#Scenario: TC_2-Verify user can do the logout using Flyout from My Account header 
		#	Given user launches the browser and navigates to "ASO_HOME" page 
		#	And User clicks on the burger menu 
		#	When user clicks on sign in link from burger menu 
		#	And user logs in as "RawUser" 
		#	When user sign out from the website 
		#	Then Sign in page should open 
		#	When user logs in as "RawUser" 
		#	And user clicks on one of the category and navigates to LOne 
		#	And user clicks on one of the subcategory and navigates to LTwo  
		#	And user clicks on one of the product category and navigates to LThree 
		#	And user sign out from the website 
		#	Then User is navigated to pdp page 
		
@R2_Mobile @R2_MAST-03 @P-Highest @C-MyAccount @KER-4249 
@ZYP_MYACCOUNT_K4249-10149_M @CR-SK @AutomationSanityR2 
Scenario: TC_3- Verify User is able to create an account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on sign in link from burger menu 
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
		
		
@R2_Mobile @R2_MAST-04 @P-High @C-MyAccount @KER-3093 @ZYP_CART_K3093-10418_M 
@CR-SK @AutomationSanityR2 
Scenario: TC_4- Verify User is able to Add Gift Card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	#And user clicks on payment tab 
	And User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And User has empty wallet with no Gift Card added 
	When user clicks on Add New Gift Card button 
	And user enter valid "Valid16DigitGiftCardNumber" in Gift Card Number text field 
	And user enter valid "Valid8DigitGiftCardPIN" in Gift Card PIN text field 
	And clicks on Add button to add gift card 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments > Add New Gift card section	|
		|AddGiftCardPage_Add_txt										|
	Then user should be able to see "Valid16DigitGiftCardNumber" Gift card 
	And user should be able to see available balance 
	And there should be a Remove link with cross icon 
	
	
@R2_Mobile @R2_WAST-05 @P-High @C-MyAccount @KER-2919 @ZYP_CART_K2919-10696
@CR-DPK @AutomationSanityR2 
Scenario: TC_5-Verify Add Credit Card and added as a Default Card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	When user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "CreditCardNumber" 
	And User enters expiration date "ExpDate" 
	And User enters CVV number "CVV" 
	Then user enter First Name field "UpdateFirstName" 
	And user enter Last Name field "UpdateLastName" 
	And user enter Address field "UpdateAddress" 
	And user enter ZipCode field "UpdateZipcode" 
	And user enter PhoneNumber field "UpdatePhoneNumber" 
	Then User verifies that city and State are populated automatically 
	Then click on Add button on credit card page 
	And click on Add another Credit Card button 
	And User enters Credit Card number "SecondCreditCardNumber" 
	And User enters expiration date "ExpDate" 
	And User enters CVV number "CVV" 
	Then user enter First Name field "UpdateFirstName" 
	And user enter Last Name field "UpdateLastName" 
	And user enter Address field "UpdateAddress" 
	And user enter ZipCode field "UpdateZipcode" 
	And user enter PhoneNumber field "UpdatePhoneNumber" 
	Then User verifies that city and State are populated automatically 
	Then click on Add button on credit card page 
	And User clicks on ASO Logo and should be navigated to Home Page 
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
	Then User verifies that in Payment section credit card "CreditCardNumber" is pre-populated by default 
	
	
	#===========unit testing pending as search is not working
@R2_Mobile @R2_MAST-06 @P-High @CR-SK @AutomationSanityR2 
Scenario: TC_6-Verify and Search an item and  navigate to  View Cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User should be able to see Search Box on Homepage 
	When User searches a product "productName" and navigates to PDP 
	#	And User click on search icon 
	And user verifies the entered SKU id 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	Then user navigate to Cart page 
	
	
	
	#===========unit testing pending as search is not working
@R2_Mobile @R2_MAST-07 @P-High @CR-SK @AutomationSanityR2 
Scenario: TC_7-Verify and Search - Checkout from ATC Modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	When user click on checkout button 
	Then user is navigated to checkout page 
	
@R2_Mobile @R2_MAST-08 @CR-SK @AutomationSanityR2 
Scenario: TC_8-Verify Cat Nav - View Cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	Then user navigate to Cart page 
	
	
@R2_Mobile @R2_MAST-09 @CR-SK @AutomationSanityR2 
Scenario: TC_9-Verify Cat Nav - Checkout from ATC Modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	When user click on checkout button 
	Then user is navigated to checkout page 
	
	
	
@R2_Mobile @R2_MAST-10 @P-High @C-Cart @KER-3166 @ZYP_K3166-9604_M @CR-DP 
@AutomationSanityR2 
Scenario: TC_10-Verify Apply Promotion
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	Then user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "SanityOrderLevelQuantity" to X 
	Then verify Promo code discount is applied 
	
@R2_Mobile @R2_MAST-11 @P-Highest @C-Cart @KER-3127 @ZYP_K3127-8166_M @CR-AKK 
@AutomationSanityR2 
Scenario: TC_11- Verify Apply Promotion / Remove Promotion
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "SanityEnterQuantityGreaterThenOne" to X 
	And user view and Applied Promotions/Discounts "SanityItemLevelPromoCodeDiscount" 
	Then Verify below Sub/Main Module of Cart Page 
		|# verify the following element in checkout order summary page|
		|RemoveFromCart_Btn| 
	And User clicks on Remove Promo code link 
	Then Promo code is Removed 
	
@R2_Mobile @R2_MAST-12 @P-Highest @C-Cart @KER-2942 @ZYP_K2942-8044_M @CR-AKK 
@AutomationSanityR2 
Scenario: TC_12-Verify Update Quantity 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
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
	
@R2_Mobile @R2_MAST-13 @P-Highest @C-Cart @KER-2939 @ZYP-K2939_9615_M @CR-AKK 
@AutomationSanityR2 
Scenario: 
	TC_13-To Verify Image for selected SKU is be displayed on product blade for multi-variant product 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button 
	And user will click on View Cart button 
	When user navigate to Cart page 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "|
		|CartProductName_Link   |
	Then User is able to see the selected variant image as thumbnail 
	
@R2_Mobile @R2_MAST-14 @P-Highest @C-Cart @KER-2942 @ZYP_K2942-8047_M @CR-DP 
@AutomationSanityR2 
Scenario: TC_14-Verify Remove Item from Cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And User navigates to LThree 
	Then user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And verify the Remove Quantity link 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "|
		|RemoveFromCart_Btn|
		
@R2_Mobile @R2_MAST-15 @P-Highest @C-Cart @KER-3127 @ZYP_K3127-8168_M @CR-AKK 
@AutomationSanityR2 
Scenario: TC_15-Verify User Able to Checkout, if no errors in cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	When user click on Add to Cart Button 
	When user click on view cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart item details "| 
		|checkOut_OrderSummary_btn|
	And user click on checkout button in Cart page 
	
@R2_Mobile @R2_MAST-16 @P-Highest @C-Checkout @KER-2934 
@ZYP_CHECKOUT_K2934-8177_M @CR-DPK @AutomationSanityR2 
Scenario: 
	TC_16-Verify Add Shipping Address
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And User navigates to LThree 
	Then user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	Then user navigate to Cart page 
	And selects Add a New Shipping Address in address drop-down in shipping address drawer 
	Then user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	
	
	
@R2_Mobile @R2_MAST-17 @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6821-8629_M 
@CR-DPK @AutomationSanityR2 
Scenario: TC_17-Verify Payment - Add Gift Card - Unathenticated 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And User navigates to LThree 
	Then user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user click on checkout button in Cart page 
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page 
	Then user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "GiftcardNumber" 
	And user enter Pin Number "PinNumber" 
	And user click on Apply button 
	Then verify Gift Card in order summary page 
	
@R2_Mobile @R2_MAST-18 @P-High @C-Checkout @KER-6822 @ZYP_CHECKOUT_K6822-7954_M 
@CR-GK @AutomationSanityR2 
Scenario: TC_18-Verify Payment - Add Gift Card - Athenticated 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And User navigates to LThree 
	Then user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user click on checkout button in Cart page 
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page 
	Then user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "GiftcardNumber" 
	And user enter Pin Number "PinNumber" 
	And user click on Apply button 
	Then applied gift card "GiftcardNumber" should be displayed 
	Then gift card balance is applied towards the purchase 
	
	
@R2_Mobile @R2_MAST-19 @P-High @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8147_M 
@CR-RK 
@AutomationSanityR2 
Scenario: TC_19-Verify Sign In During Checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And User navigates to LThree 
	Then user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
	When user click on SignIn link 
	And user enter the valid emailaddress "EmailAddress" from checkout page 
	And user enter the valid password "Password" from checkout page 
	And user click on signin button 
	Then user should get logged in successfully 
	
@R2_Mobile @R2_MAST-20 @P-Highest @C-Checkout @KER-2926 
@ZYP_CHECKOUT_K2926-8100_M @CR-AKK 
@AutomationSanityR2 
Scenario: TC_20- Verify Edit cart items from Order summary 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
	And user cilck on expand icon in order summary checkout page 
	When user clicks on Edit My cart in Order Summary 
	Then user should navigates to the CartPage "CartTitle" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|CartPage|
		
@R2_Mobile @R2_MAST-21 @P-Low @C-Checkout @KER-2926 @ZYP_CHECKOUT_K2926-8098_M 
@CR-AKK 
@AutomationSanityR2 
Scenario: TC_21-Verify Order Summary 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user will click on Checkout button and navigates to Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout page "Order Summary"|
		|Subtotal_txt|
		|Estimatedshippint_txt|
		|EstimatedTax_Txt |
		
		
@R2_Mobile @R2_MAST-22 @P-Highest @C-Cart @KER-2872 @ZYP_CART_K2872-8710_M 
@CR-DPK 
@AutomationSanityR2 
Scenario: 
	TC_22-Verify Find a store 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then User should be able to click on Find Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user verify the results based on entering zipcode 
	
	
@R2_MAST-23 @BrokenLink @Broken @TC_BL_09 
Scenario: TC_23- Verify all broken URL's on Cart page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	Then verfy all link url's status code is 200 
	
@R2_MAST-24 @BrokenLink @Broken @TC_BL_10 
Scenario: TC_24- Verify all broken URL's on Checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When user click on checkout button in Cart page 
	Then user is navigated to checkout page 
	Then verfy all link url's status code is 200 
	
@R2_MAST-25 @BrokenLink @Broken @TC_BL_11 
Scenario: TC_25- Verify all broken URL's on MyAccount page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	Then verfy all link url's status code is 200 
	
	
@R2_MAST-26 @BrokenLink @Broken @TC_BIM_09 
Scenario: TC_26- Verify all broken URL's on Cart page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	Then verfy all Image link urls status code is 200 
	
@R2_MAST-27 @BrokenLink @Broken @TC_BIM_10 
Scenario: TC_27- Verify all broken URL's on Checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When user click on checkout button in Cart page 
	Then user is navigated to checkout page 
	Then verfy all Image link urls status code is 200 
	
@R2_MAST-28 @BrokenLink @Broken @TC_BIM_11 
Scenario: TC_28- Verify all broken URL's on MyAccount page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	Then verfy all Image link urls status code is 200 
	
	
	
	
