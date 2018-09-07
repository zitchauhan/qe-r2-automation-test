Feature: Web Automation Sanity Test Cases Mimicing manual Scenarios 

@R2_Web @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10040 @CR-SK
@AutomationSanityR2 
Scenario:
TC_1- Verify the user is able to sign in successfully with valid credentials 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user should get logged in successfully 
	And a greeting message should be displayed 
	
	
@R2_Web @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10301 @CR-SK
@AutomationSanityR2 
Scenario:
TC_2- Verify user can do the logout using Flyout from My Account header 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	When user sign out from the website 
	Then Sign in page should open 
	When user logs in as "RawUser" 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And user sign out from the website 
	Then User is navigated to pdp page 
	
	
@R2_Web @P-Highest @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10149 @CR-SK
@AutomationSanityR2 
Scenario: TC_3- Verify user is able to create an account with all valid data 
       Given user launches the browser and navigates to "ASO_HOME" page 
       When user clicks on SignIn link from global header 
       And clicks on SignUp link from SignIn page 
       And user enter first "FirstName" 
       And user enter last "LastName" 
       And user enter random email Address
       And user enter password "Password"
       Then user should see password masked 
       When clicks on Sign Up Button
       Then user should be able to sign up successfully
       And Verify the message on the page
           |# Following Message should show on the page|
           |CONGRATULATIONS                                                |
           |You have successfully registered with Academy.com|
           |LET'S SHOP                                                            |
       And user should be able to view My Account in global header

	
	
@R2_Web @P-High @C-My_Account @KER-3093 @ZYP_CART_K3093-10418 @CR-SK
@AutomationSanityR2 
Scenario: TC_5-Verify that user is able to add a new gift card in My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	And user clicks on payment tab 
	And User has empty wallet with no Gift Card added 
	When user clicks on Add New Gift Card button 
	And user enter valid "Valid16DigitGiftCardNumber" in Gift Card Number text field 
	And user enter valid "Valid8DigitGiftCardPIN" in Gift Card PIN text field 
	And clicks on Add button to add gift card 
		|#Verify following elements in Payments > Add New Gift card section	|
		|AddGiftCardPage_Add_txt										|
	Then user should be able to see "Valid16DigitGiftCardNumber" Gift card 
	And user should be able to see available balance 
	And there should be a Remove link with cross icon 
	
	@R2_Web  @P-High @C-MyAccount @KER-2919 @ZYP_CART_K2919-10696 @CR-DPK @AutomationSanityR2
Scenario: TC_7-Verify that the first added Credit Card becomes the Default Credit Card for payment.
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	And User enters Credit Card number "CreditCard"
 	And User enters expiration date "ExpirationDate"
 	And User enters CVV number "CVV"
 	Then user enter First Name field "UpdateFirstName"
 	And user enter Last Name field "UpdateLastName"
 	And user enter Address field "UpdateAddress"
 	And user enter ZipCode field "UpdateZipcode"
 	And user enter PhoneNumber field "UpdatePhoneNumber"
 	Then User verifies that city and State are populated automatically
 	Then click on Add button
 	And click on Add another Credit Card button
 	And User enters Credit Card number "SecondCreditCard"
 	And User enters expiration date "SecondExpirationDate"
 	And User enters CVV number "SecondCVV"
 	Then user enter First Name field "UpdateFirstName"
 	And user enter Last Name field "UpdateLastName"
 	And user enter Address field "UpdateAddress"
 	And user enter ZipCode field "UpdateZipcode"
 	And user enter PhoneNumber field "UpdatePhoneNumber"
 	Then User verifies that city and State are populated automatically
	Then click on Add button
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo
	And user is able to see the product category name in section title
	And user clicks on one of the product category and navigates to LThree
	And User is navigated to pdp page
	And user click on Add to Cart Button
	And user is navigated to Add to cart Notification popup  
	And user will click on View Cart button 
	And user navigate to Cart page
	And user will click on Checkout button and navigates to Checkout page
	Then User verifies that in Payment section CCone credit card is pre-populated by default.
	
	#===========unit testing pending as search is not working
@R2_Web  @P-High @CR-SK @AutomationSanityR2 
Scenario: TC_8-Search an item and  navigate to  View Cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User should be able to see Search Box on Homepage 
	When User enter the SKU search "SKUNumber" 
	And User click on search icon 
	And user verifies the entered SKU id 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then user navigate to Cart page 
	
	#===========unit testing pending as search is not working
@R2_Web   @P-High @CR-SK @AutomationSanityR2 
Scenario: TC_9-Search an item and  navigate to  checkout page from ATC modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User should be able to see Search Box on Homepage 
	When User enter the SKU search "SKUNumber" 
	And User click on search icon 
	And user verifies the entered SKU id 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	Then user is navigated to checkout page 
	
	
@R2_Web @AutomationSanityR2 @CR-SK 
Scenario: TC_10-Cat Nav - View Cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then user navigate to Cart page 
	
	
@R2_Web @AutomationSanityR2 @CR-SK 
Scenario: TC_11-Cat Nav - Checkout from ATC Modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	Then user is navigated to checkout page 
	
	
@R2_Web @P-High @C-Checkout @KER-3166 @ZYP_CART_K3166-9604 @CR-DPK
@AutomationSanityR2 
Scenario:
TC_12-Verify promotion got applied for order level when user applied %off promotion on order -- Implicit promotion 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "OrderLevelQuantity" to X 
	Then verify Promo code discount is applied
		
