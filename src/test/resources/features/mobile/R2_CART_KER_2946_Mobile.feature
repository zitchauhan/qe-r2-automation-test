Feature: [Mobile]Verify Automatic Store Locator for Unauthenticated User 

	@R2_Mobile @R2_Regression  @KER-2946 @ZYP_CART_K2946-7993 @CR-RKA 
	Scenario:  Verify if unauthenticated user can view Accepted Payment Methods[For Guest User] 
	Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to LThree
    Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button  
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
	    |# user should see all payment icons on cart page|
		|Visa_img|
		|MasterCard_img|
		|Paypal_img|
		|GooglePay_img|
		|ApplePay_img|
		|AmericanExpress_img|
		|Discover_img|
	
	
	
	@R2_Mobile @R2_Regression  @KER-2946 @ZYP_CART_K2946-7994 @CR-RKA 
    Scenario:  Verify if Authenticated user can view Accepted Payment Methods[For Existing User]
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user able to signin 
    Then User clicks on the burger menu
    And User navigates to LThree
    Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button  
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
	    |# user should see all payment icons on cart page|
		|Visa_img|
		|MasterCard_img|
		|Paypal_img|
		|GooglePay_img|
		|ApplePay_img|
		|AmericanExpress_img|
		|Discover_img|