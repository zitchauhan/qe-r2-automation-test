Feature: Display Favorite Store Header- Authenticated User


@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-3140 @ZYP_CART_K3140-8696 @CR-SK 
Scenario: Verify the user is able to see their favorite store in ASO site home page
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user logs in as "UserWithZeroProductsInCart"
	And user sets up a store for "FindStoreZipcode"
	And user sign out from the website
	When user clicks on SignIn link from global header
	And user logs in as "UserWithZeroProductsInCart"
	Then Authenticated user should see the Favorite store "FindStoreZipcodeNearestStore" details in home page
	