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
    And user should be able to validate the cart merge
   
    

@ES197 @CR-SK1 @P1 @P1Temp @Regression @RegressionP1
Scenario: Verify Cart merge 
  Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productNameSTH" and navigates to PDP
	And User gets a product name for "productNameSTH"
	And user click on ship it button
	And user click on viewcart button
  Then user navigates to Cart Page 
  And User clicks on the minicart icon and navigated to minicart 
	Then user should able to click on Signin button
  And user should be able to enter the signin details "Login_username" "Login_pwd"
  And User clicks on the minicart icon and navigated to minicart 
  And user should be able to validate the cart merge
  Then remove the product added from cart 
  
  
  
  
    
@RegressionP2 @abc
Scenario: Verify cart merge happens when user signs in
Given user launches the browser and navigates to "ASO_HOME" page
When User searches a product "productNameSTH" and navigates to PDP
And User gets a product name for "productNameSTH"
And user click on ship it button
And user click on viewcart button
Then user navigates to Cart Page
And User clicks on the minicart icon and navigated to minicart
Then user should able to click on Signin button
And user should be able to enter the signin details "Login_username" "Login_pwd"
And User clicks on the minicart icon and navigated to minicart
And user should be able to validate the cart merge
Then User should be able to click on Find Store 
And Find Store Modal should pop-up 
When User select store with "BOPIS_Store2" 
When user enters "SOFSKUNumber" in the searchbox
And User gets a product name for "SOFSKUNumber" 
Then user click on pickup button
And user click on view cart
And user should be able to validate the cart merge

#When User searches a product "SOFSKUNumber" and navigates to PDP
#And User gets a product name for "SOFSKUNumber"
#And user click on ship it button
#And user click on viewcart button
#Then user navigates to Cart Page
#And User clicks on the minicart icon and navigated to minicart
#And user should be able to validate the cart merge
  