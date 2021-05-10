Feature: Paypal | Checkout
	
	@ST-OMNI-28575 @Sprint6 @TC-OMNI-37496
  Scenario: Validate User can make payment through paypal
  	Given User launches the application
    And User continues as guest user
		And User is on Log In screen
    When User enters "email" on login screen 
		And User enters "password" on login screen
 		And User taps on Login
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword" 
    When I choose to navigate to PDP
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    And User sees the checkout button
    When User taps on checkout button
    Then User taps on "paypal" payment type
    Then User enters "paypalEmail"
    Then User taps on next button on paypal
    Then User enters "paypalPassword"
    Then User taps on Login button on paypal
    Then User taps on PayNow button on paypal
   
   @ST-OMNI-28575 @Sprint6 @TC-OMNI-37497
   Scenario: Validate User is returned to checkout screen when user taps on cancel button on paypal screen
  	Given User launches the application
    And User continues as guest user
		And User is on Log In screen
    When User enters "email" on login screen 
		And User enters "password" on login screen
 		And User taps on Login
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword" 
    When I choose to navigate to PDP
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    And User sees the checkout button
    When User taps on checkout button
    Then User taps on "paypal" payment type
    Then User taps on cancel button on paypal screen
    Then User sees paypal payment type