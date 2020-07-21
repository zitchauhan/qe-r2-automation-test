Feature: PayPal on Cart: Display Accurate Shipping and Tax on Order Review After Arriving from PayPal 

@CR-SK1 @P1 @P1Temp 

Scenario: Place order using Paypal express
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productNameSTH" and navigates to PDP
	And User gets a product name for "productNameSTH"
	And user click on ship it button 
	And user will click on View Cart button 
    When user navigate to Cart page 
    Then Verify paypal button on Cart Page 
	Then User click on paypal button on cart page
	#Then user switch to iframe and enter the paypal login "PayPalEmail1" "PaypalPassword1" 
	And user enter the paypal login "PayPalEmail1" "PayPalPassword" and click on Continue button
	And User clicks on the minicart icon and navigated to minicart 
	Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    And User clicks on the minicart icon and navigated to minicart 
    And user should be able to validate the cart merge*/
   
    

@ES197 @CR-SK1 @P1 @P1Temp @Regression @RegressionP1
Scenario: Verify Cart merge
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productNameSTH" and navigates to PDP
	And User gets a product name for "productNameSTH"
	And user click on ship it button 
	And user will click on View Cart button 
    When user navigate to Cart page 
  	And User clicks on the minicart icon and navigated to minicart 
	Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    And User clicks on the minicart icon and navigated to minicart 
    And user should be able to validate the cart merge
    Then remove the product added from cart 