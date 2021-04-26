Feature: Change Zip Code - Design Change
@TC-OMNI-31547
Scenario: verify submit button to enable on Valid zip code Accepted
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
    When User taps on Change zip code
    Then User sees change zip code field
    Then User enters zip code "78701"	
    Then User sees change zip code submit button

  @TC-OMNI-31547
  Scenario: verify submit button to disable on Invalid  zip code
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
    When User taps on Change zip code
    Then User sees change zip code field
    Then User enters zip code "19824"
    Then User sees change zip code submit button Disable

    