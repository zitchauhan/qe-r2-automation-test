Feature: Verify guest user sign in funcationalies on cart page

  @Sprint1 @ST-25206
  Scenario: verify guest user is able to log in from cart page
    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
#	 When User Sees the Search Box
#    Then User clicks on the Search Box
#    And User search for the "SearchKeyword"
#    And user click on Product
 #   When User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    Then User verifies guest user sign in section "is present" on cart page
    Then User taps on Sign in button on cart page
    Then User enters valid email "loginFromCart@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	Then User is navigated To Cart Screen
 	Then User verifies guest user sign in section "is not present" on cart page
 	
 	
  Scenario: verify guest user is able to log in from cart page
    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
#	 When User Sees the Search Box
#    Then User clicks on the Search Box
#    And User search for the "SearchKeyword"
#    And user click on Product
    When User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    Then User verifies guest user sign in section "is present" on cart page
    Then User taps on Sign in button on cart page
    
 	Then User is navigated To Cart Screen
 	Then User verifies guest user sign in section "is not present" on cart page