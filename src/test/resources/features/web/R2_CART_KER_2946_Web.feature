Feature: Verify accepted Payment Display in Cart

@R2_Web @R2_Regression  @KER-2946 @ZYP_CART_K2946-7993 @CR-RKA 
Scenario: Verify if unauthenticated user can view Accepted Payment Methods
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button 
    And user click on view cart button  
    Then Verify below Sub/Main Module of Cart Page 
	    |# user should see all payment icons on cart page|
		|Visa_img|
		|MasterCard_img|
		|Paypal_img|
		|GooglePay_img|
		|ApplePay_img|
		|AmericanExpress_img|
		|Discover_img|
		
		
		
@R2_Web @R2_Regression  @KER-2946 @ZYP_CART_K2946-7994 @CR-RKA 
Scenario: Verify if unauthenticated user can view Accepted Payment Methods
        Given user launches the browser and navigates to "ASO_HOME" page 
		Then user able to signin 
		When user clicks on one of the category and navigates to LOne
        Then user clicks on one of the subcategory and navigates to LTwo
        And user is able to see the product category name in section title
        Then user clicks on one of the product category and navigates to LThree
    	Then User is navigated to pdp page
	    Then user click on Add to Cart Button 
        And user click on view cart button  
       Then Verify below Sub/Main Module of Cart Page 
	    |# user should see all payment icons on cart page|
		|Visa_img|
		|MasterCard_img|
		|Paypal_img|
		|GooglePay_img|
		|ApplePay_img|
		|AmericanExpress_img|
		|Discover_img|
		
	