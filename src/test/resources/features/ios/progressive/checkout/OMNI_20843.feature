Feature: Guest Checkout - Contact Information
  
  @ST-OMNI-20843 @TC-OMNI-33162
  Scenario: User enter unregistered email in contact information field
    Given User launches the application
    And User continues as guest user
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
    Then User sees contact information section
    When User taps on contact information section
    Then User is shown email field
    Then User enters "not@gmail.com" in email field
    Then User taps on Save Email button
    Then User is shown Create an Account button in contact information screen
   
  @ST-OMNI-20843 @TC-OMNI-33163
  Scenario: User enter registered email in contact information field
    Given User launches the application
    And User continues as guest user
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
    Then User sees contact information section
    When User taps on contact information section
    Then User is shown email field
    Then User enters "testuser_shr@yopmail.com" in email field
    Then User taps on Save Email button
    Then User is shown Sign In button
    When User taps on Continue as Guest button
    Then User sees "testuser_shr@yopmail.com" in contact information screen
 