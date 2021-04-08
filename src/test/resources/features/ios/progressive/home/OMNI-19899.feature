Feature: Validate User is able to use the application as guest user

  @ST-OMNI-19899 @Sprint1 @TC-OMNI-33094
  Scenario: User is able to visit homepage as guest user 
  	Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
  
  @ST-OMNI-19899 @Sprint1 @TC-OMNI-33095
  Scenario: Guest user is able to add the product to cart 
  	Given User launches the application
  	And User continues as guest user
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword" 
    When I choose to navigate to PDP
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen