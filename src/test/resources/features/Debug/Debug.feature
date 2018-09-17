Feature: Debug Testing

  #@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-8124 @ZYP_CART_K2927-8124 @CR-SK
  #Scenario: To Verify Available Taxes and Tax is > $0.00 - Authenticated User
    #Given user launches the browser and navigates to "ASO_HOME" page
    #And User clicks on the burger menu
    #Then user should able to click on Signin button
    #And user enter the valid emailaddress "EmailAddress"
    #And user enter the valid password "Password"
    #And user click on signin button
    #And User clicks on the burger menu
    #When User searches a product "productName" and navigates to PDP
    #And user click on Add to Cart Button
    #Then user click on checkout from ATC pop up
    #Then user click on edit Payment link and click on billing information
    #Then user click on checkbox Same as shipping address
    #Then Verify below Sub/Main Module of Checkout Page
      #| #verify shipping address is displying |
      #| SameAsShippingAddress_Txt             |

      
 #@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-8124 @ZYP_CART_K2927-8124 @CR-SK
  #Scenario: To Verify Available Taxes and Tax is > $0.00 - Authenticated User     
 #	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User clicks on the burger menu
#	And user clicks on SignIn link from global header
#	And user enter the valid emailaddress "EmailAddressForZeroProductsInCart" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	And User clicks on the burger menu 
#	And User navigates to LThree 
#	And user clicks on the product card and navigates to PDP 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
	
 #@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-8124 @ZYP_CART_K2927-8124 @CR-SK	
#		Scenario: To view price of each item in cart
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on one of the category and navigates to LOne
  #Then user clicks on one of the subcategory and navigates to LTwo
  #Then user clicks on one of the product category and navigates to LThree
#	Then User is navigated to pdp page
#	Then user click on Add to Cart Button
#	Then user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button
#	Then User clicks on ASO Logo and should be navigated to Home Page
#	And User navigates to LThree 
#	Then user clicks on the product card and navigates to PDP
#	Then user click on Add to Cart Button
#	Then user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button
#	And user navigate to Cart page 
#	Then verify price of each item in the cart
#	And verify the price format each item is $XX.XX 
#	When User searches a product "productName" and navigates to PDP



@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-7953 @CR-GK 
Scenario: Verify Gift card fields displayed - No Previous Gift Cards Saved 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User Naviates L2 form Homepage Header 
	And User clicks on product in PLP
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%%%%  Gift Card form in payment drawer%%%%%%%%%%|
		|GiftCardNumber_Input|
		|Pin_Input|
		|Apply_Btn|