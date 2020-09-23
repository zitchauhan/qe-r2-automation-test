Feature: Regression P2 scenarios

	@RegressionP2
	Scenario: Validate navigation to Hot Deals page
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithDefaultAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on Deals menu
	Then user click on Hot Deals menu and navigate to Hot Deals page
	And Shop By Category section is displayed
	And user should be able to see the listed products
	
	@RegressionP2 @qwer
	Scenario: Verify the functionality of 'See All >' button
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithDefaultAddress"
	And user enter the valid password "Password"
	And user click on signin button
	And user clicks on Shop menu
	And user hover on the "Outdoors" category
	Then user clicks on See All > button
	And user should be navigated to "Outdoors" PLP
	
#	@RegressionP2
#   Scenario: Search a Gift card and verify URL,Image,Attributes on the PDP page
#   Given user launches the browser and navigates to "ASO_HOME" page
#   When User searches a product "SKUForGiftCard" and navigates to PDP
#   Then user should be able to see PDP mention in the current url
#   And user should be able to see Image of the product
#   And user should be able to see the search term in the GiftCard title