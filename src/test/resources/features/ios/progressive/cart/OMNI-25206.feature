Feature: Verify guest user sign in funcationalies on cart page

<<<<<<< HEAD
  @Sprint2 @ST-25206 @TC-OMNI-30503
  Scenario: verify sign-in section is no more displayed once guest user sign-in from cart page
   Given User launches the application
    When User continues as guest user
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
    Then User enters valid email "loginFromCart@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	Then User is navigated To Cart Screen
 	Then User verifies guest user sign in section "is not present" on cart page
 	
 	@Sprint2 @ST-25206 @TC-OMNI-30504
  Scenario: verify when guest user declines to login then user lands back on cart page with sign-in section displayed
    Given User launches the application
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
    Then User sees login button
    Then User taps on cancel button
 	Then User is navigated To Cart Screen
 	Then User verifies guest user sign in section "is present" on cart page
=======
  @Sprint1 @ST-25206
  Scenario: verify guest user is able to log in from cart page
    Given User launches the application
    And User Logs into the application
    When User navigates to pdp
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    
>>>>>>> e01b100d... commit for 24745