@R2_Web @P-Highest @C-Cart @KER-3127 @ZYP_CART_K3127-8166 @CR-AKK
@AutomationSanityR2 
Scenario:
TC_13- Verify if user should be able to apply or remove a promotion code 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And user view and Applied Promotions/Discounts "ItemLevelPromoCodeDiscount" 
	Then discount value applied against the individual line item 
	Then user is displayed Promo code XXXXX applied 
	Then Verify below Sub/Main Module of Cart Page 
	And customer must see the associated discount as -$XX.XX (total order discount) at Order Summary in Cart 
	And total price must be updated to reflect discount 
	And User clicks on Remove Promo code link 
	Then Promo code is Removed 
	And associated discount should get remove 
	Then total price must be updated with reflect amount 
	
@R2_Web @P-Highest @C-Cart @KER-2942 @ZYP_CART_K2942-8044 @CR-DPK
@AutomationSanityR2 
Scenario: TC_14-Verify add quantity adjustment in the Cart Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user view the items in order summary details (Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes) 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And modified quantity should get updated 
	Then Order Summary should get recalculated 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page"Order Summary"|
		|SubTotal_txt|
	And user should be able to see the increased quantity and Price in Cart Order summary 
	
@R2_Web @P-Highest @C-Cart @KER-2939 @ZYP_CART_K2939-9615 @CR-AKK
@AutomationSanityR2 
Scenario:
TC_15-To Verify Image for selected SKU is be displayed on product blade for multi-variant product 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	When user navigate to Cart page 
	Then User is able to see the selected variant image as thumbnail     
	
	
@R2_Web @P-Highest @C-Cart @KER-2942 @ZYP_CART_K2942-8047 @CR-DPK
@AutomationSanityR2 
Scenario: TC_16-Verify Remove link in the Cart Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then verify the Remove Quantity link 
	
	
@R2_Web @P-Highest @C-Cart @KER-3127 @ZYP_CART_K3127-8168 @CR-RK
@AutomationSanityR2 
Scenario: TC_17-Verify if user should be able to checkout if there are no errors 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	When user click on view cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify below Sub/Main Module of Cart Page "|
		|checkOutYourCart_Btn|
	And user click on checkout button in Cart page 	
		
@R2_Web  @P-Highest @C-Checkout @KER-2934 @ZYP_CHECKOUT_K2934-8177 @CR-DPK @AutomationSanityR2 
Scenario: TC_18-Verify As an unauthenticated user should be presented with the un-populated shipping address form fields 
 	Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Mens clothing
   Then user clicks on one of the subcategory and navigates to LTwo
   And user is able to see the product category name in section title
   Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user navigate to Cart page
	And selects Add a New Shipping Address in address drop-down in shipping address drawer 
	Then user click on checkout button in Cart page
	|# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingAddress_FirstName_txt						|
		|checkout_ShippingAddress_LastName_txt						|
		|checkout_ShippingAddress_PhoneNumber_txt					|
		|checkout_ShippingAddress_Address_txt						|
		|checkout_ShippingAddress_ZipCode_txt						|
		|checkout_ShippingAddress_City_txt							|
		|checkout_ShippingAddress_Edit_lnk							|
		|checkOut_ShippingAddress_GoToShippingMethod_btn			|
		|checkOut_ShippingAddress_AddNewShippingAddress_btn         |
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page	
		
		
@R2_Web @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6821-8629 @CR-DPK
@AutomationSanityR2 
Scenario: TC_20-Verify Gift Card applied is reflected on Order summary 
	Given user launches the browser and navigates to "ASO_HOME" page  
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup  
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
	
@R2_Web @P-High @C-Checkout @KER-6822 @ZYP_CHECKOUT_K6822-7954 @CR-GK
@AutomationSanityR2 
Scenario: TC_21-Verify Valid gift card is applied for purchases 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	Then user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "GiftcardNumber" 
	And user enter Pin Number "PinNumber" 
	And user click on Apply button 
	Then applied gift card "GiftcardNumber" should be displayed 
	Then gift card balance is applied towards the purchase 
	
	
@R2_Web @P-High @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8147 @CR-RK
@AutomationSanityR2 
Scenario: TC_22-Verify is user can Sign-In for faster checkout experience 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on Checkout button 
	When user click on SignIn link 
	And user enter the valid "emailaddress" 
	And user enter create password 
	And user click on signin button 
	Then user should get logged in successfully 
	
@R2_Web @P-Highest @C-Checkout @KER-2926 @ZYP_CHECKOUT_K2926-8100 @CR-AKK
@AutomationSanityR2 
Scenario: TC_23-To Edit cart items from Order summary 
	  Given user launches the browser and navigates to "ASO_HOME" page  
		And User navigates to L2 Mens clothing
	    And user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    And user clicks on one of the product category and navigates to LThree
		And User is navigated to pdp page
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		And user will click on Checkout button and navigates to Checkout page
		When user clicks on Edit My cart in Order Summary
		Then Verify below Sub/Main Module of Checkout Page 
	    |EditMyCart_Link|
        Then user should navigates to the CartPage "CartTitle"
	
@R2_Web @P-Low @C-Checkout @KER-2926 @ZYP_CHECKOUT_K2926-8098 @CR-AKK
@AutomationSanityR2 
Scenario: TC_24-To view the Order Summary details on the Check out 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user will click on Checkout button and navigates to Checkout page 
	Then verify the presence of the following in the Order Summary 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page"Order Summary"|
		|EstimatedShipping_txt|
		
		
@R2_Web @P-Highest @C-Cart @KER-2872 @ZYP_CART_K2872-8710 @CR-DPK
@AutomationSanityR2 
Scenario:
TC_25-Verify that the user should be able to search the store details by entering ZIP code 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user verify the results based on entering zipcode
	
	
	
	
