Feature: [UI]- To Verify the Footer Email link functionality

@C-BOPIS @R2_Web  @R2_All @P-Highest  @1HR_R2 @C-NonOrder @CC-Checkout_Order   @KER-2865 @ZYP_CHECKOUT_K2865-9977 @CR-RK 
Scenario: Verify the user is able to view the 'Change Location' under In-store Pick Up on Checkout
    Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user logs in as "Cart_BopisEmail" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user click on change location button on cart
	
@C-BOPIS @R2_Web  @R2_All @P-Highest  @1HR_R2 @C-NonOrder @CC-Checkout_Order   @KER-2865 @ZYP_CHECKOUT_K2865-9978 @CR-RK 
Scenario: Verify the user is able to view the 'Change Location' in Cart Order Summary
    Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user logs in as "Cart_BopisEmail" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	
	@C-BOPIS @R2_Web  @R2_All @P-Low @C-NonOrder @CC-MyAccount_Order   @KER-2865 @ZYP_MYACCOUNT_K2865-9979 @CR-MS @C1-MessageB
Scenario: 
	Verify that Authenticated user is able to view order details for BOPIS orders
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "BOPIS_Regular_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user click on find the store button on cart
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 