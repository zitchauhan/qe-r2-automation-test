Feature: Validate the functionality of shipping policy and return policy 

  @Sprint2 @ST-20845 @TC-OMNI-30715
  Scenario: Verify user is able to navigate to shipping policy and return policy 
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
    Then User scrolls down to the bottom
    Then User sees "Shipping policy" on cart page
    And User sees "Return policy" on cart page
    Then User taps on "Shipping policy"
    Then User lands on "Shipping policy" page
    Then User taps on back button
    Then User is navigated To Cart Screen
    Then User taps on "Return policy"
    Then User scrolls down to the bottom
    Then User lands on "Return policy" page
    Then User taps on back button
    Then User is navigated To Cart Screen
 
 	