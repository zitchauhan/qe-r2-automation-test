Feature: Verify accepted Payment Display in Cart

@R2_Web @R2_Regression  @C-Cart @1HR_R2 @KER-2946 @ZYP_CART_K2946-7993 @CR-RKA @1HR_R2
Scenario: Verify if unauthenticated user can view Accepted Payment Methods
    Given user launches the browser and navigates to "ASO_HOME" page 
    When User Navigates L2 form Homepage Header 
	And User clicks on product in PLP 
	#	And user click on Add to Cart Button
	And user click on ship it button 
    And user click on view cart button  
    Then Verify below Sub/Main Module of Cart Page 
	    |# user should see all payment icons on cart page|
		|Visa_img|
		|MasterCard_img|
		|Paypal_img|
#		|ApplePay_img|
		|AmericanExpress_img|
		|Discover_img|
		
		
		
@R2_Web @R2_Regression @C-Cart @1HR_R2 @KER-2946 @ZYP_CART_K2946-7994 @CR-RKA
Scenario: Verify if authenticated user can view Accepted Payment Methods
   Given user launches the browser and navigates to "ASO_HOME" page
    When user should able to click on Signin button 
		And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password"
		And user click on signin button 
       When User Navigates L2 form Homepage Header 
	   And User clicks on product in PLP 
	    #	And user click on Add to Cart Button
	And user click on ship it button
        And user click on view cart button  
       Then Verify below Sub/Main Module of Cart Page 
	    |# user should see all payment icons on cart page|
		|Visa_img|
		|MasterCard_img|
		|Paypal_img|
#		|ApplePay_img|
		|AmericanExpress_img|
		|Discover_img|
		
	