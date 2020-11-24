Feature: PayPal on Cart: Display Accurate Shipping and Tax on Order Review After Arriving from PayPal 
 
@ES197 @CR-SK1 @P1 @P1Temp @Regression @RegressionP1 @TC-OMNI-13450
Scenario: Verify Cart merge 
  Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productNameSTH" and navigates to PDP
	And User gets a product name for "productNameSTH"
	And user click on ship it button
	And user click on viewcart button
  Then user navigates to Cart Page 
	Then user should able to click on Signin button
  And user should be able to enter the signin details "UserForCartMerge" "Password"
  And User clicks on the minicart icon and navigated to minicart 
  And user should be able to validate the cart merge
  Then user will empty the cart if product is in cart
  
  
  
  
    
@RegressionP2 @TC-OMNI-13451
Scenario: Verify cart merge happens when user signs in
Given user launches the browser and navigates to "ASO_HOME" page
When User searches a product "productNameSTH" and navigates to PDP
And User gets a product name for "productNameSTH"
And user click on ship it button
And user click on viewcart button
Then user navigates to Cart Page
Then user should able to click on Signin button
And user enter the valid emailaddress "UserForCartMerge" 
And user enter the valid password "Password" 
And user click on signin button
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
Then user will empty the cart if product is in cart
  