@TC-OMNI-20627
Feature: Verify that user can change zip code from order summary screen

  Scenario: Verify that the user can see required fiels for changing the zip code
    Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User select home delivery option
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    When User taps on Change zip code
    Then User sees change zip code field
    And User sees change zip code submit button
  
  Scenario: Verify that the user can see required fiels for changing the zip code
    Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User select home delivery option
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    When User notes down estimated shipping charges
    And User notes down order total before changing zip code
    And User taps on Change zip code
    And User enters zip code "12345"
    Then User sees zip code in the order summary
    And User sees estimated shipping charges for zip code
    And User sees updated order total after changing the zip code 
  
  
  Scenario Outline: Verify buying restriction message is shown for a zip code
  	Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User select home delivery option
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    When User notes down estimated shipping charges
    And User notes down order total before changing zip code
    And User taps on Change zip code
    And User enters zip code "<zip_code>"
    Then User sees zip code buying restriction message "<zip_restriction_message>"
    
    
    Examples:
    | zip_code | zip_restriction_message |
    | 12345	   | Zip restriction message |