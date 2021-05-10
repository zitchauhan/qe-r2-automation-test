Feature: Guest user sign in on cart page, navigates to checkout page and the place order

@Regression
Scenario: verify when guest user sign-in from cart page
    And User continues as guest user
    Then User sees the homepage
	 	When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    When User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    Then User verifies guest user sign in section "is present" on cart page
    Then User taps on Sign in button on cart page
    When User enters "email1" on login screen 
		And User enters "password1" on login screen
	 	And User taps on Login
	 	Then User is navigated To Cart Screen
	 	Then User verifies guest user sign in section "is not present" on cart page