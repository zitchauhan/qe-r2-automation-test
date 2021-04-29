Feature: Checkout

 @ST-OMNI-31888 @Regression 
  Scenario: As an ASP mobile app signed-in user
    I want to navigate to Payment screen when i tap on Save credit card button once i filled all 
    the detail and no error present on add credit card screen
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
    Then User sees save credit card button as enabled
    When User taps on save credit card button
    Then User is on Payment screen page
    
    @ST-OMNI-31888 @Regression 
     Scenario: As an ASP mobile app guest user
    I want to navigate to Payment screen when i tap on Save credit card button once i filled all 
    the detail and no error present on add credit card screen
    Given User launches the application
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
    Then User sees save credit card button as enabled
    When User taps on save credit card button
    Then User is on Payment screen page
    
    
     Scenario: As an ASO mobile app signed-in user
  I want to see the valid credit card image when i enter first two  digit of card number 
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    When User enter "4111" in "CardNumber" field
    Then User sees card image in card number input field