Feature: Verify accepted Payment Display in Cart

@R2_Web @R2_Regression  @P-Highest @1HR_R2 @KER-2946 @ZYP_CART_K2946-7993 @CR-RKA @1HR_R2
Scenario: Verify if unauthenticated user can view Accepted Payment Methods
    Given user launches the browser and navigates to "ASO_HOME" page 
    And User navigates to L2 Mens clothing
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
		|ApplePay_img|
		|AmericanExpress_img|
		|Discover_img|
		
		
		
@R2_Web @R2_Regression @P-Highest @1HR_R2 @KER-2946 @ZYP_CART_K2946-7994 @CR-RKA
Scenario: Verify if unauthenticated user can view Accepted Payment Methods
        Given user launches the browser and navigates to "ASO_HOME" page
        When user clicks on SignIn link from global header 
		Then user able to signin 
		And User navigates to L2 Mens clothing
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
		|ApplePay_img|
		|AmericanExpress_img|
		|Discover_img|
		
	